package yd1;

/* loaded from: classes7.dex */
public class g implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f460999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f461000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f461001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yd1.h f461002d;

    public g(yd1.h hVar, int i17, ta1.t0 t0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f461002d = hVar;
        this.f460999a = i17;
        this.f461000b = t0Var;
        this.f461001c = c0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (i17 != this.f460999a) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: on result callback, result code: %d", java.lang.Integer.valueOf(i18));
        ta1.t0 t0Var = this.f461000b;
        if (i18 == 0 || i18 == 3001) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: user cancelled share!");
            t0Var.a(3, 803, "user cancelled", new org.json.JSONObject());
        } else if (i18 == -1 && intent != null && intent.hasExtra("key_req_result")) {
            com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
            int intExtra = intent.getIntExtra("key_selected_item", 0);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(sightCaptureResult.f148806d);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intExtra);
            java.lang.String str = sightCaptureResult.f148809g;
            java.lang.String str2 = sightCaptureResult.f148810h;
            java.lang.String str3 = sightCaptureResult.f148812m;
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: is video: %b, video path %s, thumb path: %s, md5: %s, selectedItem: %d", valueOf, str, str2, str3, valueOf2);
            if (!sightCaptureResult.f148806d) {
                t0Var.a(3, 804, "not a video", new org.json.JSONObject());
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(sightCaptureResult.f148811i) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                t0Var.a(1, 804, "edit failed", new org.json.JSONObject());
            } else {
                ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
                android.graphics.Bitmap p17 = ai3.d.p(str);
                if (p17 != null) {
                    try {
                        com.tencent.mm.sdk.platformtools.x.D0(p17, 100, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameRecord.JsApiOpenVideoEditor", e17, "hy: exception when convert bitmap", new java.lang.Object[0]);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: generated thumb path is null!");
                }
                ta1.q0 E = this.f461002d.E(this.f461001c);
                E.f416665a.postToWorker(new ta1.j0(E, str, new yd1.f(this, str, str2, intExtra)));
            }
        } else {
            t0Var.a(1, 804, "edit file failed", new org.json.JSONObject());
        }
        return true;
    }
}
