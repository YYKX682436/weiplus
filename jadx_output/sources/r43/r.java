package r43;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f369547d = 0;

    public r(r43.s sVar, r43.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f369547d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f369547d;
        this.f369547d = i17 + 1;
        if (i17 == 0) {
            return r43.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
