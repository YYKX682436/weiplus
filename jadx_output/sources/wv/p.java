package wv;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f449887d = 0;

    public p(wv.q qVar, wv.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f449887d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f449887d;
        this.f449887d = i17 + 1;
        if (i17 == 0) {
            return wv.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
