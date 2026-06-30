package y71;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f459694d = 0;

    public b(y71.c cVar, y71.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f459694d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f459694d;
        this.f459694d = i17 + 1;
        if (i17 == 0) {
            return b81.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
