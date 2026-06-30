package ja0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f298587d = 0;

    public n(ja0.o oVar, ja0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f298587d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f298587d;
        this.f298587d = i17 + 1;
        if (i17 == 0) {
            return ja0.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
