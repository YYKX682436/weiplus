package h30;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278386d = 0;

    public h(h30.i iVar, h30.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278386d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278386d;
        this.f278386d = i17 + 1;
        if (i17 == 0) {
            return h30.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
