package s50;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f403032d = 0;

    public b(s50.c cVar, s50.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f403032d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f403032d;
        this.f403032d = i17 + 1;
        if (i17 == 0) {
            return s50.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
