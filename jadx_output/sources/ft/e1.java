package ft;

/* loaded from: classes6.dex */
public class e1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f266381d = 0;

    public e1(ft.f1 f1Var, ft.d1 d1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f266381d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f266381d;
        this.f266381d = i17 + 1;
        if (i17 == 0) {
            return et.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
