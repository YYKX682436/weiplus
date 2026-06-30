package s50;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f403106d = 0;

    public r(s50.s sVar, s50.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f403106d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f403106d;
        this.f403106d = i17 + 1;
        if (i17 == 0) {
            return s50.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
