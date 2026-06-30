package qk;

/* loaded from: classes6.dex */
public class x4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364359d = 0;

    public x4(qk.y4 y4Var, qk.w4 w4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364359d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364359d;
        this.f364359d = i17 + 1;
        if (i17 == 0) {
            return ef0.p3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
