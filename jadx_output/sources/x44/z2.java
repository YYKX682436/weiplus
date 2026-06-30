package x44;

/* loaded from: classes4.dex */
public final class z2 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToFriend");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("shareTitle");
        java.lang.String optString2 = data.optString("shareDesc");
        java.lang.String optString3 = data.optString("shareThumbUrl");
        java.lang.String optString4 = data.optString("shareWebUrl");
        java.lang.String optString5 = data.optString("canvasDynamicExtInfo");
        java.lang.String optString6 = data.optString("canvasDynamicLoadExtInfo");
        com.tencent.mars.xlog.Log.i("SnsAdJs.ToFriend", "canvasDynamicExtInfo is " + optString5 + ", canvasDynamicLoadExtInfo is " + optString6);
        if (!(optString == null || optString.length() == 0)) {
            if (!(optString2 == null || optString2.length() == 0)) {
                if (!(optString3 == null || optString3.length() == 0)) {
                    if (!(optString4 == null || optString4.length() == 0)) {
                        if (env.a() == null) {
                            com.tencent.mars.xlog.Log.e("SnsAdJs.ToFriend", "the activity is null!!!");
                            b(g("the activity is null"));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToFriend");
                            return;
                        }
                        java.lang.String b17 = ca4.z0.b(optString4, a54.h.a(env.b()));
                        m54.t tVar = m54.t.f324306a;
                        m54.l b18 = env.b();
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
                        java.lang.String a17 = tVar.a(b18, uVar);
                        java.lang.String b19 = tVar.b(env.b());
                        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
                        android.app.Activity a18 = env.a();
                        java.lang.String a19 = a54.h.a(env.b());
                        java.lang.String i17 = env.b().i();
                        if (i17 == null) {
                            i17 = "";
                        }
                        adLandingPagesProxy.doTransimt(a18, a17, optString, optString3, optString2, b17, b19, a19, i17);
                        b(l());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToFriend");
                        return;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.e("SnsAdJs.ToFriend", "the share info is invalid!!!");
        b(g("the share info is invalid!!!"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ShareToFriend");
    }
}
