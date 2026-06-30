package u24;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424119d = 0;

    public e(u24.f fVar, u24.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424119d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424119d;
        this.f424119d = i17 + 1;
        if (i17 == 0) {
            return u24.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
