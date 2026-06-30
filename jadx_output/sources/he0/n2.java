package he0;

/* loaded from: classes6.dex */
public class n2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f280766d = 0;

    public n2(he0.o2 o2Var, he0.m2 m2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f280766d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f280766d;
        this.f280766d = i17 + 1;
        if (i17 == 0) {
            return he0.p5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
