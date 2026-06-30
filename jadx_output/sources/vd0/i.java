package vd0;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435431d = 0;

    public i(vd0.j jVar, vd0.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435431d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435431d;
        this.f435431d = i17 + 1;
        if (i17 == 0) {
            return vd0.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
