package dd0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f228909d = 0;

    public f(dd0.g gVar, dd0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f228909d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f228909d;
        this.f228909d = i17 + 1;
        if (i17 == 0) {
            return dd0.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
