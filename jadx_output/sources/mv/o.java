package mv;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331521d = 0;

    public o(mv.p pVar, mv.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331521d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331521d;
        this.f331521d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.backup.roambackup.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
