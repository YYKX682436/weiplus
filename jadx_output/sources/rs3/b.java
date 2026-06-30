package rs3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399332d = 0;

    public b(rs3.c cVar, rs3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399332d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399332d;
        this.f399332d = i17 + 1;
        if (i17 == 0) {
            return rs3.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
