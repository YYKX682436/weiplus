package ml2;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f327721d = 0;

    public n(ml2.o oVar, ml2.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f327721d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f327721d;
        this.f327721d = i17 + 1;
        if (i17 == 0) {
            return ml2.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
