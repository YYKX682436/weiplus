package e42;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f249326d = 0;

    public f(e42.g gVar, e42.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f249326d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f249326d;
        this.f249326d = i17 + 1;
        if (i17 == 0) {
            return g42.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
