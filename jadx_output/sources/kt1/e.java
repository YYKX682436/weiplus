package kt1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f311927d = 0;

    public e(kt1.f fVar, kt1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f311927d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f311927d;
        this.f311927d = i17 + 1;
        if (i17 == 0) {
            return kt1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
