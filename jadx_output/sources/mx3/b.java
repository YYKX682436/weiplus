package mx3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332527d = 0;

    public b(mx3.c cVar, mx3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332527d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332527d;
        this.f332527d = i17 + 1;
        if (i17 == 0) {
            return mx3.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
