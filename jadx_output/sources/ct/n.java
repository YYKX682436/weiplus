package ct;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222171d = 0;

    public n(ct.o oVar, ct.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222171d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222171d;
        this.f222171d = i17 + 1;
        if (i17 == 0) {
            return te5.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
