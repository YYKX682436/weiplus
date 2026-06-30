package po2;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f357317d = 0;

    public e(po2.f fVar, po2.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f357317d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f357317d;
        this.f357317d = i17 + 1;
        if (i17 == 0) {
            return po2.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
