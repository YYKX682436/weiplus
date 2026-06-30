package yg0;

/* loaded from: classes6.dex */
public class p1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f462243d = 0;

    public p1(yg0.q1 q1Var, yg0.o1 o1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f462243d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f462243d;
        this.f462243d = i17 + 1;
        if (i17 == 0) {
            return yg0.j4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
