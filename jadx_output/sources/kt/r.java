package kt;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f311887d = 0;

    public r(kt.s sVar, kt.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f311887d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f311887d;
        this.f311887d = i17 + 1;
        if (i17 == 0) {
            return kt.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
