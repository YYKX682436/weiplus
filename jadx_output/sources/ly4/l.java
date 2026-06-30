package ly4;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f322300d = 0;

    public l(ly4.m mVar, ly4.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f322300d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f322300d;
        this.f322300d = i17 + 1;
        if (i17 == 0) {
            return ly4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
