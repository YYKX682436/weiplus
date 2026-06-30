package cr0;

/* loaded from: classes6.dex */
public class f2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f221624d = 0;

    public f2(cr0.g2 g2Var, cr0.e2 e2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f221624d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f221624d;
        this.f221624d = i17 + 1;
        if (i17 == 0) {
            return cr0.a7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
