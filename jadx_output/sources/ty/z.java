package ty;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f422771d = 0;

    public z(ty.a0 a0Var, ty.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f422771d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f422771d;
        this.f422771d = i17 + 1;
        if (i17 == 0) {
            return sy.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
