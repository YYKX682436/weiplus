package o72;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343472d = 0;

    public u(o72.v vVar, o72.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343472d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343472d;
        this.f343472d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fav.ui.e3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
