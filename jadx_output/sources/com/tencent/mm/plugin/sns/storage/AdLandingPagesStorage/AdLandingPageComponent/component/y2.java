package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask f165842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.z5 f165843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ab4.r f165844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 f165845g;

    public y2(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 z2Var, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask adLandingPageChattingTask, k91.z5 z5Var, ab4.r rVar) {
        this.f165845g = z2Var;
        this.f165842d = adLandingPageChattingTask;
        this.f165843e = z5Var;
        this.f165844f = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 z2Var = this.f165845g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$7");
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(67108864);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask adLandingPageChattingTask = this.f165842d;
        intent.putExtra("Chat_User", adLandingPageChattingTask.f165006g);
        intent.putExtra("app_brand_chatting_from_scene", 3);
        intent.putExtra("app_brand_chatting_expose_params", this.f165843e.a());
        intent.putExtra("key_temp_session_from", adLandingPageChattingTask.f165005f);
        intent.putExtra("finish_direct", true);
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_appbrand_contact_support_send_video, a17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + a17);
        if (!a17) {
            intent.putExtra("key_need_send_video", false);
        }
        intent.putExtra("app_brand_chatting_from_scene_new", 4);
        try {
            ab4.r rVar = this.f165844f;
            boolean z17 = rVar.D1 == 1;
            java.lang.String str3 = rVar.E1;
            java.lang.String str4 = rVar.G1;
            java.lang.String str5 = rVar.F1;
            if (!z17 || com.tencent.mm.sdk.platformtools.t8.N0(str3, str5, str4)) {
                intent.putExtra("showMessageCard", false);
            } else {
                intent.putExtra("showMessageCard", true);
                intent.putExtra("sendMessageTitle", str3);
                intent.putExtra("sendMessagePath", str4);
                intent.putExtra("sendMessageImg", str5);
            }
        } catch (java.lang.Throwable th6) {
            intent.putExtra("showMessageCard", false);
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", th6.toString());
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("uxInfo", z2Var.u().o());
            str = jSONObject.toString();
        } catch (java.lang.Exception unused) {
            str = "";
        }
        intent.putExtra("sns_landing_pages_ux_info", str);
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) z2Var.f165049d;
        mMActivity.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x2(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageBtnComponent", "open ServiceChattingUI， uxInfo=" + str);
        j45.l.v(mMActivity, ".ui.chatting.AppBrandServiceChattingUI", intent, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$7");
    }
}
