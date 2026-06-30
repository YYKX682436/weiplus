package uy4;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f432018d = 0;

    public r(uy4.s sVar, uy4.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432018d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f432018d;
        this.f432018d = i17 + 1;
        if (i17 == 0) {
            return sy4.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
