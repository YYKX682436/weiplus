package l05;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f314861d = 0;

    public b(l05.c cVar, l05.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f314861d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f314861d;
        this.f314861d = i17 + 1;
        if (i17 == 0) {
            return l05.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
