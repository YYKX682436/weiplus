package v70;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f433608d = 0;

    public h(v70.i iVar, v70.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f433608d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f433608d;
        this.f433608d = i17 + 1;
        if (i17 == 0) {
            return v70.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
