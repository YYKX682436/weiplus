package uh4;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f427984d = 0;

    public k(uh4.l lVar, uh4.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f427984d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f427984d;
        this.f427984d = i17 + 1;
        if (i17 == 0) {
            return vh4.l2.INSTANCE;
        }
        if (i17 == 1) {
            return vh4.o2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
