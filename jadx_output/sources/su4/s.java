package su4;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f413087d = 0;

    public s(su4.t tVar, su4.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f413087d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f413087d;
        this.f413087d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.websearch.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
