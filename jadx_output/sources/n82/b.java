package n82;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335630d = 0;

    public b(n82.c cVar, n82.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335630d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335630d;
        this.f335630d = i17 + 1;
        if (i17 == 0) {
            return a40.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
