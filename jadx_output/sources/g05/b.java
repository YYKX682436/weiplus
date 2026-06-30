package g05;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f267471d = 0;

    public b(g05.c cVar, g05.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f267471d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f267471d;
        this.f267471d = i17 + 1;
        if (i17 == 0) {
            return g05.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
