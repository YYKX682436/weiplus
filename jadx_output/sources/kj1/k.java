package kj1;

/* loaded from: classes9.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj1.m f308347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f308348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo f308349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308350g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f308351h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kj1.m mVar, android.app.Activity activity, com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f308347d = mVar;
        this.f308348e = activity;
        this.f308349f = wxaShortLinkInfo;
        this.f308350g = str;
        this.f308351h = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo = this.f308349f;
        com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams absWxaShortLinkLauncher$WxaShortLinkLaunchParams = new com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams(wxaShortLinkInfo.f88874d, wxaShortLinkInfo.f88876f, wxaShortLinkInfo.f88877g, wxaShortLinkInfo.f88878h, this.f308350g, wxaShortLinkInfo.f88880m);
        java.util.regex.Pattern pattern = kj1.m.f308365a;
        kj1.m mVar = this.f308347d;
        mVar.getClass();
        android.app.Activity activity = this.f308348e;
        mVar.b(activity, absWxaShortLinkLauncher$WxaShortLinkLaunchParams, new kj1.b(mVar, activity, absWxaShortLinkLauncher$WxaShortLinkLaunchParams, this.f308351h));
        return jz5.f0.f302826a;
    }
}
