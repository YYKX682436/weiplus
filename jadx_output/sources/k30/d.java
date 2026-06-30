package k30;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303819d = 0;

    public d(k30.e eVar, k30.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303819d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303819d;
        this.f303819d = i17 + 1;
        if (i17 == 0) {
            return k30.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
