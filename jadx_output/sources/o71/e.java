package o71;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343290d = 0;

    public e(o71.f fVar, o71.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343290d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343290d;
        this.f343290d = i17 + 1;
        if (i17 == 0) {
            return o71.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
