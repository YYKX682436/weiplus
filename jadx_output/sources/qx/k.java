package qx;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f367253d = 0;

    public k(qx.l lVar, qx.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f367253d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f367253d;
        this.f367253d = i17 + 1;
        if (i17 == 0) {
            return px.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
