package vf0;

/* loaded from: classes6.dex */
public class k0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436211d = 0;

    public k0(vf0.l0 l0Var, vf0.j0 j0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436211d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436211d;
        this.f436211d = i17 + 1;
        if (i17 == 0) {
            return vf0.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
