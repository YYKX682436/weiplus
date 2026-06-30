package e82;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f250082d = 0;

    public b(e82.c cVar, e82.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f250082d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f250082d;
        this.f250082d = i17 + 1;
        if (i17 == 0) {
            return e82.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
