package cx;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f224456d = 0;

    public r(cx.s sVar, cx.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f224456d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f224456d;
        this.f224456d = i17 + 1;
        if (i17 == 0) {
            return cx.b2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
