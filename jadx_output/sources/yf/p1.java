package yf;

/* loaded from: classes15.dex */
public class p1 {

    /* renamed from: f, reason: collision with root package name */
    public static yf.w f461433f;

    /* renamed from: a, reason: collision with root package name */
    public final yf.p f461434a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f461435b;

    /* renamed from: c, reason: collision with root package name */
    public final yf.x f461436c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f461437d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f461438e;

    static {
        int i17 = yf.w.f461467a;
        f461433f = yf.v.f461465b;
    }

    public p1(com.tencent.live2.jsplugin.pusher.V2TXLivePusherJSAdapter livePusherJsAdapter) {
        kotlin.jvm.internal.o.g(livePusherJsAdapter, "livePusherJsAdapter");
        yf.q1 q1Var = new yf.q1(livePusherJsAdapter);
        this.f461435b = false;
        this.f461436c = f461433f.create();
        this.f461437d = false;
        this.f461438e = false;
        this.f461434a = q1Var;
    }

    public final void a(android.os.Bundle bundle, java.lang.String str, yf.q qVar) {
        if (bundle.containsKey(str)) {
            float f17 = 0.0f;
            float f18 = bundle.getFloat(str, 0.0f);
            if (f18 < 0.0f) {
                com.tencent.mars.xlog.Log.i("TXLivePusherWeEffectJSAdapter", "applyFaceBeautyIfNeed, rate(%f) of %s is illegal", java.lang.Float.valueOf(f18), str);
            } else {
                f17 = f18;
            }
            if (f17 > 1.0f) {
                com.tencent.mars.xlog.Log.i("TXLivePusherWeEffectJSAdapter", "applyFaceBeautyIfNeed, rate(%f) of %s is illegal", java.lang.Float.valueOf(f17), str);
                f17 = 1.0f;
            }
            b();
            this.f461436c.e(qVar, f17);
        }
    }

    public final void b() {
        if (this.f461437d) {
            return;
        }
        yf.q1 q1Var = (yf.q1) this.f461434a;
        q1Var.getClass();
        yf.x videoProcessListener = this.f461436c;
        kotlin.jvm.internal.o.g(videoProcessListener, "videoProcessListener");
        q1Var.f461446a.setVideoProcessListener(videoProcessListener);
        this.f461437d = true;
    }

    public final void c(android.os.Bundle bundle, boolean z17) {
        if (z17 || bundle.keySet().size() != 0) {
            this.f461438e = bundle.getBoolean("customEffect", this.f461438e);
            if (f()) {
                com.tencent.mars.xlog.Log.i("TXLivePusherWeEffectJSAdapter", "parseAndApplyParams, useCustomEffect");
                a(bundle, "skinWhiteness", yf.q.SKIN_BRIGHT);
                a(bundle, "skinSmoothness", yf.q.SKIN_SMOOTH);
                a(bundle, "faceThinness", yf.q.FACE_THIN);
                a(bundle, "eyeBigness", yf.q.EYE_BIGGER);
            }
        }
    }

    public final float d(org.json.JSONObject jSONObject, java.lang.String str, float f17) {
        float optDouble = (float) jSONObject.optDouble(str, 1.0d);
        if (optDouble < 0.0f) {
            com.tencent.mars.xlog.Log.i("TXLivePusherWeEffectJSAdapter", "parseRate, rate(%f) is illegal", java.lang.Float.valueOf(optDouble));
            optDouble = 0.0f;
        }
        if (optDouble <= 1.0f) {
            return optDouble;
        }
        com.tencent.mars.xlog.Log.i("TXLivePusherWeEffectJSAdapter", "parseRate, rate(%f)  is illegal", java.lang.Float.valueOf(optDouble));
        return 1.0f;
    }

    public final yf.s e(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("stickerType", null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.w("TXLivePusherWeEffectJSAdapter", "parseStickerType, stickerTypeStr is empty");
            return null;
        }
        if (optString.equalsIgnoreCase("back")) {
            return yf.s.STICKER_BACK;
        }
        if (optString.equalsIgnoreCase("front")) {
            return yf.s.STICKER_FRONT;
        }
        if (optString.equalsIgnoreCase("2d")) {
            return yf.s.STICKER_2D;
        }
        com.tencent.mars.xlog.Log.w("TXLivePusherWeEffectJSAdapter", "parseStickerType, stickerTypeStr: ".concat(optString));
        return null;
    }

    public final boolean f() {
        return this.f461438e && this.f461436c.isEnabled();
    }
}
