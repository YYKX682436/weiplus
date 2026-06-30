package rd0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f394223d = 0;

    public r(rd0.s sVar, rd0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f394223d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f394223d;
        this.f394223d = i17 + 1;
        if (i17 == 0) {
            return qd0.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
