package oh1;

/* loaded from: classes9.dex */
public class z1 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345330g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345331h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f345332i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f345333m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f345334n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345335o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f345336p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f345337q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f345338r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f345339s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(oh1.a2 a2Var, int i17, r35.m3 m3Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.ref.WeakReference weakReference, int i18, long j17, java.lang.String str5, int i19, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f345328e = str;
        this.f345329f = str2;
        this.f345330g = str3;
        this.f345331h = str4;
        this.f345332i = weakReference;
        this.f345333m = i18;
        this.f345334n = j17;
        this.f345335o = str5;
        this.f345336p = i19;
        this.f345337q = map;
        this.f345338r = bundle;
        this.f345339s = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        byte[] decode;
        java.lang.String str = this.f345328e;
        java.lang.String str2 = this.f345329f;
        java.lang.String str3 = this.f345330g;
        java.lang.String str4 = this.f345331h;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaSysTemplateMsgHandler", "On Span clicked(title : %s, username : %s, path : %s, talker : %s)", str, str2, str3, str4);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", this.f345333m);
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(this.f345334n));
        bundle.putString("stat_chat_talker_username", str4);
        bundle.putString("stat_send_msg_user", this.f345335o);
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1088;
        appBrandStatObject.f87791g = "";
        appBrandStatObject.f87788d = com.tencent.mm.plugin.appbrand.report.z0.a(1088, bundle);
        appBrandStatObject.f87789e = com.tencent.mm.plugin.appbrand.report.z0.b(appBrandStatObject.f87790f, bundle);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(view.getContext(), this.f345329f, null, this.f345336p, 0, (str3 == null || str3.length() <= 0 || (decode = android.util.Base64.decode(str3, 2)) == null) ? "" : new java.lang.String(decode), appBrandStatObject);
        ((ih3.e) ((tg3.k1) i95.n0.c(tg3.k1.class))).Di("link_view_wxapp", this.f345337q, this.f345338r, this.f345332i, this.f345339s);
    }
}
