package s33;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f402537d = 0;

    public t(s33.u uVar, s33.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402537d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f402537d;
        this.f402537d = i17 + 1;
        if (i17 == 0) {
            return s33.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
