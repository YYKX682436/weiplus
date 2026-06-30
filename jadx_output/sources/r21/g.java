package r21;

/* loaded from: classes.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368788d = 0;

    public g(r21.h hVar, r21.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368788d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368788d;
        this.f368788d = i17 + 1;
        if (i17 == 0) {
            return r21.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
