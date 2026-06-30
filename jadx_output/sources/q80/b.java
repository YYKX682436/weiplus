package q80;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360646d = 0;

    public b(q80.c cVar, q80.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360646d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360646d;
        this.f360646d = i17 + 1;
        if (i17 == 0) {
            return sa3.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
