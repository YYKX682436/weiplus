package qf0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362234d = 0;

    public b(qf0.c cVar, qf0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362234d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362234d;
        this.f362234d = i17 + 1;
        if (i17 == 0) {
            return qf0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
