package d30;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f226133d = 0;

    public h(d30.i iVar, d30.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f226133d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f226133d;
        this.f226133d = i17 + 1;
        if (i17 == 0) {
            return d30.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
