package q12;

/* loaded from: classes6.dex */
public class c2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359554d = 0;

    public c2(q12.d2 d2Var, q12.b2 b2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359554d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359554d;
        this.f359554d = i17 + 1;
        if (i17 == 0) {
            return q12.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
