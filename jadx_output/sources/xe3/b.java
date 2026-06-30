package xe3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f453936d = 0;

    public b(xe3.c cVar, xe3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f453936d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f453936d;
        this.f453936d = i17 + 1;
        if (i17 == 0) {
            return xe3.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
