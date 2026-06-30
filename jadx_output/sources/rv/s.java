package rv;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399897d = 0;

    public s(rv.t tVar, rv.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399897d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399897d;
        this.f399897d = i17 + 1;
        if (i17 == 0) {
            return qv.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
