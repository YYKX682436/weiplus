package km4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f309270d = 0;

    public b(km4.c cVar, km4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f309270d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f309270d;
        this.f309270d = i17 + 1;
        if (i17 == 0) {
            return km4.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
