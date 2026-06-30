package em3;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f255196d = 0;

    public n(em3.o oVar, em3.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f255196d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f255196d;
        this.f255196d = i17 + 1;
        if (i17 == 0) {
            return em3.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
