package ue0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426779d = 0;

    public f(ue0.g gVar, ue0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426779d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426779d;
        this.f426779d = i17 + 1;
        if (i17 == 0) {
            return ue0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
