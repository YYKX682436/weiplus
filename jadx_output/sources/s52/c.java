package s52;

/* loaded from: classes13.dex */
public abstract class c {
    public static void a(java.lang.String str, int i17, long j17, e42.l0 l0Var) {
        e42.l0 l0Var2 = e42.l0.MMActivity_Back2Front;
        e42.l0 l0Var3 = e42.l0.MMActivity_Front2Back;
        int i18 = l0Var == l0Var2 ? 7 : l0Var == l0Var3 ? 8 : -1;
        if (b52.b.m() && !com.tencent.mm.plugin.expt.pageflow.k.f99811g) {
            if (l0Var == l0Var2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(932L, 91L, 1L, false);
            } else if (l0Var == l0Var3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(932L, 92L, 1L, false);
            }
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellFrontBackReport", "report 切换-前后台(3): %d, %s 未登录", java.lang.Integer.valueOf(i18), str);
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellFrontBackReport", "report 切换-前后台(3): %d, %s", java.lang.Integer.valueOf(i18), str);
        ((com.tencent.mm.plugin.expt.pageflow.k) i95.n0.c(com.tencent.mm.plugin.expt.pageflow.k.class)).Di(str, l0Var, i17, j17);
    }
}
