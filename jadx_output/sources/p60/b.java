package p60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f352154d = 0;

    public b(p60.c cVar, p60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f352154d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f352154d;
        this.f352154d = i17 + 1;
        if (i17 == 0) {
            return p60.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
