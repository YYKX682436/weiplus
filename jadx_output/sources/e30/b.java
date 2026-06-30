package e30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f247069d = 0;

    public b(e30.c cVar, e30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f247069d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f247069d;
        this.f247069d = i17 + 1;
        if (i17 == 0) {
            return d30.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
