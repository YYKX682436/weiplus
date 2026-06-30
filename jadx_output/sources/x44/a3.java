package x44;

/* loaded from: classes4.dex */
public final class a3 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToTimeline");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        if (env.a() == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.ToTimeline", "the activity is null in share method");
            b(g("the activity is null in share method"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToTimeline");
            return;
        }
        java.lang.String optString = data.optString("shareTitle");
        java.lang.String optString2 = data.optString("shareDesc");
        java.lang.String optString3 = data.optString("shareThumbUrl");
        java.lang.String optString4 = data.optString("shareWebUrl");
        java.lang.String optString5 = data.optString("canvasDynamicExtInfo");
        java.lang.String optString6 = data.optString("canvasDynamicLoadExtInfo");
        com.tencent.mars.xlog.Log.i("SnsAdJs.ToTimeline", "canvasDynamicExtInfo is " + optString5 + ", canvasDynamicLoadExtInfo is " + optString6);
        if (!(optString == null || optString.length() == 0)) {
            if (!(optString2 == null || optString2.length() == 0)) {
                if (!(optString3 == null || optString3.length() == 0)) {
                    if (!(optString4 == null || optString4.length() == 0)) {
                        java.lang.String b17 = ca4.z0.b(optString4, a54.h.a(env.b()));
                        m54.u uVar = new m54.u(null, null, null, null, null, null, null, 0, null, null, 1023, null);
                        kotlin.jvm.internal.o.d(optString);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareTitle", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        uVar.f324308b = optString;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareTitle", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        kotlin.jvm.internal.o.d(optString2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareDesc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        uVar.f324309c = optString2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareDesc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        kotlin.jvm.internal.o.d(optString3);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareThumbUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        uVar.f324307a = optString3;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareThumbUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        kotlin.jvm.internal.o.d(optString4);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareWebUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        uVar.f324310d = optString4;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareWebUrl", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        kotlin.jvm.internal.o.d(optString5);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCanvasDynamicExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        uVar.f324311e = optString5;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCanvasDynamicExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        kotlin.jvm.internal.o.d(optString6);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCanvasDynamicLoadExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        uVar.f324312f = optString6;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCanvasDynamicLoadExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasShareParam");
                        m54.t tVar = m54.t.f324306a;
                        java.lang.String a17 = tVar.a(env.b(), uVar);
                        java.lang.String b18 = tVar.b(env.b());
                        int l17 = env.b().l();
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("Ksnsupload_link", b17);
                        intent.putExtra("Ksnsupload_title", optString);
                        intent.putExtra("Ksnsupload_imgurl", optString3);
                        intent.putExtra("Ksnsupload_canvas_info", a17);
                        intent.putExtra("Ksnsupload_contentattribute", 0);
                        intent.putExtra("Ksnsupload_source", 1);
                        intent.putExtra("Ksnsupload_type", 1);
                        intent.putExtra("key_snsad_statextstr", b18);
                        intent.putExtra("need_result", true);
                        switch (l17) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 9:
                            case 10:
                            case 11:
                                str = "sns_0";
                                break;
                            case 5:
                            case 6:
                                str = "msg_" + com.tencent.mm.sdk.platformtools.c2.g(intent, "msg_id", Integer.MIN_VALUE);
                                break;
                            case 7:
                                java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(intent, "sns_landing_favid");
                                if (l18 == null) {
                                    l18 = "";
                                }
                                str = "fav_".concat(l18);
                                break;
                            case 8:
                            default:
                                str = "sns_";
                                break;
                        }
                        java.lang.String a18 = c01.n2.a(str);
                        c01.n2.d().c(a18, true).i("prePublishId", str);
                        intent.putExtra("reportSessionId", a18);
                        intent.putExtra("KSnsIsUploadAdLandingPage", true);
                        j45.l.o(env.a(), "sns", ".ui.SnsUploadUI", intent, 2001, false);
                        android.app.Activity a19 = env.a();
                        if (a19 != null) {
                            a19.overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
                        }
                        b(l());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToTimeline");
                        return;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.e("SnsAdJs.ToFriend", "the share info is invalid!!!");
        b(g("the share info is invalid!!!"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToTimeline");
    }
}
