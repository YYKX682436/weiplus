package tn0;

/* loaded from: classes3.dex */
public abstract class w0 implements hn0.h, vn0.f, zn0.e0, gt0.d, fo0.a {
    public hn0.i A;
    public ao0.a A1;
    public hn0.i B;
    public long B1;
    public kn0.i C;
    public final java.util.List C1;
    public final kn0.p D;
    public final java.util.List D1;
    public boolean E;
    public final java.util.List E1;
    public final p05.z0 F;
    public java.lang.Boolean F1;
    public final p05.y0 G;
    public un0.h G1;
    public final p05.s0 H;
    public com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam H1;
    public final jz5.g I;
    public long I1;

    /* renamed from: J, reason: collision with root package name */
    public long f420756J;
    public boolean J1;
    public int K;
    public java.lang.Boolean K1;
    public com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam L;
    public long L1;
    public r45.rm1 M;
    public long M1;
    public boolean N;
    public float N1;
    public float O1;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final kn0.d T;
    public int U;
    public int V;
    public final jz5.g W;
    public com.tencent.thumbplayer.api.ITPPlayer X;
    public final kotlinx.coroutines.y0 Y;
    public java.lang.String Z;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f420757d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f420758e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f420761h;

    /* renamed from: l1, reason: collision with root package name */
    public tn0.x0 f420763l1;

    /* renamed from: m, reason: collision with root package name */
    public vn0.e f420764m;

    /* renamed from: p, reason: collision with root package name */
    public final fo0.n f420767p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.Integer f420768p0;

    /* renamed from: p1, reason: collision with root package name */
    public final tn0.b f420769p1;

    /* renamed from: q, reason: collision with root package name */
    public tn0.k1 f420770q;

    /* renamed from: r, reason: collision with root package name */
    public final go0.f0 f420771r;

    /* renamed from: s, reason: collision with root package name */
    public final go0.h0 f420772s;

    /* renamed from: t, reason: collision with root package name */
    public final hn0.f f420773t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.live.core.view.LivePreviewView f420774u;

    /* renamed from: v, reason: collision with root package name */
    public ts0.r f420775v;

    /* renamed from: w, reason: collision with root package name */
    public ts0.c f420776w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f420777x;

    /* renamed from: x0, reason: collision with root package name */
    public int f420778x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.util.LinkedList f420779x1;

    /* renamed from: y, reason: collision with root package name */
    public hn0.i f420780y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f420781y0;

    /* renamed from: y1, reason: collision with root package name */
    public final tn0.d f420782y1;

    /* renamed from: z, reason: collision with root package name */
    public hn0.i f420783z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f420784z1;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f420759f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f420760g = jz5.h.b(new tn0.u0(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f420762i = jz5.h.b(new tn0.v0(this));

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame f420765n = new com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame();

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.trtc.TRTCCloudDef.TRTCTexture f420766o = new com.tencent.trtc.TRTCCloudDef.TRTCTexture();

    public w0(boolean z17, boolean z18) {
        this.f420757d = z17;
        this.f420758e = z18;
        new com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame();
        this.f420767p = new fo0.n(this);
        go0.f0 f0Var = new go0.f0(z17, z18);
        this.f420771r = f0Var;
        this.f420772s = new go0.h0(z17);
        this.f420773t = new hn0.p(this, f0Var);
        this.f420777x = true;
        kn0.p pVar = new kn0.p();
        this.D = pVar;
        p05.z0 z0Var = new p05.z0();
        this.F = z0Var;
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        this.G = new p05.d2(z0Var);
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        this.H = new p05.d1(z0Var);
        this.I = jz5.h.b(tn0.f.f420665d);
        this.K = 5;
        this.Q = 15;
        kn0.d dVar = new kn0.d(0, 1, null);
        this.T = dVar;
        this.U = 0;
        this.V = 100;
        this.W = jz5.h.b(new tn0.r(this));
        this.Y = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c).plus(new kotlinx.coroutines.x0("Sei_Message_Handler")));
        this.f420769p1 = new tn0.b(this);
        this.f420779x1 = new java.util.LinkedList();
        this.f420782y1 = new tn0.d(this);
        this.C1 = new java.util.ArrayList();
        this.D1 = new java.util.ArrayList();
        this.E1 = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "live anchor use trtc,ver:" + com.tencent.trtc.TRTCCloud.getSDKVersion());
        java.lang.String debugText = "use trtc sdk,ver:" + com.tencent.trtc.TRTCCloud.getSDKVersion();
        kotlin.jvm.internal.o.g(debugText, "debugText");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText);
        ko0.t.f309903a.e(pVar.f309592l);
        dVar.f309502a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_mic_wave_threshold, 20);
        f0Var.l(new go0.w(f0Var, z0Var));
    }

    public static com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam H(tn0.w0 w0Var, int i17, java.lang.String str, boolean z17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: genAudioMusicParam");
        }
        if ((i19 & 4) != 0) {
            z17 = true;
        }
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        w0Var.getClass();
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = new com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam(i17, str);
        audioMusicParam.publish = z17;
        audioMusicParam.loopCount = i18;
        if (i17 == 0) {
            audioMusicParam.f46245id = new java.util.Random().nextInt();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "generated random id " + audioMusicParam.f46245id + " for music play");
        }
        return audioMusicParam;
    }

    public static boolean Y(tn0.w0 w0Var, java.lang.Long l17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isInTRTCRoom");
        }
        if ((i17 & 1) != 0) {
            l17 = null;
        }
        return w0Var.D.g(l17);
    }

    public static final int r(tn0.w0 w0Var) {
        boolean z17;
        if (w0Var.U != 1) {
            return 1080;
        }
        java.lang.String lowerCase = wo.w0.m().toLowerCase();
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_live_capture_res_white_list_android, "", true);
        java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_live_capture_res_black_list_android, "", true);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_capture_res_enum_android, 114);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_cpu_capacity_thres_android, 60);
        java.lang.String wi6 = ((p05.v2) ((rh0.x) i95.n0.c(rh0.x.class))).wi(rh0.z.f395613g, "FaceBeautyLevel");
        if (wi6 == null || wi6.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "xnet miss");
            z17 = false;
        } else {
            z17 = true ^ (com.tencent.mm.sdk.platformtools.t8.B1(wi6) == 1.0f);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "xnet isLowDevice:" + z17);
        }
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3483q).getValue()).r()).intValue();
        if (intValue <= 0) {
            intValue = com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH;
            if (!z17) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
                    kotlin.jvm.internal.o.d(Zi);
                    if (r26.n0.B(Zi, lowerCase, false)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "resolution white list:".concat(Zi));
                        if (Ni != 110) {
                            if (Ni != 112) {
                                return 1080;
                            }
                        }
                        return com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH;
                    }
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi2)) {
                    kotlin.jvm.internal.o.d(Zi2);
                    if (r26.n0.B(Zi2, lowerCase, false)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "resolution black list:".concat(Zi2));
                    }
                }
                int a17 = wo.r.a() & 255;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "camera param prepare. exptResolution:" + Ni + " exptCpuThreshold:" + Ni2 + " cpuCapacity:" + a17);
                if (a17 > Ni2) {
                    if (Ni != 110) {
                        if (Ni != 112) {
                            return 1080;
                        }
                    }
                    return com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH;
                }
            }
        }
        return intValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(tn0.w0 r24, java.lang.String r25, is0.c r26) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn0.w0.s(tn0.w0, java.lang.String, is0.c):void");
    }

    public static final java.lang.String t(tn0.w0 w0Var, byte[] bArr) {
        w0Var.getClass();
        java.lang.String str = new java.lang.String(bArr, r26.c.f368865a);
        java.lang.String s07 = r26.n0.s0(str, "\\0", str);
        if (!(s07.length() == str.length() + (-2))) {
            s07 = null;
        }
        return s07 == null ? str : s07;
    }

    public static final void u(tn0.w0 w0Var, java.lang.String str) {
        w0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "#progressGestureSeiInfo " + str);
        ao0.b a17 = ao0.c.f12524a.a(str);
        if (a17 != null) {
            java.util.Iterator it = ((java.util.ArrayList) w0Var.C1).iterator();
            while (it.hasNext()) {
                ((yz5.b) it.next()).V(a17.f12514a, java.lang.Float.valueOf(a17.f12515b), a17.f12516c, a17.f12517d, java.lang.Float.valueOf(a17.f12518e), java.lang.Float.valueOf(a17.f12519f), java.lang.Float.valueOf(a17.f12520g), java.lang.Float.valueOf(a17.f12521h), a17.f12522i, a17.f12523j);
            }
        }
    }

    public static final void v(tn0.w0 w0Var, org.json.JSONObject jSONObject) {
        w0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "#progressScreenCastGameSeiInfo " + jSONObject);
        int optInt = jSONObject.optInt("recordScreenScene", 0);
        java.util.Iterator it = ((java.util.ArrayList) w0Var.D1).iterator();
        while (it.hasNext()) {
            yz5.l lVar = (yz5.l) it.next();
            boolean z17 = true;
            if (optInt != 1) {
                z17 = false;
            }
            lVar.invoke(java.lang.Boolean.valueOf(z17));
        }
    }

    public static final void w(tn0.w0 w0Var, cl0.g gVar, java.lang.String str) {
        w0Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        hn0.u uVar = hn0.u.f282437e;
        w0Var.q0(16, gVar.optString("d"));
        bundle.putString("live_cdn_sei_msg", gVar.optString("d"));
        bundle.putString("live_link_mic_info_in_anchor_sei_msg", gVar.optString("m"));
        bundle.putString("live_link_mic_info_in_anchor_sei_msg_am", gVar.optString("am"));
        bundle.putString("LIVE_LINK_MIC_INFO_FULL_SEI_MSG", str);
        hn0.i iVar = w0Var.A;
        if (iVar != null) {
            iVar.callback(20, bundle);
        }
    }

    public void A(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "callLiveExperimentalAPI: " + str + " result: " + T().callExperimentalAPI(str));
    }

    public final void A0(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "[21to10]setVideoCrop: " + z17);
        this.f420784z1 = z17;
    }

    public void B(java.lang.Boolean bool) {
    }

    public void B0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "setVoiceCaptureVolume volume:" + i17);
        com.tencent.liteav.audio.TXAudioEffectManager audioEffectManager = T().getAudioEffectManager();
        if (audioEffectManager != null) {
            audioEffectManager.setVoiceCaptureVolume(i17);
        }
    }

    public final void C(boolean z17) {
        D(!z17);
        cl0.g gVar = new cl0.g();
        gVar.h("api", "enableBlackStream");
        cl0.g gVar2 = new cl0.g();
        gVar2.r("enable", z17);
        gVar2.o("width", 96);
        gVar2.o("height", 160);
        gVar.h("params", gVar2);
        A(gVar.toString());
        if (z17) {
            hn0.h.i(this, null, 0, 2, null);
            A0(false);
            vn0.e eVar = this.f420764m;
            if (eVar != null) {
                eVar.f();
                return;
            }
            return;
        }
        vn0.e eVar2 = this.f420764m;
        A0(eVar2 != null ? eVar2.a(this.f420757d) : false);
        vn0.e eVar3 = this.f420764m;
        if (eVar3 != null) {
            eVar3.d(this.D.e());
        }
    }

    public void C0(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "startLocalAudio: " + z17);
        if (z17) {
            yj0.a.j(T(), "com/tencent/mm/live/core/core/trtc/AbsLiveTRTCCore", "startLocalAudio", "(Z)V", "com/tencent/trtc/TRTCCloud", "startLocalAudio", "()V");
        } else {
            T().stopLocalAudio();
        }
    }

    public void D(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "enableCustomVideoCapture: " + z17 + ' ');
        T().enableCustomVideoCapture(z17);
    }

    public int D0(com.tencent.mm.live.core.view.LivePreviewView livePreviewView, lo0.b0 b0Var, int i17) {
        boolean z17;
        ts0.r rVar;
        kn0.f fVar;
        kn0.f fVar2;
        java.util.Iterator it = ((java.util.ArrayList) this.E1).iterator();
        while (it.hasNext()) {
            if (((java.lang.Boolean) ((yz5.a) it.next()).invoke()).booleanValue()) {
                java.lang.Throwable th6 = new java.lang.Throwable();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String c17 = com.tencent.mm.sdk.platformtools.z3.c(th6);
                pm0.z.b(xy2.b.f458155b, "startPreviewCameraPreviewBlocker", false, null, null, false, false, new tn0.t(c17), 60, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "startPreview block for blocker: " + c17);
                return -3;
            }
        }
        if (un0.s.f429418b != null) {
            java.lang.Throwable th7 = new java.lang.Throwable();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String c18 = com.tencent.mm.sdk.platformtools.z3.c(th7);
            pm0.z.b(xy2.b.f458155b, "startPreviewCameraPreviewScreenCastRunningCheck", false, null, null, false, false, new tn0.u(c18), 60, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "startPreview block for running check: " + c18);
            return -3;
        }
        if (livePreviewView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveCore", "startPreview preiewView is null");
            return -3;
        }
        java.lang.String debugText = "startPreview " + livePreviewView;
        kotlin.jvm.internal.o.g(debugText, "debugText");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText);
        this.f420774u = livePreviewView;
        kn0.i iVar = this.C;
        if (iVar == null || (fVar2 = iVar.f309560d) == null) {
            z17 = !(this.f420776w != null && !ts0.c.f421548h);
        } else {
            z17 = fVar2.f309530b;
        }
        V(z17);
        kn0.i iVar2 = this.C;
        boolean z27 = (iVar2 == null || (fVar = iVar2.f309560d) == null || !fVar.f309531c) ? false : true;
        go0.f0 f0Var = this.f420771r;
        if (z27 && (rVar = this.f420775v) != null) {
            rVar.k(f0Var.getFrameDataCallback());
        }
        vn0.c cVar = vn0.b.f438174a;
        cVar.a().getClass();
        cVar.d().getClass();
        xn0.b b17 = cVar.b();
        ts0.r rVar2 = this.f420775v;
        b17.f455410a = rVar2 != null ? rVar2.e() : 0;
        livePreviewView.f(new tn0.v(this), new tn0.w(this));
        livePreviewView.b(this.f420769p1, false);
        f0Var.getClass();
        f0Var.l(new go0.p(f0Var));
        f0Var.l(new go0.b0(f0Var, b0Var));
        f0Var.u(new tn0.z(this, i17));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void E(hn0.i callback) {
        kn0.g gVar;
        kotlin.jvm.internal.o.g(callback, "callback");
        kn0.p pVar = this.D;
        kn0.l lVar = pVar.f309582b;
        kn0.l lVar2 = kn0.l.f309571f;
        if ((lVar == lVar2) == true) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "entering room or already room");
            this.f420780y = callback;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "start create room");
        kn0.i iVar = this.C;
        if (pVar.g((iVar == null || (gVar = iVar.f309558b) == null) ? null : java.lang.Long.valueOf(gVar.f309535b))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "enter room and already in room");
            hn0.i.a(callback, 0, null, 2, null);
            return;
        }
        this.f420780y = callback;
        pVar.getClass();
        pVar.f309582b = lVar2;
        vn0.e eVar = this.f420764m;
        if (eVar != null) {
            vn0.c cVar = vn0.b.f438174a;
            int i17 = cVar.a().f455409g;
            com.tencent.trtc.TRTCCloud tRTCCloud = eVar.f438183a;
            tRTCCloud.setAudioQuality(i17);
            eVar.h(cVar.a().f455406d);
            eVar.b(cVar.a().f455408f, false);
            boolean z17 = cVar.d().f455444t;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("api", com.tencent.live2.impl.V2TXLiveProperty.kV2EnableHevcEncode);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("enable", z17 ? 1 : 0);
                jSONObject.put("params", jSONObject2);
                tRTCCloud.callExperimentalAPI(jSONObject.toString());
            } catch (org.json.JSONException unused) {
            }
            com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams = eVar.f438184b;
            if (tRTCParams != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TRTCCloudManager", "real trtc enterRoom roomId " + tRTCParams.roomId + " sdkAppId: " + tRTCParams.sdkAppId + " userSig: " + tRTCParams.userSig + " userId: " + tRTCParams.userId + " role: " + tRTCParams.role + " strRoomId: " + tRTCParams.strRoomId + " isAudioVolumeEvaluation: " + cVar.a().f455408f + " streamId: " + tRTCParams.streamId + " privateMapKey: " + tRTCParams.privateMapKey + " businessInfo: " + tRTCParams.businessInfo);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TRTCCloudManager", "real trtc enterRoom fail mTRTCParams = null");
            }
            tRTCCloud.enterRoom(tRTCParams, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E0(boolean r18, android.app.Activity r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn0.w0.E0(boolean, android.app.Activity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void F(hn0.i callback) {
        com.tencent.trtc.TRTCCloud tRTCCloud;
        kn0.g gVar;
        kotlin.jvm.internal.o.g(callback, "callback");
        this.S = false;
        kn0.i iVar = this.C;
        java.lang.Long valueOf = (iVar == null || (gVar = iVar.f309558b) == null) ? null : java.lang.Long.valueOf(gVar.f309535b);
        kn0.p pVar = this.D;
        if (!pVar.g(valueOf)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "already exit room");
            H0();
            hn0.i.a(callback, 0, null, 2, null);
            return;
        }
        H0();
        this.f420783z = callback;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "start exit room");
        if (this.f420757d) {
            if (this.U == 1) {
                zn0.a0 U = U();
                zn0.s sVar = U.f474321y;
                if (sVar != null) {
                    if (U.C > 0) {
                        pm0.v.X(new zn0.o(sVar));
                    }
                    zn0.s sVar2 = U.f474321y;
                    java.lang.Runnable runnable = sVar2.f474395m;
                    if (runnable != null) {
                        sVar2.f474394l.removeCallbacks(runnable);
                        sVar2.f474395m = null;
                    }
                    sVar2.d();
                    sVar2.f474394l.removeCallbacksAndMessages(null);
                    U.f474321y = null;
                }
                com.tencent.trtc.TRTCCloudListener tRTCCloudListener = U.f474320x;
                if (tRTCCloudListener != null) {
                    U.f474298b.removeListener(tRTCCloudListener);
                    U.f474320x = null;
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.LiveCore", "invalid live scene: " + this.U);
            }
        }
        vn0.e eVar = this.f420764m;
        if (eVar != null && (tRTCCloud = eVar.f438183a) != null) {
            tRTCCloud.exitRoom();
        }
        pVar.f309582b = kn0.l.f309569d;
        pVar.f309585e = -1L;
    }

    public void F0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopBgMusic path:");
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = this.L;
        sb6.append(audioMusicParam != null ? audioMusicParam.path : null);
        sb6.append(", publish:");
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam2 = this.L;
        sb6.append(audioMusicParam2 != null ? java.lang.Boolean.valueOf(audioMusicParam2.publish) : null);
        sb6.append(", loopCount:");
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam3 = this.L;
        sb6.append(audioMusicParam3 != null ? java.lang.Integer.valueOf(audioMusicParam3.loopCount) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", sb6.toString());
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam4 = this.L;
        if (audioMusicParam4 != null) {
            T().getAudioEffectManager().stopPlayMusic(audioMusicParam4.f46245id);
            T().getAudioEffectManager().setMusicObserver(audioMusicParam4.f46245id, null);
            this.L = null;
            this.N = false;
        }
        this.M = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x013b, code lost:
    
        if ((r7 != null && ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.L6).getValue()).r()).intValue() == 1) != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int G(jn0.a r28) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn0.w0.G(jn0.a):int");
    }

    public final void G0() {
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = this.H1;
        if (audioMusicParam != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "stopLocalBgmAudio, already has playing music [" + audioMusicParam.path + ", " + audioMusicParam.publish + ", " + audioMusicParam.loopCount + "], stop it firstly.");
            T().getAudioEffectManager().stopPlayMusic(audioMusicParam.f46245id);
            T().getAudioEffectManager().setMusicObserver(audioMusicParam.f46245id, null);
        }
    }

    public int H0() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "release");
            this.f420771r.l(new tn0.q0(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiveCoreError", e17, "camera release error:" + e17.getMessage(), new java.lang.Object[0]);
        }
        java.lang.Boolean bool = this.K1;
        if (bool != null) {
            long j17 = this.L1;
            if (j17 != 0) {
                long j18 = this.M1;
                if (j18 != 0) {
                    long j19 = j18 - j17;
                    if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
                        this.N1 += (float) j19;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "#flushCameraUseTimeRecord backCameraUseSeconds:" + this.N1);
                    } else {
                        this.O1 += (float) j19;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "#flushCameraUseTimeRecord frontCameraUseSeconds:" + this.O1);
                    }
                }
            }
        }
        this.K1 = null;
        this.L1 = 0L;
        this.M1 = 0L;
        return 0;
    }

    public org.json.JSONObject I() {
        return null;
    }

    public void I0(android.graphics.Bitmap muteImage) {
        kotlin.jvm.internal.o.g(muteImage, "muteImage");
        kn0.p pVar = this.D;
        pVar.l();
        hn0.h.i(this, muteImage, 0, 2, null);
        c0(false);
        A0(false);
        if (pVar.f309589i) {
            d0(false);
        } else {
            d0(true);
            vn0.e eVar = this.f420764m;
            if (eVar != null) {
                eVar.i(pVar.e());
            }
        }
        H0();
        M0(false);
        if (fn0.g.f264195a.g()) {
            C(true);
        }
    }

    public final org.json.JSONObject J() {
        return U().f474319w;
    }

    public void J0(int i17, yz5.a aVar) {
        ts0.c z17;
        try {
            ts0.r rVar = this.f420775v;
            boolean z18 = true;
            if (rVar != null && ((ts0.b) rVar).G()) {
                ts0.r rVar2 = this.f420775v;
                java.lang.Boolean bool = null;
                java.lang.Boolean valueOf = rVar2 != null ? java.lang.Boolean.valueOf(((ts0.b) rVar2).M()) : null;
                if (valueOf != null) {
                    bool = java.lang.Boolean.valueOf(!valueOf.booleanValue());
                }
                B(bool);
                go0.f0 f0Var = this.f420771r;
                f0Var.y();
                if (this.f420774u != null) {
                    ts0.r rVar3 = this.f420775v;
                    if (rVar3 == null || !((ts0.b) rVar3).G()) {
                        z18 = false;
                    }
                    if (z18) {
                        xn0.b b17 = vn0.b.f438174a.b();
                        ts0.r rVar4 = this.f420775v;
                        b17.f455410a = rVar4 != null ? rVar4.e() : 0;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        ts0.r rVar5 = this.f420775v;
                        if (rVar5 == null || (z17 = rVar5.z()) == null) {
                            return;
                        }
                        ts0.c.f421545e = i17;
                        this.f420776w = z17;
                        f0Var.w(z17);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiveCoreError", e17, "switch camera error:" + e17.getMessage(), new java.lang.Object[0]);
        }
    }

    public org.json.JSONObject K() {
        return new cl0.g();
    }

    public void K0(boolean z17, android.view.TextureView textureView, android.util.Size size, android.view.View view) {
        go0.k0 k0Var;
        go0.k0 k0Var2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "switchScreenShareMode screenShareMode:" + z17 + ", camereViewDrawSize:" + size);
        kn0.p pVar = this.D;
        pVar.f309589i = z17;
        M0(false);
        go0.f0 f0Var = this.f420771r;
        if (!z17) {
            if (textureView != null) {
                textureView.setSurfaceTextureListener(null);
            }
            com.tencent.mm.live.core.view.LivePreviewView livePreviewView = this.f420774u;
            if (livePreviewView != null) {
                livePreviewView.f(new tn0.s0(this), new tn0.t0(this));
            }
            go0.f1 f1Var = f0Var.f273767p;
            if (f1Var != null && (k0Var = f1Var.f273774w) != null) {
                k0Var.L = 0;
                k0Var.K = 0;
            }
            Q().b();
            if (pVar.e()) {
                d0(true);
            }
            vn0.e eVar = this.f420764m;
            A0(eVar != null ? eVar.a(this.f420757d) : false);
            vn0.e eVar2 = this.f420764m;
            if (eVar2 != null) {
                eVar2.i(pVar.e());
                return;
            }
            return;
        }
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView2 = this.f420774u;
        android.view.TextureView cameraView = livePreviewView2 != null ? livePreviewView2.getCameraView() : null;
        if (cameraView != null) {
            cameraView.setSurfaceTextureListener(null);
        }
        if (textureView != null) {
            textureView.setSurfaceTextureListener(new tn0.r0(this));
        }
        go0.f1 f1Var2 = f0Var.f273767p;
        if (f1Var2 != null && (k0Var2 = f1Var2.f273774w) != null) {
            k0Var2.L = 0;
            k0Var2.K = 0;
        }
        A0(false);
        vn0.e eVar3 = this.f420764m;
        if (eVar3 != null) {
            eVar3.i(false);
        }
        if (pVar.e()) {
            d0(false);
        }
        tn0.j1 Q = Q();
        Q.getClass();
        com.tencent.mars.xlog.Log.i("LiveTrtcCoreScreenShare", "startScreenShare screenShareView:" + view + "\ndocViewPos:" + Q.f420707j + ",docViewSize:" + Q.f420706i + "\npreviewPos:" + Q.f420710m + ",previewSize:" + Q.f420708k);
        Q.f420702e = view;
        com.tencent.mm.sdk.platformtools.b4 b4Var = Q.f420704g;
        b4Var.d();
        b4Var.c(0L, 300L);
        if (size != null) {
            Q().c(size.getWidth(), size.getHeight());
        } else if (textureView != null) {
            Q().c(textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        }
    }

    public final boolean L() {
        return ((java.lang.Boolean) ((jz5.n) this.I).getValue()).booleanValue();
    }

    public void L0() {
        kn0.p pVar = this.D;
        pVar.m();
        android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.mic_user_leave);
        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
        hn0.h.i(this, pm0.v.o(drawable, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1280, android.graphics.Bitmap.Config.ARGB_8888), 0, 2, null);
        d0(false);
        c0(false);
        M0(false);
        vn0.e eVar = this.f420764m;
        A0(eVar != null ? eVar.a(this.f420757d) : false);
        vn0.e eVar2 = this.f420764m;
        if (eVar2 != null) {
            eVar2.i(pVar.e());
        }
    }

    public final boolean M() {
        return this.S;
    }

    public final void M0(boolean z17) {
        if (fn0.g.f264195a.b()) {
            zn0.s sVar = U().f474321y;
            if (!(sVar != null ? sVar.f474384b : false)) {
                cl0.g gVar = new cl0.g();
                gVar.h("api", "enableChorus");
                cl0.g gVar2 = new cl0.g();
                gVar2.r("enable", true);
                gVar2.o("audioSource", 0);
                gVar.h("params", gVar2);
                A(gVar.toString());
            }
        }
        U().t(z17);
    }

    public kn0.d N() {
        return this.T;
    }

    public void N0(android.graphics.Bitmap bitmap, int i17) {
        T().setVideoMuteImage(bitmap, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "updateMuteVideoImage fps: " + i17 + " muteImage: " + bitmap);
    }

    public abstract fo0.n O();

    public void O0(java.lang.String privateMapKey) {
        kotlin.jvm.internal.o.g(privateMapKey, "privateMapKey");
        if (com.tencent.mm.sdk.platformtools.t8.K0(privateMapKey)) {
            return;
        }
        cl0.g gVar = new cl0.g();
        gVar.h("privateMapKey", privateMapKey);
        cl0.g gVar2 = new cl0.g();
        gVar2.h("api", "updatePrivateMapKey");
        gVar2.h("params", gVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "updatePrivateMapKey:" + gVar2 + ' ');
        T().callExperimentalAPI(gVar2.toString());
    }

    public kn0.p P() {
        return this.D;
    }

    public void P0(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "updateRemoteOutputSurface userId:" + str);
        if (str != null) {
            zn0.a0 U = U();
            com.tencent.mm.live.core.view.LivePreviewView livePreviewView = this.f420774u;
            U.n(str, 0, livePreviewView != null ? livePreviewView.c(str, 0) : null);
        }
    }

    public final tn0.j1 Q() {
        return (tn0.j1) this.W.getValue();
    }

    public void Q0() {
        vn0.e eVar = this.f420764m;
        boolean z17 = false;
        A0(eVar != null ? eVar.a(this.f420757d) : false);
        if (fn0.g.f264195a.g()) {
            vn0.e eVar2 = this.f420764m;
            if (eVar2 != null) {
                eVar2.f();
                return;
            }
            return;
        }
        vn0.e eVar3 = this.f420764m;
        if (eVar3 != null) {
            kn0.p pVar = this.D;
            if (pVar.e() && !pVar.f309589i) {
                z17 = true;
            }
            eVar3.i(z17);
        }
    }

    public android.graphics.Bitmap R() {
        android.view.View view = Q().f420702e;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth() - (view.getMeasuredWidth() % 4);
            int measuredHeight = view.getMeasuredHeight() - (view.getMeasuredHeight() % 4);
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (view instanceof com.tencent.xweb.WebView) {
                    android.graphics.Bitmap f17 = ((com.tencent.xweb.WebView) view).f();
                    android.graphics.Bitmap.Config config = f17.getConfig();
                    kotlin.jvm.internal.o.d(config);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Boolean.FALSE);
                    arrayList.add(config);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/live/core/core/trtc/LiveTrtcCoreScreenShare", "getScreenShareShot", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap copy = f17.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
                    yj0.a.e(f17, copy, "com/tencent/mm/live/core/core/trtc/LiveTrtcCoreScreenShare", "getScreenShareShot", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                    return copy;
                }
                android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config2);
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(measuredHeight));
                arrayList2.add(java.lang.Integer.valueOf(measuredWidth));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/live/core/core/trtc/LiveTrtcCoreScreenShare", "getScreenShareShot", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/live/core/core/trtc/LiveTrtcCoreScreenShare", "getScreenShareShot", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                if (createBitmap != null) {
                    if (!(createBitmap.isRecycled())) {
                        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                        canvas.drawPaint(new android.graphics.Paint());
                        canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
                        view.draw(canvas);
                        return createBitmap;
                    }
                }
            }
        }
        return null;
    }

    public void R0(int i17) {
        go0.q1 g17 = U().g(this.D.f309586f);
        if (g17 != null) {
            g17.e(i17);
        }
    }

    public final zn0.a0 S() {
        return U();
    }

    public final com.tencent.trtc.TRTCCloud T() {
        return (com.tencent.trtc.TRTCCloud) this.f420760g.getValue();
    }

    public final zn0.a0 U() {
        return (zn0.a0) this.f420762i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x049f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int V(boolean r33) {
        /*
            Method dump skipped, instructions count: 1185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tn0.w0.V(boolean):int");
    }

    public boolean W() {
        ts0.r rVar = this.f420775v;
        if (rVar != null) {
            return ((ts0.b) rVar).f421525g;
        }
        return true;
    }

    public boolean X() {
        return false;
    }

    public final boolean Z() {
        return U().k();
    }

    public void a(int i17) {
        hn0.i iVar;
        java.lang.String debugText = "[" + i17 + "] onExitRoom, end exit room.(" + eo0.a.f255544a.a(i17) + ')';
        kotlin.jvm.internal.o.g(debugText, "debugText");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText);
        hn0.i iVar2 = this.f420783z;
        if (iVar2 != null) {
            hn0.i.a(iVar2, i17, null, 2, null);
        }
        if (i17 != 0 && (iVar = this.A) != null) {
            hn0.i.a(iVar, 6, null, 2, null);
        }
        this.f420783z = null;
        zn0.x.f474414a.b();
        if (fn0.g.f264195a.n()) {
            zn0.a0 U = U();
            U.getClass();
            com.tencent.mars.xlog.Log.i("TRTCRemoteUserManager", "releaseRenderSurface");
            java.util.HashMap hashMap = U.f474307k;
            for (java.lang.Runnable runnable : hashMap.values()) {
                if (runnable != null) {
                    U.f474308l.removeCallbacks(runnable);
                }
            }
            hashMap.clear();
            java.util.HashMap hashMap2 = U.f474306j;
            if (hashMap2 != null) {
                for (go0.q1 q1Var : hashMap2.values()) {
                    if (q1Var != null) {
                        q1Var.c(new go0.k1(q1Var));
                    }
                }
                hashMap2.clear();
            }
        }
        tn0.x0 x0Var = this.f420763l1;
        if (x0Var != null) {
            x0Var.a(i17);
        }
    }

    public void a0() {
        pm0.v.X(new tn0.i(this));
    }

    public void b0(int i17, int i18) {
        tn0.j1 Q = Q();
        android.view.View view = Q.f420702e;
        android.view.ViewParent parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        int width = ((viewGroup != null ? viewGroup.getWidth() : Q.f420706i.getWidth()) - Q.f420708k.getWidth()) - Q.a().x;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updatePreviewPos from:");
        android.graphics.Point point = Q.f420710m;
        sb6.append(point);
        sb6.append(" to:$(");
        sb6.append(width);
        sb6.append(',');
        sb6.append(Q.a().y);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("LiveTrtcCoreScreenShare", sb6.toString());
        Q.a().set(i17, i18);
        point.x = width;
        point.y = Q.f420698a.f420758e ? (Q.f420712o - Q.a().y) - Q.f420708k.getHeight() : Q.a().y;
    }

    public void c(java.lang.String str, int i17, int i18, int i19) {
        java.lang.String debugText = "[sdk]onFirstVideoFrame uid:" + str + " ,streamType:" + i17 + " width:" + i18 + " height:" + i19;
        kotlin.jvm.internal.o.g(debugText, "debugText");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("live_user_id", str);
        bundle.putInt("live_stream_type", i17);
        bundle.putInt("live_stream_type", i17);
        bundle.putInt("live_first_frame_width", i18);
        bundle.putInt("live_first_frame_height", i19);
        hn0.i iVar = this.A;
        if (iVar != null) {
            iVar.callback(7, bundle);
        }
    }

    public void c0(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "muteLocalAudio " + z17);
        T().muteLocalAudio(z17);
    }

    public fo0.b d() {
        return null;
    }

    public void d0(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "muteLocalVideo " + z17);
        T().muteLocalVideo(z17);
    }

    public void e(long j17) {
        kn0.g gVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create room ret:");
        sb6.append(j17);
        sb6.append('(');
        int i17 = (int) j17;
        sb6.append(eo0.a.f255544a.a(i17));
        sb6.append(')');
        java.lang.String debugText = sb6.toString();
        kotlin.jvm.internal.o.g(debugText, "debugText");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText);
        hn0.i iVar = this.f420780y;
        if (iVar != null) {
            hn0.i.a(iVar, i17, null, 2, null);
        }
        this.f420780y = null;
        kn0.i iVar2 = this.C;
        long j18 = (iVar2 == null || (gVar = iVar2.f309558b) == null) ? -1L : gVar.f309535b;
        kn0.p pVar = this.D;
        pVar.getClass();
        pVar.f309582b = kn0.l.f309570e;
        pVar.f309585e = j18;
        if (j17 >= 0 && this.f420757d) {
            vn0.c cVar = vn0.b.f438174a;
            boolean z17 = cVar.d().f455444t;
            boolean z18 = cVar.d().f455445u;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "onEnterRoom hevcenable:" + z17 + ", force265Mixing:" + z18);
            if (z17 && z18) {
                U().s();
            }
        }
        tn0.x0 x0Var = this.f420763l1;
        if (x0Var != null) {
            x0Var.e(j17);
        }
    }

    public void e0(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "muteMicVolume: " + z17);
        if (z17) {
            u0(0);
        } else {
            u0(this.V);
        }
    }

    public void f0(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "muteMusicVolume mute:" + z17 + " musicVolumeLevel:" + this.f420778x0);
        if (z17) {
            T().getAudioEffectManager().setAllMusicVolume(0);
        } else if (this.f420781y0) {
            T().getAudioEffectManager().setAllMusicVolume(this.f420778x0);
        }
    }

    public void g0(java.util.ArrayList userList) {
        kotlin.jvm.internal.o.g(userList, "userList");
        java.util.Iterator it = userList.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            com.tencent.trtc.TRTCCloud T = T();
            if (T != null) {
                T.muteRemoteAudio((java.lang.String) lVar.f302833d, ((java.lang.Boolean) lVar.f302834e).booleanValue());
            }
        }
    }

    public abstract void h0();

    public final void i0(int i17, java.lang.String forceUserId) {
        zn0.a0 U = U();
        U.getClass();
        com.tencent.mars.xlog.Log.i("TRTCRemoteUserManager", "onMicForceSelectUserId micMode: %d forceUserId:%s", java.lang.Integer.valueOf(i17), forceUserId);
        U.f474315s = forceUserId;
        U.f474316t = i17;
        zn0.i iVar = U.f474312p;
        iVar.getClass();
        kotlin.jvm.internal.o.g(forceUserId, "forceUserId");
        iVar.f474353c = forceUserId;
        U.t(false);
    }

    public final void j0(java.lang.String userId, ps0.a aVar) {
        go0.q1 q1Var;
        kotlin.jvm.internal.o.g(userId, "userId");
        zn0.a0 U = U();
        U.getClass();
        if (userId.isEmpty() || (q1Var = (go0.q1) U.f474306j.get(userId)) == null) {
            return;
        }
        if (aVar != null) {
            ((go0.w1) aVar).e(q1Var.f273824h);
        }
        go0.s1 s1Var = q1Var.f273828o;
        if (s1Var != null) {
            if (s1Var.f273841a == 1) {
                os0.d dVar = s1Var.f273843c;
                if (dVar != null) {
                    dVar.R = aVar;
                    return;
                }
                return;
            }
            go0.c cVar = s1Var.f273842b;
            if (cVar != null) {
                cVar.I = aVar;
            }
        }
    }

    public void k(org.json.JSONObject jSONObject) {
    }

    public void k0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseLive,liveMode:");
        kn0.p pVar = this.D;
        sb6.append(pVar.f309587g);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveStatus", sb6.toString());
        pVar.f309588h = true;
        android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.mic_user_leave);
        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
        hn0.h.i(this, pm0.v.o(drawable, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1280, android.graphics.Bitmap.Config.ARGB_8888), 0, 2, null);
        c0(true);
        d0(true);
        H0();
    }

    public void l(java.lang.String str, int i17) {
        java.lang.Object obj;
        zn0.a0 U = U();
        U.getClass();
        if (str == null || str.isEmpty()) {
            com.tencent.mars.xlog.Log.w("TRTCRemoteUserManager", "removeRemoteUserInRoom: userId is null or empty");
        } else {
            java.util.concurrent.ConcurrentHashMap.KeySetView keySetView = (java.util.concurrent.ConcurrentHashMap.KeySetView) U.F;
            keySetView.remove(str);
            com.tencent.mars.xlog.Log.i("TRTCRemoteUserManager", "removeRemoteUserInRoom: userId=" + str + ", size=" + keySetView.size());
        }
        if (fn0.g.f264196b != null && zl2.r4.f473950a.x1()) {
            fj2.s sVar = fj2.s.f263183a;
            java.lang.String str2 = str == null ? "" : str;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 2);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            sVar.f(6, str2, r26.i0.t(jSONObject2, ",", ";", false));
            mm2.y2 y2Var = (mm2.y2) dk2.ef.f233372a.i(mm2.y2.class);
            if (y2Var != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.List list = y2Var.f329569v;
                arrayList.addAll(list);
                java.util.List list2 = y2Var.f329570w;
                arrayList.addAll(list2);
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, str)) {
                            break;
                        }
                    }
                }
                km2.q qVar = (km2.q) obj;
                if (qVar != null) {
                    java.lang.String str3 = str != null ? str : "";
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, i17);
                    jSONObject3.put("role", qVar.f309177h ? 1 : kotlin.jvm.internal.o.b(qVar.f309189t, java.lang.Boolean.TRUE) ? 3 : 2);
                    java.lang.String jSONObject4 = jSONObject3.toString();
                    kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                    sVar.f(5, str3, r26.i0.t(jSONObject4, ",", ";", false));
                    if (list != null) {
                        list.remove(qVar);
                    }
                    if (list2 != null) {
                        list2.remove(qVar);
                    }
                }
            }
        }
        java.lang.String debugText = "[sdk]onRemoteUserLeaveRoom:" + str + " reason:" + i17;
        kotlin.jvm.internal.o.g(debugText, "debugText");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("live_user_id", str);
        bundle.putInt("live_user_exit_reason", i17);
        hn0.i iVar = this.A;
        if (iVar != null) {
            iVar.callback(1, bundle);
        }
        U().o(str);
        U().q(str, 0);
        if (this.f420757d) {
            if (this.U == 1) {
                M0(false);
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LiveCore", "invalid live scene: " + this.U);
        }
    }

    public void l0(int i17, java.lang.String path, com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "playLocalSoundEffect path:".concat(path));
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam H = H(this, i17, path, false, 0, 12, null);
        H.publish = false;
        T().getAudioEffectManager().setMusicObserver(H.f46245id, new tn0.l(tXMusicPlayObserver));
        T().getAudioEffectManager().startPlayMusic(H);
    }

    public void m0() {
        java.lang.String str;
        java.lang.String str2;
        yz5.l lVar;
        kn0.g gVar;
        kn0.g gVar2;
        kn0.g gVar3;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "#reportCameraUseTime backCameraUseMs:" + this.N1 + " frontCameraUseMs:" + this.O1);
        if (this.N1 > 0.0f) {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            e42.d0 d0Var = e42.d0.clicfg_gallery_image_edit_icon_hide;
            h62.d dVar = (h62.d) e0Var;
            dVar.getClass();
            dVar.bj("clicfg_finder_live_camera_2_enable", "", true);
        }
        int rj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).rj(e42.d0.clicfg_finder_live_camera_2_enable, 0);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("backCameraUseMs", java.lang.Float.valueOf(this.N1));
        jSONObject.put("frontCameraUseMs", java.lang.Float.valueOf(this.O1));
        kn0.i iVar = this.C;
        jSONObject.put("liveId", (iVar == null || (gVar3 = iVar.f309558b) == null) ? "" : java.lang.Long.valueOf(gVar3.f309535b));
        kn0.i iVar2 = this.C;
        if (iVar2 == null || (gVar2 = iVar2.f309558b) == null || (str = gVar2.f309534a) == null) {
            str = "";
        }
        jSONObject.put("liveName", str);
        kn0.i iVar3 = this.C;
        if (iVar3 == null || (gVar = iVar3.f309558b) == null || (str2 = gVar.f309549p) == null) {
            str2 = "";
        }
        jSONObject.put("nickName", str2);
        jSONObject.put("exptValue", rj6);
        pm0.z.b(xy2.b.f458155b, "CameraUseTimeInfo", false, null, null, false, false, new tn0.n(jSONObject), 60, null);
        hn0.p pVar = (hn0.p) this.f420773t;
        kotlinx.coroutines.z0.e(pVar.f282406h, null, 1, null);
        pVar.f282400b.l(new hn0.j(pVar));
        ((p05.d1) this.H).b(null);
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam = this.L;
        if (audioMusicParam != null) {
            if (this.f420761h) {
                T().getAudioEffectManager().stopPlayMusic(audioMusicParam.f46245id);
                T().getAudioEffectManager().setMusicObserver(audioMusicParam.f46245id, null);
            }
            this.L = null;
            this.N = false;
        }
        this.M = null;
        this.f420771r.release();
        this.f420772s.release();
        this.f420767p.e();
        Q().f420699b = null;
        Q().b();
        if (this.f420761h) {
            T().setListener(null);
            com.tencent.trtc.TRTCCloud.destroySharedInstance();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.X;
        if (iTPPlayer != null) {
            iTPPlayer.stop();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = this.X;
        if (iTPPlayer2 != null) {
            iTPPlayer2.release();
        }
        this.X = null;
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.live.core.core.trtc.screencast.LiveScreenCastForegroundService.class);
        com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(intent);
        this.G1 = null;
        un0.h hVar = un0.s.f429418b;
        if (hVar != null && (lVar = hVar.f429365n) != null) {
            lVar.invoke("AbsLiveTRTCCore-closeScreenRecordWorker");
        }
        vn0.c cVar = vn0.b.f438174a;
        if (cVar.f438180f == null) {
            cVar.f438180f = new wn0.a();
        }
        cVar.f438180f.getClass();
        xn0.l d17 = cVar.d();
        d17.f455431d = 108;
        d17.f455432e = 15;
        d17.f455433f = 600;
        d17.f455434g = 600;
        d17.f455435h = 110;
        d17.f455436i = 15;
        d17.f455437m = 1500;
        d17.f455438n = 600;
        d17.f455439o = 1;
        d17.f455440p = 2;
        d17.f455441q = true;
        d17.f455442r = true;
        d17.f455443s = true;
        d17.f455444t = false;
        d17.f455445u = false;
        d17.f455446v = 5;
        d17.f455447w = 10;
        d17.f455448x = 5;
        d17.f455449y = 0;
        d17.f455450z = 0;
        d17.A = false;
        xn0.a a17 = cVar.a();
        a17.f455406d = 0;
        a17.f455407e = true;
        a17.f455408f = true;
        a17.f455409g = 2;
        if (cVar.f438178d == null) {
            cVar.f438178d = new xn0.k();
        }
        cVar.f438178d.f455430d = "";
        if (cVar.f438179e == null) {
            cVar.f438179e = new xn0.j();
        }
        cVar.f438179e.getClass();
        cVar.b().f455410a = -1;
        zn0.y yVar = zn0.x.f474414a;
        yVar.f474415a.clear();
        ((java.util.concurrent.ConcurrentHashMap) yVar.f474418d).clear();
        yVar.f474416b = 1;
        yVar.f474417c = 0;
        yVar.f474419e = null;
        ((java.util.ArrayList) this.C1).clear();
        ((java.util.ArrayList) this.D1).clear();
        ((java.util.ArrayList) this.E1).clear();
        this.F.f350739a.clear();
        ao0.a aVar = this.A1;
        if (aVar != null) {
            aVar.b();
        }
        this.A1 = null;
        if (fn0.g.f264195a.l()) {
            this.f420774u = null;
        }
    }

    public void n0(int i17) {
        fo0.n nVar = this.f420767p;
        nVar.getClass();
        pm0.v.X(new fo0.l(nVar, i17));
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null) {
            if2.z.f291153a.i(liveRoomControllerStore, new mf2.d0(liveRoomControllerStore, i17));
        }
    }

    public void o(int i17, int i18) {
    }

    public final void o0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "removeGiftMakeUpSuitEffectRes");
        this.f420771r.l(new tn0.m(this));
    }

    public void p(int i17, java.lang.String str, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("live_err_code", i17);
        hn0.i iVar = this.A;
        if (iVar != null) {
            iVar.callback(4, bundle2);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LiveCore", "onError errCode:" + i17 + ",errMsg:" + str);
        java.lang.String debugText = "[" + i17 + "]msg:" + str + '(' + eo0.a.f255544a.a(i17) + ')';
        kotlin.jvm.internal.o.g(debugText, "debugText");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText);
    }

    public void p0() {
        this.D.a();
        a0();
    }

    public void q(java.util.ArrayList arrayList, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("userVolumeSize:");
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        sb6.append(",totalVolume:");
        sb6.append(i17);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.trtc.TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo = (com.tencent.trtc.TRTCCloudDef.TRTCVolumeInfo) it.next();
                sb6.append(" [" + tRTCVolumeInfo.userId + ", " + tRTCVolumeInfo.volume + ", vad: " + tRTCVolumeInfo.vad + ']');
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "dumpUserVoiceVolume = " + ((java.lang.Object) sb6));
    }

    public final void q0(int i17, java.lang.String str) {
        kn0.g gVar;
        java.lang.String str2;
        com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams;
        kn0.g gVar2;
        kn0.g gVar3;
        kn0.g gVar4;
        r45.ka4 ka4Var;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f420756J > this.K * 1000) {
            try {
                long a17 = c01.id.a();
                cl0.g gVar5 = new cl0.g();
                cl0.d dVar = new cl0.d(str);
                hn0.u uVar = hn0.u.f282437e;
                long optLong = i17 == 16 ? dVar.f42846a.optLong("st", 0L) : 0L;
                gVar5.s("SVRT", java.lang.Long.valueOf(a17));
                kn0.i iVar = this.C;
                java.lang.String str3 = (iVar == null || (gVar4 = iVar.f309558b) == null || (ka4Var = gVar4.f309548o) == null) ? null : ka4Var.f378556y;
                java.lang.String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                gVar5.s("GAMEID", str3);
                gVar5.s("SEI", dVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "handleSeiMessage SEIMode_GAMEREPORT jsonData:" + gVar5 + ", anchorTs:" + optLong + ", audienceTs:" + a17 + " seiMessage: " + str);
                com.tencent.mm.autogen.mmdata.rpt.LiveVisitorExceptionClientStruct liveVisitorExceptionClientStruct = new com.tencent.mm.autogen.mmdata.rpt.LiveVisitorExceptionClientStruct();
                liveVisitorExceptionClientStruct.f58680d = liveVisitorExceptionClientStruct.b("moduleName", java.lang.String.valueOf(i17), true);
                liveVisitorExceptionClientStruct.f58681e = 2012L;
                kn0.i iVar2 = this.C;
                liveVisitorExceptionClientStruct.f58683g = (iVar2 == null || (gVar3 = iVar2.f309558b) == null) ? 0L : gVar3.f309535b;
                liveVisitorExceptionClientStruct.f58684h = this.U;
                liveVisitorExceptionClientStruct.f58685i = (iVar2 == null || (gVar2 = iVar2.f309558b) == null) ? 0L : gVar2.f309536c;
                liveVisitorExceptionClientStruct.f58682f = liveVisitorExceptionClientStruct.b("eventMsg", fp.s0.b(gVar5.toString(), com.tencent.mapsdk.internal.rv.f51270c), true);
                liveVisitorExceptionClientStruct.f58686j = optLong;
                liveVisitorExceptionClientStruct.f58687k = a17;
                kn0.i iVar3 = this.C;
                liveVisitorExceptionClientStruct.f58688l = (iVar3 == null || (tRTCParams = iVar3.f309557a) == null) ? 0 : tRTCParams.roomId;
                if (iVar3 != null && (gVar = iVar3.f309558b) != null && (str2 = gVar.f309534a) != null) {
                    str4 = str2;
                }
                liveVisitorExceptionClientStruct.f58689m = liveVisitorExceptionClientStruct.b("finderName", str4, true);
                liveVisitorExceptionClientStruct.k();
                this.f420756J = currentTimeMillis;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", e17.toString());
            }
        }
    }

    public void r0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resumeLive,liveMode:");
        kn0.p pVar = this.D;
        sb6.append(pVar.f309587g);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveStatus", sb6.toString());
        pVar.f309588h = false;
        if (pVar.f309587g == kn0.k.f309566d) {
            L0();
        } else {
            if (!pVar.e()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "resumeLive error");
                return;
            }
            android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.ajc);
            kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
            I0(pm0.v.n(drawable));
        }
    }

    public void s0(android.opengl.EGLContext eglContext, int i17, int i18, int i19, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(eglContext, "eglContext");
        com.tencent.trtc.TRTCCloudDef.TRTCTexture tRTCTexture = this.f420766o;
        tRTCTexture.eglContext14 = eglContext;
        tRTCTexture.textureId = i17;
        com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = this.f420765n;
        tRTCVideoFrame.texture = tRTCTexture;
        tRTCVideoFrame.width = i18;
        tRTCVideoFrame.height = i19;
        tRTCVideoFrame.pixelFormat = 2;
        tRTCVideoFrame.bufferType = 3;
        if (!kotlin.jvm.internal.o.b(this.F1, java.lang.Boolean.valueOf(z17))) {
            T().setVideoEncoderMirror(z17);
            this.F1 = java.lang.Boolean.valueOf(z17);
        }
        tRTCVideoFrame.rotation = z17 ? 2 : 0;
        T().sendCustomVideoData(tRTCVideoFrame);
    }

    public final void t0(int i17, byte[] bArr, boolean z17) {
        hn0.i iVar;
        try {
            r45.fa4 fa4Var = new r45.fa4();
            if (bArr != null) {
                try {
                    fa4Var.parseFrom(bArr);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "handleSeiMessage seiData wxt:" + fa4Var.f374143d + " seiMode:" + i17);
            int i18 = (int) fa4Var.f374143d;
            hn0.u uVar = hn0.u.f282437e;
            if (pm0.v.z(i18, 128) && z17) {
                android.os.Bundle bundle = new android.os.Bundle();
                com.tencent.mm.protobuf.g gVar = fa4Var.f374144e;
                bundle.putByteArray("live_cdn_sei_msg", gVar != null ? gVar.g() : null);
                hn0.i iVar2 = this.A;
                if (iVar2 != null) {
                    iVar2.callback(33, bundle);
                    return;
                }
                return;
            }
            int i19 = (int) fa4Var.f374143d;
            hn0.u uVar2 = hn0.u.f282437e;
            if (pm0.v.z(i19, 256)) {
                hn0.i iVar3 = this.A;
                if (iVar3 != null) {
                    iVar3.b(35, fa4Var);
                    return;
                }
                return;
            }
            hn0.u uVar3 = hn0.u.f282437e;
            if (pm0.v.z(i17, 1024) && pm0.v.z((int) fa4Var.f374143d, 1024) && (iVar = this.A) != null) {
                iVar.b(37, fa4Var);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiveCore", "handleSeiMessage seiData Exception:" + e18.getMessage());
        }
    }

    public void u0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "setAudioCaptureVolume " + i17);
        T().setAudioCaptureVolume(i17);
    }

    public final void v0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "set backupCaptureVolume: " + i17);
        this.V = i17;
    }

    public void w0(int i17) {
        fo0.n nVar = this.f420767p;
        nVar.getClass();
        pm0.v.X(new fo0.m(nVar, i17));
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null) {
            if2.z.f291153a.i(liveRoomControllerStore, new mf2.e0(liveRoomControllerStore, i17));
        }
    }

    public final void x(tn0.m1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.LinkedList linkedList = this.f420779x1;
        if (linkedList.contains(listener)) {
            return;
        }
        linkedList.add(listener);
    }

    public void x0(hn0.i iVar) {
        this.A = iVar;
    }

    public void y(int i17) {
        fo0.n nVar = this.f420767p;
        nVar.getClass();
        pm0.v.X(new fo0.h(nVar, i17));
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null) {
            if2.z.f291153a.i(liveRoomControllerStore, new mf2.c0(liveRoomControllerStore, i17));
        }
    }

    public void y0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "setPreviewOrientation: " + i17);
        ts0.r rVar = this.f420775v;
        if (rVar != null) {
            int e17 = rVar.e();
            ts0.r rVar2 = this.f420775v;
            if (rVar2 != null) {
                rVar2.w(e17, i17);
            }
        }
        vn0.b.f438174a.d().f455441q = i17 != 1;
    }

    public android.graphics.Point z(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        return (this.f420757d && z17) ? new android.graphics.Point(com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480464yo), com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480465yp)) : new android.graphics.Point(com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480465yp), com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480464yo));
    }

    public void z0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "setScene:" + i17);
        this.U = i17;
    }
}
