package f01;

/* loaded from: classes6.dex */
public class e0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f258341d = 0;

    public e0(f01.f0 f0Var, f01.d0 d0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f258341d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f258341d;
        this.f258341d = i17 + 1;
        if (i17 == 0) {
            return f01.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
