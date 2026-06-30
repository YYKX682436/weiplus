package ll3;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f319197d = 0;

    public n(ll3.o oVar, ll3.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f319197d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f319197d;
        this.f319197d = i17 + 1;
        if (i17 == 0) {
            return ll3.y0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
