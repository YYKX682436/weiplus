package o30;

/* loaded from: classes.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342664d = 0;

    public r(o30.s sVar, o30.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342664d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342664d;
        this.f342664d = i17 + 1;
        if (i17 == 0) {
            return o30.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
