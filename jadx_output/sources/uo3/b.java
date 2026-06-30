package uo3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f429650d = 0;

    public b(uo3.c cVar, uo3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f429650d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f429650d;
        this.f429650d = i17 + 1;
        if (i17 == 0) {
            return uo3.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
