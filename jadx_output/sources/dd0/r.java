package dd0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f228935d = 0;

    public r(dd0.s sVar, dd0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f228935d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f228935d;
        this.f228935d = i17 + 1;
        if (i17 == 0) {
            return dd0.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
