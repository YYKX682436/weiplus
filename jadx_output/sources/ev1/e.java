package ev1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f256895d = 0;

    public e(ev1.f fVar, ev1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f256895d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f256895d;
        this.f256895d = i17 + 1;
        if (i17 == 0) {
            return ev1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
