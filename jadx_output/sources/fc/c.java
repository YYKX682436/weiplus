package fc;

/* loaded from: classes16.dex */
public abstract class c extends fc.o implements java.util.Iterator {

    /* renamed from: g, reason: collision with root package name */
    public final fc.s f260905g;

    public c(fc.s sVar) {
        super(sVar);
        this.f260905g = sVar;
    }

    public abstract java.lang.Object a(int i17);

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int nextIndex = nextIndex();
        this.f260922f = nextIndex;
        if (nextIndex >= 0) {
            return a(nextIndex);
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // fc.o
    public final int nextIndex() {
        int i17;
        java.lang.Object obj;
        int i18 = this.f260921e;
        fc.s sVar = this.f260905g;
        if (i18 != sVar.f260900d) {
            throw new java.util.ConcurrentModificationException();
        }
        java.lang.Object[] objArr = sVar.f260928i;
        int i19 = this.f260922f;
        while (true) {
            i17 = i19 - 1;
            if (i19 <= 0 || !((obj = objArr[i17]) == null || obj == fc.s.f260926n)) {
                break;
            }
            i19 = i17;
        }
        return i17;
    }
}
