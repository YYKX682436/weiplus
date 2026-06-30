package kj1;

/* loaded from: classes7.dex */
public final class m0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f308366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f308367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308368f;

    public m0(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var, java.lang.String str) {
        this.f308366d = o6Var;
        this.f308367e = n7Var;
        this.f308368f = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult wxaShortLinkRiskManager$UploadResult = (com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult) obj;
        if (wxaShortLinkRiskManager$UploadResult.f88872d) {
            int i17 = this.f308366d.f74805p.f77281g;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.g(21830, true, true, true, this.f308367e.getAppId(), java.lang.Integer.valueOf(this.f308366d.d2()), java.lang.Integer.valueOf(i17 != 0 ? i17 != 1 ? i17 != 2 ? 0 : 3 : 2 : 1), this.f308368f, wxaShortLinkRiskManager$UploadResult.f88873e, this.f308367e.Y1(), this.f308367e.J1());
        }
    }
}
