package fa1;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f260690d = 0;

    public l(fa1.m mVar, fa1.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f260690d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f260690d;
        this.f260690d = i17 + 1;
        if (i17 == 0) {
            return fa1.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
