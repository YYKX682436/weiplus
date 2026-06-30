package f65;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259877d = 0;

    public e(f65.f fVar, f65.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259877d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259877d;
        this.f259877d = i17 + 1;
        if (i17 == 0) {
            return bq1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
