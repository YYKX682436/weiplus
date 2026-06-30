package ct;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222200d = 0;

    public z(ct.a0 a0Var, ct.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222200d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222200d;
        this.f222200d = i17 + 1;
        if (i17 == 0) {
            return bt.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
