package ww;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f450071d = 0;

    public b(ww.c cVar, ww.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450071d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f450071d;
        this.f450071d = i17 + 1;
        if (i17 == 0) {
            return lr1.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
