package n34;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f334760d = 0;

    public w(n34.x xVar, n34.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334760d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334760d;
        this.f334760d = i17 + 1;
        if (i17 == 0) {
            return n34.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
