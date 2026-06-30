package rq1;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398770d = 0;

    public n(rq1.o oVar, rq1.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398770d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398770d;
        this.f398770d = i17 + 1;
        if (i17 == 0) {
            return rq1.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
