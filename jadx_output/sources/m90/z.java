package m90;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324939d = 0;

    public z(m90.a0 a0Var, m90.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324939d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324939d;
        this.f324939d = i17 + 1;
        if (i17 == 0) {
            return m90.t1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
