package f90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f260234d = 0;

    public b(f90.c cVar, f90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f260234d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f260234d;
        this.f260234d = i17 + 1;
        if (i17 == 0) {
            return if3.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
