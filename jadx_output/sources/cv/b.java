package cv;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222483d = 0;

    public b(cv.c cVar, cv.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222483d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222483d;
        this.f222483d = i17 + 1;
        if (i17 == 0) {
            return bv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
