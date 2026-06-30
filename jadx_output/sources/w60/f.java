package w60;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f443257d = 0;

    public f(w60.g gVar, w60.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f443257d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f443257d;
        this.f443257d = i17 + 1;
        if (i17 == 0) {
            return v60.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
