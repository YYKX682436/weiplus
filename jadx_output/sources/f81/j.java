package f81;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f260119d = 0;

    public j(f81.k kVar, f81.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f260119d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f260119d;
        this.f260119d = i17 + 1;
        if (i17 == 0) {
            return f81.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
