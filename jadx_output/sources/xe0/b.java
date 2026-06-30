package xe0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f453743d = 0;

    public b(xe0.c cVar, xe0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f453743d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f453743d;
        this.f453743d = i17 + 1;
        if (i17 == 0) {
            return we0.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
