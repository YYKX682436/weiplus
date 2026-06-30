package mq4;

/* loaded from: classes14.dex */
public class p implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.q f330805d;

    public p(mq4.q qVar) {
        this.f330805d = qVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.g gVar;
        r45.e83 e83Var;
        com.tencent.mm.plugin.voip.model.a3 a3Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Invite response:");
        sb6.append(i17);
        sb6.append(" errCode:");
        sb6.append(i18);
        sb6.append(" status:");
        mq4.q qVar = this.f330805d;
        sb6.append(qVar.f330796g.f176508a);
        vq4.d0.c("MicroMsg.NetSceneVoipInvite", sb6.toString());
        r45.x27 x27Var = (r45.x27) qVar.K();
        com.tencent.mm.plugin.voip.model.g1 g1Var = qVar.f330796g;
        com.tencent.mm.plugin.voip.model.l1 l1Var = g1Var.f176532x.M1;
        l1Var.getClass();
        l1Var.I = java.lang.System.currentTimeMillis();
        g1Var.E = false;
        r45.w27 w27Var = (r45.w27) ((mq4.q) m1Var).f330793d.f70710a.f70684a;
        boolean z17 = gq4.v.Bi().f176558a.f176418h == 2;
        boolean z18 = gq4.v.Bi().f176558a.f176418h == 1;
        if (i18 != 238) {
            if (z17) {
                gq4.v.Bi().e(x27Var.f389706d, x27Var.f389709g, w27Var.f388817p);
                vq4.d0.b("MicroMsg.NetSceneVoipInvite", " steve:[simucall] new simul call invite response  return!, DO NOT use inviteresp info,  I'm callee!!");
                g1Var.f176534z.C(g1Var.f176532x.f176828J);
                vq4.d0.b("MicroMsg.NetSceneVoipInvite", " danial:[simucall] new simul call invite response return! auto accept, I'm callee");
                return;
            }
            if (z18) {
                com.tencent.mm.plugin.voip.model.d3 d3Var = gq4.v.Bi().f176558a;
                if ((d3Var.f176418h == 1) && (a3Var = d3Var.f176421k) != null) {
                    d3Var.d(a3Var.f176335d, a3Var.f176336e, 5, null, null, a3Var.f176332a);
                }
                vq4.d0.b("MicroMsg.NetSceneVoipInvite", " danial:[simucall] new simul call invite response  return!, send ack,  I'm caller!!");
            }
        }
        int i19 = g1Var.f176508a;
        if (i19 == 1) {
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - w27Var.f388818q);
            java.util.LinkedList linkedList = w27Var.f388810f;
            java.lang.String str2 = linkedList.size() > 0 ? ((r45.du5) linkedList.get(0)).f372756d : "";
            mq4.i iVar = new mq4.i(x27Var.f389706d, x27Var.f389709g, str2, "", w27Var.f388820s, 1, currentTimeMillis, w27Var.f388817p);
            vq4.d0.c("MicroMsg.NetSceneVoipInvite", "caller cancel before invite resp! send cancel invite, roomid " + x27Var.f389706d + " interval: " + currentTimeMillis + " + inviteId:" + w27Var.f388820s + " invitetype " + w27Var.f388817p + " talker" + str2);
            iVar.L();
            return;
        }
        if (i19 != 2) {
            if (i18 != 238) {
                vq4.d0.b("MicroMsg.NetSceneVoipInvite", " invite response with error status:" + g1Var.f176508a + " should:2");
                return;
            }
            if (z17) {
                gq4.v.Bi().f176559b.e0(true, w27Var.f388817p == 0);
                vq4.d0.b("MicroMsg.NetSceneVoipInvite", " danial:[simucall] resetStateMachine, isNewSimulCallee true");
            }
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        v2protocalVar.M0 = x27Var.f389714o;
        v2protocalVar.N0 = x27Var.f389715p;
        v2protocalVar.O0 = x27Var.f389716q;
        v2protocalVar.P0 = x27Var.f389717r;
        v2protocalVar.R0 = x27Var.f389720u;
        v2protocalVar.Q0 = x27Var.B;
        v2protocalVar.f176876p1 = x27Var.C;
        v2protocalVar.D = x27Var.F;
        v2protocalVar.E = x27Var.K;
        v2protocalVar.T0 = x27Var.H;
        v2protocalVar.C = x27Var.f389721v;
        v2protocalVar.I = x27Var.G;
        r45.cu5 cu5Var = x27Var.L;
        if (cu5Var == null || (gVar = cu5Var.f371841f) == null) {
            vq4.d0.b("MicroMsg.NetSceneVoipInvite", "voip general strategy is null");
        } else {
            v2protocalVar.G = gVar.g();
            try {
                e83Var = (r45.e83) new r45.e83().parseFrom(g1Var.f176532x.G);
            } catch (java.io.IOException unused) {
                vq4.d0.c("MicroMsg.NetSceneVoipInvite", "parse Voip general strategy fail");
                e83Var = null;
            }
            if (e83Var != null) {
                int i27 = e83Var.f373098f;
                vq4.d0.a("MicroMsg.NetSceneVoipInvite", "steve:nSvrBaseBRTuneRatio1:" + i27);
                g1Var.f176532x.S0 = i27;
            }
        }
        vq4.d0.c("MicroMsg.NetSceneVoipInvite", "setSvrConfig onInviteResp: audioTsdfBeyond3G = " + g1Var.f176532x.M0 + ",audioTsdEdge = " + g1Var.f176532x.N0 + ",passthroughQosAlgorithm = " + g1Var.f176532x.O0 + ",fastPlayRepair = " + g1Var.f176532x.P0 + ", audioDtx = " + g1Var.f176532x.R0 + ",switchtcpPktCnt = " + g1Var.f176532x.C + ",SvrCfgListV = " + g1Var.f176532x.Q0 + ", setMaxBRForRelay=" + g1Var.f176532x.T0 + ",EnableDataAccept = " + g1Var.f176532x.f176876p1 + ",WifiScanInterval = " + g1Var.f176532x.I + ",BaseBRTuneRatio=" + g1Var.f176532x.S0);
        g1Var.f176532x.U0 = x27Var.A;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("inviteResp AudioAecMode5 = ");
        sb7.append(g1Var.f176532x.U0);
        vq4.d0.c("MicroMsg.NetSceneVoipInvite", sb7.toString());
        com.tencent.mm.plugin.voip.model.l1 l1Var2 = g1Var.f176532x.M1;
        l1Var2.getClass();
        int currentTimeMillis2 = (int) (java.lang.System.currentTimeMillis() - l1Var2.H);
        l1Var2.g((long) currentTimeMillis2);
        int e17 = vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (i17 == 0) {
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = g1Var.f176532x;
            v2protocalVar2.f176877q = x27Var.f389706d;
            v2protocalVar2.f176883s = x27Var.f389709g;
            v2protocalVar2.f176880r = x27Var.f389710h;
            g1Var.D(4);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 1, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
            int i28 = x27Var.f389718s;
            if (i28 > 0) {
                long j17 = i28 * 1000;
                g1Var.T.c(j17, j17);
            }
            gq4.v.Bi().f176558a.B.c(1000L, 1000L);
            g1Var.B();
            vq4.d0.c("MicroMsg.NetSceneVoipInvite", "invite ok, roomid =" + g1Var.f176532x.f176877q + ",memberid = " + g1Var.f176532x.f176880r + "VoipSyncInterval = " + x27Var.f389718s);
            g1Var.f176534z.J();
            if (gq4.v.Bi().f176558a != null) {
                gq4.v.Bi().f176558a.getClass();
            }
            vq4.d0.j(gq4.v.Bi().m(), gq4.v.Bi().n(), 0, 1);
            return;
        }
        if (i17 != 4) {
            com.tencent.mm.plugin.voip.model.l1 l1Var3 = g1Var.f176532x.M1;
            l1Var3.f176713a = 12;
            l1Var3.f176715b = i18;
            l1Var3.f176726m = 99;
            l1Var3.f176732s = 6;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 9, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
            g1Var.v(1, -9004, "", 3);
            return;
        }
        vq4.d0.c("MicroMsg.NetSceneVoipInvite", "RoomId in InviteResp: " + x27Var.f389706d + "," + x27Var.f389709g);
        if (i18 == 211) {
            com.tencent.mm.plugin.voip.model.l1 l1Var4 = g1Var.f176532x.M1;
            l1Var4.f176713a = 12;
            l1Var4.f176726m = 12;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 8, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
        } else if (i18 != 241) {
            switch (i18) {
                case com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR /* 233 */:
                    com.tencent.mm.plugin.voip.model.l1 l1Var5 = g1Var.f176532x.M1;
                    l1Var5.f176713a = 12;
                    l1Var5.f176726m = 1;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 3, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
                    break;
                case 234:
                    com.tencent.mm.plugin.voip.model.l1 l1Var6 = g1Var.f176532x.M1;
                    l1Var6.f176713a = 13;
                    l1Var6.f176726m = 11;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 4, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
                    break;
                case 235:
                    com.tencent.mm.plugin.voip.model.l1 l1Var7 = g1Var.f176532x.M1;
                    l1Var7.f176713a = 13;
                    l1Var7.f176726m = 2;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 2, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
                    break;
                case com.tencent.mm.plugin.appbrand.jsapi.j6.CTRL_INDEX /* 236 */:
                    com.tencent.mm.plugin.voip.model.l1 l1Var8 = g1Var.f176532x.M1;
                    l1Var8.f176713a = 12;
                    l1Var8.f176726m = 10;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 7, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
                    break;
                case 237:
                    com.tencent.mm.plugin.voip.model.l1 l1Var9 = g1Var.f176532x.M1;
                    l1Var9.f176713a = 13;
                    l1Var9.f176726m = 9;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 2, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
                    break;
                case 238:
                    g1Var.f176516h = true;
                    g1Var.f176518j = false;
                    g1Var.f176517i = false;
                    com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = g1Var.f176532x;
                    v2protocalVar3.L0 = 0;
                    v2protocalVar3.K0 = 0;
                    g1Var.D(3);
                    com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar4 = g1Var.f176532x;
                    v2protocalVar4.f176877q = x27Var.f389706d;
                    v2protocalVar4.f176883s = x27Var.f389709g;
                    v2protocalVar4.f176880r = x27Var.f389710h;
                    v2protocalVar4.N1 |= 1;
                    vq4.d0.c("MicroMsg.NetSceneVoipInvite", "steve:[simucall]: use old svr-based simulcall! iSimulCallStatus: " + g1Var.f176532x.N1);
                    g1Var.f176534z.G(w27Var.f388817p);
                    return;
                default:
                    com.tencent.mm.plugin.voip.model.l1 l1Var10 = g1Var.f176532x.M1;
                    l1Var10.f176713a = 12;
                    l1Var10.f176726m = 99;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 5, java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(currentTimeMillis2));
                    break;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVoipInvite", "invite fail cuz server unavailable! reInvtieInterval is : " + x27Var.E + " seconds!");
            gq4.v.Bi().f176569l = java.lang.System.currentTimeMillis();
            if (x27Var.E != 0) {
                gq4.v.Bi().f176570m = x27Var.E * 1000;
            } else {
                gq4.v.Bi().f176570m = 30000L;
            }
        }
        g1Var.f176532x.M1.f176715b = i18;
        java.lang.String str3 = x27Var.M;
        java.lang.String str4 = str3 != null ? new java.lang.String(android.util.Base64.decode(str3, 0)) : null;
        g1Var.H();
        com.tencent.mm.plugin.voip.model.c1 c1Var = g1Var.f176509a0;
        if (c1Var != null) {
            ((com.tencent.mm.plugin.voip.model.d3) c1Var).l(1, i18, str, -1, str4);
        }
    }
}
