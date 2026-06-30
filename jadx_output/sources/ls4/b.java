package ls4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f321040d = 0;

    public b(ls4.c cVar, ls4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f321040d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f321040d;
        this.f321040d = i17 + 1;
        if (i17 == 0) {
            return ls4.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
