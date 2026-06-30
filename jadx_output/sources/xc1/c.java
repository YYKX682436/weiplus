package xc1;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f453028d = 0;

    public c(xc1.d dVar, xc1.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f453028d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f453028d;
        this.f453028d = i17 + 1;
        if (i17 == 0) {
            return xc1.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
