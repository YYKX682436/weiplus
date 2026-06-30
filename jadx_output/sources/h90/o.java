package h90;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f279681d = 0;

    public o(h90.p pVar, h90.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f279681d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f279681d;
        this.f279681d = i17 + 1;
        if (i17 == 0) {
            return g90.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
