package qc0;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361449d = 0;

    public w(qc0.x xVar, qc0.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361449d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361449d;
        this.f361449d = i17 + 1;
        if (i17 == 0) {
            return pc0.f2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
