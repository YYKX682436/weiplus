package tu1;

/* loaded from: classes13.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public pu1.b f422110a;

    /* renamed from: b, reason: collision with root package name */
    public android.media.projection.MediaProjection f422111b;

    /* renamed from: c, reason: collision with root package name */
    public android.hardware.display.VirtualDisplay f422112c;

    /* renamed from: d, reason: collision with root package name */
    public int f422113d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Intent f422114e;

    /* renamed from: f, reason: collision with root package name */
    public ru1.t f422115f;

    /* renamed from: g, reason: collision with root package name */
    public ru1.u f422116g;

    /* renamed from: h, reason: collision with root package name */
    public vu1.h f422117h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.HandlerThread f422118i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f422119j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f422120k;

    /* renamed from: l, reason: collision with root package name */
    public long f422121l = -1;

    /* renamed from: m, reason: collision with root package name */
    public long f422122m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f422123n = -1;

    /* renamed from: o, reason: collision with root package name */
    public long f422124o = -1;

    /* renamed from: p, reason: collision with root package name */
    public bv1.b f422125p;

    /* renamed from: q, reason: collision with root package name */
    public wu1.c f422126q;

    /* renamed from: r, reason: collision with root package name */
    public xu1.c f422127r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f422128s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f422129t;

    public static final void c(tu1.o oVar, int i17, java.lang.String address, int i18, wu1.a callback) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastManager", "realExecuteTcpConnect " + i17 + " connecting " + address + ':' + i18);
        wu1.c cVar = oVar.f422126q;
        if (cVar != null) {
            kotlin.jvm.internal.o.g(address, "address");
            kotlin.jvm.internal.o.g(callback, "callback");
            com.tencent.mars.xlog.Log.i("ScreenRecord.Main", "try connect to server " + address + ':' + i18);
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new wu1.b(address, i18, cVar, callback, null), 3, null);
        }
    }

    public final void a(android.content.Context context, pu1.b bVar) {
        this.f422117h = new vu1.h(bVar.f256312b, bVar.f256313c, bVar.f256315e);
        android.content.Intent intent = this.f422114e;
        kotlin.jvm.internal.o.d(intent);
        int i17 = this.f422113d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastManager", "createMediaProjection");
        java.lang.Object systemService = context.getSystemService("media_projection");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        android.media.projection.MediaProjection mediaProjection = ((android.media.projection.MediaProjectionManager) systemService).getMediaProjection(i17, intent);
        kotlin.jvm.internal.o.d(mediaProjection);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastManager", "createVirtualDisplay");
        mediaProjection.registerCallback(new tu1.g(this), null);
        android.hardware.display.VirtualDisplay createVirtualDisplay = mediaProjection.createVirtualDisplay("MicroMsg.ScreenCastManager", bVar.f256312b, bVar.f256313c, (int) i65.a.g(context), 16, null, null, null);
        kotlin.jvm.internal.o.d(createVirtualDisplay);
        this.f422112c = createVirtualDisplay;
        this.f422111b = mediaProjection;
        vu1.h hVar = this.f422117h;
        if (hVar != null) {
            hVar.b(new tu1.f(this, bVar, context));
        }
    }

    public final void b() {
        java.util.List list;
        java.lang.Integer num;
        java.util.List list2;
        pu1.b bVar = this.f422110a;
        int i17 = 0;
        if (!((bVar == null || (list2 = bVar.f358420q) == null || !(list2.isEmpty() ^ true)) ? false : true)) {
            this.f422127r = xu1.c.f457195i;
            ((ku5.t0) ku5.t0.f312615d).B(new tu1.i(this));
            return;
        }
        this.f422129t = true;
        pu1.b bVar2 = this.f422110a;
        if (bVar2 == null || (list = bVar2.f358420q) == null) {
            return;
        }
        if (bVar2 != null && (num = bVar2.f358418o) != null) {
            i17 = num.intValue();
        }
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        int i18 = f0Var.f310116d;
        c(this, i18, (java.lang.String) list.get(i18), i17, new tu1.l(f0Var, this, list, i17));
    }

    public final void d() {
        int i17;
        int i18;
        boolean fj6;
        boolean fj7;
        this.f422129t = false;
        ((ku5.t0) ku5.t0.f312615d).B(tu1.n.f422109d);
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f422121l);
        if (!(valueOf.longValue() != -1)) {
            valueOf = null;
        }
        if (valueOf != null) {
            int longValue = (int) valueOf.longValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markVideoRenderFirstFrameCost " + longValue);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.m(1634, 25, 26, longValue, true);
        }
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f422122m);
        if (!(valueOf2.longValue() != -1)) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            valueOf2.longValue();
            int i19 = (int) this.f422122m;
            com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markVideoEncodeFrameCostAvg " + i19);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.m(1634, 22, 23, i19, true);
        }
        bv1.b bVar = this.f422125p;
        if (bVar != null) {
            bVar.f24713c = false;
            if (bVar.f24711a > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BatteryUtils", "sum avgBattery=￥avgAverageBattery} microAmpere and avg avgBattery= " + bVar.f24711a + ' ');
                long j17 = bVar.f24711a;
                long j18 = j17 / ((long) 1000);
                int i27 = (int) j17;
                com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markBatteryCost " + i27);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.m(1634, 28, 29, i27, true);
            }
            i17 = (int) bVar.f24711a;
            com.tencent.mm.sdk.platformtools.n3 n3Var = bVar.f24712b;
            if (n3Var != null) {
                n3Var.removeCallbacksAndMessages(null);
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = bVar.f24712b;
            if (n3Var2 != null) {
                n3Var2.quitSafely();
            }
        } else {
            i17 = 0;
        }
        java.lang.Long valueOf3 = java.lang.Long.valueOf(this.f422124o);
        if (!(valueOf3.longValue() != -1)) {
            valueOf3 = null;
        }
        if (valueOf3 != null) {
            long longValue2 = valueOf3.longValue();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            i18 = (int) (android.os.SystemClock.elapsedRealtime() - longValue2);
            com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markRecordingCost " + i18);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.m(1634, 31, 32, i18, true);
        } else {
            i18 = 0;
        }
        pu1.b bVar2 = this.f422110a;
        if (bVar2 != null) {
            int i28 = bVar2.f256314d;
            int i29 = bVar2.f256313c;
            int i37 = bVar2.f256312b;
            int i38 = bVar2.f256315e;
            wo.o oVar = wo.v1.f447833m;
            int i39 = oVar.f447766x;
            int i47 = 2;
            if (i39 != -1) {
                fj6 = i39 != 1 ? i39 != 2 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_opengl_render, true) : false : true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_opengl_render, true);
            }
            int i48 = fj6 ? 1 : 2;
            int i49 = oVar.f447765w;
            if (i49 != -1) {
                fj7 = i49 != 1 ? i49 != 2 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_async_codec, true) : false : true;
            } else {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_async_codec, true);
            }
            int i57 = fj7 ? 1 : 2;
            int i58 = (int) this.f422121l;
            int i59 = i17;
            int i66 = (int) this.f422122m;
            int i67 = (int) this.f422123n;
            xu1.c cVar = this.f422127r;
            int i68 = cVar == null ? -1 : tu1.a.f422088a[cVar.ordinal()];
            if (i68 == 1) {
                i47 = 1;
            } else if (i68 != 2) {
                i47 = 3;
                if (i68 != 3) {
                    i47 = 4;
                    if (i68 != 4) {
                        i47 = 5;
                        if (i68 != 5) {
                            i47 = 0;
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "doScreenCastPcKvReport is bitrate: " + i28 + ",videoHeight : " + i29 + ",videoWidth : " + i37 + ",videoFrameRate: " + i38 + ",times: " + i18 + ",batteryCost : " + i59 + ",encodeStrategy : " + i48 + ",renderStrategy : " + i57 + ",firstFrameRenderCost: " + i58 + ",firstFrameEncodeCost: " + i66 + ",avgFrameRenderCost: " + i67 + ' ');
            com.tencent.mm.plugin.report.service.g0.INSTANCE.r(22393, true, true, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i59), java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(i58), java.lang.Integer.valueOf(i66), java.lang.Integer.valueOf(i67), java.lang.Integer.valueOf(i47));
        }
        wu1.c cVar2 = this.f422126q;
        if (cVar2 != null) {
            cVar2.a();
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var3 = this.f422119j;
        if (n3Var3 != null) {
            n3Var3.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var4 = this.f422119j;
        if (n3Var4 != null) {
            n3Var4.quitSafely();
        }
        this.f422119j = null;
        android.os.HandlerThread handlerThread = this.f422118i;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        ru1.u uVar = this.f422116g;
        if (uVar != null) {
            uVar.stopRecord();
        }
        ru1.t tVar = this.f422115f;
        if (tVar != null) {
            tVar.c();
        }
        vu1.h hVar = this.f422117h;
        if (hVar != null) {
            int i69 = (int) hVar.f440203o;
            com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markVideoRenderFrameCostAvg " + i69);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.m(1634, 16, 17, i69, true);
            com.tencent.mm.sdk.platformtools.n3 n3Var5 = hVar.f440194f;
            n3Var5.removeCallbacksAndMessages(null);
            n3Var5.quitSafely();
            android.os.HandlerThread handlerThread2 = hVar.f440195g;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
            }
            os0.c cVar3 = hVar.f440197i;
            if (cVar3 != null) {
                cVar3.n();
            }
            vu1.b bVar3 = hVar.f440196h;
            if (bVar3 != null) {
                android.view.Surface surface = bVar3.f440181e;
                if (surface != null) {
                    surface.release();
                }
                android.view.Surface surface2 = bVar3.f440180d;
                if (surface2 != null) {
                    surface2.release();
                }
                bVar3.f440180d = null;
                android.media.ImageReader imageReader = bVar3.f440179c;
                if (imageReader != null) {
                    imageReader.close();
                }
                bVar3.f440179c = null;
            }
            rs0.h hVar2 = hVar.f440200l;
            if (hVar2 != null) {
                rs0.i.f399296a.u(hVar2);
            }
            android.view.Surface surface3 = hVar.f440199k;
            if (surface3 != null) {
                surface3.release();
            }
            android.graphics.SurfaceTexture surfaceTexture = hVar.f440198j;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var = hVar.f440205q;
            b4Var.removeCallbacksAndMessages(null);
            b4Var.d();
            b4Var.quitSafely();
            android.view.Surface surface4 = hVar.f440192d;
            if (surface4 != null) {
                surface4.release();
            }
        }
        android.media.projection.MediaProjection mediaProjection = this.f422111b;
        if (mediaProjection != null) {
            mediaProjection.stop();
        }
        android.hardware.display.VirtualDisplay virtualDisplay = this.f422112c;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.f422120k = false;
        this.f422127r = null;
    }
}
