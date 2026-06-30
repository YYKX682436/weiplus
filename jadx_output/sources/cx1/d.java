package cx1;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f224524d = 0;

    public d(cx1.e eVar, cx1.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f224524d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f224524d;
        this.f224524d = i17 + 1;
        if (i17 == 0) {
            return cx1.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
