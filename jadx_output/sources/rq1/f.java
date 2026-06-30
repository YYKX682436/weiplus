package rq1;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398744d = 0;

    public f(rq1.g gVar, rq1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398744d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398744d;
        this.f398744d = i17 + 1;
        if (i17 == 0) {
            return rq1.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
