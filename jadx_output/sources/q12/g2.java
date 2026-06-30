package q12;

/* loaded from: classes6.dex */
public class g2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359581d = 0;

    public g2(q12.h2 h2Var, q12.f2 f2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359581d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359581d;
        this.f359581d = i17 + 1;
        if (i17 == 0) {
            return q12.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
