package q90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360874d = 0;

    public b(q90.c cVar, q90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360874d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360874d;
        this.f360874d = i17 + 1;
        if (i17 == 0) {
            return q90.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
