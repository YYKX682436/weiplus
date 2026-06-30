package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class v0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.g1 f176809a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.voip.model.g1 g1Var, android.os.Looper looper) {
        super(looper);
        this.f176809a = g1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        java.lang.String str;
        if (message == null || message.what != 59998) {
            return;
        }
        int i17 = message.arg1;
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176809a;
        if (i17 == 1) {
            if (g1Var.f176532x.f176877q == 0) {
                vq4.d0.b("MicroMsg.Voip.VoipContext", "JNI_DOSYNC without roomid , igored!");
                return;
            }
            vq4.d0.c("MicroMsg.Voip.VoipContext", "need dosync for cmd from channel...");
            byte[] bArr = (byte[]) message.obj;
            com.tencent.mm.plugin.voip.model.i3 i3Var = g1Var.B;
            int i18 = message.arg2;
            i3Var.getClass();
            r45.k37 k37Var = new r45.k37();
            k37Var.f378343d = 1;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(bArr);
            k37Var.f378344e = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            try {
                cu5Var2.d(k37Var.toByteArray());
                r45.j27 j27Var = new r45.j27();
                j27Var.f377523d = i18;
                j27Var.f377524e = cu5Var2;
                j27Var.f377525f = c01.z1.r();
                r45.k27 k27Var = new r45.k27();
                k27Var.f378335d = 1;
                k27Var.f378336e.add(j27Var);
                i3Var.a(k27Var, true, 2);
                return;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        if (i17 == 4) {
            if (g1Var.f176532x.f176877q == 0) {
                vq4.d0.b("MicroMsg.Voip.VoipContext", "JNI_STARTDEVFAILED without roomid , igored!");
                return;
            }
            vq4.d0.c("MicroMsg.Voip.VoipContext", "need hangUP for startTalk failed. ");
            g1Var.f176532x.M1.f176713a = 107;
            g1Var.v(1, -9004, "", -1);
            return;
        }
        if (i17 == 6) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "OnChannelConnected from JNI");
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
            if (v2protocalVar.f176877q == 0) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "OnChannelConnected roomid null, ignored");
                return;
            }
            g1Var.f176513e = true;
            v2protocalVar.M1.f176730q = 1;
            boolean z17 = g1Var.f176515g;
            if (!z17 && !g1Var.f176514f) {
                v2protocalVar.L0 = 1;
            }
            if (v2protocalVar.f176879q1 && z17 && !g1Var.f176516h) {
                g1Var.y(1);
            }
            g1Var.f176532x.setInactive();
            vq4.d0.c("MicroMsg.Voip.VoipContext", "Voip.Channel setInactive");
            g1Var.K();
            return;
        }
        if (i17 == 3) {
            g1Var.f176508a = 5;
            return;
        }
        if (i17 == 5) {
            if (message.arg2 == 14) {
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap((byte[]) message.obj);
                wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                int i19 = wrap.getInt();
                if (i19 != 0 && i19 != 1) {
                    if (i19 == 2) {
                        com.tencent.mm.plugin.voip.model.l1 l1Var = g1Var.f176532x.M1;
                        l1Var.f176713a = 113;
                        l1Var.f176732s = 6;
                        g1Var.v(1, -9000, "", -1);
                        return;
                    }
                    return;
                }
                if (g1Var.f176532x.f176877q != 0) {
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "close room req from teg reason " + i19);
                    g1Var.f176532x.M1.f176713a = 114;
                    g1Var.v(6, 0, "", -1);
                    return;
                }
                return;
            }
            vq4.d0.c("MicroMsg.Voip.VoipContext", "need hangUP for disconnect from channel..envent = " + message.arg2);
            if (g1Var.f176508a >= 5) {
                g1Var.f176532x.M1.f176713a = 108;
            } else {
                g1Var.f176532x.M1.f176713a = 106;
            }
            int i27 = message.arg2;
            if (i27 == 5) {
                g1Var.f176532x.M1.f176732s = 1;
                vq4.d0.c("MicroMsg.Voip.VoipContext", "channel broken...");
            } else if (i27 == 8) {
                if (g1Var.f176518j) {
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "channel connect fail while pre-connect");
                    g1Var.f176517i = true;
                    return;
                } else {
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "channel connect fail...");
                    g1Var.f176513e = false;
                    g1Var.f176532x.M1.f176732s = 5;
                }
            } else if (i27 == 2) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "channel closed...");
                com.tencent.mm.plugin.voip.model.l1 l1Var2 = g1Var.f176532x.M1;
                l1Var2.f176713a = 113;
                l1Var2.f176732s = 6;
            }
            java.lang.Object obj = message.obj;
            if (obj != null) {
                try {
                    if (((byte[]) obj)[0] == 1) {
                        g1Var.v(1, -9000, "", 3);
                        return;
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipContext", "parse msg obj failed cause %s", e18.getMessage());
                }
            }
            g1Var.v(1, -9000, "", -1);
            return;
        }
        if (i17 == 100) {
            vq4.d0.h((byte[]) message.obj, "MicroMsg.Voip.VoipContext", message.arg2);
            return;
        }
        if (i17 == 101) {
            vq4.d0.h((byte[]) message.obj, "MicroMsg.v2Core", message.arg2);
            return;
        }
        if (i17 == 7) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "NOTIFY_FROM_JNI_SPEEDTESTRESULT handle");
            byte[] bArr2 = (byte[]) message.obj;
            int i28 = message.arg2;
            java.lang.String str2 = null;
            try {
                str = com.tencent.mm.sdk.platformtools.v0.f193027a.e(false);
            } catch (java.lang.Exception unused) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "Get wifiName failed in voip speedTest!");
                str = null;
            }
            try {
                str2 = ((android.telephony.TelephonyManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone")).getSimOperatorName();
            } catch (java.lang.Exception unused2) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "Get netName failed in voip speedTest!");
            }
            new mq4.w(g1Var.f176523o, g1Var.f176522n, g1Var.f176524p, str2, str, 0.0d, 0.0d, g1Var.f176525q, i28, bArr2).L();
            return;
        }
        if (i17 == 8) {
            g1Var.w((byte[]) message.obj);
            return;
        }
        if (i17 == 9) {
            com.tencent.mm.plugin.voip.model.l1 l1Var3 = g1Var.f176532x.M1;
            if (0 == l1Var3.E) {
                l1Var3.E = java.lang.System.currentTimeMillis();
                vq4.d0.c("MicroMsg.VoipDailReport", "first pkt received timestamp:" + l1Var3.E);
            }
            vq4.d0.c("MicroMsg.Voip.VoipContext", "get first pkt for voip, enable data accept " + g1Var.f176532x.f176876p1);
            if (1 == g1Var.f176532x.f176876p1) {
                r45.v37 v37Var = new r45.v37();
                v37Var.f387858e = 1;
                g1Var.B.c(v37Var, 2);
                return;
            }
            return;
        }
        if (i17 == 11) {
            g1Var.S = 2;
            return;
        }
        if (i17 == 12) {
            g1Var.S = 1;
            return;
        }
        if (i17 == 13) {
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = g1Var.f176532x;
            new mq4.s(v2protocalVar2.f176877q, v2protocalVar2.f176883s, v2protocalVar2.f176880r, 5, 0, null, null).L();
        } else if (i17 == 15) {
            g1Var.j(message.arg2, false);
        } else if (i17 == 16) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.model.u0(this, message.arg2 == 0));
        }
    }
}
