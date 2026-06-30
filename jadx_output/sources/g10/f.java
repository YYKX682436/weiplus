package g10;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f267520d = 0;

    public f(g10.g gVar, g10.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f267520d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f267520d;
        this.f267520d = i17 + 1;
        if (i17 == 0) {
            return g10.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
