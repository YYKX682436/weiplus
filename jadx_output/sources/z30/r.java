package z30;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f469872d = 0;

    public r(z30.s sVar, z30.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f469872d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f469872d;
        this.f469872d = i17 + 1;
        if (i17 == 0) {
            return y30.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
