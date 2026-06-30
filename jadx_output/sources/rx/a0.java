package rx;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f400651d = 0;

    public a0(rx.b0 b0Var, rx.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f400651d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f400651d;
        this.f400651d = i17 + 1;
        if (i17 == 0) {
            return rx.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
