package kj1;

/* loaded from: classes9.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj1.m f308313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f308314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo f308315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308316g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f308317h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kj1.m mVar, android.app.Activity activity, com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f308313d = mVar;
        this.f308314e = activity;
        this.f308315f = wxaShortLinkInfo;
        this.f308316g = str;
        this.f308317h = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo = this.f308315f;
        com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams absWxaShortLinkLauncher$WxaShortLinkLaunchParams = new com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams(wxaShortLinkInfo.f88874d, wxaShortLinkInfo.f88876f, wxaShortLinkInfo.f88877g, wxaShortLinkInfo.f88878h, this.f308316g, "");
        java.util.regex.Pattern pattern = kj1.m.f308365a;
        kj1.m mVar = this.f308313d;
        mVar.getClass();
        android.app.Activity activity = this.f308314e;
        mVar.b(activity, absWxaShortLinkLauncher$WxaShortLinkLaunchParams, new kj1.b(mVar, activity, absWxaShortLinkLauncher$WxaShortLinkLaunchParams, this.f308317h));
        return jz5.f0.f302826a;
    }
}
