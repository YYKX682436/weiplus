package f23;

/* loaded from: classes.dex */
public class v1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259072d = 0;

    public v1(f23.w1 w1Var, f23.u1 u1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259072d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259072d;
        this.f259072d = i17 + 1;
        if (i17 == 0) {
            return f23.o3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
