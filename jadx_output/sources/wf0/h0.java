package wf0;

/* loaded from: classes6.dex */
public class h0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445511d = 0;

    public h0(wf0.i0 i0Var, wf0.g0 g0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445511d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445511d;
        this.f445511d = i17 + 1;
        if (i17 == 0) {
            return vf0.x1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
