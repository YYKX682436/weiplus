package tp1;

/* loaded from: classes6.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f421037d = 0;

    public d0(tp1.e0 e0Var, tp1.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f421037d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f421037d;
        this.f421037d = i17 + 1;
        if (i17 == 0) {
            return tp1.x1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
