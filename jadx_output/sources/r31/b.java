package r31;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368950d = 0;

    public b(r31.c cVar, r31.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368950d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368950d;
        this.f368950d = i17 + 1;
        if (i17 == 0) {
            return ko.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
