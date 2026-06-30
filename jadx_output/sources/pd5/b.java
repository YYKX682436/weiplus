package pd5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353571d = 0;

    public b(pd5.c cVar, pd5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353571d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353571d;
        this.f353571d = i17 + 1;
        if (i17 == 0) {
            return pd5.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
