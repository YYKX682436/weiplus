package m40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323396d = 0;

    public b(m40.c cVar, m40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323396d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323396d;
        this.f323396d = i17 + 1;
        if (i17 == 0) {
            return q92.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
