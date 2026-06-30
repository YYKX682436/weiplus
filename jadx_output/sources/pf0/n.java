package pf0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353765d = 0;

    public n(pf0.o oVar, pf0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353765d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353765d;
        this.f353765d = i17 + 1;
        if (i17 == 0) {
            return kn4.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
