package yv;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f465944d = 0;

    public n(yv.o oVar, yv.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f465944d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f465944d;
        this.f465944d = i17 + 1;
        if (i17 == 0) {
            return yv.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
