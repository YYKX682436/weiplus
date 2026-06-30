package fa4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f260788d = 0;

    public b(fa4.c cVar, fa4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f260788d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f260788d;
        this.f260788d = i17 + 1;
        if (i17 == 0) {
            return fa4.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
