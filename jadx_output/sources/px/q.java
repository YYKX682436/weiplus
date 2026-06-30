package px;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f358757d = 0;

    public q(px.r rVar, px.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f358757d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f358757d;
        this.f358757d = i17 + 1;
        if (i17 == 0) {
            return px.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
