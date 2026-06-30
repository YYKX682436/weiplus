package mz2;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333211d = 0;

    public z(mz2.a0 a0Var, mz2.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333211d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333211d;
        this.f333211d = i17 + 1;
        if (i17 == 0) {
            return mz2.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
