package k43;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304061d = 0;

    public b(k43.c cVar, k43.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304061d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304061d;
        this.f304061d = i17 + 1;
        if (i17 == 0) {
            return k43.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
