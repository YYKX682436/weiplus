package j90;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f298337d = 0;

    public b(j90.c cVar, j90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f298337d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f298337d;
        this.f298337d = i17 + 1;
        if (i17 == 0) {
            return j90.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
