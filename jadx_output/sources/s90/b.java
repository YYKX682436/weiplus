package s90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404984d = 0;

    public b(s90.c cVar, s90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404984d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404984d;
        this.f404984d = i17 + 1;
        if (i17 == 0) {
            return s90.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
