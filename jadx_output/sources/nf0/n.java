package nf0;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336626d = 0;

    public n(nf0.o oVar, nf0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336626d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336626d;
        this.f336626d = i17 + 1;
        if (i17 == 0) {
            return nf0.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
