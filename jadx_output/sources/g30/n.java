package g30;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f268050d = 0;

    public n(g30.o oVar, g30.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f268050d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f268050d;
        this.f268050d = i17 + 1;
        if (i17 == 0) {
            return g30.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
