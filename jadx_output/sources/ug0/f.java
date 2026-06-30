package ug0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f427456d = 0;

    public f(ug0.g gVar, ug0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f427456d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f427456d;
        this.f427456d = i17 + 1;
        if (i17 == 0) {
            return ug0.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
