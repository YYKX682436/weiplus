package sg0;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407741d = 0;

    public l(sg0.m mVar, sg0.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407741d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407741d;
        this.f407741d = i17 + 1;
        if (i17 == 0) {
            return sg0.b2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
