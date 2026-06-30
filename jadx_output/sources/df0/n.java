package df0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f229635d = 0;

    public n(df0.o oVar, df0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f229635d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f229635d;
        this.f229635d = i17 + 1;
        if (i17 == 0) {
            return cf0.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
