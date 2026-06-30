package ot0;

/* loaded from: classes6.dex */
public class u0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348793d = 0;

    public u0(ot0.v0 v0Var, ot0.t0 t0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348793d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348793d;
        this.f348793d = i17 + 1;
        if (i17 == 0) {
            return ah0.h1.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.feature.app.extension.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
