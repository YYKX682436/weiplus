package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.k37 f176613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.i3 f176614e;

    public h3(com.tencent.mm.plugin.voip.model.i3 i3Var, r45.k37 k37Var) {
        this.f176614e = i3Var;
        this.f176613d = k37Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.protobuf.g gVar;
        r45.cu5 cu5Var;
        com.tencent.mm.protobuf.g gVar2;
        com.tencent.mm.protobuf.g gVar3;
        r45.cu5 cu5Var2;
        r45.cu5 cu5Var3;
        r45.k37 k37Var;
        r45.cu5 cu5Var4;
        r45.c27 c27Var;
        r45.do5 do5Var;
        r45.cu5 cu5Var5;
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "__onMultiRelayData begin");
        try {
            r45.e37 e37Var = (r45.e37) new r45.e37().parseFrom(this.f176613d.f378344e.f371841f.g());
            r45.k37 k37Var2 = e37Var.f372973d;
            com.tencent.mm.plugin.voip.model.i3 i3Var = this.f176614e;
            if (k37Var2 != null && (cu5Var5 = k37Var2.f378344e) != null && cu5Var5.f371841f != null) {
                i3Var.f176678b.f372973d = k37Var2;
            }
            r45.k37 k37Var3 = e37Var.f372974e;
            r45.cu5 cu5Var6 = k37Var3.f378344e;
            if (cu5Var6 != null && cu5Var6.f371841f != null) {
                i3Var.f176678b.f372974e = k37Var3;
            }
            int i17 = e37Var.f372975f;
            if (i17 != 0) {
                i3Var.f176678b.f372975f = i17;
            }
            r45.c27 c27Var2 = e37Var.f372976g;
            if (c27Var2 != null && c27Var2.f371249d != 0) {
                i3Var.f176678b.f372976g = c27Var2;
            }
            r45.c27 c27Var3 = e37Var.f372977h;
            if (c27Var3 != null && c27Var3.f371249d != 0) {
                i3Var.f176678b.f372977h = c27Var3;
            }
            java.util.LinkedList linkedList = e37Var.L;
            if (linkedList != null && linkedList.size() != 0) {
                r45.e37 e37Var2 = i3Var.f176678b;
                e37Var2.L = e37Var.L;
                e37Var2.K = e37Var.L.size();
            }
            int i18 = e37Var.f372979m;
            if (i18 != 0) {
                i3Var.f176678b.f372979m = i18;
            }
            int i19 = e37Var.f372980n;
            if (i19 != 0) {
                i3Var.f176678b.f372980n = i19;
            }
            r45.c27 c27Var4 = e37Var.f372984r;
            if (c27Var4.f371249d != 0) {
                i3Var.f176678b.f372984r = c27Var4;
            }
            int i27 = e37Var.f372985s;
            if (i27 > 0) {
                i3Var.f176678b.f372985s = i27;
            } else {
                i3Var.f176678b.f372985s = 0;
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no ARQstrategy in mrdata");
            }
            int i28 = e37Var.f372990x;
            if (i28 > 0) {
                i3Var.f176678b.f372990x = i28 - 1;
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[ENCRYPT] got encryptStrategy[" + i3Var.f176678b.f372990x + "] from relaydata");
            } else {
                i3Var.f176678b.f372990x = 1;
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no EncryptStrategy in mrdata");
            }
            int i29 = e37Var.f372986t;
            if (i29 > 0) {
                r45.e37 e37Var3 = i3Var.f176678b;
                e37Var3.f372986t = i29;
                e37Var3.f372987u = e37Var.f372987u;
                e37Var3.f372988v = e37Var.f372988v;
                e37Var3.f372989w = e37Var.f372989w;
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got ARQCacheLen: " + e37Var.f372986t + ", ARQRttThreshold: " + e37Var.f372987u + ", ARQUsedRateThreshold: " + e37Var.f372988v + ", ARQRespRateThreshold: " + e37Var.f372989w);
            } else {
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no ARQKeyParameters in mrdata");
            }
            int i37 = e37Var.B;
            if (i37 > 0) {
                i3Var.f176678b.B = i37;
            } else {
                i3Var.f176678b.B = 0;
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[LOGIC]:got no QosStrategy in mrdata");
            }
            r45.e37 e37Var4 = i3Var.f176678b;
            e37Var4.E = e37Var.E;
            r45.r24 r24Var = e37Var.G;
            if (r24Var != null) {
                e37Var4.G = r24Var;
            }
            com.tencent.mm.plugin.voip.model.g1 g1Var = i3Var.f176677a;
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
            int i38 = v2protocalVar.f176877q;
            if (i38 != 0) {
                long j17 = v2protocalVar.f176883s;
                if (j17 != 0) {
                    r45.k37 k37Var4 = e37Var4.f372973d;
                    if (!((k37Var4 == null || (cu5Var3 = k37Var4.f378344e) == null || cu5Var3.f371841f == null || e37Var4.f372975f == 0 || (k37Var = e37Var4.f372974e) == null || (cu5Var4 = k37Var.f378344e) == null || cu5Var4.f371841f == null || (((c27Var = e37Var4.f372976g) == null || c27Var.f371249d == 0) && ((do5Var = e37Var.M) == null || do5Var.f372624d <= 0))) ? false : true)) {
                        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "__onMultiRelayData end");
                        return;
                    }
                    e37Var4.f372972J = e37Var.f372972J;
                    e37Var4.I = e37Var.I;
                    g1Var.O.b(e37Var.f372972J, e37Var.I, i38, j17);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("multiRelayData recv all, update. RedirectReqThreshold = ");
                    r45.e37 e37Var5 = i3Var.f176678b;
                    sb6.append(e37Var5.E);
                    sb6.append(" BothSideSwitchFlag = ");
                    sb6.append(e37Var.F);
                    vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", sb6.toString());
                    int i39 = e37Var5.f372975f;
                    com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = g1Var.f176532x;
                    v2protocalVar2.M1.f176720g = (byte) 1;
                    v2protocalVar2.f176904z = i39;
                    g1Var.N(e37Var5.f372973d.f378344e.f371841f.g());
                    r45.cu5 cu5Var7 = e37Var.f372982p;
                    if (cu5Var7 != null && (gVar3 = cu5Var7.f371841f) != null && (cu5Var2 = e37Var.C) != null && cu5Var2.f371841f != null) {
                        byte[] g17 = gVar3.g();
                        int i47 = e37Var.f372981o;
                        int i48 = e37Var5.f372990x;
                        byte[] g18 = e37Var.C.f371841f.g();
                        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = g1Var.f176532x;
                        v2protocalVar3.f176898x = i47;
                        v2protocalVar3.f176901y = g17;
                        v2protocalVar3.f176846f1 = i48;
                        v2protocalVar3.f176849g1 = g18;
                    }
                    if (gq4.v.Bi().m() != 0) {
                        g1Var.M(e37Var5.f372974e.f378344e.f371841f.g());
                    }
                    r45.do5 do5Var2 = e37Var.M;
                    if (do5Var2 == null || do5Var2.f372624d == 0) {
                        r45.co5 co5Var = new r45.co5();
                        co5Var.f371724d = 0;
                        co5Var.f371725e = "";
                        co5Var.f371726f = "";
                        co5Var.f371727g = g1Var.f176532x.f176847g;
                        co5Var.f371728h = 4;
                        co5Var.f371729i = 2;
                        co5Var.f371730m = e37Var.f372976g;
                        co5Var.f371731n = e37Var.f372984r;
                        r45.do5 do5Var3 = new r45.do5();
                        e37Var.M = do5Var3;
                        do5Var3.f372624d = 1;
                        do5Var3.f372625e = new java.util.LinkedList();
                        e37Var.M.f372625e.add(co5Var);
                    }
                    r45.ve0 ve0Var = e37Var.N;
                    if (ve0Var == null || ve0Var.f388148d == 0) {
                        r45.ue0 ue0Var = new r45.ue0();
                        ue0Var.f387280d = 1;
                        ue0Var.f387281e = "";
                        ue0Var.f387282f = "";
                        ue0Var.f387283g = g1Var.f176532x.f176847g;
                        ue0Var.f387284h = 4;
                        ue0Var.f387285i = 2;
                        ue0Var.f387286m = e37Var.f372977h;
                        ue0Var.f387287n = e37Var.K;
                        ue0Var.f387288o = e37Var.L;
                        r45.ve0 ve0Var2 = new r45.ve0();
                        e37Var.N = ve0Var2;
                        ve0Var2.f388148d = 1;
                        ve0Var2.f388149e = new java.util.LinkedList();
                        e37Var.N.f388149e.add(ue0Var);
                    }
                    vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "relay conn cnt: " + e37Var.M.f372624d);
                    try {
                        g1Var.f176532x.f176894v1 = e37Var.M.toByteArray();
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipSyncHandle", "relay conn info to byte array fail..");
                    }
                    try {
                        g1Var.f176532x.f176897w1 = e37Var.N.toByteArray();
                    } catch (java.lang.Exception unused2) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipSyncHandle", "direct conn info to byte array fail..");
                    }
                    try {
                        r45.kj3 kj3Var = e37Var.P;
                        if (kj3Var.f378738d > 0) {
                            g1Var.f176532x.f176900x1 = kj3Var.toByteArray();
                        }
                    } catch (java.lang.Exception unused3) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipSyncHandle", "nic query info to byte array fail..");
                    }
                    vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onMultiRelayData natsvr =" + e37Var5.K);
                    int i49 = e37Var5.f372985s;
                    int i57 = e37Var5.f372986t;
                    int i58 = e37Var5.f372987u;
                    int i59 = e37Var5.f372988v;
                    int i66 = e37Var5.f372989w;
                    com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar4 = g1Var.f176532x;
                    v2protocalVar4.W0 = i49;
                    v2protocalVar4.X0 = i57;
                    v2protocalVar4.Y0 = i58;
                    v2protocalVar4.Z0 = i59;
                    v2protocalVar4.f176831a1 = i66;
                    v2protocalVar4.f176834b1 = e37Var5.B;
                    int i67 = e37Var5.f372979m;
                    int i68 = e37Var5.f372980n;
                    v2protocalVar4.A = i67;
                    v2protocalVar4.B = i68;
                    v2protocalVar4.f176852h1 = e37Var5.E;
                    v2protocalVar4.f176855i1 = e37Var.F;
                    r45.cu5 cu5Var8 = e37Var.H;
                    if (cu5Var8 != null && (gVar2 = cu5Var8.f371841f) != null) {
                        v2protocalVar4.F = gVar2.g();
                    }
                    r45.cu5 cu5Var9 = e37Var.f372992z;
                    if (cu5Var9 != null && (gVar = cu5Var9.f371841f) != null && (cu5Var = e37Var.A) != null && cu5Var.f371841f != null) {
                        int i69 = e37Var.f372991y;
                        byte[] g19 = gVar.g();
                        byte[] g27 = e37Var.A.f371841f.g();
                        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar5 = g1Var.f176532x;
                        v2protocalVar5.f176867m1 = i69;
                        v2protocalVar5.f176870n1 = g19;
                        v2protocalVar5.f176873o1 = g27;
                    }
                    r45.r24 r24Var2 = e37Var5.G;
                    com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar6 = g1Var.f176532x;
                    v2protocalVar6.getClass();
                    vq4.d0.a("MicroMsg.Voip", "v2protocal updateJbmBitrateRsSvrParam BitrateFlag : " + r24Var2.f384468e + " Bitrate: " + r24Var2.f384469f);
                    v2protocalVar6.field_jbmParamArraySize = 27;
                    v2protocalVar6.field_jbmBitratRsSvrParamArray = r5;
                    int[] iArr = {r24Var2.f384467d, r24Var2.f384468e, r24Var2.f384469f, r24Var2.f384470g, r24Var2.f384471h, r24Var2.f384472i, r24Var2.f384473m, r24Var2.f384476p, r24Var2.f384478q, r24Var2.f384481t, r24Var2.f384482u, r24Var2.f384485x, r24Var2.f384487y, r24Var2.B, r24Var2.C, r24Var2.F, r24Var2.G, r24Var2.f384466J, r24Var2.K, r24Var2.N, r24Var2.P, r24Var2.S, r24Var2.T, r24Var2.W, r24Var2.X, r24Var2.f384477p0, r24Var2.f384486x0};
                    v2protocalVar6.field_jbmParamDoubleArraySize = 20;
                    v2protocalVar6.field_jbmBitratRsSvrParamDoubleArray = r5;
                    double[] dArr = {r24Var2.f384474n, r24Var2.f384475o, r24Var2.f384479r, r24Var2.f384480s, r24Var2.f384483v, r24Var2.f384484w, r24Var2.f384488z, r24Var2.A, r24Var2.D, r24Var2.E, r24Var2.H, r24Var2.I, r24Var2.L, r24Var2.M, r24Var2.Q, r24Var2.R, r24Var2.U, r24Var2.V, r24Var2.Y, r24Var2.Z};
                    g1Var.J();
                    vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "__onMultiRelayData end");
                    return;
                }
            }
            vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "not in valid room, __onMultiRelayData end");
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e17, "", new java.lang.Object[0]);
        }
    }
}
