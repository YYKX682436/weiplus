package y43;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f459345d = 0;

    public b(y43.c cVar, y43.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f459345d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f459345d;
        this.f459345d = i17 + 1;
        if (i17 == 0) {
            return j60.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
