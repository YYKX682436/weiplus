package vf0;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436227d = 0;

    public m(vf0.n nVar, vf0.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436227d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436227d;
        this.f436227d = i17 + 1;
        if (i17 == 0) {
            return vf0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
