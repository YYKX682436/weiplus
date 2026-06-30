package z62;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f470342d = 0;

    public f(z62.g gVar, z62.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f470342d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f470342d;
        this.f470342d = i17 + 1;
        if (i17 == 0) {
            return z62.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
