package qy;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f367549d = 0;

    public f(qy.g gVar, qy.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f367549d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f367549d;
        this.f367549d = i17 + 1;
        if (i17 == 0) {
            return xf5.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
