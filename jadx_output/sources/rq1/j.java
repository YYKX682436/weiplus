package rq1;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398750d = 0;

    public j(rq1.k kVar, rq1.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398750d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398750d;
        this.f398750d = i17 + 1;
        if (i17 == 0) {
            return rq1.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
