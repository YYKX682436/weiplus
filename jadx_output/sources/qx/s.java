package qx;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f367263d = 0;

    public s(qx.t tVar, qx.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f367263d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f367263d;
        this.f367263d = i17 + 1;
        if (i17 == 0) {
            return d35.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
