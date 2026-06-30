package rx;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f400887d = 0;

    public o(rx.p pVar, rx.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f400887d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f400887d;
        this.f400887d = i17 + 1;
        if (i17 == 0) {
            return rx.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
