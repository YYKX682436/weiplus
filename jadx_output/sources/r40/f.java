package r40;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f369499d = 0;

    public f(r40.g gVar, r40.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f369499d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f369499d;
        this.f369499d = i17 + 1;
        if (i17 == 0) {
            return r40.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
