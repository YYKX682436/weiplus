package h01;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f277845d = 0;

    public f(h01.g gVar, h01.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f277845d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f277845d;
        this.f277845d = i17 + 1;
        if (i17 == 0) {
            return h01.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
