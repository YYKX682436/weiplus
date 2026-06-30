package fe0;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261437d = 0;

    public s(fe0.t tVar, fe0.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261437d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261437d;
        this.f261437d = i17 + 1;
        if (i17 == 0) {
            return ee0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
