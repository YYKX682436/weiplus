package pk1;

/* loaded from: classes15.dex */
public final class q extends com.tencent.mm.plugin.appbrand.video.player.thumb.l {
    public static final pk1.f O = new pk1.f(null);
    public static int P;
    public final mk1.b0 M;
    public pk1.l0 N;

    public q(android.content.Context context, android.os.Looper looper, boolean z17, mk1.b0 b0Var, kotlin.jvm.internal.i iVar) {
        super(context, looper, z17, false, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_wxa_appbrand_enable_set_thumb_player_min_buffer_duration, false));
        this.M = b0Var;
        pk1.r rVar = new pk1.r();
        this.E = rVar;
        java.lang.String str = rVar.f355486a;
        com.tencent.mars.xlog.Log.i(str, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        java.lang.String netTypeString = com.tencent.mars.comm.NetStatusUtil.getNetTypeString(com.tencent.mm.sdk.platformtools.x2.f193071a);
        kotlin.jvm.internal.o.d(netTypeString);
        rVar.f355502l = netTypeString;
        com.tencent.mars.xlog.Log.i(str, "setNetType netType:%s", netTypeString);
    }

    public static final void X(pk1.q qVar, long j17) {
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnVideoPreloadedMetaData, preloadSize:%d", java.lang.Long.valueOf(j17));
        synchronized (qVar) {
            if (qVar.f461163b) {
                return;
            }
            ye1.p pVar = qVar.f461171j;
            if (pVar != null) {
                com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = ((ff1.k) pVar).f261620a;
                try {
                    ye1.e eVar = abstractVideoTextureView.f83659g;
                    if (qVar != eVar) {
                        abstractVideoTextureView.g("another player on preloaded meta data, return now.[%s, %s]", qVar, eVar);
                    } else {
                        abstractVideoTextureView.e("on preloaded meta preloadedSize:%d", java.lang.Long.valueOf(j17));
                        ff1.z zVar = abstractVideoTextureView.f83664o;
                        if (zVar != null) {
                            com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView abstractVideoView = (com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView) zVar;
                            abstractVideoView.k("MicroMsg.Video.AbstractVideoView", "on preloaded meta data preloadSize:%d", java.lang.Long.valueOf(j17));
                            oe1.h1 h1Var = abstractVideoView.f83686q;
                            if (h1Var != null) {
                                h1Var.n(abstractVideoView.getSessionId(), j17);
                            }
                        }
                    }
                } catch (java.lang.Exception e17) {
                    int i17 = com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView.Q;
                    abstractVideoTextureView.f(e17, "on preloaded meta error", new java.lang.Object[0]);
                }
            }
        }
    }

    public static final void Y(pk1.q qVar, long j17) {
        qVar.getClass();
        int i17 = j17 > 0 ? 1 : 0;
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = qVar.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            com.tencent.mars.xlog.Log.i(rVar.f355486a, "setHitPreload hitPreload:%d, hitPreloadSize:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
            rVar.f355499i = i17;
            rVar.f355500j = j17;
        }
    }

    @Override // ye1.a, ye1.s
    public void C(long j17) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            rVar.f355491c0 = j17;
            com.tencent.mars.xlog.Log.i(rVar.f355486a, "updateJsInsertCostTime jsInsertCostTime:%d", java.lang.Long.valueOf(j17));
        }
    }

    @Override // ye1.a
    public boolean G(int i17, int i18) {
        boolean G = super.G(i17, i18);
        pk1.l0 l0Var = this.N;
        if (l0Var != null) {
            com.tencent.mars.xlog.Log.i(l0Var.f355470h, "onError");
            pk1.z zVar = pk1.z.f355530a;
            pk1.v cacheInfoHolder = l0Var.f355471i;
            kotlin.jvm.internal.o.g(cacheInfoHolder, "cacheInfoHolder");
            pk1.u uVar = cacheInfoHolder.f355526a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheError, cacheInfo: " + uVar);
            com.tencent.mm.vfs.r6 c17 = zVar.c();
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(uVar.f355523b + ".res", false, true);
            com.tencent.mm.vfs.z7 z7Var = c17 == null ? com.tencent.mm.vfs.z7.f213276i : c17.f213166d;
            if (l17 != null && !l17.isEmpty()) {
                java.lang.String str = z7Var.f213279f;
                z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str + '/' + l17, z7Var.f213280g, z7Var.f213281h);
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(z7Var, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheError, cacheDeleted: " + (m17.a() && m17.f213266a.d(m17.f213267b)));
            com.tencent.mm.vfs.r6 c18 = zVar.c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = uVar.f355523b;
            sb6.append(str2);
            sb6.append(".mark");
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(sb6.toString(), false, true);
            com.tencent.mm.vfs.z7 z7Var2 = c18 == null ? com.tencent.mm.vfs.z7.f213276i : c18.f213166d;
            if (l18 != null && !l18.isEmpty()) {
                java.lang.String str3 = z7Var2.f213279f;
                z7Var2 = new com.tencent.mm.vfs.z7(z7Var2.f213277d, z7Var2.f213278e, str3 + '/' + l18, z7Var2.f213280g, z7Var2.f213281h);
            }
            com.tencent.mm.vfs.z2 m18 = b3Var.m(z7Var2, null);
            boolean z17 = m18.a() && m18.f213266a.d(m18.f213267b);
            com.tencent.mm.vfs.r6 c19 = zVar.c();
            java.lang.String l19 = com.tencent.mm.vfs.e8.l(str2 + ".temp.mark", false, true);
            com.tencent.mm.vfs.z7 z7Var3 = c19 == null ? com.tencent.mm.vfs.z7.f213276i : c19.f213166d;
            if (l19 != null && !l19.isEmpty()) {
                java.lang.String str4 = z7Var3.f213279f;
                z7Var3 = new com.tencent.mm.vfs.z7(z7Var3.f213277d, z7Var3.f213278e, str4 + '/' + l19, z7Var3.f213280g, z7Var3.f213281h);
            }
            com.tencent.mm.vfs.z2 m19 = b3Var.m(z7Var3, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "clearMark, markDeleted: " + z17 + ", tempMarkDeleted: " + (m19.a() && m19.f213266a.d(m19.f213267b)));
            cacheInfoHolder.f355526a = pk1.u.a(uVar, null, null, null, false, 7, null);
        }
        return G;
    }

    @Override // com.tencent.mm.plugin.appbrand.video.player.thumb.l
    public java.lang.String Q() {
        if (com.tencent.mm.plugin.appbrand.utils.p.e()) {
            return k91.d3.a(com.tencent.mm.sdk.platformtools.x2.f193071a, k91.n0.a());
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
        kotlin.jvm.internal.o.f(str, "getApplicationId(...)");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(java.lang.String r17, java.lang.String r18, yz5.a r19) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk1.q.a0(java.lang.String, java.lang.String, yz5.a):void");
    }

    public final synchronized void b0() {
        pk1.l0 l0Var = this.N;
        if (l0Var != null) {
            l0Var.b();
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            java.lang.String str = rVar.f355486a;
            com.tencent.mars.xlog.Log.i(str, "onStartDownload");
            rVar.H = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i(str, "markRequestVideoMoovTime");
            rVar.M = java.lang.System.currentTimeMillis();
        }
    }

    public final synchronized void c0() {
        pk1.l0 l0Var = this.N;
        if (l0Var != null) {
            l0Var.c();
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i(((pk1.r) aVar).f355486a, "onStopDownload");
            java.lang.System.currentTimeMillis();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.video.player.thumb.l, ye1.e
    public void m(java.lang.String path, java.lang.String str) {
        kotlin.jvm.internal.o.g(path, "path");
        if (this.f90888q) {
            a0(path, str, new pk1.i(path));
        } else {
            a0(path, str, new pk1.j(path));
        }
    }

    @Override // ye1.a, ye1.s
    public void o(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            if (jSONObject != null) {
                com.tencent.mars.xlog.Log.i(rVar.f355486a, "updateExtraData extraData:%s", jSONObject.toString());
                if (jSONObject.optLong("videoBitrate", 0L) > 0) {
                    rVar.f355514x = jSONObject.optLong("videoBitrate", 0L);
                }
                if (jSONObject.optLong("audioBitrate", 0L) > 0) {
                    rVar.f355515y = jSONObject.optLong("audioBitrate", 0L);
                }
                if (jSONObject.optLong("fileSize", 0L) > 0) {
                    rVar.f355492d = jSONObject.optLong("fileSize", 0L);
                }
                if (jSONObject.optInt("width", 0) > 0) {
                    rVar.F = jSONObject.optInt("width", 0);
                }
                if (jSONObject.optInt("height", 0) > 0) {
                    rVar.G = jSONObject.optInt("height", 0);
                }
                if (jSONObject.optInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, 0) > 0) {
                    rVar.E = jSONObject.optLong(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, 0L);
                }
                java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, "");
                kotlin.jvm.internal.o.f(optString, "optString(...)");
                rVar.f355516z = optString;
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.video.player.thumb.l, ye1.e
    public void pause() {
        super.pause();
        c0();
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = rVar.f355508r + (currentTimeMillis - rVar.f355505o);
            rVar.f355508r = j17;
            rVar.f355507q = currentTimeMillis;
            com.tencent.mars.xlog.Log.i(rVar.f355486a, "pause realPlayTime:%d", java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.video.player.thumb.l, ye1.e
    public void prepareAsync() {
        super.prepareAsync();
        b0();
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            com.tencent.mars.xlog.Log.i(rVar.f355486a, "prepare");
            rVar.f355504n = java.lang.System.currentTimeMillis();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.video.player.thumb.l, ye1.e
    public void release() {
        super.release();
        synchronized (this) {
            pk1.l0 l0Var = this.N;
            if (l0Var != null) {
                l0Var.a();
            }
        }
        synchronized (O) {
            P--;
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i(((pk1.r) aVar).f355486a, "release");
        }
    }

    @Override // ye1.a, ye1.s
    public void setAppId(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            if (!kotlin.jvm.internal.o.b(rVar.f355488b, str)) {
                com.tencent.mars.xlog.Log.i(rVar.f355486a, "updateAppId appId:%s", str);
            }
            rVar.f355488b = str;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.video.player.thumb.l, ye1.e
    public void start() {
        super.start();
        b0();
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            rVar.f355495e0 = false;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            rVar.f355505o = currentTimeMillis;
            long j17 = rVar.f355507q;
            if (j17 > 0) {
                rVar.f355506p += currentTimeMillis - j17;
                rVar.f355507q = 0L;
            }
            com.tencent.mars.xlog.Log.i(rVar.f355486a, "start pauseTotalTime:%d", java.lang.Long.valueOf(rVar.f355506p));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.video.player.thumb.l, ye1.e
    public void stop() {
        super.stop();
        c0();
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            java.lang.String str = rVar.f355486a;
            com.tencent.mars.xlog.Log.i(str, "stop");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = rVar.f355507q;
            if (j17 > 0) {
                rVar.f355506p += currentTimeMillis - j17;
                rVar.f355507q = 0L;
            } else {
                rVar.f355508r += currentTimeMillis - rVar.f355505o;
            }
            rVar.f355507q = 0L;
            if (rVar.f355495e0) {
                return;
            }
            com.tencent.mm.autogen.mmdata.rpt.AppBrandThumbPlayerReportStruct appBrandThumbPlayerReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandThumbPlayerReportStruct();
            appBrandThumbPlayerReportStruct.f55238d = appBrandThumbPlayerReportStruct.b("AppId", rVar.f355488b, true);
            appBrandThumbPlayerReportStruct.f55239e = appBrandThumbPlayerReportStruct.b("Url", rVar.f355490c, true);
            appBrandThumbPlayerReportStruct.f55240f = rVar.f355492d;
            appBrandThumbPlayerReportStruct.f55242h = rVar.f355494e;
            appBrandThumbPlayerReportStruct.f55241g = rVar.f355496f;
            appBrandThumbPlayerReportStruct.f55243i = rVar.f355497g;
            appBrandThumbPlayerReportStruct.f55244j = rVar.f355498h;
            appBrandThumbPlayerReportStruct.f55245k = rVar.f355499i;
            appBrandThumbPlayerReportStruct.f55246l = rVar.f355500j;
            appBrandThumbPlayerReportStruct.f55247m = rVar.f355501k;
            appBrandThumbPlayerReportStruct.f55248n = appBrandThumbPlayerReportStruct.b("NetType", rVar.f355502l, true);
            appBrandThumbPlayerReportStruct.f55249o = rVar.f355503m;
            appBrandThumbPlayerReportStruct.f55250p = rVar.f355506p;
            appBrandThumbPlayerReportStruct.f55251q = rVar.f355508r;
            appBrandThumbPlayerReportStruct.f55252r = rVar.f355509s;
            appBrandThumbPlayerReportStruct.f55253s = rVar.f355510t;
            appBrandThumbPlayerReportStruct.f55254t = rVar.f355511u;
            appBrandThumbPlayerReportStruct.f55255u = rVar.f355513w;
            appBrandThumbPlayerReportStruct.f55256v = (int) rVar.f355514x;
            appBrandThumbPlayerReportStruct.f55257w = (int) rVar.f355515y;
            appBrandThumbPlayerReportStruct.f55258x = appBrandThumbPlayerReportStruct.b("PlayCodeFormat", rVar.f355516z, true);
            appBrandThumbPlayerReportStruct.f55259y = (int) rVar.A;
            appBrandThumbPlayerReportStruct.f55260z = (int) rVar.B;
            appBrandThumbPlayerReportStruct.A = (int) rVar.C;
            appBrandThumbPlayerReportStruct.B = (int) rVar.D;
            appBrandThumbPlayerReportStruct.C = (int) rVar.E;
            appBrandThumbPlayerReportStruct.D = rVar.F;
            appBrandThumbPlayerReportStruct.E = rVar.G;
            appBrandThumbPlayerReportStruct.F = rVar.I;
            appBrandThumbPlayerReportStruct.G = rVar.f355485J;
            appBrandThumbPlayerReportStruct.H = rVar.K;
            appBrandThumbPlayerReportStruct.I = rVar.L;
            appBrandThumbPlayerReportStruct.f55237J = rVar.N;
            appBrandThumbPlayerReportStruct.K = rVar.O;
            appBrandThumbPlayerReportStruct.L = rVar.P;
            appBrandThumbPlayerReportStruct.M = rVar.Q;
            appBrandThumbPlayerReportStruct.N = rVar.R;
            appBrandThumbPlayerReportStruct.O = appBrandThumbPlayerReportStruct.b("DropFrameRate", "" + rVar.S, true);
            appBrandThumbPlayerReportStruct.P = rVar.T ? 1L : 0L;
            appBrandThumbPlayerReportStruct.Q = rVar.U;
            appBrandThumbPlayerReportStruct.R = rVar.V;
            appBrandThumbPlayerReportStruct.S = rVar.W;
            appBrandThumbPlayerReportStruct.T = rVar.X;
            appBrandThumbPlayerReportStruct.U = rVar.Y ? 1L : 0L;
            appBrandThumbPlayerReportStruct.V = rVar.Z ? 1L : 0L;
            appBrandThumbPlayerReportStruct.W = rVar.f355487a0 ? 1L : 0L;
            appBrandThumbPlayerReportStruct.X = rVar.f355489b0 ? 1L : 0L;
            appBrandThumbPlayerReportStruct.Y = rVar.f355491c0;
            appBrandThumbPlayerReportStruct.Z = rVar.f355493d0;
            com.tencent.mars.xlog.Log.i(str, "report thumb player report data 35934");
            appBrandThumbPlayerReportStruct.k();
            rVar.f355495e0 = true;
        }
    }

    @Override // ye1.a, ye1.e
    public void u(java.lang.String str, java.lang.String str2, ye1.h hVar) {
        ((ku5.t0) ku5.t0.f312615d).g(new pk1.l(this, str, str2, hVar));
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            ((pk1.r) aVar).a(str);
        }
    }

    @Override // ye1.a, ye1.s
    public void v(long j17) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            rVar.f355493d0 = j17;
            com.tencent.mars.xlog.Log.i(rVar.f355486a, "updateJsInsertToLoadMetaDataCostTime jsInsertToLoadMetaDataCostTime:%d", java.lang.Long.valueOf(j17));
        }
    }

    @Override // ye1.a, ye1.e
    public void x(java.lang.String path, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        a0(path, str, new pk1.k(i17, path));
    }
}
