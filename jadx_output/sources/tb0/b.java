package tb0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f416883d = 0;

    public b(tb0.c cVar, tb0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f416883d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f416883d;
        this.f416883d = i17 + 1;
        if (i17 == 0) {
            return sb0.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
