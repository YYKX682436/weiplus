package l32;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f315420d = 0;

    public u(l32.v vVar, l32.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f315420d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f315420d;
        this.f315420d = i17 + 1;
        if (i17 == 0) {
            return l32.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
