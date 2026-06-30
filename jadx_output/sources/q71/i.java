package q71;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360345d = 0;

    public i(q71.j jVar, q71.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360345d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360345d;
        this.f360345d = i17 + 1;
        if (i17 == 0) {
            return q71.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
