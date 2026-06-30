package e60;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f249694d = 0;

    public f(e60.g gVar, e60.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f249694d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f249694d;
        this.f249694d = i17 + 1;
        if (i17 == 0) {
            return th5.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
