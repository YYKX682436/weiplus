package ef4;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f252440d = 0;

    public e(ef4.f fVar, ef4.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f252440d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f252440d;
        this.f252440d = i17 + 1;
        if (i17 == 0) {
            return ef4.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
