package k41;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304038d = 0;

    public r(k41.s sVar, k41.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304038d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304038d;
        this.f304038d = i17 + 1;
        if (i17 == 0) {
            return k41.u0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
