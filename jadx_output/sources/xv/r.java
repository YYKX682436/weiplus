package xv;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f457363d = 0;

    public r(xv.s sVar, xv.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f457363d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f457363d;
        this.f457363d = i17 + 1;
        if (i17 == 0) {
            return wv.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
