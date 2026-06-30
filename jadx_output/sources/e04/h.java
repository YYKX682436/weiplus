package e04;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f245947d = 0;

    public h(e04.i iVar, e04.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f245947d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f245947d;
        this.f245947d = i17 + 1;
        if (i17 == 0) {
            return e04.y2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
