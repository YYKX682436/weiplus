package com.tencent.wcdb.support;

/* loaded from: classes12.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final java.util.LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i17;
        this.map = new java.util.LinkedHashMap<>(0, 0.75f, true);
    }

    private int safeSizeOf(K k17, V v17) {
        int sizeOf = sizeOf(k17, v17);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new java.lang.IllegalStateException("Negative size: " + k17 + "=" + v17);
    }

    public V create(K k17) {
        return null;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public void entryRemoved(boolean z17, K k17, V v17, V v18) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    public final V get(K k17) {
        V v17;
        if (k17 == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            V v18 = this.map.get(k17);
            if (v18 != null) {
                this.hitCount++;
                return v18;
            }
            this.missCount++;
            V create = create(k17);
            if (create == null) {
                return null;
            }
            synchronized (this) {
                this.createCount++;
                v17 = (V) this.map.put(k17, create);
                if (v17 != null) {
                    this.map.put(k17, v17);
                } else {
                    this.size += safeSizeOf(k17, create);
                }
            }
            if (v17 != null) {
                entryRemoved(false, k17, create, v17);
                return v17;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final V put(K k17, V v17) {
        V put;
        if (k17 == null || v17 == null) {
            throw new java.lang.NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.putCount++;
            this.size += safeSizeOf(k17, v17);
            put = this.map.put(k17, v17);
            if (put != null) {
                this.size -= safeSizeOf(k17, put);
            }
        }
        if (put != null) {
            entryRemoved(false, k17, put, v17);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final V remove(K k17) {
        V remove;
        if (k17 == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.map.remove(k17);
            if (remove != null) {
                this.size -= safeSizeOf(k17, remove);
            }
        }
        if (remove != null) {
            entryRemoved(false, k17, remove, null);
        }
        return remove;
    }

    public void resize(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = i17;
        }
        trimToSize(i17);
    }

    public final synchronized int size() {
        return this.size;
    }

    public int sizeOf(K k17, V v17) {
        return 1;
    }

    public final synchronized java.util.Map<K, V> snapshot() {
        return new java.util.LinkedHashMap(this.map);
    }

    public final synchronized java.lang.String toString() {
        int i17;
        int i18;
        i17 = this.hitCount;
        i18 = this.missCount + i17;
        return java.lang.String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", java.lang.Integer.valueOf(this.maxSize), java.lang.Integer.valueOf(this.hitCount), java.lang.Integer.valueOf(this.missCount), java.lang.Integer.valueOf(i18 != 0 ? (i17 * 100) / i18 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0086, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r6) {
        /*
            r5 = this;
        L0:
            monitor-enter(r5)
            int r0 = r5.size     // Catch: java.lang.Throwable -> L87
            if (r0 < 0) goto L68
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L11
            int r0 = r5.size     // Catch: java.lang.Throwable -> L87
            if (r0 != 0) goto L68
        L11:
            int r0 = r5.size     // Catch: java.lang.Throwable -> L87
            if (r0 <= r6) goto L66
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L1e
            goto L66
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L87
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L87
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L87
            r1 = 0
            if (r0 == 0) goto L40
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch: java.lang.Throwable -> L87
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L87
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L87
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L87
            goto L41
        L40:
            r0 = r1
        L41:
            if (r0 != 0) goto L45
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            goto L67
        L45:
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L87
            java.util.LinkedHashMap<K, V> r3 = r5.map     // Catch: java.lang.Throwable -> L87
            r3.remove(r2)     // Catch: java.lang.Throwable -> L87
            int r3 = r5.size     // Catch: java.lang.Throwable -> L87
            int r4 = r5.safeSizeOf(r2, r0)     // Catch: java.lang.Throwable -> L87
            int r3 = r3 - r4
            r5.size = r3     // Catch: java.lang.Throwable -> L87
            int r3 = r5.evictionCount     // Catch: java.lang.Throwable -> L87
            r4 = 1
            int r3 = r3 + r4
            r5.evictionCount = r3     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            r5.entryRemoved(r4, r2, r0, r1)
            goto L0
        L66:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
        L67:
            return
        L68:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r0.<init>()     // Catch: java.lang.Throwable -> L87
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L87
            r0.append(r1)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L87
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L87
            throw r6     // Catch: java.lang.Throwable -> L87
        L87:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.support.LruCache.trimToSize(int):void");
    }
}
