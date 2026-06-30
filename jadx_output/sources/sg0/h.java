package sg0;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407717d = 0;

    public h(sg0.i iVar, sg0.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407717d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407717d;
        this.f407717d = i17 + 1;
        if (i17 == 0) {
            return sg0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
