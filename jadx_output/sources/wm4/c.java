package wm4;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f447288d = 0;

    public c(wm4.d dVar, wm4.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f447288d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f447288d;
        this.f447288d = i17 + 1;
        if (i17 == 0) {
            return wm4.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
