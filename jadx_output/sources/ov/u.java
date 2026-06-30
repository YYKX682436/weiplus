package ov;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f349109d = 0;

    public u(ov.v vVar, ov.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f349109d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f349109d;
        this.f349109d = i17 + 1;
        if (i17 == 0) {
            return ov.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
