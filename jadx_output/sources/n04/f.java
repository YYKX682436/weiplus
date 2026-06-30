package n04;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333913d = 0;

    public f(n04.g gVar, n04.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333913d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333913d;
        this.f333913d = i17 + 1;
        if (i17 == 0) {
            return n04.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
