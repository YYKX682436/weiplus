package lh3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318666d = 0;

    public f(lh3.g gVar, lh3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318666d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318666d;
        this.f318666d = i17 + 1;
        if (i17 == 0) {
            return lh3.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
