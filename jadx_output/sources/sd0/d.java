package sd0;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f406673d = 0;

    public d(sd0.e eVar, sd0.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f406673d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f406673d;
        this.f406673d = i17 + 1;
        if (i17 == 0) {
            return sd0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
