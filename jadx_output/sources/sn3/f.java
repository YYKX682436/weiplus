package sn3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f410135d = 0;

    public f(sn3.g gVar, sn3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f410135d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f410135d;
        this.f410135d = i17 + 1;
        if (i17 == 0) {
            return sn3.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
