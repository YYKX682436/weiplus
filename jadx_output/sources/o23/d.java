package o23;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342413d = 0;

    public d(o23.e eVar, o23.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342413d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342413d;
        this.f342413d = i17 + 1;
        if (i17 == 0) {
            return o23.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
