package js;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301449d = 0;

    public w(js.x xVar, js.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301449d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301449d;
        this.f301449d = i17 + 1;
        if (i17 == 0) {
            return ks.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
