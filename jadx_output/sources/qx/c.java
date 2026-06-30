package qx;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f367245d = 0;

    public c(qx.d dVar, qx.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f367245d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f367245d;
        this.f367245d = i17 + 1;
        if (i17 == 0) {
            return px.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
