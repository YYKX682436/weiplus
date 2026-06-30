package v90;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434144d = 0;

    public n(v90.o oVar, v90.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434144d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434144d;
        this.f434144d = i17 + 1;
        if (i17 == 0) {
            return u90.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
