package zy2;

/* loaded from: classes6.dex */
public class u3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477587d = 0;

    public u3(zy2.v3 v3Var, zy2.t3 t3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477587d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477587d;
        this.f477587d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.r4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
