package vh0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436914d = 0;

    public n(vh0.o oVar, vh0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436914d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436914d;
        this.f436914d = i17 + 1;
        if (i17 == 0) {
            return vh0.j2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
