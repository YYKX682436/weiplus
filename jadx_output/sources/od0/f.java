package od0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f344540d = 0;

    public f(od0.g gVar, od0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f344540d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f344540d;
        this.f344540d = i17 + 1;
        if (i17 == 0) {
            return od0.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
