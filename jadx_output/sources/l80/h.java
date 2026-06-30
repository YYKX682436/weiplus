package l80;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f316996d = 0;

    public h(l80.i iVar, l80.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f316996d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f316996d;
        this.f316996d = i17 + 1;
        if (i17 == 0) {
            return l80.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
