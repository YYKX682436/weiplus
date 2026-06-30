package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class va extends qw4.a implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.va f186580d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.va();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f186581e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f186582f;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (((java.util.HashMap) msg.f340790a).isEmpty()) {
            env.f340863d.e(msg.f341013c, "quickSendRedPacket:fail missing arguments", null);
        }
        f186581e = env;
        f186582f = msg;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("materialId");
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[handleMsg] JsApiQuickSendRedPacket start Content: " + env.f340860a);
        android.content.Context context = env.f340860a;
        boolean z17 = context instanceof com.tencent.mm.ui.MMActivity;
        com.tencent.mm.plugin.webview.model.z3 z3Var = com.tencent.mm.plugin.webview.model.h4.f182914i;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[handleMsg] normal activity: " + str + " 、" + str2);
            z3Var.a(hy4.a0.f286076i);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27809, 1, str, str, "", str2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
            android.content.Context context2 = env.f340860a;
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context2;
            mMActivity.mmSetOnActivityResultCallback(this);
            rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string = env.f340860a.getString(com.tencent.mm.R.string.gkc);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.content.Intent Ni = ((qd0.q0) e1Var).Ni(mMActivity, string);
            Ni.putExtra("KQuickSendRedPacketSessionId", str2);
            Ni.putExtra("KQuickSendRedPacketMaterialId", str);
            Ni.putExtra("key_from", 4);
            ((com.tencent.mm.feature.wxpay.j) ((mh0.n) i95.n0.c(mh0.n.class))).getClass();
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
            pf5.j0.a(Ni, fb3.e.class);
            pf5.j0.a(Ni, fb3.b.class);
            mMActivity.startActivityForResult(Ni, 215);
        } else if ((context instanceof com.tencent.mm.ext.ui.SwipeBackActivity) && (context instanceof q80.z)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[handleMsg] liteapp: " + str + " 、" + str2);
            z3Var.a(hy4.a0.f286076i);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27809, 1, str, str, "", str2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
            java.lang.Object obj = env.f340860a;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.feature.lite.api.ILiteAppFeatureService.ISetOnActivityResult");
            ((q80.z) obj).R1(com.tencent.mm.plugin.webview.ui.tools.newjsapi.ta.f186547a);
            android.content.Context context3 = env.f340860a;
            kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ext.ui.SwipeBackActivity");
            com.tencent.mm.ext.ui.SwipeBackActivity swipeBackActivity = (com.tencent.mm.ext.ui.SwipeBackActivity) context3;
            rd0.e1 e1Var2 = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string2 = env.f340860a.getString(com.tencent.mm.R.string.gkc);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            android.content.Intent Ni2 = ((qd0.q0) e1Var2).Ni(swipeBackActivity, string2);
            Ni2.putExtra("KQuickSendRedPacketSessionId", str2);
            Ni2.putExtra("KQuickSendRedPacketMaterialId", str);
            Ni2.putExtra("key_from", 4);
            ((pg0.d3) ((qg0.c0) i95.n0.c(qg0.c0.class))).getClass();
            if (((j05.f) i95.n0.c(j05.f.class)) != null) {
                pf5.j0.a(Ni2, fb3.e.class);
                pf5.j0.a(Ni2, fb3.b.class);
            }
            swipeBackActivity.startActivityForResult(Ni2, 215);
        } else if ((context instanceof com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI) && (context instanceof q80.z)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[handleMsg] WxaLiteAppTransparentBaseUI: " + str + " 、" + str2);
            z3Var.a(hy4.a0.f286076i);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27809, 1, str, str, "", str2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
            java.lang.Object obj2 = env.f340860a;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.feature.lite.api.ILiteAppFeatureService.ISetOnActivityResult");
            ((q80.z) obj2).R1(com.tencent.mm.plugin.webview.ui.tools.newjsapi.ua.f186561a);
            android.content.Context context4 = env.f340860a;
            kotlin.jvm.internal.o.e(context4, "null cannot be cast to non-null type com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI");
            com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI wxaLiteAppTransparentBaseUI = (com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI) context4;
            rd0.e1 e1Var3 = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.lang.String string3 = env.f340860a.getString(com.tencent.mm.R.string.gkc);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            android.content.Intent Ni3 = ((qd0.q0) e1Var3).Ni(wxaLiteAppTransparentBaseUI, string3);
            Ni3.putExtra("KQuickSendRedPacketSessionId", str2);
            Ni3.putExtra("KQuickSendRedPacketMaterialId", str);
            Ni3.putExtra("key_from", 4);
            ((pg0.d3) ((qg0.c0) i95.n0.c(qg0.c0.class))).getClass();
            if (((j05.f) i95.n0.c(j05.f.class)) != null) {
                pf5.j0.a(Ni3, fb3.e.class);
                pf5.j0.a(Ni3, fb3.b.class);
            }
            wxaLiteAppTransparentBaseUI.startActivityForResult(Ni3, 215);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.q.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.p0.NAME;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[mmOnActivityResult] requestCode: ");
        sb6.append(i17);
        sb6.append(", resultCode: ");
        sb6.append(i18);
        sb6.append(", data: ");
        sb6.append(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQuickSendRedPacket", sb6.toString());
        if (i17 != 215 || i18 != -1 || intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[mmOnActivityResult] unknow case");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("KEY_FINISH_ACTIVITY_REASON");
        if (kotlin.jvm.internal.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[mmOnActivityResult] cancel");
            nw4.k kVar = f186581e;
            if (kVar != null) {
                nw4.y2 y2Var = f186582f;
                kVar.f340863d.e(y2Var != null ? y2Var.f341013c : null, "quickSendRedPacket:selectSessionCancel ", null);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.o.b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiQuickSendRedPacket", "[mmOnActivityResult] unknow error");
            nw4.k kVar2 = f186581e;
            if (kVar2 != null) {
                nw4.y2 y2Var2 = f186582f;
                kVar2.f340863d.e(y2Var2 != null ? y2Var2.f341013c : null, "quickSendRedPacket:unknown ", null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiQuickSendRedPacket", "[mmOnActivityResult] pay success");
        nw4.k kVar3 = f186581e;
        if (kVar3 != null) {
            nw4.y2 y2Var3 = f186582f;
            kVar3.f340863d.e(y2Var3 != null ? y2Var3.f341013c : null, "quickSendRedPacket:ok", null);
            com.tencent.mm.plugin.webview.model.h4.f182914i.a(hy4.a0.f286077m);
        }
    }
}
