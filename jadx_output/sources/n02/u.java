package n02;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333902d = 0;

    public u(n02.v vVar, n02.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333902d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333902d;
        this.f333902d = i17 + 1;
        if (i17 == 0) {
            return n02.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
