package kb3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f306231d = 0;

    public b(kb3.c cVar, kb3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f306231d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f306231d;
        this.f306231d = i17 + 1;
        if (i17 == 0) {
            return kb3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
