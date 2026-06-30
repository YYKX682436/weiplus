package k12;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303187d = 0;

    public n(k12.o oVar, k12.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303187d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303187d;
        this.f303187d = i17 + 1;
        if (i17 == 0) {
            return h12.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
