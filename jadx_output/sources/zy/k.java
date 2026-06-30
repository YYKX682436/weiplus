package zy;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477296d = 0;

    public k(zy.l lVar, zy.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477296d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477296d;
        this.f477296d = i17 + 1;
        if (i17 == 0) {
            return yy.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
