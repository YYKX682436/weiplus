package zq1;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f474980d = 0;

    public f(zq1.g gVar, zq1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f474980d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f474980d;
        this.f474980d = i17 + 1;
        if (i17 == 0) {
            return aq1.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
