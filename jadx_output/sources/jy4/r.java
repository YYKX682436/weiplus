package jy4;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f302541d = 0;

    public r(jy4.s sVar, jy4.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302541d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302541d;
        this.f302541d = i17 + 1;
        if (i17 == 0) {
            return jy4.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
