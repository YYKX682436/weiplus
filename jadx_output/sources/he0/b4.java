package he0;

/* loaded from: classes6.dex */
public class b4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f280670d = 0;

    public b4(he0.c4 c4Var, he0.a4 a4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f280670d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f280670d;
        this.f280670d = i17 + 1;
        if (i17 == 0) {
            return he0.k6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
