package dy4;

/* loaded from: classes15.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244731d;

    public w0(dy4.f1 f1Var) {
        this.f244731d = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.f1 f1Var = this.f244731d;
        if (!f1Var.I) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onMediaPlayerPrepared, mp released");
            return;
        }
        com.tencent.mars.xlog.Log.i(f1Var.x(), "onPrepared");
        boolean z17 = true;
        f1Var.f244635u = true;
        f1Var.s();
        dy4.h1 h1Var = f1Var.X;
        ye1.e eVar = f1Var.f244627n;
        int duration = eVar != null ? eVar.getDuration() : 0;
        dy4.g1 g1Var = h1Var.f244664a;
        if (g1Var.f244649e <= 0) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            g1Var.f244649e = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(1379L, 21L, 1L, false);
            long j17 = g1Var.f244649e - g1Var.f244648d;
            g1Var.f244650f = j17;
            g0Var.idkeyStat(1379L, 22L, j17, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoProfileReport", "onMediaPlayerVideoPrepareEnd, prepareTime:%s", java.lang.Long.valueOf(j17));
        }
        if (g1Var.f244647c <= 0 && duration > 0) {
            long j18 = (long) ((duration * 1.0d) / 1000);
            g1Var.f244647c = j18;
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(1379L, 26L, 1L, false);
            g0Var2.idkeyStat(1379L, 24L, j18, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoProfileReport", "onMediaPlayerVideoPrepareEnd, duration:%s", java.lang.Long.valueOf(j18));
        }
        if (f1Var.J()) {
            dy4.w wVar = f1Var.U;
            if (wVar != null) {
                ye1.e eVar2 = f1Var.f244627n;
                int videoWidth = eVar2 != null ? eVar2.getVideoWidth() : 0;
                ye1.e eVar3 = f1Var.f244627n;
                int videoHeight = eVar3 != null ? eVar3.getVideoHeight() : 0;
                ye1.e eVar4 = f1Var.f244627n;
                int duration2 = eVar4 != null ? eVar4.getDuration() : 0;
                java.lang.String str = wVar.f244715a;
                com.tencent.mars.xlog.Log.i(str, "onVideoLoadedMetaData width=" + videoWidth + ", height=" + videoHeight + ", duration=" + duration2);
                try {
                    org.json.JSONObject c17 = wVar.c();
                    c17.put("width", videoWidth);
                    c17.put("height", videoHeight);
                    double d17 = (duration2 * 1.0d) / 1000;
                    wVar.f244718d = d17;
                    c17.put("duration", d17);
                    wVar.a("onVideoLoadedMetaData", c17);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e(str, "onVideoLoadedMetaData fail", e17);
                }
            }
            dy4.w wVar2 = f1Var.U;
            if (wVar2 != null) {
                java.lang.String str2 = wVar2.f244715a;
                com.tencent.mars.xlog.Log.i(str2, "onWaitingMoovReport");
                try {
                    wVar2.d("WaitingMoov", null);
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.e(str2, "onWaitingMoovReport fail", e18);
                }
            }
            dy4.w wVar3 = f1Var.U;
            if (wVar3 != null) {
                java.lang.String str3 = wVar3.f244715a;
                com.tencent.mars.xlog.Log.i(str3, "onWaitingPreDataReport");
                try {
                    wVar3.d("WaitingPreData", null);
                } catch (org.json.JSONException e19) {
                    com.tencent.mars.xlog.Log.e(str3, "onWaitingPreDataReport fail", e19);
                }
            }
            dy4.w wVar4 = f1Var.U;
            if (wVar4 != null) {
                java.lang.String str4 = wVar4.f244715a;
                com.tencent.mars.xlog.Log.i(str4, "onWaitingReadyReport");
                try {
                    org.json.JSONObject c18 = wVar4.c();
                    c18.put("state", 5);
                    c18.put("extInfo", wVar4.b());
                    wVar4.d("WaitingReady", c18);
                } catch (org.json.JSONException e27) {
                    com.tencent.mars.xlog.Log.e(str4, "onWaitingReadyReport fail", e27);
                }
            }
            dy4.w wVar5 = f1Var.U;
            if (wVar5 != null) {
                java.lang.String str5 = wVar5.f244715a;
                com.tencent.mars.xlog.Log.i(str5, "onWaitingPlayReport");
                try {
                    dy4.f1 f1Var2 = wVar5.f244717c;
                    if (kotlin.jvm.internal.o.b(f1Var2 != null ? f1Var2.D : null, null)) {
                        wVar5.f244721g++;
                    } else {
                        wVar5.f244721g = 0;
                    }
                    wVar5.d("WaitingPlay", null);
                } catch (org.json.JSONException e28) {
                    com.tencent.mars.xlog.Log.e(str5, "onWaitingPlayReport fail", e28);
                }
            }
        }
        long j19 = f1Var.f244633s;
        if (j19 > 0) {
            f1Var.H(j19);
            f1Var.f244633s = 0L;
        }
        f1Var.x();
        if (f1Var.M) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onPrepared, stop video auto play when webview in background");
            if (!f1Var.f244634t && !f1Var.f244636v) {
                z17 = false;
            }
            f1Var.Y = new java.util.concurrent.atomic.AtomicBoolean(z17);
            return;
        }
        if (!f1Var.f244634t && !f1Var.f244636v) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onPrepared, not set start play when prepared");
        } else {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onPrepared, start play when prepared, mStartWhenPrepared:%s, mControlStartWhenPrepared:%s", java.lang.Boolean.valueOf(f1Var.f244634t), java.lang.Boolean.valueOf(f1Var.f244636v));
            f1Var.A(f1Var.f244634t, true);
        }
    }
}
