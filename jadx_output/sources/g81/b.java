package g81;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f269522d = 0;

    public b(g81.c cVar, g81.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f269522d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f269522d;
        this.f269522d = i17 + 1;
        if (i17 == 0) {
            return g81.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
