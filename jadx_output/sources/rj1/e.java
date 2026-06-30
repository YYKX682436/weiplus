package rj1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f396166d = 0;

    public e(rj1.f fVar, rj1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f396166d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f396166d;
        this.f396166d = i17 + 1;
        if (i17 == 0) {
            return rj1.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
