package g05;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f267474d = 0;

    public f(g05.g gVar, g05.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f267474d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f267474d;
        this.f267474d = i17 + 1;
        if (i17 == 0) {
            return g05.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
