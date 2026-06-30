package ve3;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436095d = 0;

    public c(ve3.d dVar, ve3.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436095d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436095d;
        this.f436095d = i17 + 1;
        if (i17 == 0) {
            return we3.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
