package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.i f139897d;

    public h(com.tencent.mm.plugin.game.luggage.page.i iVar) {
        this.f139897d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.page.i iVar = this.f139897d;
        com.tencent.mm.plugin.game.luggage.page.j jVar = iVar.f139906c.f139919s2;
        if (jVar != null) {
            java.lang.String str = iVar.f139904a;
            com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI gameWebTabUI = ((com.tencent.mm.plugin.game.ui.chat_tab.k1) jVar).f141286a;
            if (str.equalsIgnoreCase(gameWebTabUI.f141198n)) {
                java.lang.String format = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__isGameIndexPreload__= %s; })()", java.lang.Boolean.valueOf(g53.e.b()));
                com.tencent.mars.xlog.Log.i("MicroMsg.GameWebTabUI", "gamelog.setInjectJsPreloadDataCallback.tabKey:%s, jsStr_1:%s", str, format);
                gameWebTabUI.f139497g.o(format, null);
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, null, g53.l.class, gameWebTabUI.f141203s);
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.plugin.game.luggage.page.k kVar = iVar.f139906c.f139912l2;
        objArr[0] = java.lang.Integer.valueOf(kVar != null ? kVar.b() : 0);
        java.lang.String format2 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameTabHeight__= %d; })()", objArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "tabKey:%s, jsStr_1:%s", iVar.f139904a, format2);
        iVar.f139905b.o(format2, null);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        com.tencent.mm.plugin.game.luggage.page.k kVar2 = iVar.f139906c.f139912l2;
        objArr2[0] = kVar2 != null ? kVar2.e() : "";
        java.lang.String format3 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameTabInfo__= %s; })()", objArr2);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "tabKey:%s, jsStr_2:%s", iVar.f139904a, format3);
        iVar.f139905b.o(format3, null);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        com.tencent.mm.plugin.game.luggage.page.k kVar3 = iVar.f139906c.f139912l2;
        objArr3[0] = java.lang.Integer.valueOf(kVar3 != null ? kVar3.h() : 0);
        java.lang.String format4 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__chatPageStyle__= %s; })()", objArr3);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "getChatPageStyle, jsStr_3:%s", format4);
        iVar.f139905b.o(format4, null);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        com.tencent.mm.plugin.game.luggage.page.k kVar4 = iVar.f139906c.f139912l2;
        objArr4[0] = java.lang.Boolean.valueOf(kVar4 != null ? kVar4.c() : false);
        java.lang.String format5 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__forceHideTab__= %s; })()", objArr4);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "isForceHideTab: jsStr_4:%s", format5);
        iVar.f139905b.o(format5, null);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        com.tencent.mm.plugin.game.luggage.page.k kVar5 = iVar.f139906c.f139912l2;
        objArr5[0] = java.lang.Boolean.valueOf(kVar5 != null ? kVar5.f() : false);
        java.lang.String format6 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__hasEntranceInfo__= %s; })()", objArr5);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "hasEntranceInfo : jsStr_5:%s", format6);
        iVar.f139905b.o(format6, null);
        java.lang.String format7 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__report_session_id__=\"%s\"; })()", com.tencent.mm.plugin.game.commlib.util.i.b().getString("session_id"));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "getSessionId, jsStr_6:%s", format7);
        iVar.f139905b.o(format7, null);
        java.lang.String format8 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameStatusBarHeight__= %d; })()", java.lang.Integer.valueOf(com.tencent.mm.ui.bl.h(iVar.f139906c.f406610d)));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "gameStatusBarHeight, jsStr_6:%s", format8);
        iVar.f139905b.o(format8, null);
        java.lang.String format9 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameNavigationBarHeight__= %d; })()", java.lang.Integer.valueOf(com.tencent.mm.ui.bl.c(iVar.f139906c.f406610d)));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "gameNavigationBarHeight, jsStr_6:%s", format9);
        iVar.f139905b.o(format9, null);
        java.lang.String Q = iVar.f139906c.Q();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Q)) {
            java.lang.String format10 = java.lang.String.format("javascript:(function(){ window.__wxWebEnv= { getEnv: function(){ return %s; } }; })()", org.json.JSONObject.quote(Q));
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebPage", "_wxWebEnv, :%s", org.json.JSONObject.quote(Q));
            iVar.f139905b.o(format10, null);
        }
        iVar.f139906c.X(iVar.f139904a, 2);
    }
}
