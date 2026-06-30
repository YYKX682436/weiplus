package n74;

/* loaded from: classes6.dex */
public class e1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335349d = 0;

    public e1(n74.f1 f1Var, n74.d1 d1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335349d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335349d;
        this.f335349d = i17 + 1;
        if (i17 == 0) {
            return n74.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
