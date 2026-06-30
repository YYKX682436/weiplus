package rh0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f395608d = 0;

    public r(rh0.s sVar, rh0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f395608d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f395608d;
        this.f395608d = i17 + 1;
        if (i17 == 0) {
            return qh0.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
