package r30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368937d = 0;

    public b(r30.c cVar, r30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368937d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368937d;
        this.f368937d = i17 + 1;
        if (i17 == 0) {
            return q30.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
