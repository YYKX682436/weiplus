package me3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f325931d = 0;

    public f(me3.g gVar, me3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f325931d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f325931d;
        this.f325931d = i17 + 1;
        if (i17 == 0) {
            return me3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
