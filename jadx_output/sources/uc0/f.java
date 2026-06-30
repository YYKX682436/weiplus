package uc0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426269d = 0;

    public f(uc0.g gVar, uc0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426269d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426269d;
        this.f426269d = i17 + 1;
        if (i17 == 0) {
            return tc0.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
