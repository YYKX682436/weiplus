package rj;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f396136d = 0;

    public g(rj.h hVar, rj.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f396136d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f396136d;
        this.f396136d = i17 + 1;
        if (i17 == 0) {
            return rj.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
