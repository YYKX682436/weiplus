package lt3;

/* loaded from: classes10.dex */
public final class f0 implements ot3.g {

    /* renamed from: a, reason: collision with root package name */
    public final mt3.a f321212a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.r f321213b;

    /* renamed from: c, reason: collision with root package name */
    public long f321214c;

    /* renamed from: d, reason: collision with root package name */
    public zv3.a f321215d;

    /* renamed from: e, reason: collision with root package name */
    public zv3.g f321216e;

    /* renamed from: f, reason: collision with root package name */
    public final st3.f f321217f;

    /* renamed from: g, reason: collision with root package name */
    public int f321218g;

    /* renamed from: h, reason: collision with root package name */
    public int f321219h;

    /* renamed from: i, reason: collision with root package name */
    public int f321220i;

    /* renamed from: j, reason: collision with root package name */
    public int f321221j;

    /* renamed from: k, reason: collision with root package name */
    public int f321222k;

    /* renamed from: l, reason: collision with root package name */
    public int f321223l;

    /* renamed from: m, reason: collision with root package name */
    public int f321224m;

    /* renamed from: n, reason: collision with root package name */
    public int f321225n;

    /* renamed from: o, reason: collision with root package name */
    public int f321226o;

    /* renamed from: p, reason: collision with root package name */
    public int f321227p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate f321228q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.base.ABAPrams f321229r;

    /* renamed from: s, reason: collision with root package name */
    public int f321230s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f321231t;

    /* renamed from: u, reason: collision with root package name */
    public final int f321232u;

    /* renamed from: v, reason: collision with root package name */
    public final int f321233v;

    /* renamed from: w, reason: collision with root package name */
    public final int f321234w;

    /* renamed from: x, reason: collision with root package name */
    public final yz5.l f321235x;

    /* renamed from: y, reason: collision with root package name */
    public final yz5.l f321236y;

    /* renamed from: z, reason: collision with root package name */
    public android.os.HandlerThread f321237z;

    public f0(mt3.a videoMixData) {
        kotlin.jvm.internal.o.g(videoMixData, "videoMixData");
        this.f321212a = videoMixData;
        this.f321214c = -1L;
        this.f321217f = videoMixData.f331289a;
        this.f321232u = 1;
        this.f321233v = 2;
        this.f321234w = 4;
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.VideoMixer", "create VideoMixer, " + videoMixData);
        this.f321235x = new lt3.x(this);
        this.f321236y = new lt3.y(this);
    }

    public static final java.lang.String b(lt3.f0 f0Var) {
        int i17;
        android.graphics.Bitmap createScaledBitmap;
        mt3.a aVar = f0Var.f321212a;
        java.lang.String str = aVar.f331293e;
        int i18 = aVar.f331298j;
        android.graphics.Bitmap q17 = ai3.d.q(str, 200000L);
        java.lang.String str2 = aVar.f331294f;
        if (q17 != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.Media.VideoMixer", "createThumb getParentAbsolutePath: " + com.tencent.mm.vfs.w6.r(str2) + "  thumb size:" + i18);
                com.tencent.mm.vfs.w6.f(str2);
                if (i18 > 0 && java.lang.Math.min(q17.getWidth(), q17.getHeight()) > i18) {
                    if (q17.getWidth() < q17.getHeight()) {
                        i17 = (int) (((q17.getHeight() * i18) * 1.0f) / q17.getWidth());
                    } else {
                        i18 = (int) (((q17.getWidth() * i18) * 1.0f) / q17.getHeight());
                        i17 = i18;
                    }
                    createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(q17, i18, i17, true);
                    kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
                    com.tencent.mm.sdk.platformtools.x.D0(createScaledBitmap, 60, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
                }
                createScaledBitmap = q17;
                com.tencent.mm.sdk.platformtools.x.D0(createScaledBitmap, 60, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryRemuxIDKeyStat", "markCreateThumbFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 9L, 1L);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryRemuxIDKeyStat", "markCreateThumbFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 9L, 1L);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" mixVideoPath : ");
        sb6.append(aVar.f331293e);
        sb6.append(" mixThumbPath:");
        sb6.append(str2);
        sb6.append("   thumb-bitmap is null:");
        sb6.append(q17 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.VideoMixer", sb6.toString());
        if (q17 == null) {
            return null;
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010f A[Catch: Exception -> 0x0215, TryCatch #2 {Exception -> 0x0215, blocks: (B:14:0x00c1, B:17:0x00cc, B:21:0x00e5, B:23:0x00ed, B:28:0x0109, B:30:0x010f, B:31:0x0111, B:51:0x0153, B:53:0x0183, B:54:0x018a), top: B:13:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(lt3.f0 r50) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lt3.f0.c(lt3.f0):void");
    }

    public static android.graphics.Bitmap d(lt3.f0 f0Var, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, float f17, float f18, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            f17 = 0.0f;
        }
        if ((i17 & 8) != 0) {
            f18 = 0.0f;
        }
        f0Var.getClass();
        new android.graphics.Canvas(bitmap2).drawBitmap(bitmap, f17, f18, (android.graphics.Paint) null);
        return bitmap2;
    }

    @Override // ot3.g
    public void a(yz5.r rVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Start mixer ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.VideoMixer", sb6.toString());
        this.f321213b = new lt3.c0(rVar, this);
        lt3.e0 e0Var = new lt3.e0(this);
        mt3.a aVar = this.f321212a;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = aVar.f331289a.f412539m;
        if (audioCacheInfo == null || audioCacheInfo.f155716m) {
            e0Var.invoke();
            return;
        }
        wt3.c1 c1Var = wt3.c1.f449387b;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = aVar.f331289a.f412539m;
        kotlin.jvm.internal.o.d(audioCacheInfo2);
        c1Var.c(audioCacheInfo2, new lt3.z(e0Var));
    }

    public final void e(android.graphics.Canvas canvas, android.graphics.Bitmap bitmap, android.graphics.Point point) {
        float f17;
        float f18;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = point.x;
        float f19 = 0.0f;
        if (width == i17 && height == point.y) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
            return;
        }
        int i18 = point.y;
        if (width * i18 > height * i17) {
            f18 = i18 / height;
            float f27 = (i17 - (width * f18)) * 0.5f;
            f17 = 0.0f;
            f19 = f27;
        } else {
            float f28 = i17 / width;
            f17 = (i18 - (height * f28)) * 0.5f;
            f18 = f28;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f18, f18);
        matrix.postTranslate(f19, f17);
        canvas.drawBitmap(bitmap, matrix, null);
    }

    public final void f(android.graphics.Canvas canvas, android.graphics.Bitmap bitmap, android.graphics.Point point) {
        float f17;
        float f18;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = point.x;
        float f19 = 0.0f;
        if (width == i17 && height == point.y) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
            return;
        }
        int i18 = point.y;
        if (width * i18 > i17 * height) {
            f17 = i17 / width;
            f18 = (i18 - (height * f17)) * 0.5f;
        } else {
            float f27 = i18 / height;
            float f28 = (i17 - (width * f27)) * 0.5f;
            f17 = f27;
            f18 = 0.0f;
            f19 = f28;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(f17, f17);
        matrix.postTranslate(f19, f18);
        canvas.drawBitmap(bitmap, matrix, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024a, code lost:
    
        if (r1.resolutionAdjust > 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if ((r1 != null && r1.f162368g == 2) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        r1 = new java.lang.Object[2];
        r1[0] = java.lang.Integer.valueOf(r24.f321220i);
        r2 = r24.f321228q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (r2 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        r4 = java.lang.Integer.valueOf(r2.f162379r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        r1[1] = r4;
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.VideoMixer", "ABA: No use ABA algorithm: final bitrate: [%d], takePhotosVideoBR: [%d]", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if ((r1 != null && r1.f162367f == r24.f321234w) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g() {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lt3.f0.g():int");
    }

    public final com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig h() {
        com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig videoMixer$MixConfig = new com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig();
        videoMixer$MixConfig.f155641d = this.f321218g;
        videoMixer$MixConfig.f155642e = this.f321219h;
        videoMixer$MixConfig.f155643f = this.f321220i;
        videoMixer$MixConfig.f155644g = this.f321221j;
        videoMixer$MixConfig.f155645h = this.f321222k;
        videoMixer$MixConfig.f155646i = this.f321223l;
        videoMixer$MixConfig.f155647m = this.f321224m;
        videoMixer$MixConfig.f155648n = this.f321225n;
        return videoMixer$MixConfig;
    }

    public final int i(java.lang.String path) {
        androidx.exifinterface.media.ExifInterface exifInterface;
        java.lang.Integer valueOf;
        kotlin.jvm.internal.o.g(path, "path");
        try {
            java.io.InputStream E = com.tencent.mm.vfs.w6.E(path);
            if (E != null) {
                try {
                    exifInterface = new androidx.exifinterface.media.ExifInterface(E);
                    vz5.b.a(E, null);
                } finally {
                }
            } else {
                exifInterface = null;
            }
            valueOf = exifInterface != null ? java.lang.Integer.valueOf(exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1)) : null;
            if (valueOf != null && valueOf.intValue() == 6) {
                return 90;
            }
            if (valueOf.intValue() == 3) {
                return 180;
            }
        } catch (java.io.IOException unused) {
        }
        return (valueOf != null && valueOf.intValue() == 8) ? 270 : 0;
    }

    public final void j(com.tencent.mm.modelcontrol.VideoTransPara videoParam, int i17, int i18) {
        kotlin.jvm.internal.o.g(videoParam, "videoParam");
        if (this.f321228q == null) {
            this.f321228q = new com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.VideoMixer", "Scene: [%d], ABASwitch: [%d] ceilingVideoBR:[%d]", java.lang.Integer.valueOf(videoParam.G), java.lang.Integer.valueOf(videoParam.f71205u), java.lang.Integer.valueOf(videoParam.f71209y));
        com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate adaptiveAdjustBitrate = this.f321228q;
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162362a = this.f321219h;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162363b = this.f321218g;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162364c = this.f321220i;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162365d = i18;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162366e = i17;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162367f = videoParam.G;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162368g = videoParam.f71205u;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162369h = videoParam.f71206v;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162370i = videoParam.f71207w;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162371j = videoParam.f71208x;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162372k = videoParam.f71209y;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162373l = videoParam.f71210z;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162375n = videoParam.B;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162374m = videoParam.A;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162376o = videoParam.C;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162377p = videoParam.D;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f162378q = videoParam.E;
        }
        if (adaptiveAdjustBitrate == null) {
            return;
        }
        adaptiveAdjustBitrate.f162379r = videoParam.F;
    }

    public final void k(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47) {
        this.f321218g = i17;
        this.f321219h = i18;
        this.f321220i = i19;
        this.f321221j = i27;
        this.f321222k = i28;
        this.f321223l = i29;
        this.f321224m = i37;
        this.f321225n = i38;
        this.f321226o = i39;
        this.f321227p = i47;
        if (this.f321228q == null) {
            this.f321228q = new com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate();
        }
        com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate adaptiveAdjustBitrate = this.f321228q;
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.c();
        }
    }
}
