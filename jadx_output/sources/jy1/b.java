package jy1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f302482d = 0;

    public b(jy1.c cVar, jy1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302482d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302482d;
        this.f302482d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.datareport.flutter.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
