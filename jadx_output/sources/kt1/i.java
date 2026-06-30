package kt1;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f311947d = 0;

    public i(kt1.j jVar, kt1.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f311947d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f311947d;
        this.f311947d = i17 + 1;
        if (i17 == 0) {
            return kt1.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
