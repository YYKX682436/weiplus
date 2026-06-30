package q12;

/* loaded from: classes6.dex */
public class m3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359615d = 0;

    public m3(q12.n3 n3Var, q12.l3 l3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359615d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359615d;
        this.f359615d = i17 + 1;
        if (i17 == 0) {
            return q12.f4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
