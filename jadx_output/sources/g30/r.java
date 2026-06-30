package g30;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f268053d = 0;

    public r(g30.s sVar, g30.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f268053d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f268053d;
        this.f268053d = i17 + 1;
        if (i17 == 0) {
            return g30.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
