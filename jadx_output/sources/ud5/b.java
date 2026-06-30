package ud5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426755d = 0;

    public b(ud5.c cVar, ud5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426755d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426755d;
        this.f426755d = i17 + 1;
        if (i17 == 0) {
            return ud5.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
