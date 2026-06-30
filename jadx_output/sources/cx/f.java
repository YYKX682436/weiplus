package cx;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f224399d = 0;

    public f(cx.g gVar, cx.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f224399d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f224399d;
        this.f224399d = i17 + 1;
        if (i17 == 0) {
            return cx.u1.INSTANCE;
        }
        if (i17 == 1) {
            return cx.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
