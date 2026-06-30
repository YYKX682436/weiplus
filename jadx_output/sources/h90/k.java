package h90;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f279678d = 0;

    public k(h90.l lVar, h90.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f279678d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f279678d;
        this.f279678d = i17 + 1;
        if (i17 == 0) {
            return g90.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
