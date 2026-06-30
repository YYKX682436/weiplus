package e13;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f246406d = 0;

    public b(e13.c cVar, e13.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f246406d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f246406d;
        this.f246406d = i17 + 1;
        if (i17 == 0) {
            return e13.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
