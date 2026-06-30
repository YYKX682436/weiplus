package zy;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477299d = 0;

    public o(zy.p pVar, zy.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477299d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477299d;
        this.f477299d = i17 + 1;
        if (i17 == 0) {
            return bz.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
