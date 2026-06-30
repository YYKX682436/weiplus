package fh1;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f262544d = 0;

    public f(fh1.g gVar, fh1.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f262544d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f262544d;
        this.f262544d = i17 + 1;
        if (i17 == 0) {
            return fh1.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
