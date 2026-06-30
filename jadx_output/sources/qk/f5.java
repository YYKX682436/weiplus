package qk;

/* loaded from: classes6.dex */
public class f5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364108d = 0;

    public f5(qk.g5 g5Var, qk.e5 e5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364108d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364108d;
        this.f364108d = i17 + 1;
        if (i17 == 0) {
            return ef0.r3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
