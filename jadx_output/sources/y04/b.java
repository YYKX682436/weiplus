package y04;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f458650d = 0;

    public b(y04.c cVar, y04.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f458650d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f458650d;
        this.f458650d = i17 + 1;
        if (i17 == 0) {
            return y04.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
