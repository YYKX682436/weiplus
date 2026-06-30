package mz;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332868d = 0;

    public g(mz.h hVar, mz.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332868d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332868d;
        this.f332868d = i17 + 1;
        if (i17 == 0) {
            return mz.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
