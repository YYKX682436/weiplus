package rs5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399351d = 0;

    public b(rs5.c cVar, rs5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399351d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399351d;
        this.f399351d = i17 + 1;
        if (i17 == 0) {
            return it2.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
