package r35;

/* loaded from: classes6.dex */
public class x2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f369324d = 0;

    public x2(r35.y2 y2Var, r35.w2 w2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f369324d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f369324d;
        this.f369324d = i17 + 1;
        if (i17 == 0) {
            return r35.p1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
