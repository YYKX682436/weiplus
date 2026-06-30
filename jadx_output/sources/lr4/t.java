package lr4;

/* loaded from: classes11.dex */
public final class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgSayHiConvListUI f320763d;

    public t(com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgSayHiConvListUI w1wPersonalMsgSayHiConvListUI, java.lang.String str) {
        this.f320763d = w1wPersonalMsgSayHiConvListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String clickId = mr4.a.b();
        com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgSayHiConvListUI w1wPersonalMsgSayHiConvListUI = this.f320763d;
        w1wPersonalMsgSayHiConvListUI.getClass();
        kotlin.jvm.internal.o.g(clickId, "clickId");
        java.lang.String Di = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Di();
        gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
        java.lang.String str = w1wPersonalMsgSayHiConvListUI.f177549h;
        java.lang.String str2 = w1wPersonalMsgSayHiConvListUI.f177550i;
        java.lang.String str3 = w1wPersonalMsgSayHiConvListUI.f177551m;
        ((fr4.g0) fVar).getClass();
        com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[openHelloMsgSettings] opening settings for curUsername=" + Di + ", clickId=" + clickId);
        q80.d0 d0Var = new q80.d0();
        d0Var.f360649a = "wxalite2fd372f050eecd471a4392786dfae78c";
        d0Var.f360650b = "pages/personal-msg-settings/entry";
        d0Var.f360652d = java.lang.Boolean.TRUE;
        int i17 = 0;
        d0Var.f360657i = 0;
        com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[openHelloMsgSettings] scene params: scene=" + str + ", sceneNote=" + str2 + ", referSessionId=" + str3);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (str != null) {
            try {
                java.lang.Integer h17 = r26.h0.h(str);
                if (h17 != null) {
                    i17 = h17.intValue();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("W1w.W1wPersonalMsgService", "[openHelloMsgSettings] failed to create query JSON for curUsername=".concat(Di), e17);
                d0Var.f360651c = "";
            }
        }
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("sceneNote", str2);
        jSONObject.put("referrerClickId", clickId);
        jSONObject.put("personalMsgFromUsername", Di);
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str3);
        fr4.s[] sVarArr = fr4.s.f265860d;
        jSONObject.put("referrerPagePath", "w1w-personal-msg-chat-list");
        d0Var.f360651c = jSONObject.toString();
        com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[openHelloMsgSettings] query JSON created successfully");
        com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[openHelloMsgSettings] starting liteapp for curUsername=".concat(Di));
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(w1wPersonalMsgSayHiConvListUI, d0Var, null);
        w1wPersonalMsgSayHiConvListUI.T6().K0(vu4.d.f440303s, mr4.a.a("more:more"), "", "");
        return true;
    }
}
