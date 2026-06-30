package t21;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f414791d = 0;

    public i(t21.j jVar, t21.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f414791d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f414791d;
        this.f414791d = i17 + 1;
        if (i17 == 0) {
            return c61.mc.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
