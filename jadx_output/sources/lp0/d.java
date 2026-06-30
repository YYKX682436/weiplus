package lp0;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f320263d = 0;

    public d(lp0.e eVar, lp0.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f320263d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f320263d;
        this.f320263d = i17 + 1;
        if (i17 == 0) {
            return hr0.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
