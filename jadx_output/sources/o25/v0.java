package o25;

/* loaded from: classes6.dex */
public class v0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342589d = 0;

    public v0(o25.w0 w0Var, o25.u0 u0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342589d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342589d;
        this.f342589d = i17 + 1;
        if (i17 == 0) {
            return r35.p1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
