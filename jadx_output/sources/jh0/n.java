package jh0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f299778d = 0;

    public n(jh0.o oVar, jh0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f299778d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f299778d;
        this.f299778d = i17 + 1;
        if (i17 == 0) {
            return jh0.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
