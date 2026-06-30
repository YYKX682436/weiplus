package hh0;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f281446d = 0;

    public b(hh0.c cVar, hh0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f281446d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f281446d;
        this.f281446d = i17 + 1;
        if (i17 == 0) {
            return hh0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
