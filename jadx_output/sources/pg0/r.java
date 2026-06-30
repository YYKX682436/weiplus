package pg0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f354048d = 0;

    public r(pg0.s sVar, pg0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f354048d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f354048d;
        this.f354048d = i17 + 1;
        if (i17 == 0) {
            return pg0.q1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
