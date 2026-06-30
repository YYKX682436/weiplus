package v90;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434147d = 0;

    public r(v90.s sVar, v90.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434147d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434147d;
        this.f434147d = i17 + 1;
        if (i17 == 0) {
            return u90.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
