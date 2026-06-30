package o72;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343348d = 0;

    public i(o72.j jVar, o72.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343348d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343348d;
        this.f343348d = i17 + 1;
        if (i17 == 0) {
            return a40.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
