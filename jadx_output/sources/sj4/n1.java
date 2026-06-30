package sj4;

/* loaded from: classes10.dex */
public final class n1 extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public org.json.JSONObject f408877c;

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        sj4.m1 r17 = r();
        if (r17 == null) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        if (h6Var == null) {
            return true;
        }
        l81.b1 b1Var = new l81.b1();
        java.lang.String str = r17.f408870a;
        b1Var.f317012a = str;
        b1Var.f317022f = r17.f408871b;
        b1Var.f317018d = r17.f408872c;
        b1Var.f317016c = r17.f408873d;
        b1Var.f317032k = tj.f.CTRL_INDEX;
        b1Var.f317034l = str;
        java.lang.String str2 = r17.f408874e;
        if (str2 != null) {
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
            appBrandLaunchReferrer.f77322d = 6;
            appBrandLaunchReferrer.f77326h = str2;
            b1Var.f317041s = appBrandLaunchReferrer;
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(context, b1Var);
        return true;
    }

    @Override // bi4.o0
    public void e(pj4.w wVar) {
        sj4.m1 r17 = r();
        if (r17 != null) {
            if (wVar != null) {
                wVar.f355314g = r17.f408870a;
            }
            if (wVar == null) {
                return;
            }
            wVar.f355315h = r17.f408871b;
        }
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        org.json.JSONObject jSONObject;
        super.m(str, j0Var);
        if (j0Var == null || !kotlin.jvm.internal.o.b(j0Var.f355139d, "7")) {
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(j0Var.f355141f);
        } catch (java.lang.Throwable th6) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.WeAppStatusService", th6, "WeAppStatus parse err", new java.lang.Object[0]);
            jSONObject = null;
        }
        this.f408877c = jSONObject;
    }

    @Override // bi4.o0
    public void n() {
    }

    @Override // bi4.o0
    public boolean p(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag("MicroMsg.TextStatus.WeAppStatusService");
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        container.removeAllViews();
        container.addView(imageView);
        imageView.setOutlineProvider(new bk4.g2(0.5f));
        imageView.setClipToOutline(true);
        org.json.JSONObject jSONObject = this.f408877c;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("headImageURL") : null;
        if (!(optString == null || r26.n0.N(optString))) {
            n11.a.b().g(optString, imageView);
        }
        return true;
    }

    public final sj4.m1 r() {
        org.json.JSONObject jSONObject;
        pj4.j0 j0Var = this.f21074b;
        if (j0Var == null || !kotlin.jvm.internal.o.b(j0Var.f355139d, "7")) {
            return null;
        }
        java.lang.String str = j0Var.f355141f;
        if (!(str == null || str.length() == 0)) {
            try {
                jSONObject = new org.json.JSONObject(j0Var.f355141f);
            } catch (java.lang.Throwable unused) {
                jSONObject = new org.json.JSONObject();
            }
            return new sj4.m1(jSONObject.optString(dm.i4.COL_USERNAME), jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), jSONObject.optInt("version"), jSONObject.optInt("versionType", 0), jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA));
        }
        java.lang.String keyBusiBuf = j0Var.f355142g;
        kotlin.jvm.internal.o.f(keyBusiBuf, "keyBusiBuf");
        if (!(keyBusiBuf.length() > 0)) {
            return null;
        }
        pj4.x1 x1Var = new pj4.x1();
        x1Var.parseFrom(android.util.Base64.decode(j0Var.f355142g, 2));
        return new sj4.m1(x1Var.f355332f, x1Var.f355331e, x1Var.f355334h, x1Var.f355333g, x1Var.f355336m);
    }
}
