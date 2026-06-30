package lt;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f321161d = 0;

    public z(lt.a0 a0Var, lt.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f321161d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f321161d;
        this.f321161d = i17 + 1;
        if (i17 == 0) {
            return kt.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
