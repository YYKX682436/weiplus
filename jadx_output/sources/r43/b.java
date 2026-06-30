package r43;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f369518d = 0;

    public b(r43.c cVar, r43.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f369518d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f369518d;
        this.f369518d = i17 + 1;
        if (i17 == 0) {
            return r43.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
