package va3;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434328d = 0;

    public n(va3.o oVar, va3.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434328d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434328d;
        this.f434328d = i17 + 1;
        if (i17 == 0) {
            return va3.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
