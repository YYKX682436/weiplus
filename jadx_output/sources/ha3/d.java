package ha3;

/* loaded from: classes15.dex */
public final class d implements m8.z, m8.h0, z8.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f279806d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f279807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ha3.g f279808f;

    public d(ha3.g gVar) {
        this.f279808f = gVar;
    }

    @Override // m8.z
    public void A() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onPositionDiscontinuity");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onSeekComplete");
        ha3.g gVar = this.f279808f;
        hashMap.put("position", java.lang.Long.valueOf(gVar.q()));
        gVar.b(hashMap);
    }

    @Override // m8.z
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onLoadingChanged loading: " + z17);
        ha3.g gVar = this.f279808f;
        if (z17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("event", "bufferingStart");
            gVar.b(hashMap);
        } else {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("event", "bufferingEnd");
            gVar.b(hashMap2);
        }
    }

    @Override // m8.z
    public void d(m8.e eVar) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoHDRPlayer", "onPlayerError exception: " + eVar);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("视频加载失败 errorType: ");
        sb6.append(eVar != null ? eVar.toString() : null);
        sb6.append(", errorCode: ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f324555d) : null);
        java.lang.String sb7 = sb6.toString();
        if (eVar == null || (str = eVar.toString()) == null) {
            str = "";
        }
        hashMap.put("errorType", str);
        hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(eVar != null ? eVar.f324555d : -1));
        hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, sb7);
        hashMap.put("errorActionDesc", "重试");
        ha3.g gVar = this.f279808f;
        if (gVar.f279861l != null) {
            gVar.a(java.lang.String.valueOf(eVar != null ? eVar.f324555d : -1), sb7, hashMap);
        } else {
            gVar.f279851b = hashMap;
        }
    }

    @Override // m8.z
    public void e(d9.l0 l0Var, q9.n nVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onTracksChanged trackGroupArray: " + l0Var + ", trackSelectionArray: " + nVar);
    }

    @Override // z8.f
    public void p(com.google.android.exoplayer2.metadata.Metadata metadata) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onMetadata metadata: " + metadata);
    }

    @Override // m8.z
    public void t(m8.m0 m0Var, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onTimelineChanged timeline: " + m0Var + ", args: " + obj);
    }

    @Override // m8.z
    public void u(m8.y yVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onPlaybackParametersChanged param: " + yVar);
    }

    @Override // m8.z
    public void y(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onPlayerStateChanged playWhenReady: " + z17 + ", state: " + i17);
        ha3.g gVar = this.f279808f;
        if (i17 == gVar.f279855f) {
            gVar.f279855f = z17 ? 5 : 6;
            return;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("event", "completed");
                gVar.b(hashMap);
            }
        } else {
            if (this.f279807e) {
                return;
            }
            this.f279807e = true;
            m8.i0 i0Var = gVar.f279857h;
            if (i0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoHDRPlayer", "onPrepared video is null!");
                return;
            }
            kotlin.jvm.internal.o.d(i0Var);
            int i18 = i0Var.f324567h.f44087s;
            m8.i0 i0Var2 = gVar.f279857h;
            kotlin.jvm.internal.o.d(i0Var2);
            int i19 = i0Var2.f324567h.f44084p;
            m8.i0 i0Var3 = gVar.f279857h;
            kotlin.jvm.internal.o.d(i0Var3);
            int i27 = i0Var3.f324567h.f44085q;
            if (i18 == -270 || i18 == -90 || i18 == 90 || i18 == 270) {
                m8.i0 i0Var4 = gVar.f279857h;
                kotlin.jvm.internal.o.d(i0Var4);
                i19 = i0Var4.f324567h.f44085q;
                m8.i0 i0Var5 = gVar.f279857h;
                kotlin.jvm.internal.o.d(i0Var5);
                i27 = i0Var5.f324567h.f44084p;
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("event", "initialized");
            m8.i0 i0Var6 = gVar.f279857h;
            kotlin.jvm.internal.o.d(i0Var6);
            hashMap2.put("duration", java.lang.Long.valueOf(i0Var6.getDuration()));
            hashMap2.put("width", java.lang.Integer.valueOf(i19));
            hashMap2.put("height", java.lang.Integer.valueOf(i27));
            m8.i0 i0Var7 = gVar.f279857h;
            kotlin.jvm.internal.o.d(i0Var7);
            com.google.android.exoplayer2.Format format = i0Var7.f324567h;
            hashMap2.put("videoRate", java.lang.Integer.valueOf(format != null ? format.f44076e : 0));
            m8.i0 i0Var8 = gVar.f279857h;
            kotlin.jvm.internal.o.d(i0Var8);
            com.google.android.exoplayer2.Format format2 = i0Var8.f324568i;
            hashMap2.put("audioRate", java.lang.Integer.valueOf(format2 != null ? format2.f44076e : 0));
            m8.i0 i0Var9 = gVar.f279857h;
            kotlin.jvm.internal.o.d(i0Var9);
            hashMap2.put("videoFrameRate", java.lang.Long.valueOf(i0Var9.f324567h != null ? r2.f44086r : 0L));
            m8.i0 i0Var10 = gVar.f279857h;
            kotlin.jvm.internal.o.d(i0Var10);
            com.google.android.exoplayer2.Format format3 = i0Var10.f324567h;
            java.lang.String str = format3 != null ? format3.f44077f : null;
            if (str == null) {
                str = "";
            }
            hashMap2.put("videoCodec", str);
            if (!gVar.f279866q) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onPrepared: delayed init renderController with videoWidth=" + i19 + ", videoHeight=" + i27);
                if (i19 > 0 && i27 > 0) {
                    io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = gVar.f279860k;
                    if (surfaceProducer != null) {
                        surfaceProducer.setSize(i19, i27);
                    }
                    ha3.c cVar = new ha3.c(gVar);
                    um5.p pVar = gVar.f279864o;
                    io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer2 = gVar.f279860k;
                    kotlin.jvm.internal.o.d(surfaceProducer2);
                    pVar.e(surfaceProducer2.getSurface(), i19, i27);
                    gVar.f279864o.n(cVar);
                    gVar.f279866q = true;
                }
            }
            gVar.f279864o.m(i19, i27, i18);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "initializedEvent: " + hashMap2);
            if (gVar.f279861l != null) {
                gVar.b(hashMap2);
            } else {
                gVar.f279850a = hashMap2;
            }
        }
        gVar.f279855f = i17;
    }

    @Override // m8.z
    public void z(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onRepeatModeChanged repeatMode: " + i17);
    }
}
