package j00;

/* loaded from: classes6.dex */
public class i2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f296794d = 0;

    public i2(j00.j2 j2Var, j00.h2 h2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f296794d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f296794d;
        this.f296794d = i17 + 1;
        if (i17 == 0) {
            return j00.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
