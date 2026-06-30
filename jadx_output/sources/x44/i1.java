package x44;

/* loaded from: classes4.dex */
public final class i1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenScanner");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("bgImage");
        java.lang.String optString2 = data.optString("desc");
        java.lang.String optString3 = data.optString("descIcon");
        java.lang.String optString4 = data.optString("detectSucIcon");
        int optInt = data.optInt("scanGestureType");
        java.lang.String a17 = a54.h.a(env.b());
        if (!(optString == null || r26.n0.N(optString))) {
            if (!(optString3 == null || r26.n0.N(optString3))) {
                if (!(optString4 == null || r26.n0.N(optString4)) && optInt > 0) {
                    if (env.a() == null) {
                        com.tencent.mars.xlog.Log.e("SnsAdJs.OpenScanner", "the activity is null");
                        b(g("the activity is null"));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenScanner");
                        return;
                    }
                    android.app.Activity a18 = env.a();
                    com.tencent.mm.plugin.sns.storage.h hVar = new com.tencent.mm.plugin.sns.storage.h();
                    hVar.f166007a = optString2;
                    hVar.bgImageUrl = optString;
                    hVar.descIconUrl = optString3;
                    hVar.detectSucIconUrl = optString4;
                    hVar.f166008b = optInt;
                    l44.o5.a(a18, hVar, a17, 8);
                    b(l());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenScanner");
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("SnsAdJs.OpenScanner", "the input param is invalid");
        b(g("the input param is invalid"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenScanner");
    }
}
