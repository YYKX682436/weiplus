package f61;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259842d = 0;

    public r(f61.s sVar, f61.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259842d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259842d;
        this.f259842d = i17 + 1;
        if (i17 == 0) {
            return f61.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
