package vd2;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435871d = 0;

    public r(vd2.s sVar, vd2.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435871d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435871d;
        this.f435871d = i17 + 1;
        if (i17 == 0) {
            return vd2.q2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
