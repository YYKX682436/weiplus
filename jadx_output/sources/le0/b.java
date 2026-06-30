package le0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318114d = 0;

    public b(le0.c cVar, le0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318114d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318114d;
        this.f318114d = i17 + 1;
        if (i17 == 0) {
            return ez.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
