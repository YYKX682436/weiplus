package zy2;

/* loaded from: classes6.dex */
public class k2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477431d = 0;

    public k2(zy2.l2 l2Var, zy2.j2 j2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477431d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477431d;
        this.f477431d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.extension.reddot.y1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
