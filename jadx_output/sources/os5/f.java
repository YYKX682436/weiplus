package os5;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348283d = 0;

    public f(os5.g gVar, os5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348283d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348283d;
        this.f348283d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.n5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
