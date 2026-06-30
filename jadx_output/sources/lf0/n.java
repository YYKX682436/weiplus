package lf0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318228d = 0;

    public n(lf0.o oVar, lf0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318228d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318228d;
        this.f318228d = i17 + 1;
        if (i17 == 0) {
            return lf0.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
