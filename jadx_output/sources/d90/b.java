package d90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f227430d = 0;

    public b(d90.c cVar, d90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f227430d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f227430d;
        this.f227430d = i17 + 1;
        if (i17 == 0) {
            return d90.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
