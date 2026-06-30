package i60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f288895d = 0;

    public b(i60.c cVar, i60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f288895d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f288895d;
        this.f288895d = i17 + 1;
        if (i17 == 0) {
            return i60.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
