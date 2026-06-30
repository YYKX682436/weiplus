package m60;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324353d = 0;

    public f(m60.g gVar, m60.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324353d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324353d;
        this.f324353d = i17 + 1;
        if (i17 == 0) {
            return m60.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
