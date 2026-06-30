package kt;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f311902d = 0;

    public z(kt.a0 a0Var, kt.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f311902d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f311902d;
        this.f311902d = i17 + 1;
        if (i17 == 0) {
            return kt.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
