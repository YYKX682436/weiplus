package js;

/* loaded from: classes6.dex */
public class i0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301434d = 0;

    public i0(js.j0 j0Var, js.h0 h0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301434d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301434d;
        this.f301434d = i17 + 1;
        if (i17 == 0) {
            return is.p1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
