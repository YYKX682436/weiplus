package rv;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399906d = 0;

    public w(rv.x xVar, rv.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399906d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399906d;
        this.f399906d = i17 + 1;
        if (i17 == 0) {
            return qv.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
