package x61;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f452214d = 0;

    public n(x61.o oVar, x61.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f452214d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f452214d;
        this.f452214d = i17 + 1;
        if (i17 == 0) {
            return x61.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
