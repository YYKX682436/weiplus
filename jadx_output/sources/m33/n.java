package m33;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323318d = 0;

    public n(m33.o oVar, m33.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323318d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323318d;
        this.f323318d = i17 + 1;
        if (i17 == 0) {
            return i53.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
