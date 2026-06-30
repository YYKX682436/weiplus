package cy1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f224727d = 0;

    public e(cy1.f fVar, cy1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f224727d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f224727d;
        this.f224727d = i17 + 1;
        if (i17 == 0) {
            return cy1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
