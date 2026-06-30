package pg2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f354087d = 0;

    public b(pg2.c cVar, pg2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f354087d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f354087d;
        this.f354087d = i17 + 1;
        if (i17 == 0) {
            return pg2.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
