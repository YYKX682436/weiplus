package g44;

/* loaded from: classes4.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s34.k1 f268820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f268821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f268822f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268823g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f268824h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f268825i;

    public f0(s34.k1 k1Var, kotlin.jvm.internal.h0 h0Var, yz5.a aVar, java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        this.f268820d = k1Var;
        this.f268821e = h0Var;
        this.f268822f = aVar;
        this.f268823g = str;
        this.f268824h = snsInfo;
        this.f268825i = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper$showBottomSheet$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/AdOpenWeAppGameHalfScreenHelper$showBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsid", this.f268823g);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f268824h;
        jSONObject.put("uxinfo", snsInfo.getUxinfo());
        jSONObject.put("adExtInfo", snsInfo.getAdXml().adExtInfo);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f268825i);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("clickAction", 1);
        jSONObject.put("extInfo", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("sns_ad_half_screen_weapp_game_gift_report", jSONObject3);
        s34.k1 k1Var = this.f268820d;
        k1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGiftCode", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGiftCode", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        if (!r26.n0.N(k1Var.f402695d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGiftCode", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGiftCode", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
            l44.k.c(k1Var.f402695d);
        }
        kotlin.jvm.internal.h0 h0Var = this.f268821e;
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = (com.tencent.mm.ui.widget.dialog.k0) h0Var.f310123d;
        if ((k0Var2 != null && k0Var2.i()) && (k0Var = (com.tencent.mm.ui.widget.dialog.k0) h0Var.f310123d) != null) {
            k0Var.u();
        }
        this.f268822f.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/AdOpenWeAppGameHalfScreenHelper$showBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper$showBottomSheet$1");
    }
}
