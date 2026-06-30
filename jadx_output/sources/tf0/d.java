package tf0;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f418851d = 0;

    public d(tf0.e eVar, tf0.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f418851d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f418851d;
        this.f418851d = i17 + 1;
        if (i17 == 0) {
            return tf0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
