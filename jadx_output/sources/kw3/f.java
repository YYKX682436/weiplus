package kw3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f313125d = 0;

    public f(kw3.g gVar, kw3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f313125d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f313125d;
        this.f313125d = i17 + 1;
        if (i17 == 0) {
            return kw3.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
