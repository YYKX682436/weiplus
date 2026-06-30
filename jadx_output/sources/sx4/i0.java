package sx4;

/* loaded from: classes8.dex */
public class i0 implements tx4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI f413614a;

    public i0(com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI) {
        this.f413614a = gameWebViewUI;
    }

    @Override // tx4.e
    public void onCreateMMMenu(db5.g4 g4Var) {
        db5.g4 g4Var2;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(480L, 0L, 1L, false);
        int i17 = com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.S3;
        com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI gameWebViewUI = this.f413614a;
        gameWebViewUI.getClass();
        try {
            java.util.List<r45.rk4> list = tx4.a.f422684a;
            new android.os.Bundle().putString("game_hv_menu_appid", gameWebViewUI.F3);
            java.util.Map map = gameWebViewUI.E3;
            ((java.util.HashMap) map).clear();
            for (r45.rk4 rk4Var : list) {
                ((java.util.HashMap) map).put(java.lang.Integer.valueOf(rk4Var.f384964d), rk4Var);
            }
            g4Var2 = tx4.i.a(gameWebViewUI, list);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.GameWebViewUI", "get cache hv game menu fail! exception:%s", e17.getMessage());
            g4Var2 = null;
        }
        if (g4Var2 != null) {
            ((java.util.ArrayList) g4Var.f228344d).addAll(g4Var2.f228344d);
        }
    }
}
