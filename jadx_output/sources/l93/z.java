package l93;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f317318d = 0;

    public z(l93.a0 a0Var, l93.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f317318d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f317318d;
        this.f317318d = i17 + 1;
        if (i17 == 0) {
            return l93.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
