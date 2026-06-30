package u21;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f423961d = 0;

    public f(u21.g gVar, u21.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f423961d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f423961d;
        this.f423961d = i17 + 1;
        if (i17 == 0) {
            return u21.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
