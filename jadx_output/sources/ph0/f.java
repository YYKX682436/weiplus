package ph0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f354300d = 0;

    public f(ph0.g gVar, ph0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f354300d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f354300d;
        this.f354300d = i17 + 1;
        if (i17 == 0) {
            return nh0.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
