package u30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424248d = 0;

    public b(u30.c cVar, u30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424248d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424248d;
        this.f424248d = i17 + 1;
        if (i17 == 0) {
            return u30.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
