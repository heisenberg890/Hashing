/**
 * @author robin
 *
 * @param <K>
 * @param <V>
 */

/*
 * ###################################################################
 * #######################BEGIN Hasher CLASS###########################
 * ###################################################################
 */
public class Hasher<K, V> {
	
  @SuppressWarnings("unchecked")
  
  //The Hash table
  private Entry<K, V>[] buckets = new Entry[1];

  
  /**
   * The classes and methods used to create a Hashmap and handle collisions
 * @param key
 * @param value
 */
public void put(K key, V value) {
    Entry<K, V> entryToAdd = new Entry<>(key, value);
    int targetBucket = findBucket(key);
    Entry<K, V> currentEntry = buckets[targetBucket];
    // If bucket is empty
    if (currentEntry == null) {
      buckets[targetBucket] = entryToAdd;
    } else { // If bucket is not empty, add your entry at the end.
      Entry<K, V> previous = null;
      while (currentEntry != null) {
        if (currentEntry.key.equals(key)) { // Same key found -- Overwrite it.
          entryToAdd.next = currentEntry.next; // Ensure that the old links are intact
          if(previous == null) { // The very first item in the bucket is duplicate
            currentEntry = entryToAdd;
          } else {
            previous.next = entryToAdd;  // Overwrite somewhere in the middle
          }
          return;
        }
        previous = currentEntry;
        currentEntry = currentEntry.next;
      }
      previous.next = entryToAdd;
    }
  }

  /**
   * Return the entry associated with the given key
 * @param key
 * @return
 */

public V get(K key) {
	  
    int targetBucket = findBucket(key);
    if (buckets[targetBucket] == null) { // If bucket is empty.
      return null;
    } else {
      Entry<K, V> entry = buckets[targetBucket];
      while (entry != null) {
        if (entry.key.equals(key)) { // Find the matching Entry by provided key.
          return entry.value;
        }
        entry = entry.next;
      }
      return null; // returns null if key is not found.
    }
  }
  
  

  /**
   * The way to handle collisions, we will be overriding the collided information with our new data
 * @param key
 * @return entryToRemove
 */
public Entry<K, V> remove(K key) {
    int targetBucket = findBucket(key);
    if (buckets[targetBucket] == null) {
      return null;
    } else {
      Entry<K, V> previous = null;
      Entry<K, V> entryToRemove = null;
      Entry<K, V> currentEntry = buckets[targetBucket];
      while (currentEntry != null) {
        if (currentEntry.key.equals(key)) { // Same key found -- Remove it.
          entryToRemove = new Entry<K, V>(currentEntry.key, currentEntry.value);
          if (previous == null) { // Entry is the very first node. So, just overwrite it with the second Entry.
            buckets[targetBucket] = buckets[targetBucket].next;
            return entryToRemove;
          } else { // Entry is either in the middle or at end.
            previous.next = currentEntry.next; // Update the references. If the Entry is the last node previous.next will become null.
            return entryToRemove;
          }
        }
        previous = currentEntry;
        currentEntry = currentEntry.next;
      }
    }
    return null;
  }

  /**
   * Searches through the Hashmap and finds the proper bucket correspondiong to the given key.
   * 
   * @param key - the key for which bucket needs to be found.
   * @return the location of the bucket.
   */
public int findBucket(K key) {
    return Math.abs(key.hashCode()) % buckets.length;
  }
  
}//end Hasher Class

/*
 * ###################################################################
 * #######################BEGIN ENTRY CLASS###########################
 * ###################################################################
 */
class Entry<K, V> {
  K key;
  V value;
  Entry<K, V> next;

  /**
 * @param key
 * @param value
 */
  
  //create an entry class with the value and the key
public Entry(K key, V value) {
    this.key = key;
    this.value = value;
  }


}//end entry class