package le0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318117d = 0;

    public f(le0.g gVar, le0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318117d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318117d;
        this.f318117d = i17 + 1;
        if (i17 == 0) {
            return ke0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
