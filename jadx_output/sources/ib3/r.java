package ib3;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f290203d = 0;

    public r(ib3.s sVar, ib3.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f290203d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f290203d;
        this.f290203d = i17 + 1;
        if (i17 == 0) {
            return ib3.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
