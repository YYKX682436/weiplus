package we3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445269d = 0;

    public b(we3.c cVar, we3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445269d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445269d;
        this.f445269d = i17 + 1;
        if (i17 == 0) {
            return we3.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
