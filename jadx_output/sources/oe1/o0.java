package oe1;

/* loaded from: classes6.dex */
public class o0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f344729d = 0;

    public o0(oe1.p0 p0Var, oe1.n0 n0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f344729d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f344729d;
        this.f344729d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.v7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
