package yz4;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f468553d = 0;

    public b(yz4.c cVar, yz4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f468553d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f468553d;
        this.f468553d = i17 + 1;
        if (i17 == 0) {
            return yz4.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
