package sg0;

/* loaded from: classes6.dex */
public class v0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407826d = 0;

    public v0(sg0.w0 w0Var, sg0.u0 u0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407826d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407826d;
        this.f407826d = i17 + 1;
        if (i17 == 0) {
            return sg0.r3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
