package uv1;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f431363d = 0;

    public g(uv1.h hVar, uv1.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f431363d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f431363d;
        this.f431363d = i17 + 1;
        if (i17 == 0) {
            return uv1.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
