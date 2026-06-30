package mq0;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f330557d = 0;

    public g(mq0.h hVar, mq0.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f330557d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f330557d;
        this.f330557d = i17 + 1;
        if (i17 == 0) {
            return mq0.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
