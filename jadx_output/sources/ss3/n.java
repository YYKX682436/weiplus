package ss3;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412011d = 0;

    public n(ss3.o oVar, ss3.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412011d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412011d;
        this.f412011d = i17 + 1;
        if (i17 == 0) {
            return ss3.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
