package ka0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f305989d = 0;

    public z(ka0.a0 a0Var, ka0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f305989d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f305989d;
        this.f305989d = i17 + 1;
        if (i17 == 0) {
            return ja0.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
