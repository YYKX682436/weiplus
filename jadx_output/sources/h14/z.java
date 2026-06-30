package h14;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278217d = 0;

    public z(h14.a0 a0Var, h14.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278217d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278217d;
        this.f278217d = i17 + 1;
        if (i17 == 0) {
            return h14.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
