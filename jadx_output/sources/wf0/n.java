package wf0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445520d = 0;

    public n(wf0.o oVar, wf0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445520d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445520d;
        this.f445520d = i17 + 1;
        if (i17 == 0) {
            return vf0.z1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
