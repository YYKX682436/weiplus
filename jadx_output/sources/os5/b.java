package os5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348280d = 0;

    public b(os5.c cVar, os5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348280d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348280d;
        this.f348280d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.c5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
