package e62;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f249761d = 0;

    public b(e62.c cVar, e62.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f249761d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f249761d;
        this.f249761d = i17 + 1;
        if (i17 == 0) {
            return e62.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
