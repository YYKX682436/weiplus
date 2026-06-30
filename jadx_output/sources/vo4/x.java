package vo4;

/* loaded from: classes10.dex */
public final class x extends vo4.b {

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.SurfaceTexture f438696p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.Surface f438697q;

    /* renamed from: r, reason: collision with root package name */
    public ph3.k f438698r;

    /* renamed from: s, reason: collision with root package name */
    public long f438699s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Object f438700t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Object f438701u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f438702v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f438703w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f438704x;

    /* renamed from: y, reason: collision with root package name */
    public final ph3.d f438705y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i17, int i18, int i19, com.tencent.mm.plugin.vlog.model.p1 material, boolean z17) {
        super(i17, i18, i19, material, z17);
        kotlin.jvm.internal.o.g(material, "material");
        this.f438700t = new java.lang.Object();
        this.f438701u = new java.lang.Object();
        this.f438705y = new vo4.w(this);
    }

    @Override // vo4.b
    public void a(boolean z17) {
        ph3.k kVar;
        if (this.f438606e != z17 && (kVar = this.f438698r) != null) {
            kVar.setMute(z17);
        }
        this.f438606e = z17;
    }

    @Override // vo4.b
    public void b(long j17, boolean z17) {
        this.f438702v = true;
        ph3.k kVar = this.f438698r;
        if ((kVar == null || kVar.n()) ? false : true) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " playing start now");
            g();
        }
        if (z17) {
            try {
                android.graphics.SurfaceTexture surfaceTexture = this.f438696p;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e17, hashCode() + " updateTexImage error", new java.lang.Object[0]);
            }
        }
    }

    @Override // vo4.b
    public void c() {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.vlog.model.p0 p0Var = this.f438605d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(p0Var.f175710c) || !com.tencent.mm.vfs.w6.j(p0Var.f175710c)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VLogVideoPlayer", hashCode() + " prepare file not exist or is null");
        }
        this.f438616o = true;
        vo4.a a17 = vo4.k.f438649a.a(p0Var.f175710c);
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", "prepare get info from cache");
            this.f438613l = a17.f438597c;
            this.f438607f = a17.f438595a;
            this.f438608g = a17.f438596b;
            this.f438609h = a17.f438598d;
            this.f438610i = a17.f438599e;
            this.f438611j = a17.f438600f;
            this.f438612k = a17.f438601g;
            z17 = true;
        } else {
            z17 = false;
        }
        java.lang.String str4 = "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial";
        java.lang.String str5 = ", videoStartTime = ";
        java.lang.String str6 = ", endTime = ";
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", "prepare finish get from cache");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(hashCode());
            sb6.append(" prepare video, rotate = ");
            sb6.append(this.f438613l);
            sb6.append(", width = ");
            sb6.append(this.f438607f);
            sb6.append(", height = ");
            sb6.append(this.f438608g);
            sb6.append(", startTime = ");
            sb6.append(p0Var.f175708a);
            sb6.append(", endTime = ");
            sb6.append(p0Var.f175709b);
            sb6.append(", videoStartTime = ");
            kotlin.jvm.internal.o.e(p0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial");
            sb6.append(((com.tencent.mm.plugin.vlog.model.p1) p0Var).f175711d);
            sb6.append(", videoEndTime = ");
            sb6.append(((com.tencent.mm.plugin.vlog.model.p1) p0Var).f175712e);
            sb6.append(", cost:");
            sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            sb6.append("ms");
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", sb6.toString());
            return;
        }
        try {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VLogVideoPlayer", hashCode() + " start prepare " + p0Var.f175710c, new java.lang.Object[0]);
            this.f438613l = -1;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            android.media.MediaExtractor mediaExtractor = new android.media.MediaExtractor();
            mediaExtractor.setDataSource(p0Var.f175710c);
            int trackCount = mediaExtractor.getTrackCount();
            int i17 = 0;
            while (true) {
                if (i17 >= trackCount) {
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    break;
                }
                int i18 = trackCount;
                android.media.MediaFormat trackFormat = mediaExtractor.getTrackFormat(i17);
                str = str4;
                kotlin.jvm.internal.o.f(trackFormat, "getTrackFormat(...)");
                java.lang.String string = trackFormat.getString("mime");
                kotlin.jvm.internal.o.d(string);
                str2 = str5;
                str3 = str6;
                if (r26.i0.y(string, "video", false)) {
                    this.f438607f = trackFormat.getInteger("width");
                    this.f438608g = trackFormat.getInteger("height");
                    if (fp.h.c(23) && trackFormat.containsKey("rotation-degrees")) {
                        this.f438613l = trackFormat.getInteger("rotation-degrees");
                    }
                } else {
                    i17++;
                    trackCount = i18;
                    str4 = str;
                    str5 = str2;
                    str6 = str3;
                }
            }
            mediaExtractor.release();
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " prepare video get width/height cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms, try-get rotate:" + this.f438613l);
            if (this.f438613l < 0) {
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                this.f438613l = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(p0Var.f175710c);
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " prepare video get rotate cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime3) + "ms");
            }
            int i19 = this.f438613l;
            if (i19 == 90) {
                this.f438613l = 1;
            } else if (i19 == 180) {
                this.f438613l = 2;
            } else if (i19 == 270) {
                this.f438613l = 3;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(hashCode());
            sb7.append(" prepare video, rotate = ");
            sb7.append(this.f438613l);
            sb7.append(", width = ");
            sb7.append(this.f438607f);
            sb7.append(", height = ");
            sb7.append(this.f438608g);
            sb7.append(", startTime = ");
            sb7.append(p0Var.f175708a);
            sb7.append(str3);
            sb7.append(p0Var.f175709b);
            sb7.append(str2);
            kotlin.jvm.internal.o.e(p0Var, str);
            sb7.append(((com.tencent.mm.plugin.vlog.model.p1) p0Var).f175711d);
            sb7.append(", videoEndTime = ");
            sb7.append(((com.tencent.mm.plugin.vlog.model.p1) p0Var).f175712e);
            sb7.append(", cost:");
            sb7.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            sb7.append("ms");
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", sb7.toString());
            vo4.k.b(vo4.k.f438649a, p0Var.f175710c, this.f438607f, this.f438608g, this.f438613l, 0, 0, 0, 0, 240, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e17, hashCode() + " prepare error", new java.lang.Object[0]);
        }
    }

    @Override // vo4.b
    public void d(long j17) {
        int i17;
        boolean z17;
        if (this.f438615n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", "play already ready");
            return;
        }
        boolean z18 = true;
        this.f438615n = true;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", "%d play set video path [%s], texture:" + this.f438602a + ", seekTime:" + j17 + ", rotate:" + this.f438613l, java.lang.Integer.valueOf(hashCode()), this.f438605d.f175710c);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f438605d.f175710c) || !com.tencent.mm.vfs.w6.j(this.f438605d.f175710c)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VLogVideoPlayer", "%d open video but path is null or mSurface is null", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", "%d open video [%s]", java.lang.Integer.valueOf(hashCode()), this.f438605d.f175710c);
        if (!this.f438704x) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + ' ' + this.f438605d.f175710c + " before check crop rect, width: " + this.f438607f + ", height: " + this.f438608g);
            int i18 = this.f438607f;
            if (i18 == 0 || (i17 = this.f438608g) == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + ' ' + this.f438605d.f175710c + " width and height is zero! Don't check!");
                this.f438704x = false;
            } else {
                if (i18 % 16 != 0 || i17 % 16 != 0) {
                    vo4.a a17 = vo4.k.f438649a.a(this.f438605d.f175710c);
                    if (a17 == null || a17.f438598d < 0 || a17.f438599e < 0 || this.f438611j < 0 || a17.f438601g < 0) {
                        z17 = false;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", "checkCropRect get from cache");
                        this.f438613l = a17.f438597c;
                        this.f438607f = a17.f438595a;
                        this.f438608g = a17.f438596b;
                        this.f438609h = a17.f438598d;
                        this.f438610i = a17.f438599e;
                        this.f438611j = a17.f438600f;
                        this.f438612k = a17.f438601g;
                        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + ' ' + this.f438605d.f175710c + " finish check crop rect:[" + this.f438609h + ", " + this.f438610i + ", " + this.f438611j + ", " + this.f438612k + "], width:" + this.f438607f + ", height:" + this.f438608g);
                        z17 = true;
                    }
                    if (!z17) {
                        ((ku5.t0) ku5.t0.f312615d).h(new vo4.v(this), "VLogVideoPlayer_checkCropRect");
                    }
                }
                this.f438704x = true;
            }
        }
        try {
            this.f438696p = new android.graphics.SurfaceTexture(this.f438602a);
            this.f438697q = new android.view.Surface(this.f438696p);
            this.f438703w = false;
            ph3.k kVar = new ph3.k(android.os.Looper.getMainLooper(), false, 0);
            this.f438698r = kVar;
            kVar.h(this.f438605d.f175710c);
            ph3.k kVar2 = this.f438698r;
            if (kVar2 != null) {
                kVar2.f354429g = this.f438705y;
            }
            if (kVar2 != null) {
                kVar2.setSurface(this.f438697q);
            }
            ph3.k kVar3 = this.f438698r;
            if (kVar3 != null) {
                kVar3.setMute(this.f438606e);
            }
            ph3.k kVar4 = this.f438698r;
            if (kVar4 != null) {
                kVar4.q(false);
            }
            ph3.k kVar5 = this.f438698r;
            if (kVar5 != null) {
                kVar5.p(false);
            }
            ph3.k kVar6 = this.f438698r;
            if (kVar6 != null) {
                kVar6.prepare();
            }
            this.f438699s = j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " prepare player, wait");
            synchronized (this.f438700t) {
                try {
                    this.f438700t.wait();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e17, hashCode() + " wait prepare lock error", new java.lang.Object[0]);
                }
            }
            com.tencent.mm.plugin.vlog.model.p0 p0Var = this.f438605d;
            kotlin.jvm.internal.o.e(p0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoMaterial");
            int i19 = (int) (j17 + ((com.tencent.mm.plugin.vlog.model.p1) p0Var).f175711d);
            if (i19 > 0) {
                ph3.k kVar7 = this.f438698r;
                if (kVar7 != null) {
                    kVar7.a(i19);
                }
                synchronized (this.f438701u) {
                    try {
                        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " player seek wait:" + i19);
                        this.f438701u.wait(100L);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e18, hashCode() + " wait seekLock error", new java.lang.Object[0]);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " player seek wait finish");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " real seek time:" + i19 + ", not need to seek");
                this.f438702v = true;
                ph3.k kVar8 = this.f438698r;
                if (kVar8 == null || kVar8.n()) {
                    z18 = false;
                }
                if (z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " play directly start");
                    g();
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", hashCode() + " play finish cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VLogVideoPlayer", e19, hashCode() + " prepare async error %s", e19.getMessage());
        }
    }

    @Override // vo4.b
    public void e() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", "%d player release [%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        this.f438615n = false;
        ph3.k kVar = this.f438698r;
        if (kVar != null) {
            kVar.f354429g = null;
        }
        if (kVar != null) {
            kVar.stop();
        }
        ph3.k kVar2 = this.f438698r;
        if (kVar2 != null) {
            kVar2.release();
        }
        this.f438698r = null;
        this.f438703w = false;
        android.view.Surface surface = this.f438697q;
        if (surface != null) {
            surface.release();
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f438696p;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f438696p = null;
        this.f438697q = null;
        this.f438616o = false;
    }

    @Override // vo4.b
    public void f() {
        this.f438615n = false;
        ph3.k kVar = this.f438698r;
        if (kVar != null) {
            kVar.f354429g = null;
        }
        if (kVar != null) {
            kVar.stop();
        }
        ph3.k kVar2 = this.f438698r;
        if (kVar2 != null) {
            kVar2.release();
        }
        this.f438698r = null;
        this.f438703w = false;
        android.view.Surface surface = this.f438697q;
        if (surface != null) {
            surface.release();
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f438696p;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f438696p = null;
        this.f438697q = null;
    }

    public final boolean g() {
        if (this.f438698r == null || !this.f438703w) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(hashCode());
            objArr[1] = java.lang.Boolean.valueOf(this.f438698r == null);
            objArr[2] = java.lang.Boolean.valueOf(this.f438703w);
            com.tencent.mars.xlog.Log.w("MicroMsg.VLogVideoPlayer", "%d player is null[%b] or it prepared [%b]", objArr);
            return false;
        }
        java.lang.String str = "%d player start surface[%b], seekTime:" + this.f438699s;
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = java.lang.Integer.valueOf(hashCode());
        objArr2[1] = java.lang.Boolean.valueOf(this.f438697q != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", str, objArr2);
        ph3.k kVar = this.f438698r;
        if (kVar != null) {
            kVar.start();
        }
        return true;
    }
}
