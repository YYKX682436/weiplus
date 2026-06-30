package z30;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f469866d = 0;

    public j(z30.k kVar, z30.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f469866d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f469866d;
        this.f469866d = i17 + 1;
        if (i17 == 0) {
            return el.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
