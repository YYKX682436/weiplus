package xc;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f453017d = 0;

    public f(xc.g gVar, xc.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f453017d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f453017d;
        this.f453017d = i17 + 1;
        if (i17 == 0) {
            return xc.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
