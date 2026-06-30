package yy0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f468245d = 0;

    public n(yy0.o oVar, yy0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f468245d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f468245d;
        this.f468245d = i17 + 1;
        if (i17 == 0) {
            return yy0.n7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
