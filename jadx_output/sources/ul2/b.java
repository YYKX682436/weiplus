package ul2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428589d = 0;

    public b(ul2.c cVar, ul2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428589d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428589d;
        this.f428589d = i17 + 1;
        if (i17 == 0) {
            return ul2.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
