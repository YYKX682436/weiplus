package k63;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304567d = 0;

    public n(k63.o oVar, k63.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304567d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304567d;
        this.f304567d = i17 + 1;
        if (i17 == 0) {
            return k63.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
