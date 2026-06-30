package dt;

/* loaded from: classes6.dex */
public class v0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f243084d = 0;

    public v0(dt.w0 w0Var, dt.u0 u0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f243084d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f243084d;
        this.f243084d = i17 + 1;
        if (i17 == 0) {
            return dt.b4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
