package q63;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360281d = 0;

    public b(q63.c cVar, q63.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360281d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360281d;
        this.f360281d = i17 + 1;
        if (i17 == 0) {
            return o63.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
