package vg3;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436721d = 0;

    public k(vg3.l lVar, vg3.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436721d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436721d;
        this.f436721d = i17 + 1;
        if (i17 == 0) {
            return hn.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
