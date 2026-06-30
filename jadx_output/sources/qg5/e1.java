package qg5;

/* loaded from: classes6.dex */
public class e1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362959d = 0;

    public e1(qg5.f1 f1Var, qg5.d1 d1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362959d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362959d;
        this.f362959d = i17 + 1;
        if (i17 == 0) {
            return qg5.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
