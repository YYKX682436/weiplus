package vt1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439932d = 0;

    public b(vt1.c cVar, vt1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439932d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439932d;
        this.f439932d = i17 + 1;
        if (i17 == 0) {
            return ut1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
