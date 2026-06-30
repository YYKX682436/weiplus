package yb0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f460636d = 0;

    public j(yb0.k kVar, yb0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f460636d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f460636d;
        this.f460636d = i17 + 1;
        if (i17 == 0) {
            return yb0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
