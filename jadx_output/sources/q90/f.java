package q90;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360877d = 0;

    public f(q90.g gVar, q90.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360877d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360877d;
        this.f360877d = i17 + 1;
        if (i17 == 0) {
            return q90.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
