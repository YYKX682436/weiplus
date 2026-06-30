package mq1;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f330677d = 0;

    public n(mq1.o oVar, mq1.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f330677d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f330677d;
        this.f330677d = i17 + 1;
        if (i17 == 0) {
            return mq1.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
