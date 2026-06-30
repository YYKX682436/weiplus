package pd0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353491d = 0;

    public n(pd0.o oVar, pd0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353491d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353491d;
        this.f353491d = i17 + 1;
        if (i17 == 0) {
            return pd0.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
