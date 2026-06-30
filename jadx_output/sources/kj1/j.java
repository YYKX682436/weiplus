package kj1;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo f308340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f308341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f308342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f308343g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kj1.m f308344h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308345i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f308346m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo, android.app.Activity activity, android.app.Activity activity2, yz5.a aVar, kj1.m mVar, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f308340d = wxaShortLinkInfo;
        this.f308341e = activity;
        this.f308342f = activity2;
        this.f308343g = aVar;
        this.f308344h = mVar;
        this.f308345i = str;
        this.f308346m = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo = this.f308340d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(wxaShortLinkInfo.f88879i);
        android.app.Activity activity = this.f308341e;
        java.lang.String string = K0 ? activity.getString(com.tencent.mm.R.string.f490293qy) : activity.getString(com.tencent.mm.R.string.f490292qx, wxaShortLinkInfo.f88879i);
        kotlin.jvm.internal.o.d(string);
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211729s = string;
        aVar.A = false;
        android.app.Activity activity2 = this.f308342f;
        aVar.f211732v = activity2.getString(com.tencent.mm.R.string.f490290qv);
        aVar.f211733w = activity2.getString(com.tencent.mm.R.string.f490291qw);
        aVar.E = new kj1.h(this.f308343g);
        aVar.F = new kj1.i(this.f308344h, activity, this.f308345i, this.f308346m);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(activity2, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        return jz5.f0.f302826a;
    }
}
