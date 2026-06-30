package z80;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f470665d = 0;

    public r(z80.s sVar, z80.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f470665d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f470665d;
        this.f470665d = i17 + 1;
        if (i17 == 0) {
            return y80.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
