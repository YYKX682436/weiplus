package wf4;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445702d = 0;

    public n(wf4.o oVar, wf4.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445702d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445702d;
        this.f445702d = i17 + 1;
        if (i17 == 0) {
            return wf4.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
