package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class g1 {
    public final com.tencent.mm.plugin.voip.model.i1 A;
    public final com.tencent.mm.plugin.voip.model.i3 B;
    public int L;
    public com.tencent.mm.plugin.voip.model.VoipScoreState O;
    public final com.tencent.mm.sdk.platformtools.n3 U;
    public wu5.c V;
    public int W;
    public boolean X;
    public double Y;
    public final com.tencent.mm.sdk.platformtools.b4 Z;

    /* renamed from: a0, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.c1 f176509a0;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.v2protocal f176532x;

    /* renamed from: a, reason: collision with root package name */
    public int f176508a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f176510b = 1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f176511c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f176512d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f176513e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f176514f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f176515g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f176516h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f176517i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f176518j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f176519k = false;

    /* renamed from: l, reason: collision with root package name */
    public final r45.xc6 f176520l = new r45.xc6();

    /* renamed from: m, reason: collision with root package name */
    public int f176521m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f176522n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f176523o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f176524p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f176525q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f176526r = 10;

    /* renamed from: s, reason: collision with root package name */
    public int f176527s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f176528t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f176529u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f176530v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f176531w = -1;

    /* renamed from: y, reason: collision with root package name */
    public android.content.Context f176533y = null;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.k3 f176534z = com.tencent.mm.plugin.voip.model.k3.A0;
    public byte[] C = null;
    public r45.r27 D = null;
    public boolean E = false;
    public boolean F = false;
    public int G = 0;
    public boolean H = false;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public int f176507J = 0;
    public int K = 0;
    public boolean M = false;
    public boolean N = true;
    public android.net.Network P = null;
    public android.net.ConnectivityManager.NetworkCallback Q = null;
    public final java.util.LinkedList R = new java.util.LinkedList();
    public int S = 0;
    public final com.tencent.mm.sdk.platformtools.b4 T = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.voip.model.q0(this), true);

    public g1() {
        this.A = null;
        this.L = 0;
        com.tencent.mm.plugin.voip.model.v0 v0Var = new com.tencent.mm.plugin.voip.model.v0(this, android.os.Looper.getMainLooper());
        this.U = v0Var;
        this.V = null;
        this.W = 0;
        this.X = false;
        this.Y = 0.0d;
        this.Z = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.voip.model.o0(this), false);
        this.f176509a0 = null;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = new com.tencent.mm.plugin.voip.model.v2protocal(v0Var);
        this.f176532x = v2protocalVar;
        com.tencent.mm.plugin.voip.model.i1 i1Var = new com.tencent.mm.plugin.voip.model.i1(this);
        this.A = i1Var;
        i1Var.f176667v = v2protocalVar.f176883s;
        this.B = new com.tencent.mm.plugin.voip.model.i3(this);
        this.L = 0;
        this.O = new com.tencent.mm.plugin.voip.model.VoipScoreState();
    }

    public static double l(byte[] bArr) {
        return java.lang.Double.longBitsToDouble((((((((((((((bArr[0] & 255) | (bArr[1] << 8)) & 65535) | (bArr[2] << 16)) & 16777215) | (bArr[3] << 24)) & io.flutter.embedding.android.KeyboardMap.kValueMask) | (bArr[4] << 32)) & 1099511627775L) | (bArr[5] << 40)) & 281474976710655L) | (bArr[6] << 48)) & 72057594037927935L) | (bArr[7] << 56));
    }

    public final void A(int i17) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i17);
        vq4.d0.c("MicroMsg.Voip.VoipContext", "setHWDecoderReadyStatus, iHWDecoderReady: " + i17 + ", ret: " + this.f176532x.setAppCmd(122, allocate.array(), 4));
    }

    public void B() {
        int a17 = wo.r.a();
        boolean z17 = false;
        boolean z18 = (a17 & 1024) != 0;
        int i17 = (a17 >> 12) & 15;
        int i18 = a17 & 255;
        int i19 = android.os.Build.VERSION.SDK_INT;
        long g17 = (oj.d.g(com.tencent.mm.sdk.platformtools.x2.f193071a) / 1024) / 1024;
        boolean z19 = i17 >= ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_beauty_cpu_core_num_threshold, 4);
        boolean z27 = i18 >= ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_beauty_cpu_freq_threshold, 45);
        boolean z28 = i19 >= ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_beauty_sdkint_threadshold, 23);
        boolean z29 = g17 >= ((long) ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_beauty_totalmem_threshold, 4096));
        double a18 = oj.d.a();
        android.os.Debug.MemoryInfo b17 = oj.d.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "checkVoipBeautyLocalConfig, cpuFlags:%s, isNeon:%s, nCores:%s, nFreq:%s, sdkInt:%s, totalMemMB:%s, coreNumCheck:%s, freqCheck:%s, sdkIntCheck:%s, totalMemMBCheck:%s, cpuRate:%s, dalvikPss:%s, nativePss:%s", java.lang.Integer.valueOf(a17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(g17), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z28), java.lang.Boolean.valueOf(z29), java.lang.Double.valueOf(a18), java.lang.Integer.valueOf(b17.dalvikPss), java.lang.Integer.valueOf(b17.nativePss));
        if (z18 && z19 && z27 && z28 && z29) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.voip.model.v2protocal.f();
        }
        wo.e eVar = wo.v1.f447822b;
        int i27 = eVar.K;
        int i28 = eVar.L;
        int i29 = 1 & (this.f176532x.D >> 15);
        vq4.b0 b0Var = vq4.b0.f439270a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "hseasun: voipSTFilterSvrCfg:" + i29 + " voipSTFilterWhiteList:" + i27 + " voipSTFilterBlackList:" + i28 + " voipSTFilterFlag:%d 0 xSettingEnableSTFitler:" + java.lang.Boolean.FALSE);
    }

    public void C(boolean z17) {
        int i17;
        com.tencent.mm.plugin.voip.model.k3 k3Var;
        vq4.b0 b0Var = vq4.b0.f439270a;
        bm5.o1 o1Var = bm5.o1.f22719a;
        bm5.h0 h0Var = bm5.h0.RepairerConfig_VOIP_RemoteRenderSharpen_Int;
        if (o1Var.g(h0Var, -1) != -1) {
            i17 = o1Var.g(h0Var, -1);
        } else {
            if (wo.v1.f447822b.P != 1) {
                boolean f17 = com.tencent.mm.plugin.voip.model.v2protocal.f();
                boolean z18 = rs0.n.f399306d.f() >= ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_sharpen_gpu_score_android, 80);
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipRendererHelper", "checkRendererSharpenLocalConfig, localCheck:%s, gpuCheck:%s", java.lang.Boolean.valueOf(f17), java.lang.Boolean.valueOf(z18));
                if (f17 && z18) {
                    i17 = z17 ? 25 : 20;
                }
            }
            i17 = 0;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_sharpen_1080p_android, 0);
        if (i17 > 0 && (k3Var = this.f176534z) != null) {
            k3Var.N(i17);
            this.f176534z.D(Ni);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "sifeng: voipSharpenFilterFlag:" + i17 + " isRemoteBeautyOpened:" + z17 + " voipSharpenFilter1080p:" + Ni);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        v2protocalVar.f176888t1 = i17;
        v2protocalVar.f176891u1 = Ni;
    }

    public void D(int i17) {
        if (i17 == this.f176508a) {
            return;
        }
        if (i17 == 4) {
            this.Z.c(60000L, 60000L);
        }
        this.f176508a = i17;
    }

    public void E(boolean z17) {
        this.X = z17;
        com.tencent.mm.plugin.voip.model.k3 k3Var = this.f176534z;
        if (k3Var != null) {
            k3Var.z(z17);
        }
    }

    public final void F() {
        if (!r() && !q()) {
            n();
            return;
        }
        if (this.V != null) {
            n();
            return;
        }
        this.W = 0;
        this.V = ((ku5.t0) ku5.t0.f312615d).d(new com.tencent.mm.plugin.voip.model.x0(this), 200L, 200L);
    }

    public void G(com.tencent.mm.plugin.voip.model.f1 f1Var) {
        int i17 = this.f176508a;
        if (i17 != 2 && i17 != 3 && i17 != 4) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "startConnectRelay status fail, status:" + this.f176508a);
        } else {
            if (this.f176511c) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "can not startConnectRelay again");
                return;
            }
            com.tencent.mm.plugin.voip.model.e1 e1Var = new com.tencent.mm.plugin.voip.model.e1(this, null);
            e1Var.f176469g = new com.tencent.mm.plugin.voip.model.z0(this, f1Var);
            ((ku5.t0) ku5.t0.f312615d).g(e1Var);
        }
    }

    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "stop repeat voip sync");
        this.T.d();
    }

    public void I(int i17, boolean z17) {
        if (8 != i17 && 9 != i17) {
            this.f176527s = i17;
            this.f176528t = i17;
        }
        if (z17) {
            com.tencent.mm.plugin.voip.model.i3 i3Var = this.B;
            i3Var.getClass();
            byte[] bArr = new byte[4];
            for (int i18 = 0; i18 < 4; i18++) {
                bArr[i18] = (byte) (i17 >>> (i18 * 8));
            }
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(bArr);
            r45.cu5 cu5Var2 = new r45.cu5();
            try {
                cu5Var2.d(cu5Var.toByteArray());
                r45.j27 j27Var = new r45.j27();
                j27Var.f377523d = 3;
                j27Var.f377524e = cu5Var2;
                j27Var.f377525f = c01.z1.r();
                r45.k27 k27Var = new r45.k27();
                k27Var.f378335d = 1;
                k27Var.f378336e.add(j27Var);
                i3Var.a(k27Var, false, 4);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public void J() {
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.M0(v2protocalVar.f176889u);
        vq4.d0.c("MicroMsg.Voip.VoipContext", "channel:try start connect, hasRemotePid:" + z17 + ",mStatus:" + this.f176508a + ",isPreConnect:" + this.f176518j + ",isRemoteAccepted:" + this.f176514f + ",isLocalAccept:" + this.f176515g);
        v2protocalVar.M1.f176726m = 7;
        if (z17) {
            int i17 = this.f176508a;
            if (i17 == 4 || i17 == 5 || i17 == 6 || ((i17 == 2 && this.f176518j) || (i17 == 3 && this.f176518j))) {
                if (i17 != 2 && i17 != 3 && i17 != 4 && i17 != 5 && i17 != 6) {
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "startConnect status fail, status:" + this.f176508a);
                } else {
                    if (!this.f176514f && !this.f176515g) {
                        if (!this.f176518j || this.f176511c) {
                            return;
                        }
                        G(new com.tencent.mm.plugin.voip.model.m0(this));
                        return;
                    }
                    if (!this.f176511c) {
                        G(new com.tencent.mm.plugin.voip.model.n0(this));
                    } else {
                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.model.a1(this));
                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.model.b1(this));
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v147, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v221 */
    public void K() {
        boolean z17;
        r45.e83 e83Var;
        int i17;
        int i18;
        int i19;
        int i27;
        vq4.d0.c("MicroMsg.Voip.VoipContext", "tryStartTalk: try start talk");
        if (!this.f176516h || !this.f176513e) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "tryStartTalk: fail isCanSendData " + this.f176516h + ", isChannelConnectedSuccess " + this.f176513e);
            return;
        }
        vq4.d0.c("MicroMsg.Voip.VoipContext", "Voip tryStartTalk, channel setActive");
        this.f176532x.setActive();
        if (this.f176519k) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "tryStartTalk: engine already started, isEngineStarted " + this.f176519k);
            return;
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        v2protocalVar.setSvrConfig(com.tencent.shadow.dynamic.host.FailedException.ERROR_PLUGIN_PROCESS_LOADER_NOT_LOADED, 0, 0, v2protocalVar.f176855i1, 0, 0, 0, 0, null);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = this.f176532x;
        v2protocalVar2.setSvrConfig(3012, 0, 0, v2protocalVar2.D, 0, 0, 0, 0, null);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = this.f176532x;
        long j17 = v2protocalVar3.E;
        v2protocalVar3.setSvrConfig(3016, 0, 0, (int) (io.flutter.embedding.android.KeyboardMap.kValueMask & j17), (int) (j17 >> 32), 0, 0, 0, null);
        vq4.d0.c("MicroMsg.Voip.VoipContext", "bothSideGeneralSwitch = " + this.f176532x.f176855i1 + " SwitchFlag = " + this.f176532x.D + " SwitchFlagExt = " + this.f176532x.E);
        int i28 = ((int) ((this.f176532x.E & io.flutter.embedding.android.KeyboardMap.kValueMask) & 256)) >> 8;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("background analysis opensl_flag=");
        sb6.append(i28);
        vq4.d0.c("MicroMsg.Voip.VoipContext", sb6.toString());
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voip_opensles_devicecfg, 0);
        vq4.d0.c("MicroMsg.Voip.VoipContext", "x experiment opensles_devicecfg(flag)=" + Ni);
        try {
            cl0.g gVar = new cl0.g(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Vi(e42.c0.clicfg_voip_opensles_params, "{\"slparamsflag\":0,\"slplaynativefs\":44100,\"slplaypcmformat\":16,\"slplaychannel\":1,\"slrecnativefs\":16000}"));
            int intValue = ((java.lang.Integer) gVar.get("slparamsflag")).intValue();
            if (intValue == 1) {
                int intValue2 = ((java.lang.Integer) gVar.get("slplaynativefs")).intValue();
                int intValue3 = ((java.lang.Integer) gVar.get("slplaypcmformat")).intValue();
                int intValue4 = ((java.lang.Integer) gVar.get("slplaychannel")).intValue();
                int intValue5 = ((java.lang.Integer) gVar.get("slrecnativefs")).intValue();
                vq4.d0.c("MicroMsg.Voip.VoipContext", "x json slparamsflag=" + intValue + ", slplaynativefs=" + intValue2 + ", slplaypcmformat=" + intValue3 + ", slplaychannel=" + intValue4 + ", slrecnativefs=" + intValue5);
                this.A.f(intValue2, intValue3, intValue4, intValue5);
            } else {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "x json slparamsflag=" + intValue);
            }
        } catch (java.lang.Exception e17) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "x json openslesparams failed" + e17);
        }
        if (i28 == 1 && Ni == 0) {
            com.tencent.mm.plugin.voip.model.i1 i1Var = this.A;
            i1Var.B = 1;
            vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "seenli, setOpenslFlag=" + i1Var.B);
        } else {
            com.tencent.mm.plugin.voip.model.i1 i1Var2 = this.A;
            i1Var2.B = 0;
            vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "seenli, setOpenslFlag=" + i1Var2.B);
        }
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_frmidx_extension, -1);
        if (Ni2 > 0) {
            this.f176532x.setSvrConfig(3015, Ni2, 0, 0, 0, 0, 0, 0, null);
        }
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_video_vcodec2mix, -1);
        int i29 = Ni3 > 0 ? (Ni3 & 3) | 0 : 0;
        if (i29 >= 0) {
            this.f176532x.setSvrConfig(3017, i29, 0, 0, 0, 0, 0, 0, null);
        }
        this.f176532x.setSvrConfig(3014, 1, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_video_arq, -1), 1, 0, 0, 0, 0, null);
        this.f176532x.setSvrConfig(3019, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voip_playcontrol_android, 0), 0, 0, 0, 0, 0, 0, null);
        this.f176532x.setSvrConfig(3020, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voip_playcontrol_maxframenumber_android, 0), 0, 0, 0, 0, 0, 0, null);
        this.f176532x.setSvrConfig(3021, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voip_playcontrol_minframenumber_android, 1), 0, 0, 0, 0, 0, 0, null);
        byte[] bArr = this.f176532x.F;
        if (bArr != null) {
            if (bArr.length < 12 || (i27 = java.nio.ByteBuffer.wrap(bArr, 8, 4).getInt()) <= 0) {
                i18 = 4;
            } else {
                int i37 = (i27 / 10000000) % 10;
                int i38 = (i27 / 1000000) % 10;
                int i39 = (i27 / 10000) % 100;
                int i47 = i27 % 10000;
                vq4.d0.c("MicroMsg.Voip.VoipContext", "lilyhpeng, getSvrBothSideGeneralStrategy for dtx, uiSvrDtxConfig:" + i27 + ", config dtx: [" + i38 + ", " + i39 + ", " + i47 + "]");
                byte[] bArr2 = {(byte) (i37 & 255), (byte) ((i37 >> 8) & 255), (byte) ((i37 >> 16) & 255), (byte) ((i37 >> 24) & 255), (byte) (i38 & 255), (byte) ((i38 >> 8) & 255), (byte) ((i38 >> 16) & 255), (byte) ((i38 >> 24) & 255), (byte) (i39 & 255), (byte) ((i39 >> 8) & 255), (byte) ((i39 >> 16) & 255), (byte) ((i39 >> 24) & 255), (byte) (i47 & 255), (byte) ((i47 >> 8) & 255), (byte) ((i47 >> 16) & 255), (byte) ((i47 >> 24) & 255)};
                i18 = 4;
                this.f176532x.setJNIAppCmd(15, bArr2, 4);
            }
            byte[] bArr3 = this.f176532x.F;
            if (bArr3.length >= 20 && (i19 = java.nio.ByteBuffer.wrap(bArr3, 16, i18).getInt()) > 0) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "lilyhpeng, getSvrBothSideGeneralStrategy for lossstatinterval:" + i19);
                byte[] bArr4 = new byte[i18];
                bArr4[0] = (byte) (i19 & 255);
                bArr4[1] = (byte) ((i19 >> 8) & 255);
                bArr4[2] = (byte) ((i19 >> 16) & 255);
                bArr4[3] = (byte) ((i19 >> 24) & 255);
                this.f176532x.setJNIAppCmd(23, bArr4, 1);
            }
        }
        java.lang.String Vi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Vi(e42.c0.clicfg_voip_jbm3_params, "unused");
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, jbm3_voip_params: " + Vi);
        if (Vi.equals("unused")) {
            z17 = false;
        } else {
            this.f176532x.setJNIAppCmd(22, Vi.getBytes(), Vi.getBytes().length);
            z17 = true;
        }
        java.lang.String Vi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Vi(e42.c0.clicfg_voip_arq_json_params, "unused");
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, audio_arq_params: " + Vi2);
        if (!Vi2.equals("unused")) {
            this.f176532x.setJNIAppCmd(25, Vi2.getBytes(), Vi2.getBytes().length);
        }
        if (this.f176532x.G != null) {
            try {
                e83Var = (r45.e83) new r45.e83().parseFrom(this.f176532x.G);
            } catch (java.io.IOException unused) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "parse Voip general strategy fail");
                e83Var = null;
            }
            if (e83Var != null) {
                if (!z17) {
                    int i48 = e83Var.B1;
                    int i49 = e83Var.C1;
                    int i57 = e83Var.D1;
                    int i58 = e83Var.E1;
                    int i59 = e83Var.F1;
                    int i66 = e83Var.G1;
                    int i67 = e83Var.H1;
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "qipengfeng, jbm3_cofig:" + i48 + ", " + i49 + ", " + i57 + ", " + i58 + ", " + i59 + ", " + i66 + ", " + i67);
                    this.f176532x.setJNIAppCmd(13, new byte[]{(byte) (i48 & 255), (byte) ((i48 >> 8) & 255), (byte) ((i48 >> 16) & 255), (byte) ((i48 >> 24) & 255), (byte) (i49 & 255), (byte) ((i49 >> 8) & 255), (byte) ((i49 >> 16) & 255), (byte) ((i49 >> 24) & 255), (byte) (i57 & 255), (byte) ((i57 >> 8) & 255), (byte) ((i57 >> 16) & 255), (byte) ((i57 >> 24) & 255), (byte) (i58 & 255), (byte) ((i58 >> 8) & 255), (byte) ((i58 >> 16) & 255), (byte) ((i58 >> 24) & 255), (byte) (i59 & 255), (byte) ((i59 >> 8) & 255), (byte) ((i59 >> 16) & 255), (byte) ((i59 >> 24) & 255), (byte) (i66 & 255), (byte) ((i66 >> 8) & 255), (byte) ((i66 >> 16) & 255), (byte) ((i66 >> 24) & 255), (byte) (i67 & 255), (byte) ((i67 >> 8) & 255), (byte) ((i67 >> 16) & 255), (byte) ((i67 >> 24) & 255)}, 7);
                }
                int i68 = e83Var.I1;
                vq4.d0.c("MicroMsg.Voip.VoipContext", "qipengfeng, nsParas:" + i68);
                if (i68 >= 0) {
                    this.f176532x.setJNIAppCmd(14, new byte[]{(byte) (i68 & 255), (byte) ((i68 >> 8) & 255), (byte) ((i68 >> 16) & 255), (byte) ((i68 >> 24) & 255)}, 1);
                }
                int i69 = e83Var.V1;
                vq4.d0.c("MicroMsg.Voip.VoipContext", "qipengfeng, agcParams:" + i69);
                if (i69 > 0 || i69 == -1) {
                    this.f176532x.setJNIAppCmd(24, new byte[]{(byte) (i69 & 255), (byte) ((i69 >> 8) & 255), (byte) ((i69 >> 16) & 255), (byte) ((i69 >> 24) & 255)}, 1);
                }
                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar4 = this.f176532x;
                byte[] bArr5 = v2protocalVar4.G;
                v2protocalVar4.setSvrConfig(3013, 0, 0, 0, 0, 0, 0, bArr5.length, bArr5);
                int i76 = e83Var.R1;
                int i77 = e83Var.S1;
                int i78 = e83Var.T1;
                int i79 = e83Var.U1;
                int g17 = vq4.d0.g("enccap");
                int g18 = vq4.d0.g("encsize");
                int g19 = vq4.d0.g("deccap");
                int g27 = vq4.d0.g("decsize");
                if (i76 != g17) {
                    com.tencent.mm.sdk.platformtools.o4.M("static_cap_mmkv_key").putInt("enccap", i76);
                }
                if (i77 != g18) {
                    com.tencent.mm.sdk.platformtools.o4.M("static_cap_mmkv_key").putInt("encsize", i77);
                }
                if (i78 != g19) {
                    com.tencent.mm.sdk.platformtools.o4.M("static_cap_mmkv_key").putInt("deccap", i78);
                }
                if (i79 != g27) {
                    com.tencent.mm.sdk.platformtools.o4.M("static_cap_mmkv_key").putInt("decsize", i79);
                }
                vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli:nEncCap:" + i76 + ", nEncSize:" + i77 + ", nDecCap:" + i78 + ", nDecCap:" + i79 + ", nPrevEncCap:" + g17 + ", nPrevEncSize:" + g18 + ", nPrevDecCap:" + g19 + ", nPrevDecSize:" + g27);
                int i86 = e83Var.P;
                if (i86 != vq4.d0.g("ladder_cpu")) {
                    com.tencent.mm.sdk.platformtools.o4.M("static_cap_mmkv_key").putInt("ladder_cpu", i86);
                }
                vq4.d0.c("MicroMsg.Voip.VoipContext", "qipeng, LADDER_CPU:" + i86);
                this.f176532x.V0 = e83Var.f373096d;
                vq4.d0.c("MicroMsg.Voip.VoipContext", "AudioEnableXnoiseSup = " + this.f176532x.V0);
            }
        } else {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "tryStartTalk: protocol has null generalStrategyBuf");
        }
        if (this.f176532x.startEngine() == 0) {
            this.f176532x.M1.A = 0;
        } else {
            this.f176519k = false;
            this.f176532x.M1.A = 1;
        }
        A(0);
        bm5.o1 o1Var = bm5.o1.f22719a;
        int g28 = o1Var.g(bm5.h0.RepairerConfig_VOIP_TestEncodeParam_Int, 0);
        if (g28 != 0) {
            int g29 = o1Var.g(bm5.h0.RepairerConfig_VOIP_Use264_Int, 0);
            int g37 = o1Var.g(bm5.h0.RepairerConfig_VOIP_UseVcodec2_Int, 0);
            int g38 = o1Var.g(bm5.h0.RepairerConfig_VOIP_UseVCodec_Int, 0);
            int g39 = o1Var.g(bm5.h0.RepairerConfig_VOIP_UseVCodecMixRes_Int, 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (g29 == 1) {
                arrayList.add(8);
            }
            if (g37 == 1) {
                arrayList.add(16);
            }
            if (g38 == 1) {
                arrayList.add(2);
            }
            if (g39 == 1) {
                arrayList.add(32);
            }
            int g47 = o1Var.g(bm5.h0.RepairerConfig_VOIP_Use1920_Int, 0);
            int g48 = o1Var.g(bm5.h0.RepairerConfig_VOIP_Use1280_Int, 0);
            int g49 = o1Var.g(bm5.h0.RepairerConfig_VOIP_Use640_Int, 0);
            int g57 = o1Var.g(bm5.h0.RepairerConfig_VOIP_Use480_Int, 0);
            int g58 = o1Var.g(bm5.h0.RepairerConfig_VOIP_Use320_Int, 0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (g47 == 1) {
                arrayList2.add(12);
            }
            if (g48 == 1) {
                arrayList2.add(10);
            }
            if (g49 == 1) {
                arrayList2.add(8);
            }
            if (g57 == 1) {
                arrayList2.add(6);
            }
            if (g58 == 1) {
                arrayList2.add(4);
            }
            int g59 = o1Var.g(bm5.h0.RepairerConfig_VOIP_SetFPS_Int, 15);
            int g66 = o1Var.g(bm5.h0.RepairerConfig_VOIP_SetIPeriod_Int, 15);
            int g67 = o1Var.g(bm5.h0.RepairerConfig_VOIP_SetInterval_Int, 10);
            int g68 = o1Var.g(bm5.h0.RepairerConfig_VOIP_SetRSLevel_Int, 2);
            int g69 = o1Var.g(bm5.h0.RepairerConfig_VOIP_SetBitrate_Int, 600);
            if (g28 != 3) {
                byte[] bArr6 = new byte[12];
                bArr6[4] = (byte) g59;
                bArr6[5] = (byte) g66;
                bArr6[6] = (byte) g67;
                bArr6[7] = (byte) g68;
                bArr6[8] = (byte) (g69 & 65535);
                bArr6[9] = (byte) ((g69 >> 8) & 65535);
                bArr6[10] = (byte) ((g69 >> 16) & 65535);
                bArr6[11] = (byte) ((g69 >> 24) & 65535);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bArr6[2] = ((java.lang.Integer) it.next()).byteValue();
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        bArr6[3] = ((java.lang.Integer) it6.next()).byteValue();
                        this.f176532x.setAppCmd(98, bArr6, 12);
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "weiranli: add result " + ((int) bArr6[0]) + " size " + ((int) bArr6[1]));
                        if (bArr6[0] == 0) {
                            db5.t7.m(this.f176533y, "[tim]添加配置失败: codec:" + ((int) bArr6[2]) + ", codecSize:" + ((int) bArr6[3]));
                        }
                        if (g28 == 1) {
                            break;
                        }
                    }
                    if (g28 == 1) {
                        break;
                    }
                }
            } else {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_VOIP_QOS_CUSTOM_STRING, ""));
                    for (int i87 = 0; i87 < jSONArray.length(); i87++) {
                        byte[] decode = android.util.Base64.decode(jSONArray.getString(i87), 0);
                        this.f176532x.setAppCmd(98, decode, 12);
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "tim: add result " + ((int) decode[0]) + " size " + ((int) decode[1]));
                        if (decode[0] == 0) {
                            db5.t7.m(this.f176533y, "[tim]添加配置失败: codec:" + ((int) decode[2]) + ", codecSize:" + ((int) decode[3]));
                        }
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipContext", "use custom qos config fail:" + e18.getLocalizedMessage());
                }
            }
        }
        vq4.d0.a("MicroMsg.Voip.VoipContext", "anlin: ClientVersion: " + o45.wf.f343029g);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(o45.wf.f343029g);
        byte[] array = allocate.array();
        this.f176532x.setAppCmd(505, array, 4);
        try {
            if (this.f176532x != null) {
                r45.ww6 ww6Var = new r45.ww6();
                ww6Var.f389547d = 8;
                ww6Var.f389548e = new com.tencent.mm.protobuf.g(array);
                vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin send local client version: " + array);
                this.f176532x.SendRUDP(ww6Var.toByteArray(), ww6Var.toByteArray().length);
            }
        } catch (java.lang.Exception unused2) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin send local client version Error!");
        }
        java.lang.String m17 = wo.w0.m();
        int length = m17.length();
        byte[] bytes = m17.getBytes();
        vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin DeviceModel: ".concat(m17));
        this.f176532x.setAppCmd(507, bytes, length);
        try {
            if (this.f176532x != null) {
                r45.ww6 ww6Var2 = new r45.ww6();
                ww6Var2.f389547d = 9;
                ww6Var2.f389548e = new com.tencent.mm.protobuf.g(bytes);
                vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin send local device model: " + m17);
                this.f176532x.SendRUDP(ww6Var2.toByteArray(), ww6Var2.toByteArray().length);
            }
        } catch (java.lang.Exception unused3) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin send local device model Error!");
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar5 = this.f176532x;
        if (v2protocalVar5 != null) {
            java.lang.String a17 = v2protocalVar5.a();
            if (a17 != null) {
                this.f176532x.M1.f176714a0 = a17.replace(',', ' ');
                byte[] bytes2 = a17.getBytes();
                this.f176532x.setAppCmd(509, bytes2, a17.length());
                try {
                    r45.ww6 ww6Var3 = new r45.ww6();
                    ww6Var3.f389547d = 28;
                    ww6Var3.f389548e = new com.tencent.mm.protobuf.g(bytes2);
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin send local cpu hardware: " + a17);
                    this.f176532x.SendRUDP(ww6Var3.toByteArray(), ww6Var3.toByteArray().length);
                } catch (java.lang.Exception unused4) {
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin send local device model Error!");
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.Voip.VoipContext", "get CpuHardware failed");
            }
        }
        this.f176532x.getClass();
        byte[] bArr7 = {0};
        vq4.d0.c("MicroMsg.Voip.VoipContext", "sifeng BeautyInfo: " + bArr7);
        try {
            if (this.f176532x != null) {
                r45.ww6 ww6Var4 = new r45.ww6();
                ww6Var4.f389547d = 22;
                ww6Var4.f389548e = new com.tencent.mm.protobuf.g(bArr7);
                vq4.d0.c("MicroMsg.Voip.VoipContext", "sifeng send local beauty info: " + bArr7);
                this.f176532x.SendRUDP(ww6Var4.toByteArray(), ww6Var4.toByteArray().length);
            }
        } catch (java.lang.Exception unused5) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "sifeng send local beautyInfo Error!");
        }
        int i88 = this.f176532x.D;
        boolean z18 = ((i88 >> 17) & 1) != 0;
        boolean z19 = ((i88 >> 18) & 1) != 0;
        d(44, z18);
        e(47, z19);
        ?? r07 = (this.f176532x.E & 2097152) != 0 ? 1 : 0;
        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(4);
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
        allocate2.order(byteOrder);
        allocate2.putInt(r07);
        vq4.d0.c("MicroMsg.Voip.VoipContext", "weiranli: p2s video freeze info = " + ((boolean) r07));
        this.f176532x.setAppCmd(117, allocate2.array(), 4);
        if (!com.tencent.mm.plugin.voip.model.v2protocal.Z1) {
            a();
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar6 = this.f176532x;
        if ((v2protocalVar6.D & 2) == 0) {
            if ((v2protocalVar6.E & 32768) == 0) {
                if (this.N) {
                    c(16, true, true);
                    c(4, true, true);
                } else {
                    b(16, true, true);
                    b(16, false, true);
                    b(16, true, false);
                    b(16, false, false);
                    b(4, true, true);
                    b(4, false, true);
                    b(4, true, false);
                    b(4, false, false);
                }
            } else if (this.N) {
                c(16, true, true);
                c(4, true, true);
            } else {
                b(16, true, true);
                b(16, false, true);
                b(16, true, false);
                b(16, false, false);
            }
        }
        int i89 = (this.f176532x.D >> 12) & 1;
        java.nio.ByteBuffer allocate3 = java.nio.ByteBuffer.allocate(4);
        allocate3.order(byteOrder);
        allocate3.putInt(i89);
        vq4.d0.c("MicroMsg.Voip.VoipContext", "weiranli: set MixVcodec1 from svr = " + i89);
        this.f176532x.setAppCmd(46, allocate3.array(), 4);
        if ((this.f176532x.D & 512) == 0) {
            java.nio.ByteBuffer allocate4 = java.nio.ByteBuffer.allocate(4);
            allocate4.order(byteOrder);
            allocate4.putInt(8);
            vq4.d0.c("MicroMsg.Voip.VoipContext", "jcchen Disable 720p from svr: mSwitchFlag = " + this.f176532x.D);
            this.f176532x.setAppCmd(32, allocate4.array(), 4);
            this.f176532x.setAppCmd(30, allocate4.array(), 4);
        }
        int i96 = (this.f176532x.D & 1048576) != 0 ? 1 : 0;
        vq4.d0.c("MicroMsg.Voip.VoipContext", "setAppCmd: EMethodSetP2SSendThreadEnable enble, mSwitchFlag: " + this.f176532x.D + ", p2sEnable: " + i96);
        java.nio.ByteBuffer allocate5 = java.nio.ByteBuffer.allocate(4);
        allocate5.order(byteOrder);
        allocate5.putInt(i96);
        this.f176532x.setAppCmd(52, allocate5.array(), 4);
        if ((this.f176532x.E & 512) != 0) {
            java.nio.ByteBuffer allocate6 = java.nio.ByteBuffer.allocate(4);
            allocate6.order(byteOrder);
            allocate6.putInt(1);
            vq4.d0.c("MicroMsg.Voip.VoipContext", "setAppCmd: weiranli set rtprefext to 1, switchExt:" + this.f176532x.E);
            i17 = 4;
            this.f176532x.setAppCmd(105, allocate6.array(), 4);
        } else {
            i17 = 4;
        }
        boolean z27 = x51.o1.f452042a;
        byte[] bArr8 = new byte[i17];
        this.f176532x.setAppCmd(26, bArr8, i17);
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr8);
        wrap.order(byteOrder);
        int i97 = wrap.getInt();
        vq4.d0.a("MicroMsg.Voip.VoipContext", "steve: iHW: " + i97);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar7 = this.f176532x;
        if (!((v2protocalVar7.Q0 & 4) != 0 || wo.v1.f447822b.E > 0) && v2protocalVar7.W1) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[HW]:Server Disable HW enc/dec!!");
            boolean z28 = (i97 & 4) != 0;
            boolean z29 = (i97 & 8) != 0;
            if (z28 || z29) {
                this.A.f176656k = true;
                m(false, false);
            }
            this.f176532x.W1 = false;
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar8 = this.f176532x;
        if (v2protocalVar8.W1) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "steve: HW encoder/decoder init ret: " + v2protocalVar8.x(wo.v1.f447822b.E, i97) + ", iHW:" + i97);
            if (this.f176532x.W1) {
                A(1);
            } else {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "steve: HW dec/enc NOT supported for both sides,end HWEnc!!");
                com.tencent.mm.plugin.voip.model.i1 i1Var3 = this.A;
                i1Var3.f176656k = true;
                i1Var3.f176657l = true;
                i1Var3.f176658m = true;
                m(false, false);
                b(8, true, true);
                b(8, true, false);
            }
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar9 = this.f176532x;
        v2protocalVar9.setSvrConfig(com.tencent.shadow.dynamic.host.FailedException.ERROR_CODE_RELOAD_RUNTIME_EXCEPTION, v2protocalVar9.M0, v2protocalVar9.N0, 0, 0, 0, 0, 0, null);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar10 = this.f176532x;
        v2protocalVar10.setSvrConfig(com.tencent.shadow.dynamic.host.FailedException.ERROR_CODE_RELOAD_LOADER_EXCEPTION, 0, 0, v2protocalVar10.R0, 0, 0, 0, 0, null);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar11 = this.f176532x;
        v2protocalVar11.setSvrConfig(3011, 0, 0, v2protocalVar11.V0, 0, 0, 0, 0, null);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar12 = this.f176532x;
        v2protocalVar12.setSvrConfig(3003, v2protocalVar12.O0, v2protocalVar12.P0, v2protocalVar12.Q0, v2protocalVar12.T0, 0, 0, 0, null);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar13 = this.f176532x;
        int i98 = v2protocalVar13.W0;
        int i99 = (i98 >> 2) & 3;
        int i100 = i98 & 3;
        if (v2protocalVar13.f176880r == 0) {
            i99 <<= 2;
        } else {
            i100 <<= 2;
        }
        int i101 = i99 + i100;
        v2protocalVar13.setSvrConfig(3026, 0, 0, i101, 0, 0, 0, 0, null);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar14 = this.f176532x;
        v2protocalVar14.setSvrConfig(3027, 0, 0, v2protocalVar14.X0, v2protocalVar14.Y0, v2protocalVar14.Z0, v2protocalVar14.f176831a1, 0, null);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar15 = this.f176532x;
        if (v2protocalVar15.f176870n1 != null && v2protocalVar15.f176873o1 != null) {
            v2protocalVar15.setSvrConfig(3028, 0, 0, v2protocalVar15.f176867m1, 0, 0, 0, 0, null);
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar16 = this.f176532x;
            byte[] bArr9 = v2protocalVar16.f176870n1;
            v2protocalVar16.setSvrConfig(3029, 0, 0, bArr9[0], bArr9[1], bArr9[2], bArr9[3], 0, null);
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar17 = this.f176532x;
            byte[] bArr10 = v2protocalVar17.f176873o1;
            v2protocalVar17.setSvrConfig(3030, 0, 0, bArr10[0], bArr10[1], 0, 0, 0, null);
            vq4.d0.c("MicroMsg.Voip.VoipContext", "FECSvrCtr = " + this.f176532x.f176867m1 + ",FECKeyPara1 = " + ((int) this.f176532x.f176870n1[0]) + "," + ((int) this.f176532x.f176870n1[1]) + "," + ((int) this.f176532x.f176870n1[2]) + "," + ((int) this.f176532x.f176870n1[3]) + ",FECKeyPara2 = " + ((int) this.f176532x.f176873o1[0]) + "," + ((int) this.f176532x.f176873o1[1]));
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar18 = this.f176532x;
        int i102 = v2protocalVar18.f176834b1;
        v2protocalVar18.setSvrConfig(3031, 0, 0, (i102 & 4) >> 2, (i102 & 2) >> 1, i102 & 1, 0, 0, null);
        this.f176532x.setjbmbitraterssvrparam();
        vq4.d0.c("MicroMsg.Voip.VoipContext", "zhengxue[Logic] setSvrConfig brefore onStartTalk: audioTsdfBeyond3G = " + this.f176532x.M0 + ",audioTsdEdge = " + this.f176532x.N0 + ",passthroughQosAlgorithm = " + this.f176532x.O0 + ",fastPlayRepair = " + this.f176532x.P0 + ", audioDTX = " + this.f176532x.R0 + ", mARQFlag = " + i101 + ", mQosStrategy = " + this.f176532x.f176834b1 + ", mSvrCfgListV = " + this.f176532x.Q0 + ", maxBRForRelay = " + this.f176532x.T0);
        byte[] bArr11 = {(byte) wo.v1.f447822b.C, -1};
        vq4.d0.a("MicroMsg.Voip.VoipContext", "steve: Model Name: ".concat(wo.w0.m()));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("steve: Image Enhancement for Android Capture!!, mode: ");
        sb7.append((int) bArr11[0]);
        vq4.d0.a("MicroMsg.Voip.VoipContext", sb7.toString());
        this.f176532x.setAppCmd(15, bArr11, 1);
        dr4.p1 d07 = gq4.v.Bi().q().d0();
        if (d07 != null) {
            d07.o(gq4.v.wi().f365967a);
        }
        if (this.f176532x.R1 != null) {
            this.f176532x.R1.i(this);
        }
        com.tencent.mm.plugin.voip.model.f fVar = com.tencent.mm.plugin.voip.model.v2protocal.f176824k2;
        if (fVar != null) {
            fVar.f176491s = this;
            com.tencent.mars.xlog.Log.i("MicroMsg.AvcDecoder", "setStrategyCaller");
        }
        L();
        this.f176508a = 5;
        F();
        this.f176534z.S();
        this.A.h();
        this.f176532x.M1.c();
        this.f176534z.a();
        this.f176532x.M1.b();
        com.tencent.mm.plugin.voip.model.j0.n(gq4.v.Bi().z());
        this.f176519k = true;
        this.M = false;
        this.O.a();
        t();
        s();
    }

    public void L() {
        int i17;
        int i18;
        int i19;
        int i27;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SrvDeviceInfo.mAudioInfo.aecMode:");
        wo.c cVar = wo.v1.f447823c;
        sb6.append(cVar.K);
        vq4.d0.a("MicroMsg.Voip.VoipContext", sb6.toString());
        int i28 = cVar.f447609k;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        if (i28 == 1) {
            v2protocalVar.C(410);
        }
        byte[] bArr = new byte[2];
        int i29 = cVar.K;
        if (i29 > -1) {
            bArr[0] = (byte) i29;
            v2protocalVar.setAppCmd(406, bArr, 1);
        } else if (i29 == -2) {
            v2protocalVar.C(407);
        }
        v2protocalVar.setAppCmd(com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, new byte[]{(byte) 1}, 1);
        int i37 = cVar.L;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "kerrizhang SrvDeviceInfo.mAudioInfo.nsModeNew %d", java.lang.Integer.valueOf(i37));
        int i38 = cVar.L;
        if (i38 > -1) {
            if (i37 > 0) {
                int floor = ((int) java.lang.Math.floor(i37 / 1000.0d)) % 100;
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "kerrizhang SrvDeviceInfo.mAudioInfo.iflag %d", java.lang.Integer.valueOf(floor));
                if (floor > 0) {
                    v2protocalVar.setAppCmd(408, new byte[]{(byte) (i37 & 255), (byte) ((i37 >> 8) & 255), (byte) ((i37 >> 16) & 255), (byte) ((i37 >> 24) & 255)}, 4);
                }
            } else if (i37 == 0) {
                v2protocalVar.C(409);
            }
        } else if (i38 == -2) {
            v2protocalVar.C(409);
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_rnnoise_sinfreqwind, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "mevinwang, nssinfwindmode = %d", java.lang.Integer.valueOf(Ni));
        if (Ni > 0) {
            v2protocalVar.setAppCmd(408, new byte[]{(byte) (Ni & 255), (byte) ((Ni >> 8) & 255), (byte) ((Ni >> 16) & 255), (byte) ((Ni >> 24) & 255)}, 4);
        } else if (Ni == 0) {
            v2protocalVar.C(409);
        }
        boolean bj6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
        int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
        int Ni2 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "WaveHAid, flag:%s, type:%s, device:%s", java.lang.Boolean.valueOf(bj6), java.lang.Integer.valueOf(Di), java.lang.Integer.valueOf(Ni2));
        if (bj6) {
            byte[] bArr2 = {(byte) (Di & 255), (byte) ((Di >> 8) & 255), (byte) ((Di >> 16) & 255), (byte) ((Di >> 24) & 255), (byte) (Ni2 & 255), (byte) ((Ni2 >> 8) & 255), (byte) ((Ni2 >> 16) & 255), (byte) ((Ni2 >> 24) & 255)};
            v2protocalVar.setAppCmd(com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.CTRL_INDEX, bArr2, 8);
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "WaveHAid, params:%d,%d,%d,%d, len:%d", java.lang.Byte.valueOf(bArr2[0]), java.lang.Byte.valueOf(bArr2[1]), java.lang.Byte.valueOf(bArr2[2]), java.lang.Byte.valueOf(bArr2[3]), 8);
        }
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_play_fadeinfadeout_switch, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "kerrizhang, play_fadeinfadeout_switch = %d", java.lang.Integer.valueOf(Ni3));
        byte[] bArr3 = {0};
        if (Ni3 > 0) {
            bArr3[0] = (byte) Ni3;
        }
        v2protocalVar.setAppCmd(451, bArr3, 1);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(1024);
        com.tencent.mm.plugin.voip.model.s1 s1Var = com.tencent.mm.plugin.voip.model.s1.f176798a;
        s1Var.b(sb7);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "get ModelRoot: " + sb7.toString());
        v2protocalVar.setAppCmd(com.tencent.mm.plugin.appbrand.jsapi.lbs.h.CTRL_INDEX, sb7.toString().getBytes(), sb7.toString().length());
        com.tencent.mm.plugin.voip.model.a aVar = new com.tencent.mm.plugin.voip.model.a();
        v2protocalVar.b(aVar);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(1024);
        if (aVar.f176318b <= 16000) {
            s1Var.c(sb8, 112, 3);
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, CLN ModelMd5: " + sb8.toString());
            if (sb8.toString().length() > 0 && sb8.toString().length() <= 256) {
                v2protocalVar.setAppCmd(951, sb8.toString().getBytes(), sb8.toString().length());
            }
            sb8.setLength(0);
            s1Var.c(sb8, 112, 13);
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, CFN ModelMd5: " + sb8.toString());
            if (sb8.toString().length() > 0 && sb8.toString().length() <= 256) {
                v2protocalVar.setAppCmd(970, sb8.toString().getBytes(), sb8.toString().length());
            }
        } else {
            s1Var.c(sb8, 112, 4);
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, CLN ModelMd5: " + sb8.toString());
            if (sb8.toString().length() > 0 && sb8.toString().length() <= 256) {
                v2protocalVar.setAppCmd(951, sb8.toString().getBytes(), sb8.toString().length());
            }
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(1024);
        if (aVar.f176318b <= 16000) {
            s1Var.c(sb9, 112, 8);
        } else {
            s1Var.c(sb9, 112, 9);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "dennyliang, HowlSup Model Md5: " + sb9.toString());
        if (sb9.toString().length() > 0 && sb9.toString().length() <= 256) {
            v2protocalVar.setAppCmd(952, sb9.toString().getBytes(), sb9.toString().length());
        }
        int Ni4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_vcodec2params_for_android, -1);
        if (Ni4 > 0) {
            byte b17 = (byte) (Ni4 & 1);
            byte[] bArr4 = {b17, (byte) ((Ni4 >> 1) & 1), (byte) ((Ni4 >> 2) & 1), (byte) ((Ni4 >> 8) & 127)};
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "ashlynli, x vcodec2 adaptiveBlur = %d, mixDenoise = %d, voipOpt = %d, cpuCap = %d", java.lang.Byte.valueOf(b17), java.lang.Byte.valueOf(bArr4[1]), java.lang.Byte.valueOf(bArr4[2]), java.lang.Byte.valueOf(bArr4[3]));
            int i39 = 0;
            for (int i47 = 3; i39 < i47; i47 = 3) {
                if (bArr4[i39] == 1) {
                    java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
                    allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                    allocate.putInt(1);
                    if (v2protocalVar != null) {
                        try {
                            r45.ww6 ww6Var = new r45.ww6();
                            if (i39 == 0) {
                                ww6Var.f389547d = 11;
                            } else if (i39 == 1) {
                                ww6Var.f389547d = 12;
                            } else if (i39 == 2) {
                                ww6Var.f389547d = 13;
                            }
                            ww6Var.f389548e = new com.tencent.mm.protobuf.g(allocate.array());
                            vq4.d0.c("MicroMsg.Voip.VoipContext", "Enable vcodec2 para, i = " + i39 + " , Send RUDP CMD rudpFlag =1");
                            v2protocalVar.SendRUDP(ww6Var.toByteArray(), ww6Var.toByteArray().length);
                        } catch (java.lang.Exception unused) {
                            vq4.d0.c("MicroMsg.Voip.VoipContext", "Enable Vcodec2 para RUDP CMD Error, i = " + i39);
                        }
                    }
                }
                i39++;
            }
        }
        int Ni5 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_fullbandflag, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "kerrizhang, fullbandmode = %d", java.lang.Integer.valueOf(Ni5));
        wo.c cVar2 = wo.v1.f447823c;
        int i48 = cVar2.N;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "kerrizhang SrvDeviceInfo.mAudioInfo.voipfullbandcfg %d", java.lang.Integer.valueOf(i48));
        if (Ni5 > 0 && i48 > 0) {
            v2protocalVar.setAppCmd(456, new byte[]{(byte) (Ni5 & 255), (byte) ((Ni5 >> 8) & 255), (byte) ((Ni5 >> 16) & 255), (byte) ((Ni5 >> 24) & 255)}, 4);
        }
        int Ni6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_play_fadeinfadeout_thresh, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "kerrizhang, play_fadeinfadeout_thresh = %d", java.lang.Integer.valueOf(Ni6));
        bArr3[0] = 0;
        if (Ni6 > 0) {
            bArr3[0] = (byte) Ni6;
        }
        v2protocalVar.setAppCmd(452, bArr3, 1);
        int Ni7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_rcnnvadctr, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "kerrizhang, voip rcnnvad_switch = %d", java.lang.Integer.valueOf(Ni7));
        if (Ni7 > 0) {
            v2protocalVar.setAppCmd(nd1.t0.CTRL_INDEX, new byte[]{(byte) Ni7}, 1);
        }
        int Ni8 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_cldnn_ns, -1);
        int Ni9 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_cldnn_ns_ct, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, cldnn_ns_config:%d, cldnn_ns_ct:%d", java.lang.Integer.valueOf(Ni8), java.lang.Integer.valueOf(Ni9));
        if (Ni8 > 0) {
            int i49 = Ni8 & 1;
            int i57 = (Ni8 >> 1) & 3;
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, cldnn ns para: %d, %d, %d", java.lang.Integer.valueOf(i49), java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(Ni9));
            v2protocalVar.setAppCmd(470, new byte[]{(byte) (i49 & 255), (byte) ((i49 >> 8) & 255), (byte) ((i49 >> 16) & 255), (byte) ((i49 >> 24) & 255), (byte) (i57 & 255), (byte) ((i57 >> 8) & 255), (byte) ((i57 >> 16) & 255), (byte) ((i57 >> 24) & 255), (byte) (Ni9 & 255), (byte) ((Ni9 >> 8) & 255), (byte) ((Ni9 >> 16) & 255), (byte) ((Ni9 >> 24) & 255)}, 3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, agc2, SrvDeviceInfo.mAudioInfo.waveAgcMode:%d", java.lang.Integer.valueOf(cVar2.f447590a0));
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, agc1, SrvDeviceInfo.mAudioInfo.agcMode:%d", java.lang.Integer.valueOf(cVar2.O));
        java.lang.String Vi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Vi(e42.c0.clicfg_voip_agc_device_params, "{\"agc_flag\":-1,\"agc_type\":-1,\"agc_mode\":-1,\"agc_params\":-1}");
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, agc y-expt device params:%s", Vi);
        try {
            cl0.g gVar = new cl0.g(Vi);
            int intValue = ((java.lang.Integer) gVar.get("agc_flag")).intValue();
            int intValue2 = ((java.lang.Integer) gVar.get("agc_type")).intValue();
            int intValue3 = ((java.lang.Integer) gVar.get("agc_mode")).intValue();
            int intValue4 = ((java.lang.Integer) gVar.get("agc_params")).intValue();
            if (intValue == 1) {
                if (intValue2 == 1) {
                    if (intValue3 == 3) {
                        byte b18 = (byte) intValue3;
                        byte[] bArr5 = {b18, (byte) (intValue4 & 31), (byte) ((intValue4 >> 5) & 31), (byte) ((intValue4 >> 10) & 31), (byte) ((intValue4 >> 15) & 31), 1, 5, 1};
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, agc1 y-device paras: %d, %d, %d, %d, %d, %d, %d", java.lang.Byte.valueOf(b18), java.lang.Byte.valueOf(bArr5[1]), java.lang.Byte.valueOf(bArr5[2]), java.lang.Byte.valueOf(bArr5[3]), java.lang.Byte.valueOf(bArr5[4]), java.lang.Byte.valueOf(bArr5[5]), java.lang.Byte.valueOf(bArr5[6]), java.lang.Byte.valueOf(bArr5[7]));
                        v2protocalVar.setAppCmd(404, bArr5, 8);
                    }
                } else if (intValue2 == 2) {
                    if (intValue3 == 1) {
                        byte[] bArr6 = {(byte) intValue3, (byte) (intValue4 & 31), 30, 15, (byte) ((intValue4 >> 5) & 31), 1, 5, (byte) ((intValue4 >> 10) & 1), (byte) ((intValue4 >> 11) & 31), (byte) ((intValue4 >> 16) & 31), (byte) ((intValue4 >> 21) & 31)};
                        v2protocalVar.setAppCmd(461, bArr6, 11);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, agc2 y-device paras: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d", java.lang.Byte.valueOf(bArr6[1]), java.lang.Byte.valueOf(bArr6[2]), java.lang.Byte.valueOf(bArr6[3]), java.lang.Byte.valueOf(bArr6[4]), java.lang.Byte.valueOf(bArr6[5]), java.lang.Byte.valueOf(bArr6[6]), java.lang.Byte.valueOf(bArr6[7]), java.lang.Byte.valueOf(bArr6[8]), java.lang.Byte.valueOf(bArr6[9]), java.lang.Byte.valueOf(bArr6[10]));
                    } else if (intValue3 == 2) {
                        byte[] bArr7 = {(byte) intValue3, (byte) (intValue4 & 31), (byte) ((intValue4 >> 5) & 31), (byte) ((intValue4 >> 10) & 31), (byte) ((intValue4 >> 15) & 31), 1, 5};
                        v2protocalVar.setAppCmd(461, bArr7, 7);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, agc2 y-device paras: %d, %d, %d, %d, %d, %d", java.lang.Byte.valueOf(bArr7[1]), java.lang.Byte.valueOf(bArr7[2]), java.lang.Byte.valueOf(bArr7[3]), java.lang.Byte.valueOf(bArr7[4]), java.lang.Byte.valueOf(bArr7[5]), java.lang.Byte.valueOf(bArr7[6]));
                    }
                }
            } else if (intValue == 0) {
                v2protocalVar.C(405);
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, y-device close agc.");
            } else {
                int i58 = cVar2.f447590a0;
                if (i58 != 1 && i58 != 2) {
                    int i59 = cVar2.O;
                    if (i59 > -1) {
                        byte[] bArr8 = new byte[8];
                        byte[] bArr9 = new byte[2];
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, set agc1 by mAudioInfo, target:%d, gain:%d, spkgain:%d", java.lang.Integer.valueOf(cVar2.P), java.lang.Integer.valueOf(cVar2.Q), java.lang.Integer.valueOf(cVar2.T));
                        int i66 = cVar2.P;
                        if (i66 > -1 && (i27 = cVar2.Q) > -1) {
                            bArr9[0] = (byte) i66;
                            bArr9[1] = (byte) i27;
                            if (cVar2.R > -1) {
                                bArr8[0] = (byte) cVar2.O;
                                byte b19 = (byte) i27;
                                bArr8[1] = b19;
                                bArr8[2] = b19;
                                bArr8[3] = b19;
                                bArr8[4] = (byte) i66;
                                bArr8[5] = (byte) cVar2.Y;
                                bArr8[6] = (byte) cVar2.Z;
                                bArr8[7] = (byte) cVar2.S;
                                v2protocalVar.setAppCmd(404, bArr8, 8);
                            } else {
                                v2protocalVar.setAppCmd(404, bArr9, 2);
                            }
                        } else if (i66 > -1 && (i19 = cVar2.T) > -1) {
                            bArr8[0] = (byte) cVar2.O;
                            bArr8[1] = (byte) i19;
                            bArr8[2] = (byte) cVar2.U;
                            bArr8[3] = (byte) cVar2.V;
                            bArr8[4] = (byte) i66;
                            bArr8[5] = (byte) cVar2.Y;
                            bArr8[6] = (byte) cVar2.Z;
                            bArr8[7] = (byte) cVar2.S;
                            v2protocalVar.setAppCmd(404, bArr8, 8);
                        }
                    } else if (i59 == -2) {
                        v2protocalVar.C(405);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, close agc1.");
                    }
                }
                byte[] bArr10 = new byte[11];
                byte b27 = (byte) i58;
                bArr10[0] = b27;
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, set agc2 by mAudioInfo, device_paras[0]:%d", java.lang.Byte.valueOf(b27));
                byte b28 = bArr10[0];
                if (b28 == 1) {
                    bArr10[1] = (byte) cVar2.f447604h0;
                    bArr10[2] = (byte) cVar2.f447606i0;
                    bArr10[3] = (byte) cVar2.f447608j0;
                    bArr10[4] = (byte) cVar2.f447598e0;
                    bArr10[5] = (byte) cVar2.f447600f0;
                    bArr10[6] = (byte) cVar2.f447602g0;
                    bArr10[7] = (byte) cVar2.f447610k0;
                    bArr10[8] = (byte) cVar2.f447592b0;
                    bArr10[9] = (byte) cVar2.f447594c0;
                    bArr10[10] = (byte) cVar2.f447596d0;
                    v2protocalVar.setAppCmd(461, bArr10, 11);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, agc2 paras: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d", java.lang.Byte.valueOf(bArr10[1]), java.lang.Byte.valueOf(bArr10[2]), java.lang.Byte.valueOf(bArr10[3]), java.lang.Byte.valueOf(bArr10[4]), java.lang.Byte.valueOf(bArr10[5]), java.lang.Byte.valueOf(bArr10[6]), java.lang.Byte.valueOf(bArr10[7]), java.lang.Byte.valueOf(bArr10[8]), java.lang.Byte.valueOf(bArr10[9]), java.lang.Byte.valueOf(bArr10[10]));
                } else if (b28 == 2) {
                    bArr10[1] = (byte) cVar2.f447592b0;
                    bArr10[2] = (byte) cVar2.f447594c0;
                    bArr10[3] = (byte) cVar2.f447596d0;
                    bArr10[4] = (byte) cVar2.f447598e0;
                    bArr10[5] = (byte) cVar2.f447600f0;
                    bArr10[6] = (byte) cVar2.f447602g0;
                    v2protocalVar.setAppCmd(461, bArr10, 7);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, agc2 paras: %d, %d, %d, %d, %d, %d", java.lang.Byte.valueOf(bArr10[1]), java.lang.Byte.valueOf(bArr10[2]), java.lang.Byte.valueOf(bArr10[3]), java.lang.Byte.valueOf(bArr10[4]), java.lang.Byte.valueOf(bArr10[5]), java.lang.Byte.valueOf(bArr10[6]));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipContext", "y-expt json agc_device_params failed" + e17);
        }
        int g17 = vq4.d0.g("ladder_cpu");
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, nLadderCPU:%d", java.lang.Integer.valueOf(g17));
        if (g17 >= 0) {
            v2protocalVar.setAppCmd(97, new byte[]{(byte) (g17 & 255), (byte) ((g17 >> 8) & 255), (byte) ((g17 >> 16) & 255), (byte) ((g17 >> 24) & 255)}, 1);
        }
        int Ni10 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_frz_sta_peroid, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, tryUpdateAudioAdaption, frz_sta_p_x = %d", java.lang.Integer.valueOf(Ni10));
        if (Ni10 > 0) {
            v2protocalVar.setAppCmd(com.tencent.mm.plugin.appbrand.jsapi.share.r1.CTRL_INDEX, new byte[]{(byte) (Ni10 & 255), (byte) ((Ni10 >> 8) & 255), (byte) ((Ni10 >> 16) & 255), (byte) ((Ni10 >> 24) & 255)}, 4);
        }
        int Ni11 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_new_net_state_tips, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, updateAudioAdaption, net_state_xexpt = %d", java.lang.Integer.valueOf(Ni11));
        byte[] bArr11 = {0};
        if (Ni11 == 1) {
            bArr11[0] = 1;
        }
        v2protocalVar.setAppCmd(lf1.d.CTRL_INDEX, bArr11, 1);
        int Ni12 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_play_volume_factor, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, updateAudioAdaption, play_vol = %d", java.lang.Integer.valueOf(Ni12));
        byte[] bArr12 = {0};
        if (Ni12 > 0 && Ni12 < 20) {
            bArr12[0] = (byte) Ni12;
            v2protocalVar.setAppCmd(wc1.p.CTRL_INDEX, bArr12, 1);
        }
        wo.c cVar3 = wo.v1.f447823c;
        int i67 = cVar3.W;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, SrvDeviceInfo.mAudioInfo.playVolVoip: %d", java.lang.Integer.valueOf(i67));
        if (i67 > 0 && i67 < 20) {
            bArr12[0] = (byte) i67;
            v2protocalVar.setAppCmd(wc1.p.CTRL_INDEX, bArr12, 1);
        }
        int Ni13 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_engine_get_data_config, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, tryUpdateAudioAdaption, switch_flag_x = %d", java.lang.Integer.valueOf(Ni13));
        byte[] bArr13 = {0};
        if (Ni13 > 0) {
            bArr13[0] = 1;
        }
        v2protocalVar.setAppCmd(450, bArr13, 1);
        int i68 = cVar3.f447611l;
        if (i68 > -1 || cVar3.f447615n > -1) {
            bArr[0] = -1;
            bArr[1] = -1;
            if (i68 > -1) {
                bArr[0] = (byte) i68;
            }
            int i69 = cVar3.f447615n;
            if (i69 > -1) {
                bArr[1] = (byte) i69;
            }
            v2protocalVar.setAppCmd(414, bArr, 2);
        }
        int i76 = cVar3.f447613m;
        if (i76 > -1 || cVar3.f447617o > -1) {
            bArr[0] = -1;
            bArr[1] = -1;
            if (i76 > -1) {
                bArr[0] = (byte) i76;
            }
            int i77 = cVar3.f447617o;
            if (i77 > -1) {
                bArr[1] = (byte) i77;
            }
            v2protocalVar.setAppCmd(com.tencent.wxmm.v2helper.EMethodOutputVolumeScaleEnable, bArr, 2);
        }
        int i78 = cVar3.f447619p;
        if (i78 > -1 || cVar3.f447621q > -1) {
            bArr[0] = -1;
            i17 = 1;
            bArr[1] = -1;
            if (i78 > -1) {
                bArr[0] = (byte) i78;
            }
            int i79 = cVar3.f447621q;
            if (i79 > -1) {
                bArr[1] = (byte) i79;
            }
            v2protocalVar.setAppCmd(com.tencent.wxmm.v2helper.EMethodOutputVolumeGainEnable, bArr, 2);
        } else {
            i17 = 1;
        }
        int i86 = cVar3.f447631v;
        if (i86 > -1) {
            bArr[0] = (byte) i86;
            v2protocalVar.setAppCmd(com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC, bArr, i17);
        }
        int i87 = cVar3.f447639z;
        if (i87 > -1) {
            bArr[0] = (byte) i87;
            v2protocalVar.setAppCmd(431, bArr, 4);
        }
        int i88 = cVar3.f447633w;
        if (i88 > -1 && (v2protocalVar.U0 != 0 || i88 != 5)) {
            bArr[0] = (byte) i88;
            v2protocalVar.setAppCmd(417, bArr, 1);
        }
        int i89 = cVar3.f447635x;
        if (i89 <= -1 || (v2protocalVar.U0 == 0 && i89 == 5)) {
            i18 = 1;
        } else {
            bArr[0] = (byte) i89;
            i18 = 1;
            v2protocalVar.setAppCmd(418, bArr, 1);
        }
        int i96 = cVar3.f447637y;
        if (i96 > -1) {
            bArr[0] = (byte) i96;
            v2protocalVar.setAppCmd(419, bArr, i18);
        }
        if (v2protocalVar.U0 == i18 && (cVar3.f447633w == 5 || cVar3.f447635x == 5)) {
            v2protocalVar.f176857j0 = 5;
        }
        if (1 == cVar3.f447616n0) {
            byte[] bArr14 = new byte[30];
            for (int i97 = 0; i97 < 15; i97++) {
                int i98 = i97 * 2;
                short s17 = wo.v1.f447823c.f447618o0[i97];
                bArr14[i98] = (byte) (s17 & 255);
                bArr14[i98 + 1] = (byte) ((s17 >> 8) & 255);
            }
            v2protocalVar.setAppCmd(com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOn, bArr14, 30);
        }
        wo.c cVar4 = wo.v1.f447823c;
        if (cVar4.f447616n0 == 0) {
            v2protocalVar.C(com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOff);
        }
        short[] sArr = cVar4.f447620p0;
        short s18 = sArr[0];
        if (s18 > 0 || sArr[1] > 0) {
            bArr[0] = 0;
            bArr[1] = 0;
            if (s18 > 0 && s18 < 10000) {
                bArr[0] = (byte) s18;
            }
            short s19 = sArr[1];
            if (s19 > 0 && s19 < 10000) {
                bArr[1] = (byte) s19;
            }
            v2protocalVar.setAppCmd(com.tencent.wxmm.v2helper.EMethodSetNgStrength, bArr, 2);
        }
        int i99 = cVar4.f447622q0;
        if (i99 > 0) {
            bArr[0] = (byte) i99;
            v2protocalVar.setAppCmd(com.tencent.wxmm.v2helper.EMethodSetSpkEnhance, bArr, 1);
        }
        int Ni14 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_agcrx_params, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, x_agcrx_para: %d", java.lang.Integer.valueOf(Ni14));
        if (Ni14 > 0) {
            byte b29 = (byte) (Ni14 & 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, agcrx_switch: %d", java.lang.Byte.valueOf(b29));
            if (b29 > 0) {
                byte b37 = (byte) ((Ni14 >> 1) & 3);
                byte[] bArr15 = {b37, (byte) ((Ni14 >> 3) & 31), (byte) ((Ni14 >> 8) & 31), (byte) ((Ni14 >> 13) & 1)};
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "qipengfeng, agcrx paras: %d, %d, %d, %d", java.lang.Byte.valueOf(b37), java.lang.Byte.valueOf(bArr15[1]), java.lang.Byte.valueOf(bArr15[2]), java.lang.Byte.valueOf(bArr15[3]));
                v2protocalVar.setAppCmd(com.tencent.wxmm.v2helper.EMethodSetAgcRxOn, bArr15, 4);
            }
        }
        int i100 = cVar4.f447638y0;
        if (i100 > -1) {
            v2protocalVar.setAppCmd(com.tencent.wxmm.v2helper.EMethodSetAgcRxOn, new byte[]{(byte) i100, (byte) cVar4.f447640z0, (byte) cVar4.A0, (byte) cVar4.B0}, 4);
        }
    }

    public void M(byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "updateRemoteCapInfo, isGotCapInfo: %s", java.lang.Byte.valueOf(this.f176532x.M1.f176722i));
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        com.tencent.mm.plugin.voip.model.l1 l1Var = v2protocalVar.M1;
        if (l1Var.f176722i == 1 || bArr == null) {
            return;
        }
        l1Var.f176722i = (byte) 1;
        v2protocalVar.f176892v = bArr;
        if (this.f176532x.f176892v != null) {
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = this.f176532x;
            int exchangeCabInfo = v2protocalVar2.exchangeCabInfo(v2protocalVar2.f176892v, this.f176532x.f176892v.length);
            this.N = this.f176532x.f176892v == null || this.f176532x.f176892v.length < 36;
            if (exchangeCabInfo < 0) {
                vq4.d0.b("MicroMsg.Voip.VoipContext", "protocal exchangecabinfo failed ret:" + exchangeCabInfo);
                this.f176532x.M1.f176713a = 15;
                v(1, -9003, "", -1);
            }
        }
    }

    public void N(byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "updateRemotePid");
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        com.tencent.mm.plugin.voip.model.l1 l1Var = v2protocalVar.M1;
        l1Var.f176719f = (byte) 1;
        l1Var.f176718e = (byte) 1;
        v2protocalVar.f176889u = bArr;
    }

    public void a() {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(1);
        this.f176532x.setAppCmd(68, allocate.array(), 4);
        vq4.d0.c("MicroMsg.Voip.VoipContext", "hseasun: Voip close 720p Enc:  1");
    }

    public int b(int i17, boolean z17, boolean z18) {
        if (i17 < 0) {
            return -1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CloseCodec: targetCodec =");
        sb6.append(i17);
        sb6.append(", local=");
        sb6.append(z17);
        sb6.append(", remote =");
        sb6.append(!z17);
        sb6.append("encTag=");
        sb6.append(z18);
        vq4.d0.c("MicroMsg.Voip.VoipContext", sb6.toString());
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        if (z17 && z18) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i17);
            if (v2protocalVar != null) {
                try {
                    r45.ww6 ww6Var = new r45.ww6();
                    ww6Var.f389547d = 6;
                    ww6Var.f389548e = new com.tencent.mm.protobuf.g(allocate.array());
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "CloseCodec:close local target codec: " + i17);
                    v2protocalVar.SendRUDP(ww6Var.toByteArray(), ww6Var.toByteArray().length);
                } catch (java.lang.Exception unused) {
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "CloseCodec Error");
                }
            }
            java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(6);
            allocate2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocate2.putShort((short) 2);
            allocate2.putShort((short) i17);
            allocate2.putShort((short) 0);
            v2protocalVar.setAppCmd(39, allocate2.array(), 6);
            return 1;
        }
        if (z17 && !z18) {
            java.nio.ByteBuffer allocate3 = java.nio.ByteBuffer.allocate(6);
            allocate3.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocate3.putShort((short) 0);
            allocate3.putShort((short) i17);
            allocate3.putShort((short) 0);
            v2protocalVar.setAppCmd(39, allocate3.array(), 6);
            return 1;
        }
        if (z17 || !z18) {
            return 1;
        }
        vq4.d0.c("MicroMsg.Voip.VoipContext", "CloseCodec:disable remote target codec: " + i17);
        java.nio.ByteBuffer allocate4 = java.nio.ByteBuffer.allocate(6);
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
        allocate4.order(byteOrder);
        allocate4.putShort((short) 3);
        allocate4.putShort((short) i17);
        allocate4.putShort((short) 0);
        v2protocalVar.setAppCmd(39, allocate4.array(), 6);
        java.nio.ByteBuffer allocate5 = java.nio.ByteBuffer.allocate(4);
        allocate5.order(byteOrder);
        allocate5.putInt(i17);
        if (v2protocalVar == null) {
            return 1;
        }
        try {
            r45.ww6 ww6Var2 = new r45.ww6();
            ww6Var2.f389547d = 7;
            ww6Var2.f389548e = new com.tencent.mm.protobuf.g(allocate5.array());
            vq4.d0.c("MicroMsg.Voip.VoipContext", "CloseCodec:close local target codec: " + i17);
            v2protocalVar.SendRUDP(ww6Var2.toByteArray(), ww6Var2.toByteArray().length);
            return 1;
        } catch (java.lang.Exception unused2) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "CloseCodec Error");
            return 1;
        }
    }

    public int c(int i17, boolean z17, boolean z18) {
        if (i17 < 0) {
            return -1;
        }
        vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[HW]:DisableCodec: targetCodec = " + i17 + ", local=" + z17 + ", remote =" + z18);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i17);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        if (z17 && v2protocalVar != null) {
            try {
                r45.ww6 ww6Var = new r45.ww6();
                ww6Var.f389547d = 5;
                ww6Var.f389548e = new com.tencent.mm.protobuf.g(allocate.array());
                vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[HW]:disable local target codec: " + i17);
                v2protocalVar.SendRUDP(ww6Var.toByteArray(), ww6Var.toByteArray().length);
            } catch (java.lang.Exception unused) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "DisableCodec Error");
            }
        }
        if (!z18) {
            return 1;
        }
        vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[HW]:disable remote target codec: " + i17);
        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(6);
        allocate2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocate2.putShort((short) 3);
        allocate2.putShort((short) i17);
        allocate2.putShort((short) 0);
        v2protocalVar.setAppCmd(35, allocate2.array(), 6);
        return 1;
    }

    public int d(int i17, boolean z17) {
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        if (i17 < 0) {
            return -1;
        }
        vq4.d0.c("MicroMsg.Voip.VoipContext", "EnableAq: SetAqFlag =" + i17 + ", aqBlur=" + z17);
        if (z17) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(1);
            if (v2protocalVar != null) {
                try {
                    r45.ww6 ww6Var = new r45.ww6();
                    ww6Var.f389547d = 10;
                    ww6Var.f389548e = new com.tencent.mm.protobuf.g(allocate.array());
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "EnableAq: SetAqFlag =" + i17 + ", aqBlur=" + z17);
                    v2protocalVar.SendRUDP(ww6Var.toByteArray(), ww6Var.toByteArray().length);
                } catch (java.lang.Exception unused) {
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "EnableAq Error");
                }
            }
            java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(4);
            allocate2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocate2.putInt(1);
            v2protocalVar.setAppCmd(44, allocate2.array(), 4);
        }
        return 1;
    }

    public int e(int i17, boolean z17) {
        if (i17 < 0) {
            return -1;
        }
        vq4.d0.c("MicroMsg.Voip.VoipContext", "EnableBlur: SetBlurFlag =" + i17 + ", aqBlur=" + z17);
        if (z17) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(1);
            this.f176532x.setAppCmd(47, allocate.array(), 4);
        }
        return 1;
    }

    public int f(java.util.LinkedList linkedList) {
        boolean z17;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        int c17 = v2protocalVar.c(linkedList2);
        if (c17 == 0) {
            if (linkedList2.size() != 0 && linkedList2.size() <= 2) {
                if (((r45.et4) linkedList2.get(0)).f373722g == 4 && vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a) != 4) {
                    v2protocalVar.f176869n0 = 1;
                    if (linkedList2.size() == 1) {
                        return 0;
                    }
                    ((r45.et4) linkedList2.get(1)).f373720e = 1;
                    linkedList2.remove();
                }
                if (((r45.et4) linkedList2.get(0)).f373720e == 1 && (((r45.et4) linkedList2.get(0)).f373722g == 5 || ((r45.et4) linkedList2.get(0)).f373722g == 6)) {
                    linkedList.add((r45.et4) linkedList2.get(0));
                    v2protocalVar.f176872o0 = 1;
                    return 0;
                }
                linkedList.add((r45.et4) linkedList2.get(0));
                v2protocalVar.f176869n0 = 1;
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
                try {
                    java.lang.reflect.Method declaredMethod = android.net.ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new java.lang.Class[0]);
                    declaredMethod.setAccessible(true);
                    z17 = ((java.lang.Boolean) declaredMethod.invoke(connectivityManager, new java.lang.Object[0])).booleanValue();
                } catch (java.lang.Exception unused) {
                    z17 = false;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "mobile network not connectedorconnecting");
                    return 0;
                }
                java.lang.String simOperator = ((android.telephony.TelephonyManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone")).getSimOperator();
                if (simOperator == null || simOperator.length() < 3) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "nic_op NULL");
                } else {
                    r45.et4 et4Var = new r45.et4();
                    et4Var.f373719d = "android-cellular";
                    et4Var.f373720e = 0;
                    et4Var.f373722g = 5;
                    et4Var.f373721f = simOperator.substring(0, 3) + ":" + simOperator.substring(3, simOperator.length());
                    linkedList.add(et4Var);
                    v2protocalVar.f176872o0 = 1;
                }
            }
            return 0;
        }
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            java.lang.String str = ((r45.et4) linkedList.get(i17)).f373719d;
            int i18 = ((r45.et4) linkedList.get(i17)).f373720e;
            int i19 = ((r45.et4) linkedList.get(i17)).f373722g;
            java.lang.String str2 = ((r45.et4) linkedList.get(i17)).f373721f;
        }
        return c17;
    }

    public void g() {
        boolean z17 = this.f176511c;
        if (!z17 || this.f176521m != 0) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "StartVoipSpeedTest fail for status is wrong: isChannelStartConnect=" + this.f176511c + " ,mSpeedTestStatus=" + this.f176521m);
            return;
        }
        this.f176521m = 1;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        int i17 = v2protocalVar.field_speedTestInfoLength;
        if (i17 < 8) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "Herohe StartVoipSpeedTest failed! bufsize=" + v2protocalVar.field_speedTestInfoLength);
            return;
        }
        int[] iArr = v2protocalVar.L1;
        int i18 = iArr[1];
        int i19 = i18 + 2;
        if (i19 > i17) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "Herohe StartVoipSpeedTest failed! C2CRttCnt=" + i18 + ", bufsize=" + v2protocalVar.field_speedTestInfoLength);
            return;
        }
        int i27 = iArr[i19 + 1];
        if (i18 + 6 + i27 != i17) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "Herohe StartVoipSpeedTest failed! C2CRttCnt=" + i18 + ", C2SRttCnt=" + i27 + ", bufsize=" + v2protocalVar.field_speedTestInfoLength);
            return;
        }
        this.f176522n = v2protocalVar.f176883s;
        int i28 = v2protocalVar.f176847g;
        this.f176524p = i28;
        int i29 = v2protocalVar.f176877q;
        this.f176525q = i29;
        r45.xc6 xc6Var = this.f176520l;
        xc6Var.f389969d = i29;
        xc6Var.f389970e = v2protocalVar.f176828J;
        xc6Var.f389971f = i28;
        int i37 = 0;
        xc6Var.f389972g = z17 ? 1 : 0;
        xc6Var.f389973h = !this.f176513e ? 0 : 1;
        xc6Var.f389974i = iArr[0];
        xc6Var.f389975m = i18;
        int i38 = 2;
        int i39 = 0;
        while (i39 < xc6Var.f389975m) {
            xc6Var.f389976n.add(java.lang.Integer.valueOf(v2protocalVar.L1[i38]));
            i39++;
            i38++;
        }
        int[] iArr2 = v2protocalVar.L1;
        int i47 = i38 + 1;
        xc6Var.f389977o = iArr2[i38];
        int i48 = i47 + 1;
        xc6Var.f389978p = iArr2[i47];
        while (i37 < xc6Var.f389978p) {
            xc6Var.f389979q.add(java.lang.Integer.valueOf(v2protocalVar.L1[i48]));
            i37++;
            i48++;
        }
        int[] iArr3 = v2protocalVar.L1;
        xc6Var.f389980r = iArr3[i48];
        xc6Var.f389981s = iArr3[i48 + 1];
        new mq4.y(xc6Var).L();
    }

    public void h() {
        int i17 = this.f176521m;
        if (i17 == 0) {
            return;
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        if (i17 == 1) {
            this.f176521m = 0;
            v2protocalVar.f176903y1 = 0L;
            return;
        }
        this.f176521m = 0;
        v2protocalVar.getClass();
        vq4.d0.c("MicroMsg.Voip", "v2protocal StopVoipSpeedTest!");
        v2protocalVar.StopSpeedTest();
        v2protocalVar.f176903y1 = 0L;
    }

    public void i() {
        vq4.d0.c("MicroMsg.Voip.VoipContext", "try to UnregisterCellularNetwork");
        if (fp.h.c(21)) {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
            if (this.Q != null) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "unregister networkcallback hashCode: " + this.Q.hashCode());
                try {
                    connectivityManager.unregisterNetworkCallback(this.Q);
                } catch (java.lang.Exception unused) {
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "unregisterNetworkCallback Error");
                }
                this.Q = null;
                this.P = null;
            }
        }
    }

    public void j(int i17, boolean z17) {
        vq4.d0.c("MicroMsg.Voip.VoipContext", "start bindSocket " + i17 + " ToNetwork " + this.P + " rebind " + z17);
        if (i17 == -1) {
            i();
            return;
        }
        if (this.P == null || !fp.h.c(23)) {
            return;
        }
        java.io.FileDescriptor fileDescriptor = new java.io.FileDescriptor();
        try {
            java.lang.reflect.Field declaredField = java.io.FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            declaredField.setInt(fileDescriptor, i17);
            this.P.bindSocket(fileDescriptor);
            if (!z17) {
                this.R.add(java.lang.Integer.valueOf(i17));
            }
            vq4.d0.a("MicroMsg.Voip.VoipContext", "bindSocketToNetwork success: network" + this.P + "+socketfd" + i17);
        } catch (java.lang.Exception unused) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "bindSocketToNetwork Error");
        }
    }

    public int k(byte[] bArr) {
        if (bArr != null && bArr.length == 4) {
            return (bArr[0] & 255) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipContext", "transfer byte array to in fail:" + bArr);
        return 0;
    }

    public void m(boolean z17, boolean z18) {
        if (z17) {
            if (this.N) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "closeRemoteHWEnc: DecErr old!!");
                x(2);
                return;
            }
            vq4.d0.c("MicroMsg.Voip.VoipContext", "closeRemoteHWEnc: DecErr new!!");
            if (z18) {
                b(4, true, false);
                return;
            } else {
                b(8, true, false);
                return;
            }
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        if (v2protocalVar != null) {
            if (this.N) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[HW]:closeRemoteHWEnc: Set P2S HW Flag False!!");
                c(8, false, true);
            } else {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "closecodec: remote i264 enc!");
                b(8, false, true);
            }
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(6);
            vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[HW]:closeRemoteHWEnc:reset maxsizeformat: 6");
            v2protocalVar.setAppCmd(30, allocate.array(), 4);
        }
    }

    public final void n() {
        if (this.f176508a == 5) {
            D(6);
            if (1 != this.f176510b) {
                this.f176510b = 1;
            }
            com.tencent.mm.plugin.voip.model.l1 l1Var = this.f176532x.M1;
            if (l1Var.f176725l == 0) {
                l1Var.f176717d = 0;
            } else {
                l1Var.f176717d = (int) (java.lang.System.currentTimeMillis() - l1Var.f176725l);
            }
            vq4.d0.c("MicroMsg.VoipDailReport", "devin:beginTime:" + l1Var.f176725l + ", CurrentTime: " + java.lang.System.currentTimeMillis());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("devin:endDial:");
            sb6.append(l1Var.f176717d);
            vq4.d0.c("MicroMsg.VoipDailReport", sb6.toString());
            vq4.d0.c("MicroMsg.Voip.VoipContext", "talking  now .......!");
            this.U.post(new com.tencent.mm.plugin.voip.model.w0(this));
        }
    }

    public void o() {
        if (this.f176512d) {
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
            if (com.tencent.mm.sdk.platformtools.t8.M0(v2protocalVar.f176895w)) {
                return;
            }
            byte[] bArr = v2protocalVar.f176895w;
            int handleCommand = v2protocalVar.handleCommand(1, bArr, bArr.length);
            if (handleCommand < 0) {
                vq4.d0.b("MicroMsg.Voip.VoipContext", "v2protocal handlecommand failed ret:" + handleCommand);
            }
            v2protocalVar.f176895w = null;
        }
    }

    public boolean p() {
        return this.f176508a != 1;
    }

    public boolean q() {
        switch (this.f176527s) {
            case 0:
                return 4 == this.f176528t;
            case 4:
                int i17 = this.f176529u;
                if (4 == i17 || i17 == 0 || -1 == i17) {
                    return true;
                }
                break;
            case 1:
            case 2:
            case 3:
                return false;
            case 5:
            case 6:
            case 7:
                int i18 = this.f176529u;
                return (5 == i18 || 6 == i18 || 7 == i18) ? false : true;
            default:
                return true;
        }
    }

    public boolean r() {
        switch (this.f176527s) {
            case 0:
                return 4 == this.f176528t;
            case 4:
                int i17 = this.f176528t;
                if (4 == i17 || -1 == i17) {
                    return true;
                }
                break;
            case 1:
            case 2:
            case 3:
                return false;
            case 5:
            case 6:
            case 7:
                int i18 = this.f176528t;
                return (5 == i18 || 6 == i18 || 7 == i18) ? false : true;
            default:
                return true;
        }
    }

    public boolean s() {
        int C;
        boolean q17 = q();
        int i17 = this.f176531w;
        if (i17 == -1 || i17 != q17) {
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
            if (q17) {
                vq4.d0.a("MicroMsg.Voip.VoipContext", "setAppCmd: set start video In.......!");
                C = v2protocalVar.C(201);
            } else {
                vq4.d0.a("MicroMsg.Voip.VoipContext", "setAppCmd: set stop video In.......!");
                C = v2protocalVar.C(200);
            }
            if (C == 0) {
                this.f176531w = q17 ? 1 : 0;
                vq4.d0.a("MicroMsg.Voip.VoipContext", "setAppCmd: succeed, ret: " + C + "recvVideoStatus: " + this.f176531w);
            }
        }
        return q17;
    }

    public boolean t() {
        int C;
        boolean r17 = r();
        int i17 = this.f176530v;
        if (i17 == -1 || i17 != r17) {
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
            if (r17) {
                vq4.d0.a("MicroMsg.Voip.VoipContext", "setAppCmd: set start video Out.......!");
                C = v2protocalVar.C(203);
            } else {
                vq4.d0.a("MicroMsg.Voip.VoipContext", "setAppCmd: set stop video Out.......!");
                C = v2protocalVar.C(202);
            }
            if (C == 0) {
                this.f176530v = r17 ? 1 : 0;
                vq4.d0.a("MicroMsg.Voip.VoipContext", "setAppCmd: succeed, ret: " + C + "sendVideoStatus: " + this.f176530v);
            }
        }
        return r17;
    }

    public void u() {
        vq4.d0.c("MicroMsg.Voip.VoipContext", "In networkRequestViaCellular");
        if (fp.h.c(21)) {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
            android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
            builder.addTransportType(0);
            builder.addCapability(12);
            android.net.NetworkRequest build = builder.build();
            if (build != null) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "NetworkRequest toString: " + build.toString() + " hashCode: " + build.hashCode());
            }
            try {
                connectivityManager.requestNetwork(build, new com.tencent.mm.plugin.voip.model.t0(this));
            } catch (java.lang.Exception unused) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "missing the appropriate permissions");
                this.f176532x.f176875p0 = 2;
            }
        }
    }

    public void v(int i17, int i18, java.lang.String str, int i19) {
        H();
        com.tencent.mm.plugin.voip.model.c1 c1Var = this.f176509a0;
        if (c1Var != null) {
            ((com.tencent.mm.plugin.voip.model.d3) c1Var).l(i17, i18, str, i19, null);
        }
    }

    public void w(byte[] bArr) {
        int i17;
        int i18;
        dr4.p1 p1Var;
        dr4.p1 p1Var2;
        try {
            r45.ww6 ww6Var = (r45.ww6) new r45.ww6().parseFrom(bArr);
            if (!this.M || ww6Var.f389547d != 1) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "steve: onRecvRUDPCmd:" + ww6Var.f389547d);
            }
            int i19 = ww6Var.f389547d;
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
            switch (i19) {
                case 1:
                    if (!this.M) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[HW]:OnTransportChannelData: the other client end HWEnc!!");
                        c(8, false, true);
                        b(4, false, true);
                        com.tencent.mm.protobuf.g gVar = ww6Var.f389548e;
                        if (gVar != null) {
                            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(gVar.f192156a, 0, 4);
                            java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
                            wrap.order(byteOrder);
                            int min = java.lang.Math.min(wrap.getInt(), 6);
                            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
                            allocate.order(byteOrder);
                            allocate.putInt(min);
                            vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[HW]:CMD_VOIP_CloseHWEnc:reset maxsizeformat: " + min);
                            v2protocalVar.setAppCmd(30, allocate.array(), 4);
                        } else {
                            vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[HW]:OnTransportChannelData: cmdBuffer is nil!!");
                        }
                    }
                    this.M = true;
                    return;
                case 2:
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[HW]:OnTransportChannelData: the other client tells us to end HWEnc!!");
                    com.tencent.mm.plugin.voip.model.i1 i1Var = this.A;
                    i1Var.f176656k = true;
                    i1Var.f176657l = true;
                    i1Var.f176658m = true;
                    return;
                case 3:
                    com.tencent.mm.protobuf.g gVar2 = ww6Var.f389548e;
                    if (gVar2 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] empty buffer");
                        return;
                    }
                    byte[] bArr2 = gVar2.f192156a;
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "steve: remote new network type:" + bArr2);
                    int appCmd = v2protocalVar.setAppCmd(302, bArr2, 4);
                    if (appCmd < 0) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] update remote network type " + bArr2 + "fail:" + appCmd + ", [roomid=" + v2protocalVar.f176880r + ", roomkey=" + v2protocalVar.f176883s + "]");
                        return;
                    }
                    return;
                case 4:
                    com.tencent.mm.protobuf.g gVar3 = ww6Var.f389548e;
                    if (gVar3 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "zhengxue:[CHANNEL]EMethod_AudioDevOccupiedStatsSync empty buffer");
                        return;
                    }
                    r45.f27 f27Var = (r45.f27) new r45.f27().parseFrom(gVar3.f192156a);
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "zhengxue: remote audio dev occupied stat :" + f27Var.f373955d);
                    byte[] bArr3 = new byte[4];
                    int i27 = f27Var.f373955d;
                    bArr3[0] = (byte) i27;
                    if (i27 == 1) {
                        int i28 = this.G;
                        if (i28 == 0) {
                            i17 = 2;
                            this.G = 2;
                        } else {
                            i17 = 2;
                            if (i28 == 1) {
                                this.G = 3;
                            }
                        }
                    } else {
                        i17 = 2;
                        if (i27 == 2) {
                            int i29 = this.G;
                            if (i29 == 2) {
                                this.G = 0;
                            } else if (i29 == 3) {
                                this.G = 1;
                            }
                            i18 = 2;
                            v2protocalVar.setJNIAppCmd(i18, bArr3, 4);
                            return;
                        }
                    }
                    i18 = i17;
                    v2protocalVar.setJNIAppCmd(i18, bArr3, 4);
                    return;
                case 5:
                    com.tencent.mm.protobuf.g gVar4 = ww6Var.f389548e;
                    if (gVar4 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_DisableCodec empty buffer");
                        return;
                    }
                    byte[] bArr4 = gVar4.f192156a;
                    if (v2protocalVar != null) {
                        java.nio.ByteBuffer wrap2 = java.nio.ByteBuffer.wrap(bArr4);
                        java.nio.ByteOrder byteOrder2 = java.nio.ByteOrder.LITTLE_ENDIAN;
                        wrap2.order(byteOrder2);
                        int i37 = wrap2.getInt();
                        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(6);
                        allocate2.order(byteOrder2);
                        allocate2.putShort((short) 3);
                        allocate2.putShort((short) i37);
                        allocate2.putShort((short) 0);
                        v2protocalVar.setAppCmd(35, allocate2.array(), 6);
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_DisableCodec:  " + i37);
                        return;
                    }
                    return;
                case 6:
                    com.tencent.mm.protobuf.g gVar5 = ww6Var.f389548e;
                    if (gVar5 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_CloseEncoder empty buffer");
                        return;
                    }
                    byte[] bArr5 = gVar5.f192156a;
                    if (v2protocalVar != null) {
                        java.nio.ByteBuffer wrap3 = java.nio.ByteBuffer.wrap(bArr5);
                        java.nio.ByteOrder byteOrder3 = java.nio.ByteOrder.LITTLE_ENDIAN;
                        wrap3.order(byteOrder3);
                        int i38 = wrap3.getInt();
                        java.nio.ByteBuffer allocate3 = java.nio.ByteBuffer.allocate(6);
                        allocate3.order(byteOrder3);
                        allocate3.putShort((short) 3);
                        allocate3.putShort((short) i38);
                        allocate3.putShort((short) 0);
                        v2protocalVar.setAppCmd(39, allocate3.array(), 6);
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_CloseEncoder:  " + i38);
                        return;
                    }
                    return;
                case 7:
                    com.tencent.mm.protobuf.g gVar6 = ww6Var.f389548e;
                    if (gVar6 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_CloseEncoder empty buffer");
                        return;
                    }
                    byte[] bArr6 = gVar6.f192156a;
                    if (v2protocalVar != null) {
                        java.nio.ByteBuffer wrap4 = java.nio.ByteBuffer.wrap(bArr6);
                        java.nio.ByteOrder byteOrder4 = java.nio.ByteOrder.LITTLE_ENDIAN;
                        wrap4.order(byteOrder4);
                        int i39 = wrap4.getInt();
                        if (i39 == 20) {
                            java.nio.ByteBuffer allocate4 = java.nio.ByteBuffer.allocate(6);
                            allocate4.order(byteOrder4);
                            allocate4.putShort((short) 2);
                            allocate4.putShort((short) 16);
                            allocate4.putShort((short) 0);
                            v2protocalVar.setAppCmd(39, allocate4.array(), 6);
                            java.nio.ByteBuffer allocate5 = java.nio.ByteBuffer.allocate(6);
                            allocate5.order(byteOrder4);
                            allocate5.putShort((short) 2);
                            allocate5.putShort((short) 4);
                            allocate5.putShort((short) 0);
                            v2protocalVar.setAppCmd(39, allocate5.array(), 6);
                        } else {
                            java.nio.ByteBuffer allocate6 = java.nio.ByteBuffer.allocate(6);
                            allocate6.order(byteOrder4);
                            allocate6.putShort((short) 2);
                            allocate6.putShort((short) i39);
                            allocate6.putShort((short) 0);
                            v2protocalVar.setAppCmd(39, allocate6.array(), 6);
                        }
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_CloseEncoder:  " + i39);
                        return;
                    }
                    return;
                case 8:
                    com.tencent.mm.protobuf.g gVar7 = ww6Var.f389548e;
                    if (gVar7 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteClientVersion] empty buffer");
                        return;
                    }
                    byte[] bArr7 = gVar7.f192156a;
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin: remote wx ver: " + bArr7);
                    int appCmd2 = v2protocalVar.setAppCmd(506, bArr7, 4);
                    if (appCmd2 == 0) {
                        gq4.v.wi().f365970d = k(bArr7);
                        gq4.a aVar = gq4.v.Bi().f176559b;
                        if (aVar != null && (p1Var = ((com.tencent.mm.plugin.voip.model.d0) aVar).f176375f) != null) {
                            p1Var.o(gq4.v.wi().f365967a);
                        }
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteClientVersion] remote wx ver: " + bArr7 + "ret: " + appCmd2 + ", [roomid=" + v2protocalVar.f176880r + ", roomkey=" + v2protocalVar.f176883s + "]");
                        return;
                    }
                    return;
                case 9:
                    com.tencent.mm.protobuf.g gVar8 = ww6Var.f389548e;
                    if (gVar8 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteDeviceModel] empty buffer");
                        return;
                    }
                    byte[] bArr8 = gVar8.f192156a;
                    int length = bArr8.length;
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin: remote device model: " + bArr8);
                    int appCmd3 = v2protocalVar.setAppCmd(508, bArr8, length);
                    if (appCmd3 == 0) {
                        qq4.b wi6 = gq4.v.wi();
                        java.lang.String str = new java.lang.String(bArr8);
                        wi6.getClass();
                        wi6.f365971e = str;
                        gq4.a aVar2 = gq4.v.Bi().f176559b;
                        if (aVar2 != null && (p1Var2 = ((com.tencent.mm.plugin.voip.model.d0) aVar2).f176375f) != null) {
                            p1Var2.o(gq4.v.wi().f365967a);
                        }
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteDeviceModel] remote device model: " + bArr8 + "ret: " + appCmd3 + ", [roomid=" + v2protocalVar.f176880r + ", roomkey=" + v2protocalVar.f176883s + "]");
                        return;
                    }
                    return;
                case 10:
                    break;
                case 11:
                    if (ww6Var.f389548e == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableAdaptiveBlur empty buffer");
                        return;
                    }
                    java.nio.ByteBuffer allocate7 = java.nio.ByteBuffer.allocate(4);
                    allocate7.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                    allocate7.putInt(1);
                    v2protocalVar.setAppCmd(70, allocate7.array(), 4);
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableAdaptiveBlur:  1");
                    return;
                case 12:
                    if (ww6Var.f389548e == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableMixDenoise empty buffer");
                        return;
                    }
                    java.nio.ByteBuffer allocate8 = java.nio.ByteBuffer.allocate(4);
                    allocate8.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                    allocate8.putInt(1);
                    v2protocalVar.setAppCmd(71, allocate8.array(), 4);
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableMixDenoise:  1");
                    return;
                case 13:
                    if (ww6Var.f389548e == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableVoipOpt empty buffer");
                        return;
                    }
                    java.nio.ByteBuffer allocate9 = java.nio.ByteBuffer.allocate(4);
                    allocate9.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                    allocate9.putInt(1);
                    v2protocalVar.setAppCmd(72, allocate9.array(), 4);
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableVoipOpt:  1");
                    return;
                case 14:
                    com.tencent.mm.protobuf.g gVar9 = ww6Var.f389548e;
                    if (gVar9 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteCpuFreq: empty buffer!");
                        return;
                    }
                    java.nio.ByteBuffer wrap5 = java.nio.ByteBuffer.wrap(gVar9.f192156a);
                    java.nio.ByteOrder byteOrder5 = java.nio.ByteOrder.LITTLE_ENDIAN;
                    wrap5.order(byteOrder5);
                    int i47 = wrap5.getInt();
                    java.nio.ByteBuffer allocate10 = java.nio.ByteBuffer.allocate(4);
                    allocate10.order(byteOrder5);
                    allocate10.putInt((short) i47);
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteCpuFreq:  " + i47);
                    int appCmd4 = v2protocalVar.setAppCmd(84, allocate10.array(), 4);
                    if (appCmd4 < 0) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteCpuFreq:  " + i47 + "ret: " + appCmd4 + ", [roomid=" + v2protocalVar.f176880r + ", roomkey=" + v2protocalVar.f176883s + "]");
                        return;
                    }
                    return;
                case 15:
                    com.tencent.mm.protobuf.g gVar10 = ww6Var.f389548e;
                    if (gVar10 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteBatteryTemp: empty buffer!");
                        return;
                    }
                    byte[] bArr9 = gVar10.f192156a;
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteBatteryTemp:  " + bArr9);
                    int appCmd5 = v2protocalVar.setAppCmd(85, bArr9, 4);
                    if (appCmd5 < 0) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteBatteryTemp:  " + bArr9 + "ret: " + appCmd5 + ", [roomid=" + v2protocalVar.f176880r + ", roomkey=" + v2protocalVar.f176883s + "]");
                        return;
                    }
                    return;
                case 16:
                    com.tencent.mm.protobuf.g gVar11 = ww6Var.f389548e;
                    if (gVar11 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteBatteryQuan: empty buffer!");
                        return;
                    }
                    byte[] bArr10 = gVar11.f192156a;
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteBatteryQuan:  " + bArr10);
                    int appCmd6 = v2protocalVar.setAppCmd(86, bArr10, 4);
                    if (appCmd6 < 0) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteBatteryQuan:  " + bArr10 + "ret: " + appCmd6 + ", [roomid=" + v2protocalVar.f176880r + ", roomkey=" + v2protocalVar.f176883s + "]");
                        return;
                    }
                    return;
                case 17:
                    com.tencent.mm.protobuf.g gVar12 = ww6Var.f389548e;
                    if (gVar12 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteLowBattery: empty buffer!");
                        return;
                    }
                    byte[] bArr11 = gVar12.f192156a;
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteLowBattery:  " + bArr11);
                    int appCmd7 = v2protocalVar.setAppCmd(87, bArr11, 4);
                    if (appCmd7 < 0) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteLowBattery:  " + bArr11 + "ret: " + appCmd7 + ", [roomid=" + v2protocalVar.f176880r + ", roomkey=" + v2protocalVar.f176883s + "]");
                        return;
                    }
                    return;
                case 18:
                    if (ww6Var.f389548e != null) {
                        return;
                    }
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteProtoBuf empty buffer");
                    return;
                case 19:
                    com.tencent.mm.protobuf.g gVar13 = ww6Var.f389548e;
                    if (gVar13 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_RecoverCodec empty buffer");
                        break;
                    } else {
                        byte[] bArr12 = gVar13.f192156a;
                        if (v2protocalVar != null) {
                            java.nio.ByteBuffer wrap6 = java.nio.ByteBuffer.wrap(bArr12);
                            java.nio.ByteOrder byteOrder6 = java.nio.ByteOrder.LITTLE_ENDIAN;
                            wrap6.order(byteOrder6);
                            int i48 = wrap6.getInt();
                            java.nio.ByteBuffer allocate11 = java.nio.ByteBuffer.allocate(6);
                            allocate11.order(byteOrder6);
                            allocate11.putShort((short) 5);
                            allocate11.putShort((short) i48);
                            allocate11.putShort((short) 0);
                            v2protocalVar.setAppCmd(39, allocate11.array(), 6);
                            vq4.d0.c("MicroMsg.Voip.VoipContext", "jcchen CMD_VOIP_RecoverCodec:  " + i48);
                            break;
                        }
                    }
                    break;
                case 20:
                case 25:
                case 26:
                case 27:
                case 29:
                default:
                    return;
                case 21:
                    com.tencent.mm.protobuf.g gVar14 = ww6Var.f389548e;
                    if (gVar14 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteTotalCpuFreq: empty buffer!");
                        return;
                    }
                    java.nio.ByteBuffer wrap7 = java.nio.ByteBuffer.wrap(gVar14.f192156a);
                    java.nio.ByteOrder byteOrder7 = java.nio.ByteOrder.LITTLE_ENDIAN;
                    wrap7.order(byteOrder7);
                    int i49 = wrap7.getInt();
                    java.nio.ByteBuffer allocate12 = java.nio.ByteBuffer.allocate(4);
                    allocate12.order(byteOrder7);
                    allocate12.putInt((short) i49);
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteTotalCpuFreq:  " + i49);
                    int appCmd8 = v2protocalVar.setAppCmd(91, allocate12.array(), 4);
                    if (appCmd8 < 0) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_RemoteTotalCpuFreq:  " + i49 + "ret: " + appCmd8 + ", [roomid=" + v2protocalVar.f176880r + ", roomkey=" + v2protocalVar.f176883s + "]");
                        return;
                    }
                    return;
                case 22:
                    com.tencent.mm.protobuf.g gVar15 = ww6Var.f389548e;
                    if (gVar15 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "sifeng set beautyInfo for sharpen empty buffer");
                        return;
                    }
                    byte[] bArr13 = gVar15.f192156a;
                    if (bArr13.length > 0) {
                        try {
                            C(bArr13[0] != 0);
                            return;
                        } catch (java.lang.Exception unused) {
                            vq4.d0.c("MicroMsg.Voip.VoipContext", "sifeng set beautyInfo for sharpen Error!");
                            return;
                        }
                    }
                    return;
                case 23:
                case 24:
                    com.tencent.mm.protobuf.g gVar16 = ww6Var.f389548e;
                    if (gVar16 == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "anaylsis capture pause empty buffer, Error!");
                        return;
                    }
                    byte[] bArr14 = gVar16.f192156a;
                    int length2 = bArr14.length;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipContext", "cmdTpye  is %s and timestampe %s", java.lang.Integer.valueOf(ww6Var.f389547d), java.lang.Double.valueOf(l(bArr14)));
                    if (length2 > 0) {
                        try {
                            boolean z17 = ww6Var.f389547d == 24;
                            if (this.Y > l(bArr14)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipContext", "error happened while signal un sorted");
                            } else {
                                this.Y = l(bArr14);
                                E(z17);
                            }
                            if (z17) {
                                v2protocalVar.setAppCmd(200, bArr14, length2);
                                return;
                            } else {
                                v2protocalVar.setAppCmd(201, bArr14, length2);
                                return;
                            }
                        } catch (java.lang.Exception unused2) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "anaylsis capture pause , Error!");
                            return;
                        }
                    }
                    return;
                case 28:
                    com.tencent.mm.protobuf.g gVar17 = ww6Var.f389548e;
                    if (gVar17 == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteCpuHardware] empty buffer");
                        return;
                    }
                    byte[] bArr15 = gVar17.f192156a;
                    int length3 = bArr15.length;
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin: remote cpu hardware: ".concat(new java.lang.String(bArr15)));
                    int appCmd9 = v2protocalVar.setAppCmd(ac1.g.CTRL_INDEX, bArr15, length3);
                    if (appCmd9 < 0) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "anlin:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteCpuHardware] remote cpu hardware: " + bArr15 + "ret: " + appCmd9 + ", [roomid=" + v2protocalVar.f176880r + ", roomkey=" + v2protocalVar.f176883s + "]");
                        return;
                    }
                    return;
                case 30:
                    if (ww6Var.f389548e == null) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "CMD_VOIP_RemoteUserStatus empty buffer");
                        return;
                    }
                    r45.y37 y37Var = (r45.y37) new r45.y37().parseFrom(ww6Var.f389548e.f192156a);
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "remote user status :" + y37Var.f390768f + " roomkey " + y37Var.f390766d + " roomid " + y37Var.f390767e);
                    int i57 = y37Var.f390768f;
                    if (y37Var.f390766d == v2protocalVar.f176883s && y37Var.f390767e == v2protocalVar.f176877q) {
                        if (i57 != 1 && i57 != 2) {
                            if (i57 == 3) {
                                vq4.d0.c("MicroMsg.Voip.VoipContext", "get remote exit status by rudp");
                                v2protocalVar.M1.f176713a = 116;
                                v(6, 0, "", -1);
                                return;
                            }
                            return;
                        }
                        r45.v37 v37Var = new r45.v37();
                        v37Var.f387858e = 1;
                        this.B.c(v37Var, 4);
                        return;
                    }
                    vq4.d0.b("MicroMsg.Voip.VoipContext", "get remote user status, but room err, cur roomkey " + v2protocalVar.f176883s + " cur roomid " + v2protocalVar.f176877q);
                    return;
            }
            if (ww6Var.f389548e == null) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableAq empty buffer");
                return;
            }
            java.nio.ByteBuffer allocate13 = java.nio.ByteBuffer.allocate(4);
            allocate13.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocate13.putInt(1);
            v2protocalVar.setAppCmd(48, allocate13.array(), 4);
            vq4.d0.c("MicroMsg.Voip.VoipContext", "ashlynli CMD_VOIP_EnableAq:  1");
        } catch (java.lang.Exception unused3) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "rudp cmd processing Error");
        }
    }

    public void x(int i17) {
        try {
            r45.ww6 ww6Var = new r45.ww6();
            ww6Var.f389547d = i17;
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
            if (1 == i17) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[HW]:send maxsizeformat: !!6");
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
                allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                allocate.putInt(6);
                ww6Var.f389548e = new com.tencent.mm.protobuf.g(allocate.array());
                v2protocalVar.setAppCmd(32, allocate.array(), 4);
            } else {
                ww6Var.f389548e = null;
            }
            v2protocalVar.SendRUDP(ww6Var.toByteArray(), ww6Var.toByteArray().length);
            vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[HW]:OnTransportChannelData: send RUDP data to close remote HW encoding!Type:" + i17);
        } catch (java.lang.Exception unused) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "onVoipSendCloseHWEncCmd Error");
        }
    }

    public void y(int i17) {
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176532x;
        if (v2protocalVar != null) {
            try {
                if (v2protocalVar.f176883s != 0 && v2protocalVar.f176877q != 0) {
                    r45.ww6 ww6Var = new r45.ww6();
                    ww6Var.f389547d = 30;
                    r45.y37 y37Var = new r45.y37();
                    y37Var.f390766d = v2protocalVar.f176883s;
                    y37Var.f390767e = v2protocalVar.f176877q;
                    y37Var.f390768f = i17;
                    ww6Var.f389548e = new com.tencent.mm.protobuf.g(y37Var.toByteArray());
                    v2protocalVar.SendRUDP(ww6Var.toByteArray(), ww6Var.toByteArray().length);
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "send user status " + i17 + " roomkey " + y37Var.f390766d + " roomid " + y37Var.f390767e);
                }
            } catch (java.lang.Exception unused) {
                vq4.d0.b("MicroMsg.Voip.VoipContext", "send user status error " + i17);
            }
        }
    }

    public void z(int i17, int i18, int i19, int i27, int i28) {
        this.f176532x.f176851h0 = (int) ((i17 * java.lang.Math.pow(16.0d, 7.0d)) + (i18 * java.lang.Math.pow(16.0d, 6.0d)) + (i19 * java.lang.Math.pow(16.0d, 4.0d)) + (i27 * java.lang.Math.pow(16.0d, 2.0d)) + (i28 * java.lang.Math.pow(16.0d, 0.0d)));
    }
}
