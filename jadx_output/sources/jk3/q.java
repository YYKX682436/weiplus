package jk3;

/* loaded from: classes8.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk3.v f300102d;

    public q(jk3.v vVar) {
        this.f300102d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String string;
        r45.fr4 fr4Var;
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        r45.w60 w60Var = this.f300102d.f300078b;
        ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            string = com.tencent.mm.plugin.multitask.u0.f150506a.b("Home");
        } else {
            string = (w60Var == null || (fr4Var = (r45.fr4) w60Var.getCustom(0)) == null) ? null : fr4Var.getString(3);
            if (string == null) {
                string = "";
            }
        }
        if (com.tencent.mm.vfs.w6.j(string)) {
            com.tencent.mm.vfs.w6.h(string);
        }
    }
}
