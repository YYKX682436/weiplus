package zu4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475879d = 0;

    public f(zu4.g gVar, zu4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475879d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475879d;
        this.f475879d = i17 + 1;
        if (i17 == 0) {
            return zu4.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
