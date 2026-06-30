package tb0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f416886d = 0;

    public f(tb0.g gVar, tb0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f416886d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f416886d;
        this.f416886d = i17 + 1;
        if (i17 == 0) {
            return sb0.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
