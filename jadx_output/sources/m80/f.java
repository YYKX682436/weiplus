package m80;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324685d = 0;

    public f(m80.g gVar, m80.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324685d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324685d;
        this.f324685d = i17 + 1;
        if (i17 == 0) {
            return l80.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
