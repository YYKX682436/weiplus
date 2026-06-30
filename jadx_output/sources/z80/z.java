package z80;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f470687d = 0;

    public z(z80.a0 a0Var, z80.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f470687d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f470687d;
        this.f470687d = i17 + 1;
        if (i17 == 0) {
            return y80.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
