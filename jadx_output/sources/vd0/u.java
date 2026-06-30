package vd0;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435515d = 0;

    public u(vd0.v vVar, vd0.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435515d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435515d;
        this.f435515d = i17 + 1;
        if (i17 == 0) {
            return vd0.y1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
