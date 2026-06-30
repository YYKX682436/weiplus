package pl0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356568d = 0;

    public b(pl0.c cVar, pl0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356568d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356568d;
        this.f356568d = i17 + 1;
        if (i17 == 0) {
            return pl0.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
