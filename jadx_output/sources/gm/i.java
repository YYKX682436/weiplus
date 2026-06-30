package gm;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f273139d = 0;

    public i(gm.j jVar, gm.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f273139d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f273139d;
        this.f273139d = i17 + 1;
        if (i17 == 0) {
            return gm.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
