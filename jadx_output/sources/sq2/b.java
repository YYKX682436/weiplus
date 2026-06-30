package sq2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f411343d = 0;

    public b(sq2.c cVar, sq2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f411343d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f411343d;
        this.f411343d = i17 + 1;
        if (i17 == 0) {
            return sq2.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
