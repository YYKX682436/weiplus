package t00;

/* loaded from: classes7.dex */
public final class j1 implements t00.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f414295a = cf.b.a(this);

    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414340u;
    }

    @Override // t00.r0
    public boolean b() {
        return true;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (i17 != 1) {
            callback.a();
            return;
        }
        data.toString();
        if (context == null) {
            callback.a();
            return;
        }
        org.json.JSONArray optJSONArray = data.optJSONArray("urls");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            callback.a();
            return;
        }
        int length = optJSONArray.length();
        java.lang.String[] strArr = new java.lang.String[length];
        int length2 = optJSONArray.length();
        for (int i18 = 0; i18 < length2; i18++) {
            strArr[i18] = optJSONArray.optString(i18);
        }
        int optInt = data.optInt("currentIndex", 0);
        if (optInt >= length || optInt < 0) {
            callback.a();
            return;
        }
        boolean optBoolean = data.optBoolean("showMenu", false);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("nowUrl", strArr[optInt]);
        intent.putExtra("urlList", strArr);
        intent.putExtra("type", -255);
        intent.putExtra("isFromWebView", true);
        intent.putExtra("KIsFromAppBrandEcs", true);
        intent.putExtra("showmenu", optBoolean);
        intent.putExtra("shouldShowScanQrCodeMenu", true);
        intent.putExtra("BottomSheetStyle", 0);
        intent.putExtra("scanQrCodeGetA8KeyScene", 44);
        intent.putExtra("isCustomImageSearch", data.optBoolean("enableSearch", false));
        org.json.JSONObject optJSONObject = data.optJSONObject("pos");
        float g17 = i65.a.g(context);
        float optInt2 = (optJSONObject != null ? optJSONObject.optInt("width") : 0) * g17;
        float optInt3 = (optJSONObject != null ? optJSONObject.optInt("height") : 0) * g17;
        float optInt4 = (optJSONObject != null ? optJSONObject.optInt("x") : 0) * g17;
        float optInt5 = (optJSONObject != null ? optJSONObject.optInt("y") : 0) * g17;
        if (jSONObject != null && jSONObject.optBoolean("isHalfScreenApp") && !jSONObject.optBoolean("enableExpandToStatusBarTop")) {
            optInt5 += com.tencent.mm.ui.bk.q(context);
        }
        int i19 = (int) optInt4;
        if (i19 == 0 && ((int) optInt5) == 0) {
            optInt5 = 1.0f;
        }
        intent.putExtra("img_gallery_width", (int) optInt2);
        intent.putExtra("img_gallery_height", (int) optInt3);
        intent.putExtra("img_gallery_left", i19);
        intent.putExtra("img_gallery_top", (int) optInt5);
        int k17 = i65.a.k(context);
        if (optInt2 > 0.0f && optInt3 > 0.0f && optInt3 < k17) {
            intent.putExtra("shouldRunDragAnimation", true);
        }
        intent.putExtra("shouldForbidExitAnimation", data.optBoolean("forbidExitAnimation", false));
        java.lang.String optString = data.optString("passBuffer");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            intent.putExtra("KIsShowEcsMb", true);
            intent.putExtra("KPassBufferToMb", optString);
            intent.putExtra("ShowIndicator", false);
        }
        nf.g.a(context).f(new t00.i1(this));
        j45.l.n(context, "subapp", ".ui.gallery.ecs.EcsGestureGalleryUI", intent, this.f414295a);
        ((b00.n0) ((c00.d4) i95.n0.c(c00.d4.class))).getClass();
        b00.n0.f16729e = callback;
    }

    @Override // t00.r0
    public org.json.JSONObject f(int i17, android.content.Context context, org.json.JSONObject data, c00.q3 envHandler) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(envHandler, "envHandler");
        return envHandler.getConfig();
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
