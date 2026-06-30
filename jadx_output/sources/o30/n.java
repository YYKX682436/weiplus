package o30;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342661d = 0;

    public n(o30.o oVar, o30.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342661d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342661d;
        this.f342661d = i17 + 1;
        if (i17 == 0) {
            return o30.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
