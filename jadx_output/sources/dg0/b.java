package dg0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f232263d = 0;

    public b(dg0.c cVar, dg0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f232263d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f232263d;
        this.f232263d = i17 + 1;
        if (i17 == 0) {
            return ig0.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
