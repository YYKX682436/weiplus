package kc5;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f306561d = 0;

    public f(kc5.g gVar, kc5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f306561d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f306561d;
        this.f306561d = i17 + 1;
        if (i17 == 0) {
            return kc5.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
