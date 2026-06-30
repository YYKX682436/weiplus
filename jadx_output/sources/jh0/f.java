package jh0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f299772d = 0;

    public f(jh0.g gVar, jh0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f299772d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f299772d;
        this.f299772d = i17 + 1;
        if (i17 == 0) {
            return jh0.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
