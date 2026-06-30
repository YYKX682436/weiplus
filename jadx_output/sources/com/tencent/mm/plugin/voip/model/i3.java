package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.g1 f176677a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.e37 f176678b = new r45.e37();

    /* renamed from: c, reason: collision with root package name */
    public r45.k27 f176679c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f176680d = 0;

    public i3(com.tencent.mm.plugin.voip.model.g1 g1Var) {
        this.f176677a = null;
        this.f176677a = g1Var;
    }

    public int a(r45.k27 k27Var, boolean z17, int i17) {
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176677a;
        if (g1Var.f176532x.f176877q == 0) {
            vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", fp.k.c() + "failed to do voip sync , roomid = 0");
            return 0;
        }
        if (g1Var.F) {
            vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", fp.k.c() + "voip syncing, push to cache...");
            if (k27Var == null) {
                vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "failed to pushVoipCmdList , VoipCmdList = null");
                this.f176680d++;
            } else {
                if (this.f176679c == null) {
                    this.f176679c = new r45.k27();
                }
                for (int i18 = 0; i18 < k27Var.f378335d; i18++) {
                    this.f176679c.f378336e.add((r45.j27) k27Var.f378336e.get(i18));
                }
                r45.k27 k27Var2 = this.f176679c;
                k27Var2.f378335d = k27Var2.f378336e.size();
            }
            return 0;
        }
        g1Var.F = true;
        if (k27Var == null) {
            k27Var = new r45.k27();
            k27Var.f378335d = 0;
            k27Var.f378336e = new java.util.LinkedList();
        }
        r45.k27 k27Var3 = k27Var;
        r45.k27 k27Var4 = this.f176679c;
        if (k27Var4 != null && k27Var4.f378335d > 0) {
            int i19 = 0;
            while (true) {
                r45.k27 k27Var5 = this.f176679c;
                if (i19 >= k27Var5.f378335d) {
                    break;
                }
                k27Var3.f378336e.add((r45.j27) k27Var5.f378336e.get(i19));
                i19++;
            }
            k27Var3.f378335d = k27Var3.f378336e.size();
            r45.k27 k27Var6 = this.f176679c;
            if (k27Var6 != null) {
                k27Var6.f378336e.clear();
                this.f176679c.f378335d = 0;
                this.f176679c = null;
                this.f176680d = 0;
            }
        }
        this.f176680d = 0;
        if (g1Var.C == null) {
            g1Var.C = "".getBytes();
        }
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "____doVoipSync, fromjni:" + z17 + ",cmdList:" + k27Var3.f378335d + ",syncKey.length:" + g1Var.C.length + ",selector:" + i17);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        mq4.c0 c0Var = new mq4.c0(v2protocalVar.f176877q, k27Var3, g1Var.C, v2protocalVar.f176883s, i17);
        com.tencent.mm.plugin.voip.model.l1 l1Var = v2protocalVar.M1;
        l1Var.getClass();
        l1Var.O = java.lang.System.currentTimeMillis();
        c0Var.L();
        return 0;
    }

    public void b(r45.cu5 cu5Var) {
        byte[] g17 = cu5Var.f371841f.g();
        int i17 = 0;
        for (int i18 = 0; i18 < 4; i18++) {
            i17 |= (g17[i18] & 255) << (i18 * 8);
        }
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "voipSync remote status changed, status = " + i17);
        int i19 = i17 & 255;
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176677a;
        g1Var.getClass();
        if (8 != i19 && 9 != i19) {
            g1Var.f176529u = i19;
            g1Var.f176527s = i19;
        }
        if (1 == i19 || 3 == i19) {
            g1Var.I(2, true);
            gq4.v.Bi().f176558a.f176432v = false;
        }
        gq4.v.Bi().H();
        g1Var.f176534z.O(i19);
    }

    public void c(r45.v37 v37Var, int i17) {
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onStatusChanged:  status:" + v37Var.f387858e + " dataFlag:" + i17);
        int i18 = v37Var.f387858e;
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176677a;
        if (i18 != 1) {
            if (i18 == 6) {
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACKED");
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: try use pre-connect");
                g1Var.f176518j = true;
                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
                com.tencent.mm.plugin.voip.model.l1 l1Var = v2protocalVar.M1;
                l1Var.getClass();
                l1Var.G = java.lang.System.currentTimeMillis();
                v2protocalVar.K0 = 1;
                g1Var.J();
                return;
            }
            if (i18 == 8) {
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACK BUSY");
                com.tencent.mm.plugin.voip.model.l1 l1Var2 = g1Var.f176532x.M1;
                l1Var2.f176715b = 211;
                l1Var2.f176713a = 11;
                l1Var2.f176726m = 12;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11519, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 3);
                g1Var.v(1, 211, "", -1);
                g1Var.H();
                return;
            }
            if (i18 == 2) {
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus...MM_VOIP_SYNC_STATUS_REJECT");
                com.tencent.mm.plugin.voip.model.l1 l1Var3 = g1Var.f176532x.M1;
                l1Var3.f176713a = 103;
                l1Var3.f176726m = 4;
                l1Var3.f176733t = (int) (java.lang.System.currentTimeMillis() - g1Var.f176532x.M1.f176725l);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11519, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 1);
                g1Var.H();
                g1Var.v(4, 0, "", -1);
                return;
            }
            if (i18 == 3) {
                g1Var.f176532x.M1.f176726m = 5;
                return;
            }
            if (i18 != 4) {
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onStatusChanged: unknow status:" + v37Var.f387858e);
                return;
            }
            vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus...MM_VOIP_SYNC_STATUS_SHUTDOWN");
            int i19 = g1Var.f176508a;
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = g1Var.f176532x;
            if (i19 < 6) {
                v2protocalVar2.M1.f176727n = 1;
            }
            v2protocalVar2.M1.f176713a = 110;
            g1Var.v(6, 0, "", -1);
            g1Var.H();
            return;
        }
        if (gq4.v.Bi().f176558a.f176433w) {
            g1Var.f176514f = true;
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = g1Var.f176532x;
            if (1 == i17) {
                com.tencent.mm.plugin.voip.model.l1 l1Var4 = v2protocalVar3.M1;
                if (0 == l1Var4.C) {
                    l1Var4.C = java.lang.System.currentTimeMillis();
                    vq4.d0.c("MicroMsg.VoipDailReport", "accept received timestamp:" + l1Var4.C);
                }
            }
            if (3 == i17) {
                com.tencent.mm.plugin.voip.model.l1 l1Var5 = v2protocalVar3.M1;
                if (0 == l1Var5.D) {
                    l1Var5.D = java.lang.System.currentTimeMillis();
                    vq4.d0.c("MicroMsg.VoipDailReport", "sync accept received timestamp:" + l1Var5.D);
                }
            }
            if (4 == i17) {
                v2protocalVar3.M1.e();
                g1Var.y(2);
            }
            g1Var.f176534z.T();
            com.tencent.mm.sdk.platformtools.b4 b4Var = gq4.v.Bi().f176558a.f176435y;
            if (b4Var != null) {
                vq4.d0.c("MicroMsg.Voip.VoipServiceEx", "devincdai: voip reset timecount");
                b4Var.d();
                b4Var.c(60000L, 60000L);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11519, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 2);
        } else {
            if (!g1Var.f176515g || !g1Var.f176518j) {
                return;
            }
            if (4 == i17) {
                g1Var.f176532x.M1.e();
            }
        }
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "zhengxue[DataAccept]onVoipSyncStatus:ACCEPTdata Flag: " + i17);
        g1Var.f176516h = true;
        if (g1Var.f176518j) {
            g1Var.f176518j = false;
            if (g1Var.f176513e) {
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus:ACCEPT, channel already success, pre-connect " + g1Var.f176518j);
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.model.e3(this));
            } else {
                if (g1Var.f176517i) {
                    vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: accept, channel pre-connect already failed");
                    g1Var.v(1, -9000, "", -1);
                    return;
                }
                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus: ACCEPT, pre-connect still connecting...");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipSyncHandle", "isPreConnect is false");
        }
        g1Var.J();
        g1Var.H();
    }
}
