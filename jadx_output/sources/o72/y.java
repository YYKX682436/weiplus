package o72;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343522d = 0;

    public y(o72.z zVar, o72.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343522d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343522d;
        this.f343522d = i17 + 1;
        if (i17 == 0) {
            return x82.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
