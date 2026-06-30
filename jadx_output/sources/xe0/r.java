package xe0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f453771d = 0;

    public r(xe0.s sVar, xe0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f453771d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f453771d;
        this.f453771d = i17 + 1;
        if (i17 == 0) {
            return we0.f1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
