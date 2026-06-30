package js;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301435d = 0;

    public k(js.l lVar, js.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301435d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301435d;
        this.f301435d = i17 + 1;
        if (i17 == 0) {
            return is.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
