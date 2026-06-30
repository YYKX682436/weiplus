package gh4;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f271937d = 0;

    public l(gh4.m mVar, gh4.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f271937d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f271937d;
        this.f271937d = i17 + 1;
        if (i17 == 0) {
            return gh4.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
