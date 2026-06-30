package x44;

/* loaded from: classes4.dex */
public final class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f451916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451919g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f451920h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451921i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451922m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451923n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451924o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451925p;

    public w2(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.f451916d = context;
        this.f451917e = str;
        this.f451918f = str2;
        this.f451919g = str3;
        this.f451920h = i17;
        this.f451921i = str4;
        this.f451922m = str5;
        this.f451923n = str6;
        this.f451924o = str7;
        this.f451925p = str8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$doEnterChattingOnMainThread$1");
        android.content.Context context = this.f451916d;
        java.lang.String str = this.f451919g;
        int i17 = this.f451920h;
        java.lang.String str2 = this.f451921i;
        java.lang.String str3 = this.f451922m;
        java.lang.String str4 = this.f451923n;
        java.lang.String str5 = this.f451924o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doEnterChatting", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doEnterChatting", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
        k91.z5 z5Var = new k91.z5();
        z5Var.f305863a = this.f451918f;
        java.lang.String str6 = this.f451917e;
        z5Var.f305866d = str6;
        z5Var.f305867e = "";
        z5Var.f305868f = "";
        z5Var.f305870h = 0;
        z5Var.f305869g = 0;
        z5Var.f305871i = "";
        z5Var.f305872j = 14;
        z5Var.f305873k = "";
        z5Var.f305874l = "";
        com.tencent.mm.plugin.appbrand.config.WxaExposedParams a17 = z5Var.a();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask adLandingPageChattingTask = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask();
        java.lang.String str7 = this.f451925p;
        if (r26.n0.N(str7)) {
            str7 = str6;
        }
        adLandingPageChattingTask.f165006g = str7;
        adLandingPageChattingTask.f165007h = "";
        adLandingPageChattingTask.f165005f = str;
        adLandingPageChattingTask.f165008i = new x44.v2(adLandingPageChattingTask, a17, str, context, str5, i17, str2, str4, str3);
        adLandingPageChattingTask.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doEnterChatting", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doEnterChatting", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$doEnterChattingOnMainThread$1");
    }
}
