package hs;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f284532d = 0;

    public k(hs.l lVar, hs.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f284532d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f284532d;
        this.f284532d = i17 + 1;
        if (i17 == 0) {
            return hs.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
