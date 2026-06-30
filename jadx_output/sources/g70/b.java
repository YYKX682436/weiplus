package g70;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f269193d = 0;

    public b(g70.c cVar, g70.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f269193d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f269193d;
        this.f269193d = i17 + 1;
        if (i17 == 0) {
            return g70.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
