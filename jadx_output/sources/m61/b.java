package m61;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324362d = 0;

    public b(m61.c cVar, m61.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324362d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324362d;
        this.f324362d = i17 + 1;
        if (i17 == 0) {
            return m61.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
