package ov;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f349112d = 0;

    public y(ov.z zVar, ov.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f349112d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f349112d;
        this.f349112d = i17 + 1;
        if (i17 == 0) {
            return ov.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
