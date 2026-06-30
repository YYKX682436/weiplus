package te0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f417765d = 0;

    public b(te0.c cVar, te0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f417765d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f417765d;
        this.f417765d = i17 + 1;
        if (i17 == 0) {
            return se0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
