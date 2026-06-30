package m40;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323423d = 0;

    public r(m40.s sVar, m40.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323423d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323423d;
        this.f323423d = i17 + 1;
        if (i17 == 0) {
            return od2.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
