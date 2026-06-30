package vy4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441497d = 0;

    public f(vy4.g gVar, vy4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441497d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441497d;
        this.f441497d = i17 + 1;
        if (i17 == 0) {
            return vy4.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
