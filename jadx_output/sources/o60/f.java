package o60;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343180d = 0;

    public f(o60.g gVar, o60.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343180d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343180d;
        this.f343180d = i17 + 1;
        if (i17 == 0) {
            return o60.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
