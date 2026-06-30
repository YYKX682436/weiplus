package dm3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f241670d = 0;

    public b(dm3.c cVar, dm3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f241670d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f241670d;
        this.f241670d = i17 + 1;
        if (i17 == 0) {
            return dm3.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
