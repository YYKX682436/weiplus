package ll3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f319137d = 0;

    public b(ll3.c cVar, ll3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f319137d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f319137d;
        this.f319137d = i17 + 1;
        if (i17 == 0) {
            return ll3.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
