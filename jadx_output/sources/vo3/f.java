package vo3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f438568d = 0;

    public f(vo3.g gVar, vo3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f438568d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f438568d;
        this.f438568d = i17 + 1;
        if (i17 == 0) {
            return vo3.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
