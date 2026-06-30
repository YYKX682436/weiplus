package zy2;

/* loaded from: classes6.dex */
public class s4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477572d = 0;

    public s4(zy2.t4 t4Var, zy2.r4 r4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477572d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477572d;
        this.f477572d = i17 + 1;
        if (i17 == 0) {
            return ml2.k0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
