package wo2;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f448071d = 0;

    public f(wo2.g gVar, wo2.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f448071d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f448071d;
        this.f448071d = i17 + 1;
        if (i17 == 0) {
            return wo2.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
