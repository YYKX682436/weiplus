package td1;

/* loaded from: classes14.dex */
public final class p implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f417614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ td1.q f417616f;

    public p(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, td1.q qVar) {
        this.f417614d = c0Var;
        this.f417615e = i17;
        this.f417616f = qVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result jsApiOperateRecentUsageList$Companion$Result = (com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result) obj;
        boolean z17 = jsApiOperateRecentUsageList$Companion$Result.f82920d;
        td1.q qVar = this.f417616f;
        int i17 = this.f417615e;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f417614d;
        td1.l lVar = jsApiOperateRecentUsageList$Companion$Result.f82921e;
        if (z17) {
            c0Var.a(i17, qVar.p("ok", kz5.c1.i(new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(lVar.f417613d)))));
            return;
        }
        java.lang.String str = "fail:" + jsApiOperateRecentUsageList$Companion$Result.f82922f;
        qVar.C(str, "");
        c0Var.a(i17, qVar.p(str, kz5.c1.i(new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(lVar.f417613d)))));
    }
}
