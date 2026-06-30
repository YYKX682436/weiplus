package zy2;

/* loaded from: classes6.dex */
public class m3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477463d = 0;

    public m3(zy2.n3 n3Var, zy2.l3 l3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477463d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477463d;
        this.f477463d = i17 + 1;
        if (i17 == 0) {
            return vr2.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
