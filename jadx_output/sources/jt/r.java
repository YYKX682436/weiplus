package jt;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301585d = 0;

    public r(jt.s sVar, jt.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301585d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301585d;
        this.f301585d = i17 + 1;
        if (i17 == 0) {
            return ht.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
