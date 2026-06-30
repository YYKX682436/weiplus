package mu4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331402d = 0;

    public b(mu4.c cVar, mu4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331402d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331402d;
        this.f331402d = i17 + 1;
        if (i17 == 0) {
            return et.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
