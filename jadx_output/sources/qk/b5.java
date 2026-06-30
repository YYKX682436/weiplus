package qk;

/* loaded from: classes6.dex */
public class b5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364024d = 0;

    public b5(qk.c5 c5Var, qk.a5 a5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364024d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364024d;
        this.f364024d = i17 + 1;
        if (i17 == 0) {
            return nm3.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
