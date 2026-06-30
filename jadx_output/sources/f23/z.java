package f23;

/* loaded from: classes.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259084d = 0;

    public z(f23.a0 a0Var, f23.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259084d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259084d;
        this.f259084d = i17 + 1;
        if (i17 == 0) {
            return f23.q2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
