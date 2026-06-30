package oe1;

/* loaded from: classes6.dex */
public class w0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f344752d = 0;

    public w0(oe1.x0 x0Var, oe1.v0 v0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f344752d < 3;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f344752d;
        this.f344752d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.app.pa.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.appbrand.app.ra.INSTANCE;
        }
        if (i17 == 2) {
            return com.tencent.mm.plugin.appbrand.app.na.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 3");
    }
}
