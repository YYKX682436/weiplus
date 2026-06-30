package d35;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f226341d = 0;

    public d(d35.e eVar, d35.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f226341d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f226341d;
        this.f226341d = i17 + 1;
        if (i17 == 0) {
            return d35.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
