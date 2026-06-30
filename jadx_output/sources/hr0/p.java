package hr0;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f283317d = 0;

    public p(hr0.q qVar, hr0.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f283317d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f283317d;
        this.f283317d = i17 + 1;
        if (i17 == 0) {
            return hr0.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
