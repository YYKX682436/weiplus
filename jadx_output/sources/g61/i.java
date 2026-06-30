package g61;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f269059d = 0;

    public i(g61.j jVar, g61.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f269059d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f269059d;
        this.f269059d = i17 + 1;
        if (i17 == 0) {
            return g61.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
