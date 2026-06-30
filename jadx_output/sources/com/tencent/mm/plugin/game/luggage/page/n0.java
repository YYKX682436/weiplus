package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class n0 implements com.tencent.mm.plugin.game.luggage.page.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139923a;

    public n0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var) {
        this.f139923a = x0Var;
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.w0
    public void a() {
        java.lang.String format = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__report_session_id__=\"%s\"; })()", com.tencent.mm.plugin.game.commlib.util.i.b().getString("session_id"));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "getSessionId, jsStr_6:%s", format);
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.f139923a;
        x0Var.o(format, null);
        java.lang.String format2 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameNavigationBarHeight__= %d; })()", java.lang.Integer.valueOf(com.tencent.mm.ui.bl.c(x0Var.f406610d)));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "gameNavigationBarHeight, jsStr_6:%s", format2);
        x0Var.o(format2, null);
        java.lang.String Q = x0Var.Q();
        if (com.tencent.mm.sdk.platformtools.t8.K0(Q)) {
            return;
        }
        java.lang.String format3 = java.lang.String.format("javascript:(function(){ window.__wxWebEnv= { getEnv: function(){ return %s; } }; })()", org.json.JSONObject.quote(Q));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "_wxWebEnv, :%s", org.json.JSONObject.quote(Q));
        x0Var.o(format3, null);
    }
}
