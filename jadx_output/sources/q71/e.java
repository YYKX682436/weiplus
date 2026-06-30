package q71;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360338d = 0;

    public e(q71.f fVar, q71.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360338d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360338d;
        this.f360338d = i17 + 1;
        if (i17 == 0) {
            return q71.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
