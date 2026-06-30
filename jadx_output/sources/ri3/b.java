package ri3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f396084d = 0;

    public b(ri3.c cVar, ri3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f396084d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f396084d;
        this.f396084d = i17 + 1;
        if (i17 == 0) {
            return ri3.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
