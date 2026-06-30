package wc;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f444450d = 0;

    public b(wc.c cVar, wc.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f444450d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f444450d;
        this.f444450d = i17 + 1;
        if (i17 == 0) {
            return vc.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
