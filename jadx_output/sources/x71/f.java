package x71;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f452421d = 0;

    public f(x71.g gVar, x71.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f452421d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f452421d;
        this.f452421d = i17 + 1;
        if (i17 == 0) {
            return x71.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
