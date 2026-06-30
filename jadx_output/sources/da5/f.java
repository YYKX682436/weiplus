package da5;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f227803d = 0;

    public f(da5.g gVar, da5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f227803d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f227803d;
        this.f227803d = i17 + 1;
        if (i17 == 0) {
            return da5.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
