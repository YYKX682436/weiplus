package d81;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f226919d = 0;

    public b(d81.c cVar, d81.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f226919d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f226919d;
        this.f226919d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.announcement.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
