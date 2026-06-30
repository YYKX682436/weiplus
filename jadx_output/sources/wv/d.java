package wv;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f449866d = 0;

    public d(wv.e eVar, wv.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f449866d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f449866d;
        this.f449866d = i17 + 1;
        if (i17 == 0) {
            return wv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
