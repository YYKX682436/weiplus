package fq0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f265449d = 0;

    public f(fq0.g gVar, fq0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f265449d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f265449d;
        this.f265449d = i17 + 1;
        if (i17 == 0) {
            return fq0.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
