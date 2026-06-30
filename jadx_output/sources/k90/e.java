package k90;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f305512d = 0;

    public e(k90.f fVar, k90.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f305512d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f305512d;
        this.f305512d = i17 + 1;
        if (i17 == 0) {
            return k90.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
