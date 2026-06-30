package kv;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f312639d = 0;

    public n(kv.o oVar, kv.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312639d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f312639d;
        this.f312639d = i17 + 1;
        if (i17 == 0) {
            return hn1.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
