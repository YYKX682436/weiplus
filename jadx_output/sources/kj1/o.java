package kj1;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308372d = 0;

    public o(kj1.p pVar, kj1.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308372d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308372d;
        this.f308372d = i17 + 1;
        if (i17 == 0) {
            return kj1.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
