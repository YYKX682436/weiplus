package e10;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f246330d = 0;

    public b(e10.c cVar, e10.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f246330d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f246330d;
        this.f246330d = i17 + 1;
        if (i17 == 0) {
            return e10.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
