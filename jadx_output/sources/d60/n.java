package d60;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f226677d = 0;

    public n(d60.o oVar, d60.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f226677d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f226677d;
        this.f226677d = i17 + 1;
        if (i17 == 0) {
            return d60.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
