package dy4;

/* loaded from: classes15.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f244713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f244714f;

    public v0(dy4.f1 f1Var, int i17, int i18) {
        this.f244712d = f1Var;
        this.f244713e = i17;
        this.f244714f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.w wVar;
        dy4.f1 f1Var = this.f244712d;
        int i17 = this.f244713e;
        int i18 = this.f244714f;
        if (!f1Var.I) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onMediaPlayerInfo, mp released");
            return;
        }
        com.tencent.mars.xlog.Log.i(f1Var.x(), "onInfo, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        boolean z17 = false;
        if (i17 == 701) {
            ye1.e eVar = f1Var.f244627n;
            f1Var.f244632r = eVar != null && eVar.isPlaying();
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onInfo, buffering start, isPlayingBeforeBuffering:%b", java.lang.Boolean.valueOf(f1Var.f244632r));
            if (f1Var.J() && (wVar = f1Var.U) != null) {
                wVar.g();
            }
            dy4.w wVar2 = f1Var.U;
            if (wVar2 != null) {
                java.lang.String str = wVar2.f244715a;
                com.tencent.mars.xlog.Log.i(str, "onWaitingBufferReadyReport");
                try {
                    wVar2.d("WaitingBufferReady", null);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e(str, "onWaitingBufferReadyReport fail", e17);
                }
            }
            dy4.g1 g1Var = f1Var.X.f244664a;
            if (g1Var.f244653i <= 0) {
                g1Var.f244651g++;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                g1Var.f244653i = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1379L, 30L, 1L, false);
            }
        } else if (i17 == 702) {
            ye1.e eVar2 = f1Var.f244627n;
            boolean z19 = eVar2 != null && eVar2.isPlaying();
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onInfo, buffering end, isPlayingBeforeBuffering:%b, isCurrentPlaying:%b", java.lang.Boolean.valueOf(f1Var.f244632r), java.lang.Boolean.valueOf(z19));
            if (f1Var.f244632r) {
                f1Var.f244632r = false;
                if (z19 && f1Var.J()) {
                    com.tencent.mars.xlog.Log.i(f1Var.x(), "onInfo, buffering end, notify video play");
                    dy4.w wVar3 = f1Var.U;
                    if (wVar3 != null) {
                        wVar3.f(false);
                    }
                    dy4.w wVar4 = f1Var.U;
                    if (wVar4 != null) {
                        java.lang.String str2 = wVar4.f244715a;
                        com.tencent.mars.xlog.Log.i(str2, "onBufferReadyReport");
                        try {
                            wVar4.d("BufferReady", null);
                        } catch (org.json.JSONException e18) {
                            com.tencent.mars.xlog.Log.e(str2, "onBufferReadyReport fail", e18);
                        }
                    }
                }
            } else if (!z19 && f1Var.J()) {
                com.tencent.mars.xlog.Log.i(f1Var.x(), "onInfo, buffering end, notify video pause");
                dy4.w wVar5 = f1Var.U;
                if (wVar5 != null) {
                    wVar5.e(false);
                }
                dy4.w wVar6 = f1Var.U;
                if (wVar6 != null) {
                    java.lang.String str3 = wVar6.f244715a;
                    com.tencent.mars.xlog.Log.i(str3, "onBufferReadyReport");
                    try {
                        wVar6.d("BufferReady", null);
                    } catch (org.json.JSONException e19) {
                        com.tencent.mars.xlog.Log.e(str3, "onBufferReadyReport fail", e19);
                    }
                }
            }
            dy4.g1 g1Var2 = f1Var.X.f244664a;
            if (g1Var2.f244654j <= 0 && g1Var2.f244653i > 0) {
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                g1Var2.f244654j = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(1379L, 31L, 1L, false);
                long j17 = g1Var2.f244654j - g1Var2.f244653i;
                g1Var2.f244652h += j17;
                g0Var.idkeyStat(1379L, 32L, j17, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoProfileReport", "onMediaPlayerVideoBufferEnd, bufferTime:%s", java.lang.Long.valueOf(j17));
            }
            g1Var2.f244653i = 0L;
            g1Var2.f244654j = 0L;
        } else if (i18 == -1004) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onInfo, special error, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            dg.d dVar = f1Var.V;
            if (dVar != null) {
                ((dy4.m) dVar).a(i17, i18);
            }
        } else if (i17 == 3) {
            if (f1Var.I) {
                com.tencent.mars.xlog.Log.i(f1Var.x(), "onMediaPlayerVideoFirstFrame");
            } else {
                com.tencent.mars.xlog.Log.i(f1Var.x(), "onMediaPlayerVideoFirstFrame, mp released");
            }
        }
        ye1.e eVar3 = f1Var.f244627n;
        if (eVar3 != null && eVar3.isPlaying()) {
            z17 = true;
        }
        if (z17 && f1Var.M && f1Var.N) {
            f1Var.Y = new java.util.concurrent.atomic.AtomicBoolean(true);
            f1Var.z();
        }
    }
}
