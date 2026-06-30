package g44;

/* loaded from: classes4.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g44.h0 f268828a = new g44.h0();

    public final void a(android.content.Context context, s34.k1 k1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, yz5.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        if (k1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        if (aVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        int i18 = i17 == 0 ? 1 : 2;
        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsid", t07);
        jSONObject.put("uxinfo", snsInfo.getUxinfo());
        jSONObject.put("adExtInfo", snsInfo.getAdXml().adExtInfo);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i18);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("clickAction", 0);
        jSONObject.put("extInfo", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("sns_ad_half_screen_weapp_game_gift_report", jSONObject3);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dcj, (android.view.ViewGroup) null);
        if (inflate == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.close_icon);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f487696ph4);
        if (imageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487697ph5);
        if (textView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487695q35);
        if (textView2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487694q34);
        if (textView3 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.pzg);
        if (button == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGameIcon", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGameIcon", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        java.lang.String str = k1Var.f402692a;
        if (!r26.n0.N(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGameIcon", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGameIcon", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
            a84.m.a(str, imageView);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGameTitle", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGameTitle", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        textView.setText(k1Var.f402693b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTipWording", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTipWording", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        textView2.setText(k1Var.f402694c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGiftName", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGiftName", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        textView3.setText(k1Var.f402696e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getButtonTitle", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getButtonTitle", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        button.setText(k1Var.f402697f);
        button.setOnClickListener(new g44.f0(k1Var, h0Var, aVar, t07, snsInfo, i18));
        h0Var.f310123d = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = (com.tencent.mm.ui.widget.dialog.k0) h0Var.f310123d;
        if (k0Var != null) {
            k0Var.s(inflate, true);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = (com.tencent.mm.ui.widget.dialog.k0) h0Var.f310123d;
        if (k0Var2 != null) {
            k0Var2.V1 = true;
        }
        if (k0Var2 != null) {
            k0Var2.e(true);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = (com.tencent.mm.ui.widget.dialog.k0) h0Var.f310123d;
        if (k0Var3 != null) {
            k0Var3.v();
        }
        weImageView.setOnClickListener(new g44.g0(h0Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
    }
}
