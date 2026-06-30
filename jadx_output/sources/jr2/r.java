package jr2;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301382d = 0;

    public r(jr2.s sVar, jr2.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301382d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301382d;
        this.f301382d = i17 + 1;
        if (i17 == 0) {
            return jr2.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
