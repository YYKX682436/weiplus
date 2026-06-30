package z30;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f469863d = 0;

    public f(z30.g gVar, z30.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f469863d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f469863d;
        this.f469863d = i17 + 1;
        if (i17 == 0) {
            return y30.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
