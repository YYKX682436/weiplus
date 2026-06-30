package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class VideoCompressUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: q, reason: collision with root package name */
    public static int f148959q;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f148960e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f148961f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f148962g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f148964i;

    /* renamed from: o, reason: collision with root package name */
    public boolean f148967o;

    /* renamed from: h, reason: collision with root package name */
    public final k55.k f148963h = new k55.k(this);

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.base.ABAPrams f148965m = null;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.segment.q1 f148966n = new com.tencent.mm.plugin.mmsight.segment.q1(this, null);

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f148968p = new com.tencent.mm.plugin.mmsight.segment.p1(this);

    public static java.lang.String O6(com.tencent.mm.plugin.mmsight.segment.VideoCompressUI videoCompressUI, java.lang.String str, java.lang.String str2) {
        videoCompressUI.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return str2;
        }
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setData(android.net.Uri.parse("file://" + str));
            gp.a b17 = gp.b.b(videoCompressUI, intent, -1);
            if (b17 == null || b17.f274160b == null) {
                return str2;
            }
            str2 = videoCompressUI.T6(str);
            com.tencent.mm.sdk.platformtools.x.D0(b17.f274160b, 80, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
            return str2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoCompressUI", e17, "get thumb error: %s", e17.getMessage());
            return str2;
        }
    }

    public static void P6(com.tencent.mm.plugin.mmsight.segment.VideoCompressUI videoCompressUI, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        com.tencent.mm.plugin.sight.base.b d17;
        int i18;
        videoCompressUI.getClass();
        gp.c cVar = new gp.c();
        try {
            try {
                cVar.k(str);
                int d18 = cVar.d();
                android.media.MediaFormat mediaFormat = null;
                android.media.MediaFormat mediaFormat2 = null;
                int i19 = 0;
                while (i19 < d18) {
                    android.media.MediaFormat e17 = cVar.e(i19);
                    if (e17.containsKey("mime")) {
                        java.lang.String string = e17.getString("mime");
                        i18 = d18;
                        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompressUI", "find video mime : %s", string);
                        if (string != null) {
                            if (string.startsWith("video/")) {
                                if (mediaFormat == null) {
                                    mediaFormat = e17;
                                }
                            } else if (string.startsWith("audio/") && mediaFormat2 == null) {
                                mediaFormat2 = e17;
                            }
                            if (mediaFormat2 != null && mediaFormat != null) {
                                break;
                            }
                        }
                    } else {
                        i18 = d18;
                    }
                    i19++;
                    d18 = i18;
                }
                com.tencent.mm.plugin.mmsight.segment.q1 q1Var = videoCompressUI.f148966n;
                if (q1Var != null) {
                    if (q1Var.f149076c == -1) {
                        java.lang.String str4 = "";
                        if (mediaFormat != null) {
                            try {
                                q1Var.f149079f = !mediaFormat.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) ? 0 : mediaFormat.getInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE);
                                if (mediaFormat.containsKey("durationUs")) {
                                    str3 = "MicroMsg.VideoCompressUI";
                                    try {
                                        i17 = (int) (mediaFormat.getLong("durationUs") / 1000);
                                    } catch (java.lang.Exception e18) {
                                        e = e18;
                                        str2 = str3;
                                        com.tencent.mars.xlog.Log.e(str2, "Video extractor init failed. video path = [%s] e = [%s]", str, e.getMessage());
                                    }
                                } else {
                                    str3 = "MicroMsg.VideoCompressUI";
                                    i17 = 0;
                                }
                                q1Var.f149076c = i17;
                                q1Var.f149077d = !mediaFormat.containsKey("height") ? 0 : mediaFormat.getInteger("height");
                                q1Var.f149078e = !mediaFormat.containsKey("width") ? 0 : mediaFormat.getInteger("width");
                                q1Var.f149074a = !mediaFormat.containsKey("mime") ? "" : mediaFormat.getString("mime");
                                q1Var.f149080g = !mediaFormat.containsKey("i-frame-interval") ? 0 : mediaFormat.getInteger("i-frame-interval");
                                q1Var.f149081h = !mediaFormat.containsKey("frame-rate") ? 0 : mediaFormat.getInteger("frame-rate");
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(q1Var.f149074a) && q1Var.f149074a.equalsIgnoreCase("video/hevc")) {
                                    videoCompressUI.f148967o = true;
                                }
                            } catch (java.lang.Exception e19) {
                                e = e19;
                                str3 = "MicroMsg.VideoCompressUI";
                                str2 = str3;
                                com.tencent.mars.xlog.Log.e(str2, "Video extractor init failed. video path = [%s] e = [%s]", str, e.getMessage());
                            }
                        } else {
                            str3 = "MicroMsg.VideoCompressUI";
                        }
                        if (mediaFormat2 != null) {
                            q1Var.f149082i = !mediaFormat2.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) ? 0 : mediaFormat2.getInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE);
                            if (mediaFormat2.containsKey("mime")) {
                                str4 = mediaFormat2.getString("mime");
                            }
                            q1Var.f149075b = str4;
                        }
                        if ((q1Var.f149079f <= 0 || q1Var.f149077d <= 0 || q1Var.f149078e <= 0 || q1Var.f149076c <= 0) && (d17 = com.tencent.mm.plugin.sight.base.e.d(str, true)) != null) {
                            int i27 = d17.f162383b;
                            if (i27 > 0) {
                                q1Var.f149079f = i27;
                            }
                            int i28 = d17.f162385d;
                            if (i28 > 0) {
                                q1Var.f149077d = i28;
                            }
                            int i29 = d17.f162384c;
                            if (i29 > 0) {
                                q1Var.f149078e = i29;
                            }
                            int i37 = d17.f162382a;
                            if (i37 > 0) {
                                q1Var.f149076c = i37;
                            }
                        }
                        str2 = str3;
                        try {
                            com.tencent.mars.xlog.Log.i(str2, "videoAnalysis result: %s", q1Var);
                        } catch (java.lang.Exception e27) {
                            e = e27;
                            com.tencent.mars.xlog.Log.e(str2, "Video extractor init failed. video path = [%s] e = [%s]", str, e.getMessage());
                        }
                    }
                }
            } catch (java.lang.Exception e28) {
                e = e28;
                str2 = "MicroMsg.VideoCompressUI";
            }
        } finally {
            cVar.g();
        }
    }

    public static android.graphics.Point Q6(com.tencent.mm.plugin.mmsight.segment.VideoCompressUI videoCompressUI, int i17, int i18, int i19, int i27) {
        int i28;
        int i29;
        videoCompressUI.getClass();
        if (i17 > i18 && i19 < i27) {
            int max = java.lang.Math.max(i19, i27);
            i27 = java.lang.Math.min(i19, i27);
            i19 = max;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompressUI", "scale() called with: decoderOutputWidth = [" + i17 + "], decoderOutputHeight = [" + i18 + "], specWidth = [" + i19 + "], specHeight = [" + i27 + "]");
        if (i17 <= i19 && i18 <= i27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompressUI", "calc scale, small or equal to spec size");
            return null;
        }
        int max2 = java.lang.Math.max(i17, i18);
        int min = java.lang.Math.min(i17, i18);
        int max3 = java.lang.Math.max(i19, i27);
        int min2 = java.lang.Math.min(i19, i27);
        if (max2 % 16 == 0 && java.lang.Math.abs(max2 - max3) < 16 && min % 16 == 0 && java.lang.Math.abs(min - min2) < 16) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompressUI", "calc scale, same len divide by 16, no need scale");
            return null;
        }
        int i37 = max2 / 2;
        int i38 = min / 2;
        if (i37 % 16 == 0 && java.lang.Math.abs(i37 - max3) < 16 && i38 % 16 == 0 && java.lang.Math.abs(i38 - min2) < 16) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompressUI", "calc scale, double ratio divide by 16");
            int i39 = i17 / 2;
            int i47 = i18 / 2;
            if (i39 % 2 != 0) {
                i39++;
            }
            if (i47 % 2 != 0) {
                i47++;
            }
            return new android.graphics.Point(i39, i47);
        }
        android.graphics.Point point = new android.graphics.Point();
        if (i17 < i18) {
            i28 = java.lang.Math.min(i19, i27);
            i29 = (int) (i18 / ((i17 * 1.0d) / i28));
        } else {
            int min3 = java.lang.Math.min(i19, i27);
            i28 = (int) (i17 / ((i18 * 1.0d) / min3));
            i29 = min3;
        }
        if (i29 % 2 != 0) {
            i29++;
        }
        if (i28 % 2 != 0) {
            i28++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompressUI", "calc scale, outputsize: %s %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
        point.x = i28;
        point.y = i29;
        return point;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean R6(com.tencent.mm.plugin.mmsight.segment.VideoCompressUI r2, com.tencent.mm.modelcontrol.VideoTransPara r3) {
        /*
            r2.getClass()
            r0 = 1
            if (r3 == 0) goto L10
            int r3 = r3.f71194g
            com.tencent.mm.plugin.mmsight.segment.q1 r1 = r2.f148966n
            int r1 = r1.f149079f
            if (r3 >= r1) goto L17
            r3 = r0
            goto L18
        L10:
            java.lang.String r3 = "MicroMsg.VideoCompressUI"
            java.lang.String r1 = "hy: given target trans param is null"
            com.tencent.mars.xlog.Log.e(r3, r1)
        L17:
            r3 = 0
        L18:
            boolean r2 = r2.f148967o
            if (r2 == 0) goto L1d
            goto L1e
        L1d:
            r0 = r3
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mmsight.segment.VideoCompressUI.R6(com.tencent.mm.plugin.mmsight.segment.VideoCompressUI, com.tencent.mm.modelcontrol.VideoTransPara):boolean");
    }

    public static java.lang.String S6(com.tencent.mm.plugin.mmsight.segment.VideoCompressUI videoCompressUI, java.lang.String str) {
        videoCompressUI.getClass();
        java.lang.String str2 = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getAccVideoPath() + "videoCompressTmp/";
        if (com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.vfs.w6.g(str2, true);
        }
        com.tencent.mm.vfs.w6.u(str2);
        java.lang.String str3 = str2 + "video_send_preprocess_tmp_" + java.lang.System.currentTimeMillis() + ".mp4";
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompressUI", "initAndGetTmpPath: %s", str3);
        return str3;
    }

    public final java.lang.String T6(java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getAccVideoPath() + "videoCompressTmpThumb/";
        if (com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.vfs.w6.g(str2, true);
        }
        com.tencent.mm.vfs.w6.u(str2);
        java.lang.String str3 = str2 + "video_send_preprocess_thumb_" + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompressUI", "thumbPath: %s", str3);
        return str3;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.f488168j3);
        android.content.Intent intent = getIntent();
        if (intent == null || com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("K_SEGMENTVIDEOPATH"))) {
            setResult(0);
            finish();
            return;
        }
        this.f148962g = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.f490604zq), true, false, null);
        this.f148960e = intent.getStringExtra("K_SEGMENTVIDEOPATH");
        this.f148961f = intent.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
        k55.k kVar = this.f148963h;
        com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.createProxy(new com.tencent.mm.plugin.mmsight.model.CaptureMMProxy(kVar));
        kVar.a(new com.tencent.mm.plugin.mmsight.segment.n1(this));
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k55.k kVar = this.f148963h;
        if (kVar != null) {
            kVar.d();
        }
    }
}
