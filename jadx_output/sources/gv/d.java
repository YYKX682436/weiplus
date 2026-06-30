package gv;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f275965d = 0;

    public d(gv.e eVar, gv.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f275965d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f275965d;
        this.f275965d = i17 + 1;
        if (i17 == 0) {
            return gv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
