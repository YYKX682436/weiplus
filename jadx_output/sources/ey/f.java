package ey;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f257271d = 0;

    public f(ey.g gVar, ey.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f257271d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f257271d;
        this.f257271d = i17 + 1;
        if (i17 == 0) {
            return ey.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
