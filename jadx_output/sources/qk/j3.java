package qk;

/* loaded from: classes6.dex */
public class j3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364186d = 0;

    public j3(qk.k3 k3Var, qk.i3 i3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364186d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364186d;
        this.f364186d = i17 + 1;
        if (i17 == 0) {
            return fm4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
