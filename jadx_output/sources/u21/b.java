package u21;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f423958d = 0;

    public b(u21.c cVar, u21.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f423958d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f423958d;
        this.f423958d = i17 + 1;
        if (i17 == 0) {
            return u21.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
