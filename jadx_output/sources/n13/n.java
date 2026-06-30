package n13;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f334114d = 0;

    public n(n13.o oVar, n13.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334114d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334114d;
        this.f334114d = i17 + 1;
        if (i17 == 0) {
            return dk5.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
