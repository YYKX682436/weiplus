package zy2;

/* loaded from: classes6.dex */
public class y3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477611d = 0;

    public y3(zy2.z3 z3Var, zy2.x3 x3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477611d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477611d;
        this.f477611d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.u4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
