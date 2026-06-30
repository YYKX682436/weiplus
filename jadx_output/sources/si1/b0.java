package si1;

/* loaded from: classes6.dex */
public class b0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f408230d = 0;

    public b0(si1.c0 c0Var, si1.a0 a0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f408230d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f408230d;
        this.f408230d = i17 + 1;
        if (i17 == 0) {
            return si1.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
