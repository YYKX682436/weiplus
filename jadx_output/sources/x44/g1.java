package x44;

/* loaded from: classes4.dex */
public final class g1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenLocationPage");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        double optDouble = data.optDouble("slat");
        double optDouble2 = data.optDouble("slong");
        int optInt = data.optInt("scale");
        java.lang.String optString = data.optString("poiname", "");
        java.lang.String optString2 = data.optString(ya.b.LOCATION, "");
        if (java.lang.Math.abs(optDouble) > 90.0d || java.lang.Math.abs(optDouble2) > 180.0d) {
            com.tencent.mars.xlog.Log.e("", "the slat is " + optDouble + " , the slong is " + optDouble2);
            b(g("the slat or slong is invalid!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenLocationPage");
            return;
        }
        if (env.a() == null) {
            com.tencent.mars.xlog.Log.e("", "the activity is null");
            b(g("the activity is null"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenLocationPage");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 1);
        intent.putExtra("kwebmap_slat", optDouble);
        intent.putExtra("kwebmap_lng", optDouble2);
        intent.putExtra("kwebmap_scale", optInt);
        intent.putExtra("kPoiName", optString);
        intent.putExtra("Kwebmap_locaion", optString2);
        j45.l.n(env.a(), ya.b.LOCATION, ".ui.RedirectUI", intent, 2002);
        android.app.Activity a17 = env.a();
        if (a17 != null) {
            a17.overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        }
        b(l());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenLocationPage");
    }
}
