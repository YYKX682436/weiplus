package zy2;

/* loaded from: classes6.dex */
public class s2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477569d = 0;

    public s2(zy2.t2 t2Var, zy2.r2 r2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477569d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477569d;
        this.f477569d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.extension.reddot.n2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
