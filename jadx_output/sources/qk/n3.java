package qk;

/* loaded from: classes6.dex */
public class n3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364287d = 0;

    public n3(qk.o3 o3Var, qk.m3 m3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364287d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364287d;
        this.f364287d = i17 + 1;
        if (i17 == 0) {
            return ef0.l2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
