package ga5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f269937d = 0;

    public b(ga5.c cVar, ga5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f269937d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f269937d;
        this.f269937d = i17 + 1;
        if (i17 == 0) {
            return ga5.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
