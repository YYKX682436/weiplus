package mn2;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f329951d = 0;

    public f(mn2.g gVar, mn2.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f329951d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f329951d;
        this.f329951d = i17 + 1;
        if (i17 == 0) {
            return mn2.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
