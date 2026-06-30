package m90;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324896d = 0;

    public n(m90.o oVar, m90.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324896d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324896d;
        this.f324896d = i17 + 1;
        if (i17 == 0) {
            return m90.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
