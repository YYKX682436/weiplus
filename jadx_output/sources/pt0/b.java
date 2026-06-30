package pt0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f358187d = 0;

    public b(pt0.c cVar, pt0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f358187d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f358187d;
        this.f358187d = i17 + 1;
        if (i17 == 0) {
            return ez.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
