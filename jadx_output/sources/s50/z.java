package s50;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f403147d = 0;

    public z(s50.a0 a0Var, s50.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f403147d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f403147d;
        this.f403147d = i17 + 1;
        if (i17 == 0) {
            return s50.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
