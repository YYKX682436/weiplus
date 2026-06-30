package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class at implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167785g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167786h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167787i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167788m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167789n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167790o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTransparentUI f167791p;

    public at(com.tencent.mm.plugin.sns.ui.SnsTransparentUI snsTransparentUI, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        this.f167791p = snsTransparentUI;
        this.f167782d = str;
        this.f167783e = str2;
        this.f167784f = str3;
        this.f167785g = str4;
        this.f167786h = str5;
        this.f167787i = str6;
        this.f167788m = str7;
        this.f167789n = str8;
        this.f167790o = str9;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1");
        com.tencent.mm.plugin.sns.ui.SnsTransparentUI snsTransparentUI = this.f167791p;
        if (i18 == -1) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.tencent.mars.xlog.Log.e("SnsTransparentUI", "mmOnActivityResult fail, toUser is null");
                snsTransparentUI.finish();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1");
                return;
            }
            com.tencent.mars.xlog.Log.i("SnsTransparentUI", "doTransimt snsAdNativeLadingPagesUI is ok");
            r35.u3 u3Var = r35.t3.f369263a;
            com.tencent.mm.ui.ga controller = snsTransparentUI.getController();
            java.lang.String str = this.f167783e;
            java.lang.String str2 = this.f167784f;
            java.lang.String str3 = this.f167785g;
            java.lang.String string = snsTransparentUI.getResources().getString(com.tencent.mm.R.string.f490551ya);
            com.tencent.mm.plugin.sns.ui.zs zsVar = new com.tencent.mm.plugin.sns.ui.zs(this, this.f167782d, snsTransparentUI, stringExtra);
            ((ez.z0) u3Var).getClass();
            r35.j1.j(controller, str, str2, str3, null, true, string, zsVar);
        } else {
            snsTransparentUI.finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI$1");
    }
}
