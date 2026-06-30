package qi3;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f363758d = 0;

    public t(qi3.u uVar, qi3.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f363758d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f363758d;
        this.f363758d = i17 + 1;
        if (i17 == 0) {
            return jm.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
