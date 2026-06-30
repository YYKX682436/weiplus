package oa0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343803d = 0;

    public f(oa0.g gVar, oa0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343803d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343803d;
        this.f343803d = i17 + 1;
        if (i17 == 0) {
            return na0.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
