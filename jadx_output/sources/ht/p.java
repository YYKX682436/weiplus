package ht;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f284648d = 0;

    public p(ht.q qVar, ht.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f284648d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f284648d;
        this.f284648d = i17 + 1;
        if (i17 == 0) {
            return ht.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
