package fn1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f264202d = 0;

    public e(fn1.f fVar, fn1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f264202d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f264202d;
        this.f264202d = i17 + 1;
        if (i17 == 0) {
            return fn1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
