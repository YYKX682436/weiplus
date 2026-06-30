package e21;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f246485d = 0;

    public b(e21.c cVar, e21.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f246485d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f246485d;
        this.f246485d = i17 + 1;
        if (i17 == 0) {
            return e21.c1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
