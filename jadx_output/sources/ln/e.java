package ln;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f319623d = 0;

    public e(ln.f fVar, ln.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f319623d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f319623d;
        this.f319623d = i17 + 1;
        if (i17 == 0) {
            return ln.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
