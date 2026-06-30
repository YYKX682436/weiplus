package vj0;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f437656d = 0;

    public m(vj0.n nVar, vj0.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f437656d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f437656d;
        this.f437656d = i17 + 1;
        if (i17 == 0) {
            return vj0.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
