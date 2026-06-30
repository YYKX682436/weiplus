package hn3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f282538d = 0;

    public b(hn3.c cVar, hn3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f282538d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f282538d;
        this.f282538d = i17 + 1;
        if (i17 == 0) {
            return hn3.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
