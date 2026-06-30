package com.tencent.thumbplayer.utils;

/* loaded from: classes16.dex */
public class TPHashMapBuilder<K, V> {
    private java.util.Map<K, V> map = new java.util.HashMap();

    public java.util.Map<K, V> build() {
        return this.map;
    }

    public com.tencent.thumbplayer.utils.TPHashMapBuilder<K, V> put(K k17, V v17) {
        this.map.put(k17, v17);
        return this;
    }

    public java.util.Map<K, V> readOnly() {
        return java.util.Collections.unmodifiableMap(this.map);
    }
}
