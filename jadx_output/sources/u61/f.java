package u61;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424885d = 0;

    public f(u61.g gVar, u61.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424885d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424885d;
        this.f424885d = i17 + 1;
        if (i17 == 0) {
            return u61.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
