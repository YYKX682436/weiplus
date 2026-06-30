package qs;

/* loaded from: classes6.dex */
public class v0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366198d = 0;

    public v0(qs.w0 w0Var, qs.u0 u0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366198d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366198d;
        this.f366198d = i17 + 1;
        if (i17 == 0) {
            return qs.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
