package qk;

/* loaded from: classes6.dex */
public class j5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364189d = 0;

    public j5(qk.k5 k5Var, qk.i5 i5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364189d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364189d;
        this.f364189d = i17 + 1;
        if (i17 == 0) {
            return ef0.a4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
