package lt;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f321149d = 0;

    public j(lt.k kVar, lt.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f321149d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f321149d;
        this.f321149d = i17 + 1;
        if (i17 == 0) {
            return kt.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
