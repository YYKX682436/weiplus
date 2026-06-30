package v90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434135d = 0;

    public b(v90.c cVar, v90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434135d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434135d;
        this.f434135d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.insane_statistic.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
