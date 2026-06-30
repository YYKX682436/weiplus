package zy2;

/* loaded from: classes6.dex */
public class o4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477510d = 0;

    public o4(zy2.p4 p4Var, zy2.n4 n4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477510d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477510d;
        this.f477510d = i17 + 1;
        if (i17 == 0) {
            return py2.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
