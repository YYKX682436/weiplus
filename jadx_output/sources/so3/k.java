package so3;

/* loaded from: classes.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f410754d = 0;

    public k(so3.l lVar, so3.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f410754d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f410754d;
        this.f410754d = i17 + 1;
        if (i17 == 0) {
            return so3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
