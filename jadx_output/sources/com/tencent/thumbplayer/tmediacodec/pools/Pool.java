package com.tencent.thumbplayer.tmediacodec.pools;

/* loaded from: classes5.dex */
public interface Pool<T, Y> {
    void clear();

    boolean isEmpty();

    boolean isFull();

    T obtain(Y y17);

    void put(T t17);

    void remove(T t17);
}
