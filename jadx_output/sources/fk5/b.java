package fk5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f263653d = 0;

    public b(fk5.c cVar, fk5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f263653d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f263653d;
        this.f263653d = i17 + 1;
        if (i17 == 0) {
            return fk5.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
