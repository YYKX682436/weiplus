package js;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301429d = 0;

    public g(js.h hVar, js.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301429d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301429d;
        this.f301429d = i17 + 1;
        if (i17 == 0) {
            return is.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
