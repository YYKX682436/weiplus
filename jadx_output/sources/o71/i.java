package o71;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343293d = 0;

    public i(o71.j jVar, o71.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343293d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343293d;
        this.f343293d = i17 + 1;
        if (i17 == 0) {
            return o71.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
