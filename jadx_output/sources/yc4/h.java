package yc4;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f460853d = 0;

    public h(yc4.i iVar, yc4.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f460853d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f460853d;
        this.f460853d = i17 + 1;
        if (i17 == 0) {
            return yc4.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
