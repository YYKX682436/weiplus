package qb2;

/* loaded from: classes8.dex */
public final class w0 implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.r1 f361303d;

    public w0(qb2.r1 r1Var) {
        this.f361303d = r1Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        qb2.r1 r1Var = this.f361303d;
        r1Var.f361285f.removeCallbacks(r1Var.f361286g);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        qb2.r1 r1Var = this.f361303d;
        if (!r1Var.f361284e.isEmpty()) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            r1Var.c(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127617b7).getValue()).r()).intValue(), qb2.c1.f361182e);
        }
        if (c01.id.c() - gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_APP_PUSH_REPORT_ENABLE_TIME_LONG, 0L) >= 86400000) {
            pm0.v.K(null, new qb2.v0(r1Var));
        }
    }
}
