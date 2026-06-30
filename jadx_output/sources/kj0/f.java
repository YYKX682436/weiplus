package kj0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308285d = 0;

    public f(kj0.g gVar, kj0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308285d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308285d;
        this.f308285d = i17 + 1;
        if (i17 == 0) {
            return kj0.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
