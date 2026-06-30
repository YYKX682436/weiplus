package k35;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303908d = 0;

    public h(k35.i iVar, k35.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303908d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303908d;
        this.f303908d = i17 + 1;
        if (i17 == 0) {
            return k35.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
