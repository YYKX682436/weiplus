package q40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360022d = 0;

    public b(q40.c cVar, q40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360022d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360022d;
        this.f360022d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.service.z2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
