package mv;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331518d = 0;

    public k(mv.l lVar, mv.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331518d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331518d;
        this.f331518d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.backup.roambackup.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
