package v71;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f433640d = 0;

    public e(v71.f fVar, v71.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f433640d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f433640d;
        this.f433640d = i17 + 1;
        if (i17 == 0) {
            return v71.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
