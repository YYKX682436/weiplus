package rh0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f395605d = 0;

    public n(rh0.o oVar, rh0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f395605d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f395605d;
        this.f395605d = i17 + 1;
        if (i17 == 0) {
            return p05.x2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
