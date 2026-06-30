package r01;

/* loaded from: classes9.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f368089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f368090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f368091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f368092g;

    public h(com.tencent.mm.storage.f9 f9Var, long j17, int i17, int i18, int i19) {
        this.f368089d = f9Var;
        this.f368090e = j17;
        this.f368091f = i17;
        this.f368092g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r01.j jVar = r01.j.f368119a;
        long j17 = this.f368090e;
        int i17 = this.f368091f;
        int i18 = this.f368092g;
        com.tencent.mm.storage.f9 f9Var = this.f368089d;
        if (r01.z.n(f9Var.Q0())) {
            r01.f fVar = new r01.f();
            jVar.c(f9Var, fVar);
            jVar.d(f9Var, fVar);
            if (fVar.f368058a <= 0) {
                return;
            }
            java.lang.String.valueOf(j17);
            r01.g e17 = r01.j.e(jVar, f9Var, 0, 2, null);
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            r01.j.b(jVar, 2, Q0, f9Var, fVar, e17, j17, i17, null, i18, null, 512, null);
        }
    }
}
