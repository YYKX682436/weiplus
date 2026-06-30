package oh1;

/* loaded from: classes9.dex */
public class m1 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt0.d f345253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345254f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f345255g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f345256h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f345257i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345258m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(oh1.o1 o1Var, int i17, r35.m3 m3Var, tt0.d dVar, java.lang.String str, long j17, int i18, long j18, java.lang.String str2) {
        super(i17, m3Var);
        this.f345253e = dVar;
        this.f345254f = str;
        this.f345255g = j17;
        this.f345256h = i18;
        this.f345257i = j18;
        this.f345258m = str2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        java.lang.String str;
        byte[] decode;
        tt0.d dVar = this.f345253e;
        java.lang.String str2 = dVar.f421796a;
        java.lang.String str3 = dVar.f421800e;
        java.lang.String str4 = dVar.f421801f;
        long j17 = this.f345255g;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.String str5 = this.f345254f;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaSubscribeMsgService", "On Span clicked(title : %s, username : %s, path : %s, talker : %s, updatableMsgType: %d)", str2, str3, str4, str5, valueOf);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", this.f345256h);
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(this.f345257i));
        bundle.putString("stat_chat_talker_username", str5);
        bundle.putString("stat_send_msg_user", this.f345258m);
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1231;
        appBrandStatObject.f87791g = "0";
        appBrandStatObject.f87788d = com.tencent.mm.plugin.appbrand.report.z0.a(1231, bundle);
        appBrandStatObject.f87789e = com.tencent.mm.plugin.appbrand.report.z0.b(appBrandStatObject.f87790f, bundle);
        java.lang.String str6 = dVar.f421801f;
        java.lang.String str7 = (str6 == null || str6.length() <= 0 || (decode = android.util.Base64.decode(dVar.f421801f, 2)) == null) ? "" : new java.lang.String(decode);
        if (!(j17 == 1)) {
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(view.getContext(), dVar.f421800e, null, dVar.f421802g, 0, str7, appBrandStatObject);
            ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(dVar.f421800e, new oh1.l1(this));
            return;
        }
        tt0.e Ai = ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Ai(dVar.f421803h);
        if (Ai == null || Ai.field_msgType != 1) {
            str = str5 + "," + c01.z1.r();
        } else {
            str = Ai.field_weAppSourceUserName;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317032k = 1231;
        b1Var.f317012a = dVar.f421800e;
        b1Var.f317016c = dVar.f421802g;
        b1Var.f317022f = str7;
        b1Var.f317043u = str5;
        b1Var.f317015b0 = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            b1Var.f317017c0 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams("");
        } else {
            b1Var.f317017c0 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams("subpackage");
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(view.getContext(), b1Var);
    }
}
