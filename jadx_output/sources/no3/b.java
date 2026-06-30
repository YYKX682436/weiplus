package no3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f338749d = 0;

    public b(no3.c cVar, no3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f338749d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f338749d;
        this.f338749d = i17 + 1;
        if (i17 == 0) {
            return no3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
