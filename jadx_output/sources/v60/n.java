package v60;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f433407d = 0;

    public n(v60.o oVar, v60.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f433407d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f433407d;
        this.f433407d = i17 + 1;
        if (i17 == 0) {
            return v60.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
