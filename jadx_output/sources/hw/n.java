package hw;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f285404d = 0;

    public n(hw.o oVar, hw.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f285404d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f285404d;
        this.f285404d = i17 + 1;
        if (i17 == 0) {
            return hw.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
