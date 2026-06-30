package f23;

/* loaded from: classes.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259054d = 0;

    public r(f23.s sVar, f23.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259054d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259054d;
        this.f259054d = i17 + 1;
        if (i17 == 0) {
            return f23.l2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
