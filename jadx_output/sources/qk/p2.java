package qk;

/* loaded from: classes6.dex */
public class p2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364306d = 0;

    public p2(qk.q2 q2Var, qk.o2 o2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364306d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364306d;
        this.f364306d = i17 + 1;
        if (i17 == 0) {
            return c61.gc.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
