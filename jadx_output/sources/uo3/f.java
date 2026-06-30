package uo3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f429653d = 0;

    public f(uo3.g gVar, uo3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f429653d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f429653d;
        this.f429653d = i17 + 1;
        if (i17 == 0) {
            return uo3.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
