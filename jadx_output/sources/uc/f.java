package uc;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426258d = 0;

    public f(uc.g gVar, uc.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426258d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426258d;
        this.f426258d = i17 + 1;
        if (i17 == 0) {
            return r40.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
