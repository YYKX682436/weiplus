package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes.dex */
public final class q0 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176978a;

    public q0(java.lang.String str) {
        this.f176978a = str;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        boolean z17;
        boolean z18;
        boolean z19 = false;
        if (iArr[0] != 0) {
            db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, "请给存储权限");
            return;
        }
        java.lang.String str = this.f176978a;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipAutomatedTestSetupShell", "config path doest not exist:" + str);
            return;
        }
        java.lang.String M = com.tencent.mm.vfs.w6.M(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipAutomatedTestSetupShell", "receive test config in path:" + str + ", config:" + M);
        com.tencent.mm.plugin.voip.ui.s0 s0Var = com.tencent.mm.plugin.voip.ui.s0.f176982a;
        kotlin.jvm.internal.o.d(M);
        try {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING, new org.json.JSONObject(M).getJSONObject(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY).toString());
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoipAutomatedTestSetupShell", e17, "parse config error", new java.lang.Object[0]);
            z17 = false;
        }
        com.tencent.mm.plugin.voip.ui.s0 s0Var2 = com.tencent.mm.plugin.voip.ui.s0.f176982a;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(M).getJSONArray("qos");
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            kotlin.jvm.internal.o.d(jSONArray);
            c75.c.d(jSONArray, new com.tencent.mm.plugin.voip.ui.r0(jSONArray2));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOIP_QOS_CUSTOM_STRING, jSONArray2.toString());
            bm5.o1.f22719a.o(bm5.h0.RepairerConfig_VOIP_TestEncodeParam_Int, 3);
            z18 = true;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoipAutomatedTestSetupShell", e18, "parse config error", new java.lang.Object[0]);
            z18 = false;
        }
        com.tencent.mm.plugin.voip.ui.s0 s0Var3 = com.tencent.mm.plugin.voip.ui.s0.f176982a;
        try {
            java.lang.String l17 = new com.tencent.mm.repairer.config.ilink_voip.RepairerConfigILinkVoIPEnable().l();
            int i18 = new org.json.JSONObject(M).getInt("ilink");
            bm5.o1.f22719a.p(l17, java.lang.Integer.valueOf(i18));
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipAutomatedTestSetupShell", "Saved config to repairer! (" + l17 + '=' + i18 + ')');
            z19 = true;
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoipAutomatedTestSetupShell", e19, "parse config error", new java.lang.Object[0]);
        }
        db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, "设置美颜" + z17 + ",设置qos" + z18 + ",设置ilink" + z19);
    }
}
