package ty;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f422733d = 0;

    public n(ty.o oVar, ty.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f422733d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f422733d;
        this.f422733d = i17 + 1;
        if (i17 == 0) {
            return sy.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
