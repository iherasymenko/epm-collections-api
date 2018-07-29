package com.epm.lab.collections;

/**
 * A {@link Map} that further provides a <em>total ordering</em> on its keys.
 * The map is ordered according to the {@linkplain Comparable natural
 * ordering} of its keys.  This order is reflected when
 * iterating over the map.
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public interface OrderedMap<K extends Comparable<K>, V> extends Map<K, V> {
}
