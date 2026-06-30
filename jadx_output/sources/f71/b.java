package f71;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f260029d = 0;

    public b(f71.c cVar, f71.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f260029d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f260029d;
        this.f260029d = i17 + 1;
        if (i17 == 0) {
            return f71.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
