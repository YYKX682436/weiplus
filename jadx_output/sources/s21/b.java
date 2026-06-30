package s21;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f402282d = 0;

    public b(s21.c cVar, s21.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402282d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f402282d;
        this.f402282d = i17 + 1;
        if (i17 == 0) {
            return s21.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
