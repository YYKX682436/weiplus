package w61;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f443271d = 0;

    public s(w61.t tVar, w61.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f443271d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f443271d;
        this.f443271d = i17 + 1;
        if (i17 == 0) {
            return w61.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
