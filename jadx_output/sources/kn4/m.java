package kn4;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f309719d = 0;

    public m(kn4.n nVar, kn4.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f309719d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f309719d;
        this.f309719d = i17 + 1;
        if (i17 == 0) {
            return kn4.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
