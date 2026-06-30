package mq4;

/* loaded from: classes14.dex */
public class b0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.c0 f330784d;

    public b0(mq4.c0 c0Var) {
        this.f330784d = c0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.voip.model.g1 g1Var;
        r45.k37 k37Var;
        int i19;
        boolean z17;
        r45.d37 d37Var;
        vq4.d0.c("MicroMsg.NetSceneVoipSync", "onSceneEnd type:" + m1Var.getType() + " errType:" + i17 + " errCode:" + i18);
        mq4.c0 c0Var = this.f330784d;
        com.tencent.mm.plugin.voip.model.l1 l1Var = c0Var.f330796g.f176532x.M1;
        l1Var.getClass();
        l1Var.g((long) ((int) (java.lang.System.currentTimeMillis() - l1Var.O)));
        com.tencent.mm.plugin.voip.model.g1 g1Var2 = c0Var.f330796g;
        if (i17 != 0) {
            vq4.d0.b("MicroMsg.NetSceneVoipSync", "VoipSync Failed, type:" + m1Var.getType() + " errType:" + i17 + " errCode:" + i18);
            if (i17 == 4) {
                try {
                    r45.x37 x37Var = (r45.x37) c0Var.K();
                    if (x37Var.f389758d != g1Var2.f176532x.f176877q) {
                        vq4.d0.b("MicroMsg.NetSceneVoipSync", "syncOnSceneEnd: recv roomId %d " + x37Var.f389758d + " != current roomid %d " + g1Var2.f176532x.f176877q);
                        return;
                    }
                } catch (java.lang.Exception unused) {
                }
                com.tencent.mm.plugin.voip.model.l1 l1Var2 = g1Var2.f176532x.M1;
                l1Var2.f176732s = 3;
                l1Var2.f176713a = 11;
                l1Var2.f176716c = i18;
                l1Var2.f176715b = i18;
                if (i17 == 1) {
                    l1Var2.f176726m = 8;
                } else {
                    l1Var2.f176726m = 99;
                }
                g1Var2.v(1, -9004, "", 3);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.voip.model.i3 i3Var = g1Var2.B;
        i3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipSyncHandle", "____VoipSyncResp");
        com.tencent.mm.plugin.voip.model.g1 g1Var3 = i3Var.f176677a;
        g1Var3.F = false;
        mq4.c0 c0Var2 = (mq4.c0) m1Var;
        r45.x37 x37Var2 = (r45.x37) c0Var2.K();
        byte[] bArr = g1Var3.C;
        if (bArr == null) {
            return;
        }
        int length = bArr.length;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var3.f176532x;
        v2protocalVar.parseSyncKeyBuff(bArr, length);
        int i27 = v2protocalVar.field_statusSyncKey;
        int i28 = v2protocalVar.field_relayDataSyncKey;
        int i29 = v2protocalVar.field_connectingStatusKey;
        v2protocalVar.parseSyncKeyBuff(x37Var2.f389759e.f371841f.g(), x37Var2.f389759e.f371839d);
        int i37 = v2protocalVar.field_statusSyncKey;
        int i38 = v2protocalVar.field_relayDataSyncKey;
        int i39 = v2protocalVar.field_connectingStatusKey;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipSyncHandle", "VoipSyncResp: oldStatusSyncKey:" + i27 + " oldRelayDataSyncKey:" + i28 + " oldConnectingStatusSyncKey:" + i29);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipSyncHandle", "VoipSyncResp: newStatusSyncKey:" + i37 + " newRelayDataSyncKey:" + i38 + " newConnectingStatusSyncKey:" + i39);
        g1Var3.C = x37Var2.f389759e.f371841f.g();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("voipSync response: continueflag=");
        sb6.append(x37Var2.f389761g);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipSyncHandle", sb6.toString());
        java.util.LinkedList linkedList = x37Var2.f389760f.f378336e;
        if (linkedList != null && linkedList.size() != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipSyncHandle", " syncOnSceneEnd cmdlist size" + linkedList.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipSyncHandle", " syncOnSceneEnd cmdlist size:" + linkedList.size() + ",selector = " + ((r45.w37) c0Var2.f330793d.f70710a.f70684a).f388866i);
            int i47 = 0;
            while (i47 < linkedList.size()) {
                r45.j27 j27Var = (r45.j27) linkedList.get(i47);
                int i48 = j27Var.f377523d;
                java.util.LinkedList linkedList2 = linkedList;
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipSyncHandle", "__parse sync resp, item cmdid:" + i48);
                if (i48 == 1) {
                    if (i37 > i27) {
                        if (v2protocalVar.f176877q == 0) {
                            vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "voipSyncStatus ignored , roomid = 0");
                        } else {
                            try {
                                r45.v37 v37Var = (r45.v37) new r45.v37().parseFrom(j27Var.f377524e.f371841f.g());
                                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncStatus in...from user=" + j27Var.f377525f + ",itemStatus =  " + v37Var.f387858e);
                                i3Var.c(v37Var, 3);
                                g1Var = g1Var3;
                            } catch (java.io.IOException e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e17, "", new java.lang.Object[0]);
                            }
                            i47++;
                            linkedList = linkedList2;
                            g1Var3 = g1Var;
                        }
                    }
                    g1Var = g1Var3;
                    i47++;
                    linkedList = linkedList2;
                    g1Var3 = g1Var;
                } else if (i48 == 2) {
                    if (i38 > i28) {
                        if (v2protocalVar.f176877q == 0) {
                            vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "RelayData ignored , roomid = 0");
                        } else {
                            try {
                                k37Var = (r45.k37) new r45.k37().parseFrom(j27Var.f377524e.f371841f.g());
                                vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "onVoipSyncRelayData ...relayType = " + k37Var.f378343d + ",from user = " + j27Var.f377525f);
                                i19 = k37Var.f378343d;
                            } catch (java.io.IOException e18) {
                                g1Var = g1Var3;
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e18, "", new java.lang.Object[0]);
                            }
                            if (i19 == 5) {
                                gm0.j1.e().j(new com.tencent.mm.plugin.voip.model.h3(i3Var, k37Var));
                            } else {
                                r45.e37 e37Var = i3Var.f176678b;
                                if (i19 == 3) {
                                    g1Var3.M(k37Var.f378344e.f371841f.g());
                                    r45.cu5 cu5Var = k37Var.f378344e;
                                    if (cu5Var != null && cu5Var.f371841f != null) {
                                        e37Var.f372974e = k37Var;
                                    }
                                } else if (i19 == 2) {
                                    g1Var3.N(k37Var.f378344e.f371841f.g());
                                    r45.cu5 cu5Var2 = k37Var.f378344e;
                                    if (cu5Var2 != null && cu5Var2.f371841f != null) {
                                        e37Var.f372973d = k37Var;
                                    }
                                } else if (i19 == 1) {
                                    g1Var3.f176532x.f176895w = k37Var.f378344e.f371841f.g();
                                    g1Var3.o();
                                } else if (i19 == 6) {
                                    try {
                                        d37Var = (r45.d37) new r45.d37().parseFrom(k37Var.f378344e.f371841f.g());
                                        z17 = false;
                                    } catch (java.io.IOException e19) {
                                        z17 = false;
                                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e19, "", new java.lang.Object[0]);
                                        d37Var = null;
                                    }
                                    if (d37Var != null) {
                                        com.tencent.mm.plugin.voip.model.i3 i3Var2 = g1Var3.B;
                                        i3Var2.getClass();
                                        g1Var = g1Var3;
                                        gm0.j1.e().j(new com.tencent.mm.plugin.voip.model.g3(i3Var2, d37Var, z17));
                                        i47++;
                                        linkedList = linkedList2;
                                        g1Var3 = g1Var;
                                    }
                                }
                            }
                        }
                    }
                    g1Var = g1Var3;
                    i47++;
                    linkedList = linkedList2;
                    g1Var3 = g1Var;
                } else {
                    g1Var = g1Var3;
                    if (i48 == 3 && i39 > i29) {
                        if (v2protocalVar.f176877q == 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipSyncHandle", "voipSync(ClientStatus) ignored , roomid = 0");
                        } else {
                            try {
                                r45.cu5 cu5Var3 = new r45.cu5();
                                cu5Var3.b(j27Var.f377524e.f371841f.g());
                                if (j27Var.f377525f.equals(c01.z1.r())) {
                                    vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "svr response: local connecting status changed.");
                                } else {
                                    i3Var.b(cu5Var3);
                                }
                            } catch (java.io.IOException e27) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e27, "", new java.lang.Object[0]);
                            }
                        }
                    }
                    i47++;
                    linkedList = linkedList2;
                    g1Var3 = g1Var;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipSyncHandle", "__parse sync resp end");
        r45.k27 k27Var = i3Var.f176679c;
        if ((k27Var == null || k27Var.f378335d <= 0) && i3Var.f176680d <= 0) {
            return;
        }
        i3Var.a(null, false, 7);
    }
}
