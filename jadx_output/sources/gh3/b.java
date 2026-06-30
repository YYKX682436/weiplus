package gh3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f271872d = 0;

    public b(gh3.c cVar, gh3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f271872d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f271872d;
        this.f271872d = i17 + 1;
        if (i17 == 0) {
            return gh3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
