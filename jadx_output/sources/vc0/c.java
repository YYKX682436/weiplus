package vc0;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434893d = 0;

    public c(vc0.d dVar, vc0.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434893d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434893d;
        this.f434893d = i17 + 1;
        if (i17 == 0) {
            return vc0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
