package qx;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f367266d = 0;

    public w(qx.x xVar, qx.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f367266d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f367266d;
        this.f367266d = i17 + 1;
        if (i17 == 0) {
            return px.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
