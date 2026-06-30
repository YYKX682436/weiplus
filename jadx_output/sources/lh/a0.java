package lh;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318588d = 0;

    public a0(lh.b0 b0Var, lh.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318588d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318588d;
        this.f318588d = i17 + 1;
        if (i17 == 0) {
            return dr0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
