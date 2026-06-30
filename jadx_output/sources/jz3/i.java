package jz3;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f302793d = 0;

    public i(jz3.j jVar, jz3.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302793d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302793d;
        this.f302793d = i17 + 1;
        if (i17 == 0) {
            return jz3.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
