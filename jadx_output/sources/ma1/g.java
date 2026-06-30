package ma1;

/* loaded from: classes7.dex */
public class g implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f325163c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ma1.h f325164d;

    public g(ma1.h hVar, int i17, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i18) {
        this.f325164d = hVar;
        this.f325161a = i17;
        this.f325162b = c0Var;
        this.f325163c = i18;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (i17 != this.f325161a) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: on result callback, result code: %d", java.lang.Integer.valueOf(i18));
        ma1.h hVar = this.f325164d;
        int i19 = this.f325163c;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325162b;
        if (i18 == 0 || i18 == 3001) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: user cancelled share!");
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("errCode", 803);
            c0Var.a(i19, hVar.p("fail: user cancelled", hashMap));
        } else if (i18 == -1 && intent != null && intent.hasExtra("key_req_result")) {
            com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
            int intExtra = intent.getIntExtra("key_selected_item", 0);
            java.lang.String stringExtra = intent.getStringExtra("key_ext_url");
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: is video: %b, video path %s, thumb path: %s, md5: %s, selectedItem: %d, extUrl: %s", java.lang.Boolean.valueOf(sightCaptureResult.f148806d), sightCaptureResult.f148809g, sightCaptureResult.f148810h, sightCaptureResult.f148812m, java.lang.Integer.valueOf(intExtra), stringExtra);
            if (sightCaptureResult.f148806d) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(sightCaptureResult.f148811i)) {
                    java.lang.String str = sightCaptureResult.f148812m;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        java.lang.String str2 = sightCaptureResult.f148809g;
                        java.lang.String str3 = sightCaptureResult.f148810h;
                        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
                        android.graphics.Bitmap p17 = ai3.d.p(str2);
                        if (p17 != null) {
                            try {
                                com.tencent.mm.sdk.platformtools.x.D0(p17, 100, android.graphics.Bitmap.CompressFormat.JPEG, str3, true);
                            } catch (java.io.IOException e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGameJsApiScreenRecorderEditWC", e17, "hy: exception when convert bitmap", new java.lang.Object[0]);
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: generated thumb path is null!");
                        }
                        ma1.c E = this.f325164d.E(this.f325162b, str2, "edited_video.mp4", true, com.tencent.mm.sdk.platformtools.t8.K0(stringExtra));
                        ma1.c E2 = this.f325164d.E(this.f325162b, str3, "edited_video_thumb.jpg", true, com.tencent.mm.sdk.platformtools.t8.K0(stringExtra));
                        if (E == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: save video temp file failed!");
                            this.f325164d.F(this.f325162b, this.f325163c, 1, 804, "video file save to file system failed!");
                            return true;
                        }
                        if (E2 == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: save thumb temp file failed!");
                            this.f325164d.F(this.f325162b, this.f325163c, 1, 804, "video thumb file save to file system failed!");
                            return true;
                        }
                        java.util.HashMap hashMap2 = new java.util.HashMap(3);
                        hashMap2.put("errCode", 0);
                        hashMap2.put("videoPath", E.f325153b);
                        hashMap2.put("thumbPath", E2.f325153b);
                        hashMap2.put("videoMD5", str);
                        hashMap2.put("chosenId", java.lang.Integer.valueOf(intExtra));
                        hashMap2.put("extUrl", stringExtra);
                        c0Var.a(i19, hVar.p("ok", hashMap2));
                    }
                }
                this.f325164d.F(this.f325162b, this.f325163c, 1, 804, "edit failed!");
            } else {
                this.f325164d.F(this.f325162b, this.f325163c, 3, 804, "not a video");
            }
        } else {
            this.f325164d.F(this.f325162b, this.f325163c, 1, 804, "edit file failed!");
        }
        return true;
    }
}
