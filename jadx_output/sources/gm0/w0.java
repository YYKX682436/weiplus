package gm0;

/* loaded from: classes6.dex */
public class w0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f273283d = 0;

    public w0(gm0.x0 x0Var, gm0.v0 v0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f273283d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f273283d;
        this.f273283d = i17 + 1;
        if (i17 == 0) {
            return f01.n1.INSTANCE;
        }
        if (i17 == 1) {
            return ge0.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
