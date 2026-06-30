package ft;

/* loaded from: classes6.dex */
public class s2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f266430d = 0;

    public s2(ft.t2 t2Var, ft.r2 r2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f266430d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f266430d;
        this.f266430d = i17 + 1;
        if (i17 == 0) {
            return et.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
