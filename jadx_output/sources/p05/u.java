package p05;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350694d = 0;

    public u(p05.v vVar, p05.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350694d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350694d;
        this.f350694d = i17 + 1;
        if (i17 == 0) {
            return p05.x2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
