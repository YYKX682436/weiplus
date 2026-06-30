package n34;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f334540d = 0;

    public a0(n34.b0 b0Var, n34.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334540d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334540d;
        this.f334540d = i17 + 1;
        if (i17 == 0) {
            return n34.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
