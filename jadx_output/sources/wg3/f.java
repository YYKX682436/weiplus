package wg3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445727d = 0;

    public f(wg3.g gVar, wg3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445727d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445727d;
        this.f445727d = i17 + 1;
        if (i17 == 0) {
            return kc5.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
