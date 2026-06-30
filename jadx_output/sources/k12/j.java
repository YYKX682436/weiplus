package k12;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303184d = 0;

    public j(k12.k kVar, k12.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303184d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303184d;
        this.f303184d = i17 + 1;
        if (i17 == 0) {
            return h12.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
