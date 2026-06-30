package sr1;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f411471d = 0;

    public j(sr1.k kVar, sr1.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f411471d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f411471d;
        this.f411471d = i17 + 1;
        if (i17 == 0) {
            return sr1.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
