package w72;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f443484d = 0;

    public i(w72.j jVar, w72.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f443484d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f443484d;
        this.f443484d = i17 + 1;
        if (i17 == 0) {
            return w72.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
