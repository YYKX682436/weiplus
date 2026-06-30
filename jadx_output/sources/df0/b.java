package df0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f229626d = 0;

    public b(df0.c cVar, df0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f229626d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f229626d;
        this.f229626d = i17 + 1;
        if (i17 == 0) {
            return cf0.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
