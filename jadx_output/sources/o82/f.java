package o82;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343643d = 0;

    public f(o82.g gVar, o82.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343643d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343643d;
        this.f343643d = i17 + 1;
        if (i17 == 0) {
            return o82.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
