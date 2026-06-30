package ty4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f423135d = 0;

    public b(ty4.c cVar, ty4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f423135d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f423135d;
        this.f423135d = i17 + 1;
        if (i17 == 0) {
            return sy4.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
