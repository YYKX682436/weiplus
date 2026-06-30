package h01;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f277858d = 0;

    public r(h01.s sVar, h01.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f277858d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f277858d;
        this.f277858d = i17 + 1;
        if (i17 == 0) {
            return h01.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
