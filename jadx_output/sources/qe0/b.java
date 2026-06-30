package qe0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362012d = 0;

    public b(qe0.c cVar, qe0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362012d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362012d;
        this.f362012d = i17 + 1;
        if (i17 == 0) {
            return pe0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
