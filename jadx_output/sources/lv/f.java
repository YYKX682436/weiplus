package lv;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f321472d = 0;

    public f(lv.g gVar, lv.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f321472d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f321472d;
        this.f321472d = i17 + 1;
        if (i17 == 0) {
            return lv.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
