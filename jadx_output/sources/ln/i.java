package ln;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f319626d = 0;

    public i(ln.j jVar, ln.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f319626d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f319626d;
        this.f319626d = i17 + 1;
        if (i17 == 0) {
            return ln.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
