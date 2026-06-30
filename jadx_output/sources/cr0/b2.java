package cr0;

/* loaded from: classes6.dex */
public class b2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f221594d = 0;

    public b2(cr0.c2 c2Var, cr0.a2 a2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f221594d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f221594d;
        this.f221594d = i17 + 1;
        if (i17 == 0) {
            return cr0.b5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
