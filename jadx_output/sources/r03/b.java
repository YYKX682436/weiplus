package r03;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368349d = 0;

    public b(r03.c cVar, r03.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368349d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368349d;
        this.f368349d = i17 + 1;
        if (i17 == 0) {
            return r03.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
