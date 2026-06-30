package pn4;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f357052d = 0;

    public c(pn4.d dVar, pn4.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f357052d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f357052d;
        this.f357052d = i17 + 1;
        if (i17 == 0) {
            return pn4.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
