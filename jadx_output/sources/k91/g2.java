package k91;

/* loaded from: classes6.dex */
public class g2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f305591d = 0;

    public g2(k91.h2 h2Var, k91.f2 f2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f305591d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f305591d;
        this.f305591d = i17 + 1;
        if (i17 == 0) {
            return k91.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
