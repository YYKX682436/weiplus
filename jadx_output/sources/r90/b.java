package r90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f393442d = 0;

    public b(r90.c cVar, r90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f393442d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f393442d;
        this.f393442d = i17 + 1;
        if (i17 == 0) {
            return q90.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
