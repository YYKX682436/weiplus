package kj1;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f308306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo f308307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f308308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kj1.m f308309g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f308310h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308311i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f308312m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.app.Activity activity, com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo, yz5.a aVar, kj1.m mVar, android.app.Activity activity2, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f308306d = activity;
        this.f308307e = wxaShortLinkInfo;
        this.f308308f = aVar;
        this.f308309g = mVar;
        this.f308310h = activity2;
        this.f308311i = str;
        this.f308312m = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        android.app.Activity activity = this.f308306d;
        java.lang.String string = activity.getString(com.tencent.mm.R.string.f490292qx);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{this.f308307e.f88879i}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        aVar.f211729s = format;
        aVar.A = false;
        aVar.f211732v = activity.getString(com.tencent.mm.R.string.f490290qv);
        aVar.f211733w = activity.getString(com.tencent.mm.R.string.f490291qw);
        aVar.E = new kj1.c(this.f308308f);
        aVar.F = new kj1.d(this.f308309g, this.f308310h, this.f308311i, this.f308312m);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(activity, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        return jz5.f0.f302826a;
    }
}
