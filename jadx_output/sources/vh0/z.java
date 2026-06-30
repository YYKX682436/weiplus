package vh0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f437006d = 0;

    public z(vh0.a0 a0Var, vh0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f437006d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f437006d;
        this.f437006d = i17 + 1;
        if (i17 == 0) {
            return vh0.s1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
