package ml2;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f327860d = 0;

    public r(ml2.s sVar, ml2.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f327860d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f327860d;
        this.f327860d = i17 + 1;
        if (i17 == 0) {
            return ml2.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
