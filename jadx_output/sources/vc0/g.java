package vc0;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434896d = 0;

    public g(vc0.h hVar, vc0.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434896d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434896d;
        this.f434896d = i17 + 1;
        if (i17 == 0) {
            return vc0.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
