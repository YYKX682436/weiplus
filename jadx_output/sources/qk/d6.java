package qk;

/* loaded from: classes6.dex */
public class d6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f364074d = 0;

    public d6(qk.e6 e6Var, qk.c6 c6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f364074d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f364074d;
        this.f364074d = i17 + 1;
        if (i17 == 0) {
            return cw4.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
