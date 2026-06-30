package te5;

/* loaded from: classes6.dex */
public class b0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f418612d = 0;

    public b0(te5.c0 c0Var, te5.a0 a0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f418612d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f418612d;
        this.f418612d = i17 + 1;
        if (i17 == 0) {
            return te5.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
