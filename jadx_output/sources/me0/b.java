package me0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f325905d = 0;

    public b(me0.c cVar, me0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f325905d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f325905d;
        this.f325905d = i17 + 1;
        if (i17 == 0) {
            return me0.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
