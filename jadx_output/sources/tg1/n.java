package tg1;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public final class n extends i95.w implements com.tencent.mm.plugin.appbrand.service.i6 {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f419143g = {1025, 1031, 1032};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f419144h = {1011, 1012, 1013, 1047, 1049, 1048, com.tencent.mm.plugin.appbrand.jsapi.za.CTRL_INDEX, 1124, 1125, 1126, mi1.k2.CTRL_INDEX};

    /* renamed from: d, reason: collision with root package name */
    public final tg1.g f419145d = new tg1.g();

    /* renamed from: e, reason: collision with root package name */
    public final tg1.m f419146e = new tg1.m();

    /* renamed from: f, reason: collision with root package name */
    public final tg1.f f419147f = new tg1.f();

    public boolean Ai(android.content.Context context, java.lang.String str, int i17, android.os.Bundle bundle, android.os.Bundle bundle2, l81.e1 e1Var) {
        boolean a17 = yo.a.a(f419143g, i17);
        tg1.c cVar = tg1.c.OK;
        if (a17) {
            return cVar == this.f419145d.b(context, str, i17, bundle, bundle2, e1Var);
        }
        if (yo.a.a(f419144h, i17)) {
            return cVar == this.f419146e.b(context, str, i17, bundle, bundle2, e1Var);
        }
        if (1064 == i17 || 1078 == i17) {
            return cVar == this.f419147f.b(context, str, i17, bundle, bundle2, e1Var);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WeAppLinkOpener", "handleScanCodeLink, unhandled case link[ %s ], scene[ %d ]", str, java.lang.Integer.valueOf(i17));
        return false;
    }

    public boolean wi(java.lang.String str, android.os.Bundle bundle) {
        tg1.e eVar;
        android.net.Uri uri;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeAppLinkOpener", "handle appLink = %s", str);
        tg1.e[] values = tg1.e.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i17];
            eVar.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.startsWith(eVar.f419138d)) {
                break;
            }
            i17++;
        }
        if (eVar != null) {
            try {
                uri = android.net.Uri.parse(str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WeAppLinkOpener", "handle nativeLink = %s, exp = %s", str, e17);
                uri = null;
            }
            if (uri == null) {
                return false;
            }
            java.lang.String queryParameter = uri.getQueryParameter(dm.i4.COL_USERNAME);
            java.lang.String queryParameter2 = uri.getQueryParameter(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter) && com.tencent.mm.storage.z3.z3(queryParameter)) {
                l81.b1 b1Var = new l81.b1();
                b1Var.f317012a = queryParameter;
                b1Var.f317018d = -1;
                b1Var.f317016c = 0;
                b1Var.f317022f = queryParameter2;
                b1Var.f317032k = eVar.f419139e;
                b1Var.f317034l = "";
                b1Var.f317035m = 0;
                b1Var.f317036n = "";
                com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle = bundle == null ? null : (com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle) bundle.getParcelable("weapp_open_declare_prompt_key");
                if (weAppOpenDeclarePromptBundle != null) {
                    b1Var.B = weAppOpenDeclarePromptBundle;
                }
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(null, b1Var);
                return true;
            }
        }
        return false;
    }
}
