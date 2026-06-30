package r43;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f369540d = 0;

    public n(r43.o oVar, r43.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f369540d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f369540d;
        this.f369540d = i17 + 1;
        if (i17 == 0) {
            return r43.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
