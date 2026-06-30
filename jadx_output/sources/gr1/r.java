package gr1;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f274747d = 0;

    public r(gr1.s sVar, gr1.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f274747d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f274747d;
        this.f274747d = i17 + 1;
        if (i17 == 0) {
            return gr1.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
