package i30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f288094d = 0;

    public b(i30.c cVar, i30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f288094d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f288094d;
        this.f288094d = i17 + 1;
        if (i17 == 0) {
            return i30.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
