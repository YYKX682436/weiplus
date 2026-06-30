package r43;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f369521d = 0;

    public f(r43.g gVar, r43.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f369521d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f369521d;
        this.f369521d = i17 + 1;
        if (i17 == 0) {
            return r43.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
