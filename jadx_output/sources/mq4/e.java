package mq4;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.e37 f330791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mq4.f f330792e;

    public e(mq4.f fVar, r45.e37 e37Var) {
        this.f330792e = fVar;
        this.f330791d = e37Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.protobuf.g gVar;
        r45.cu5 cu5Var;
        com.tencent.mm.protobuf.g gVar2;
        com.tencent.mm.protobuf.g gVar3;
        r45.cu5 cu5Var2;
        gq4.v.Bi().f176558a.B.c(1000L, 1000L);
        mq4.f fVar = this.f330792e;
        vq4.d0.c(fVar.f330797d.f330798h, "steve:doublelink timer started!");
        r45.e37 e37Var = this.f330791d;
        r45.do5 do5Var = e37Var.M;
        mq4.g gVar4 = fVar.f330797d;
        if (do5Var == null || do5Var.f372624d == 0) {
            r45.co5 co5Var = new r45.co5();
            co5Var.f371724d = 0;
            co5Var.f371725e = "";
            co5Var.f371726f = "";
            co5Var.f371727g = gVar4.f330796g.f176532x.f176847g;
            co5Var.f371728h = 4;
            co5Var.f371729i = 2;
            co5Var.f371730m = e37Var.f372976g;
            co5Var.f371731n = e37Var.f372984r;
            r45.do5 do5Var2 = new r45.do5();
            e37Var.M = do5Var2;
            do5Var2.f372624d = 1;
            do5Var2.f372625e = new java.util.LinkedList();
            e37Var.M.f372625e.add(co5Var);
        }
        r45.ve0 ve0Var = e37Var.N;
        if (ve0Var == null || ve0Var.f388148d == 0) {
            r45.ue0 ue0Var = new r45.ue0();
            ue0Var.f387280d = 1;
            ue0Var.f387281e = "";
            ue0Var.f387282f = "";
            ue0Var.f387283g = gVar4.f330796g.f176532x.f176847g;
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
        vq4.d0.c(gVar4.f330798h, "relay conn cnt: " + e37Var.M.f372624d);
        try {
            gVar4.f330796g.f176532x.f176894v1 = e37Var.M.toByteArray();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(gVar4.f330798h, "relay conn info to byte array fail..");
        }
        try {
            gVar4.f330796g.f176532x.f176897w1 = e37Var.N.toByteArray();
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e(gVar4.f330798h, "direct conn info to byte array fail..");
        }
        try {
            r45.kj3 kj3Var = e37Var.P;
            if (kj3Var.f378738d > 0) {
                gVar4.f330796g.f176532x.f176900x1 = kj3Var.toByteArray();
            }
        } catch (java.lang.Exception unused3) {
            com.tencent.mars.xlog.Log.e(gVar4.f330798h, "nic query info to byte array fail..");
        }
        com.tencent.mm.protobuf.g gVar5 = e37Var.f372973d.f378344e.f371841f;
        if (gVar5 != null) {
            gVar4.f330796g.N(gVar5.g());
        } else {
            com.tencent.mars.xlog.Log.e(gVar4.f330798h, "multiRelayData.PeerId.Buffer.getBuffer() is null");
        }
        r45.cu5 cu5Var3 = e37Var.f372982p;
        if (cu5Var3 != null && (gVar3 = cu5Var3.f371841f) != null && (cu5Var2 = e37Var.C) != null && cu5Var2.f371841f != null) {
            com.tencent.mm.plugin.voip.model.g1 g1Var = gVar4.f330796g;
            byte[] g17 = gVar3.g();
            int i17 = e37Var.f372981o;
            int i18 = e37Var.f372990x;
            byte[] g18 = e37Var.C.f371841f.g();
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
            v2protocalVar.f176898x = i17;
            v2protocalVar.f176901y = g17;
            v2protocalVar.f176846f1 = i18;
            v2protocalVar.f176849g1 = g18;
        }
        com.tencent.mm.plugin.voip.model.g1 g1Var2 = gVar4.f330796g;
        int i19 = e37Var.f372985s;
        int i27 = e37Var.f372986t;
        int i28 = e37Var.f372987u;
        int i29 = e37Var.f372988v;
        int i37 = e37Var.f372989w;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = g1Var2.f176532x;
        v2protocalVar2.W0 = i19;
        v2protocalVar2.X0 = i27;
        v2protocalVar2.Y0 = i28;
        v2protocalVar2.Z0 = i29;
        v2protocalVar2.f176831a1 = i37;
        v2protocalVar2.f176834b1 = e37Var.B;
        r45.cu5 cu5Var4 = e37Var.f372992z;
        if (cu5Var4 != null && (cu5Var = e37Var.A) != null && (gVar2 = cu5Var4.f371841f) != null && cu5Var.f371841f != null) {
            int i38 = e37Var.f372991y;
            byte[] g19 = gVar2.g();
            byte[] g27 = e37Var.A.f371841f.g();
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = g1Var2.f176532x;
            v2protocalVar3.f176867m1 = i38;
            v2protocalVar3.f176870n1 = g19;
            v2protocalVar3.f176873o1 = g27;
        }
        com.tencent.mm.protobuf.g gVar6 = e37Var.f372974e.f378344e.f371841f;
        if (gVar6 != null) {
            gVar4.f330796g.M(gVar6.g());
        } else {
            com.tencent.mars.xlog.Log.e(gVar4.f330798h, "multiRelayData.CapInfo.Buffer.getBuffer() is null");
        }
        com.tencent.mm.plugin.voip.model.g1 g1Var3 = gVar4.f330796g;
        int i39 = e37Var.E;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar4 = g1Var3.f176532x;
        v2protocalVar4.f176852h1 = i39;
        int i47 = e37Var.f372979m;
        int i48 = e37Var.f372980n;
        v2protocalVar4.A = i47;
        v2protocalVar4.B = i48;
        v2protocalVar4.f176855i1 = e37Var.F;
        r45.cu5 cu5Var5 = e37Var.H;
        if (cu5Var5 != null && (gVar = cu5Var5.f371841f) != null) {
            v2protocalVar4.F = gVar.g();
        }
        com.tencent.mm.plugin.voip.model.g1 g1Var4 = gVar4.f330796g;
        boolean z17 = g1Var4.f176513e;
        java.lang.String str = gVar4.f330798h;
        if (z17) {
            vq4.d0.c(str, "channel already success, start talk, pre-connect " + gVar4.f330796g.f176518j);
            com.tencent.mm.sdk.platformtools.u3.h(new mq4.d(this));
        } else if (!g1Var4.f176518j) {
            com.tencent.mars.xlog.Log.i(str, "isPreConnect is false");
        } else {
            if (g1Var4.f176517i) {
                vq4.d0.c(str, "channel pre-connect already failed");
                gVar4.f330796g.v(1, -9000, "", -1);
                return;
            }
            vq4.d0.c(str, "channel pre-connect still connecting...");
        }
        com.tencent.mm.plugin.voip.model.g1 g1Var5 = gVar4.f330796g;
        g1Var5.f176518j = false;
        g1Var5.H();
        gVar4.f330796g.J();
    }
}
