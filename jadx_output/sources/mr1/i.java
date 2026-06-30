package mr1;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f330843d = 0;

    public i(mr1.j jVar, mr1.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f330843d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f330843d;
        this.f330843d = i17 + 1;
        if (i17 == 0) {
            return mr1.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
