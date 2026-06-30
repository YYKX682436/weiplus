package x44;

/* loaded from: classes4.dex */
public final class v0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("weAppUserName");
        java.lang.String optString2 = data.optString("businessId");
        java.lang.String optString3 = data.optString("weAppId");
        java.lang.String optString4 = data.optString("sessionFrom");
        boolean optBoolean = data.optBoolean("showMessageCard");
        java.lang.String optString5 = data.optString("sendMessageTitle");
        java.lang.String optString6 = data.optString("sendMessagePath");
        java.lang.String optString7 = data.optString("sendMessageImg");
        java.lang.String a17 = a54.h.a(env.b());
        if (env.a() == null) {
            b(g("activity is null"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat");
            return;
        }
        if (optString2 == null || r26.n0.N(optString2)) {
            x44.y2 y2Var = x44.y2.f451936a;
            android.app.Activity a18 = env.a();
            kotlin.jvm.internal.o.d(optString);
            kotlin.jvm.internal.o.d(optString3);
            kotlin.jvm.internal.o.d(optString4);
            kotlin.jvm.internal.o.d(optString5);
            kotlin.jvm.internal.o.d(optString6);
            kotlin.jvm.internal.o.d(optString7);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doEnterChattingOnMainThread$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
            y2Var.a(a18, optString, optString3, optString4, optBoolean ? 1 : 0, optString5, optString6, optString7, a17, "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doEnterChattingOnMainThread$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
            b(l());
        } else {
            if (com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(env.a())) {
                android.app.Activity context = env.a();
                kotlin.jvm.internal.o.d(optString);
                kotlin.jvm.internal.o.d(optString2);
                x44.u0 u0Var = new x44.u0(env, optString, optString3, optString4, optBoolean ? 1 : 0, optString5, optString6, optString7, a17, this);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubBusinessInfo", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = new r45.po3();
                lVar.f70665b = new r45.qo3();
                lVar.f70666c = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
                lVar.f70667d = 1303;
                lVar.f70668e = 0;
                lVar.f70669f = 0;
                com.tencent.mm.modelbase.o a19 = lVar.a();
                com.tencent.mm.protobuf.f fVar = a19.f70710a.f70684a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetSubBusinessInfoRequest");
                r45.po3 po3Var = (r45.po3) fVar;
                po3Var.f383251d = optString;
                po3Var.f383252e = optString2;
                ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a19, new x44.x2(u0Var));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubBusinessInfo", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
                str = "doAction";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat");
            }
            com.tencent.mars.xlog.Log.w("SnsAdJs.ServiceChat", "there is no network");
            b(w44.d.k(this, 300001, "fail:get network failed", null, 4, null));
        }
        str = "doAction";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenBusinessChat");
    }
}
