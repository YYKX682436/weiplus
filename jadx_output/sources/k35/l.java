package k35;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303911d = 0;

    public l(k35.m mVar, k35.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303911d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303911d;
        this.f303911d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.subapp.jdbiz.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
