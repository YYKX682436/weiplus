package l61;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f316750d = 0;

    public b(l61.c cVar, l61.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f316750d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f316750d;
        this.f316750d = i17 + 1;
        if (i17 == 0) {
            return l61.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
