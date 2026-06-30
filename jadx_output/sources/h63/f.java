package h63;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f279227d = 0;

    public f(h63.g gVar, h63.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f279227d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f279227d;
        this.f279227d = i17 + 1;
        if (i17 == 0) {
            return h63.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
