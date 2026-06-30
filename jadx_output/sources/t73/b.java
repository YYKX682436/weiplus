package t73;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f416074d = 0;

    public b(t73.c cVar, t73.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f416074d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f416074d;
        this.f416074d = i17 + 1;
        if (i17 == 0) {
            return t73.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
