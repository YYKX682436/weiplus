package e60;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f249722d = 0;

    public r(e60.s sVar, e60.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f249722d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f249722d;
        this.f249722d = i17 + 1;
        if (i17 == 0) {
            return zh5.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
