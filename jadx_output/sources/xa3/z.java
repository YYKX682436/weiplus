package xa3;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f452818d = 0;

    public z(xa3.a0 a0Var, xa3.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f452818d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f452818d;
        this.f452818d = i17 + 1;
        if (i17 == 0) {
            return xa3.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
