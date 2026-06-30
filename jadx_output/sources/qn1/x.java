package qn1;

/* loaded from: classes12.dex */
public class x implements sn1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn1.c0 f365026a;

    public x(qn1.c0 c0Var) {
        this.f365026a = c0Var;
    }

    @Override // sn1.h
    public void b(boolean z17, int i17, byte[] bArr, int i18) {
        int i19;
        int i27 = qn1.c.i().j().f364961a;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
        objArr[4] = java.lang.Boolean.valueOf(qn1.c0.f364947n);
        objArr[5] = java.lang.Integer.valueOf(i27);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify isLocal[%b], type[%d], seq[%d], buf[%d], isBackupFinish[%b], commandMode:[%d]", objArr);
        qn1.c0 c0Var = this.f365026a;
        if (z17 && bArr != null) {
            if (10011 == i17) {
                qn1.c.i().j().f364968h = false;
                kn1.g e17 = qn1.c.i().e();
                e17.getClass();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                int i28 = e17.f309609a;
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify local disconnect, backupPcState[%d]", java.lang.Integer.valueOf(i28));
                if (i28 != -21) {
                    if (i28 != 1) {
                        if (i28 != 4) {
                            if (i28 != -5) {
                                if (i28 == -4) {
                                    c0Var.d(true);
                                    return;
                                } else if (i28 != 11) {
                                    if (i28 != 12 && i28 != 14) {
                                        if (i28 != 15) {
                                            return;
                                        }
                                        qn1.c.i().h().e();
                                        return;
                                    }
                                }
                            }
                        }
                        if (!qn1.c.i().j().f364972l || qn1.c0.f364947n) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify not support reconnect, disconnect");
                            c0Var.d(true);
                            qn1.c.i().h().e();
                            qn1.c.i().e().f309609a = -4;
                            c0Var.g(-4);
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 9L, 1L, false);
                            c0Var.c(13737, 3);
                            return;
                        }
                        sn1.o0 o0Var = sn1.i.f410021r;
                        i19 = o0Var != null ? o0Var.f410063b : 0;
                        if (i19 != 0) {
                            if (i19 == 1) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify already start reconnect, state[%d]", java.lang.Integer.valueOf(i19));
                                return;
                            } else if (i19 != 2) {
                                return;
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify startBackupReconnectHandler, reconnectState[%d]", java.lang.Integer.valueOf(i19));
                        c0Var.c(13737, 19);
                        c0Var.f364953e = true;
                        sn1.i.U(qn1.c.i().j().f364979s);
                        return;
                    }
                    qn1.c.i().h().e();
                    qn1.c.i().e().f309609a = -100;
                    c0Var.g(-100);
                    return;
                }
                qn1.c.i().h().e();
                return;
            }
            return;
        }
        if (1 == i27 || 3 == i27) {
            if (i17 == 10) {
                wn1.i iVar = new wn1.i();
                try {
                    iVar.parseFrom(bArr);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPcServer", e18, "onBackupPcServerNotify buf to BackupHeartBeatResponse error.", new java.lang.Object[0]);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive heartbeatResp, ack[%d]", java.lang.Long.valueOf(iVar.f447432d));
                return;
            }
            if (i17 == 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive cancelReq");
                c0Var.d(true);
                qn1.c.i().e().f309609a = -100;
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                c0Var.g(-100);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 51L, 1L, false);
                c0Var.c(13737, 5);
                return;
            }
            if (i17 == 18) {
                wn1.f fVar = new wn1.f();
                try {
                    fVar.parseFrom(bArr);
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPcServer", e19, "onBackupPcServerNotify buf to BackupCommandResponse error.", new java.lang.Object[0]);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive commandResp, cmd[%d]", java.lang.Integer.valueOf(fVar.f447417d));
                if (fVar.f447417d == 9) {
                    sn1.o0 o0Var2 = sn1.i.f410021r;
                    i19 = o0Var2 != null ? o0Var2.f410063b : 0;
                    if (i19 != 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify reconnect is started, ignore. state[%d]", java.lang.Integer.valueOf(i19));
                        return;
                    }
                    if (o0Var2 != null) {
                        o0Var2.f410063b = 2;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify reconnect success, start resendSceneMap");
                    c0Var.c(13737, 20);
                    sn1.i.Y();
                    qn1.c.i().e().f309609a = 14;
                    boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    c0Var.g(14);
                    sn1.i.f410014h.postAtFrontOfQueue(new sn1.d(new qn1.w(this)));
                    return;
                }
                return;
            }
            if (i17 == 17) {
                wn1.e eVar = new wn1.e();
                try {
                    eVar.parseFrom(bArr);
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupPcServer", e27, "onBackupPcServerNotify buf to BackupCommandRequest error.", new java.lang.Object[0]);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive commandReq, cmd[%d]", java.lang.Integer.valueOf(eVar.f447415d));
                if (eVar.f447415d == 10) {
                    kn1.g e28 = qn1.c.i().e();
                    e28.getClass();
                    boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    int i29 = e28.f309609a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify pc request disconnect, backupPcState[%d]", java.lang.Integer.valueOf(i29));
                    if (i29 == 12 || i29 == 14) {
                        c0Var.d(true);
                        qn1.c.i().h().e();
                        qn1.c.i().e().f309609a = -4;
                        c0Var.g(-4);
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var.idkeyStat(400L, 51L, 1L, false);
                        c0Var.c(13737, 5);
                        long j17 = c0Var.f364951c.f319812m;
                        long currentTimeMillis = (j17 != 0 ? java.lang.System.currentTimeMillis() - j17 : 0L) / 1000;
                        g0Var.d(13737, 3, java.lang.Long.valueOf(c0Var.f364951c.f319811l / 1024), java.lang.Long.valueOf(currentTimeMillis), 1);
                        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPcServerNotify transfer disconnect, backupDataSize[%d kb], backupCostTime[%d s]", java.lang.Long.valueOf(c0Var.f364951c.f319811l / 1024), java.lang.Long.valueOf(currentTimeMillis));
                    }
                }
            }
        }
    }
}
