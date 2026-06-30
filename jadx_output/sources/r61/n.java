package r61;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f392908d = 0;

    public n(r61.o oVar, r61.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f392908d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f392908d;
        this.f392908d = i17 + 1;
        if (i17 == 0) {
            return r61.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
