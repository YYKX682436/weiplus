package q30;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359900d = 0;

    public f(q30.g gVar, q30.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359900d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359900d;
        this.f359900d = i17 + 1;
        if (i17 == 0) {
            return q30.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
