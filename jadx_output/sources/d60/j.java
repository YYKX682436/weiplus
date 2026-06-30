package d60;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f226671d = 0;

    public j(d60.k kVar, d60.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f226671d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f226671d;
        this.f226671d = i17 + 1;
        if (i17 == 0) {
            return d60.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
