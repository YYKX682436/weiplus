package d90;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f227433d = 0;

    public f(d90.g gVar, d90.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f227433d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f227433d;
        this.f227433d = i17 + 1;
        if (i17 == 0) {
            return d90.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
