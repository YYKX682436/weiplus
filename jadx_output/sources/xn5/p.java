package xn5;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f455699d = 0;

    public p(xn5.q qVar, xn5.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f455699d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f455699d;
        this.f455699d = i17 + 1;
        if (i17 == 0) {
            return xn5.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
