package v60;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f433410d = 0;

    public r(v60.s sVar, v60.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f433410d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f433410d;
        this.f433410d = i17 + 1;
        if (i17 == 0) {
            return v60.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
