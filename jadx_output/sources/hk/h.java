package hk;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f281676d = 0;

    public h(hk.i iVar, hk.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f281676d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f281676d;
        this.f281676d = i17 + 1;
        if (i17 == 0) {
            return hk.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
