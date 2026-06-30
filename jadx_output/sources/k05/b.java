package k05;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303147d = 0;

    public b(k05.c cVar, k05.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303147d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303147d;
        this.f303147d = i17 + 1;
        if (i17 == 0) {
            return k05.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
