package kt;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f311879d = 0;

    public n(kt.o oVar, kt.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f311879d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f311879d;
        this.f311879d = i17 + 1;
        if (i17 == 0) {
            return kt.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
