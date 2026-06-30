package n40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f334879d = 0;

    public b(n40.c cVar, n40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334879d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334879d;
        this.f334879d = i17 + 1;
        if (i17 == 0) {
            return pg3.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
