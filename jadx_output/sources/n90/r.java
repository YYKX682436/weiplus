package n90;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335822d = 0;

    public r(n90.s sVar, n90.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335822d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335822d;
        this.f335822d = i17 + 1;
        if (i17 == 0) {
            return n90.g1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
