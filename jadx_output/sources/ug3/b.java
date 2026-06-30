package ug3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f427530d = 0;

    public b(ug3.c cVar, ug3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f427530d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f427530d;
        this.f427530d = i17 + 1;
        if (i17 == 0) {
            return ug3.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
