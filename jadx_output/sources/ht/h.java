package ht;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f284642d = 0;

    public h(ht.i iVar, ht.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f284642d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f284642d;
        this.f284642d = i17 + 1;
        if (i17 == 0) {
            return ht.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
