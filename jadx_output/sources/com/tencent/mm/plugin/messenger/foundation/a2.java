package com.tencent.mm.plugin.messenger.foundation;

/* loaded from: classes12.dex */
public class a2 implements vg3.w4 {
    static {
        new java.util.LinkedList();
    }

    public static com.tencent.mm.modelbase.q0 b(com.tencent.mm.modelbase.p0 p0Var, r45.cx4 cx4Var, vg3.z4 z4Var) {
        vg3.f5 f5Var;
        int i17;
        com.tencent.mm.modelbase.q0 q0Var;
        boolean z17;
        r45.j4 j4Var = p0Var.f70726a;
        if (10008 == x51.o1.f452064q && x51.o1.f452065r != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MessageSyncExtension", "dkmsgid  set svrmsgid %d -> %d", java.lang.Long.valueOf(j4Var.f377568r), java.lang.Integer.valueOf(x51.o1.f452065r));
            j4Var.f377568r = java.lang.Long.valueOf(x51.o1.f452065r).longValue();
            x51.o1.f452065r = 0;
        }
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().X9(j4Var.f377568r)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MessageSyncExtension", "ignore, because reSync the deleted msg perhaps the IDC has change has swtiched");
            return null;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f377558e);
        java.lang.String g18 = x51.j1.g(j4Var.f377559f);
        if (g17.equals(c01.z1.r()) && g18.equals("newsapp") && j4Var.f377560g != 51) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MessageSyncExtension", "msgid:%d type:%d this msg from mac weixin ,someone send msg to newsapp at mac weixin ,givp up.", java.lang.Long.valueOf(j4Var.f377568r), java.lang.Integer.valueOf(j4Var.f377560g));
            return null;
        }
        long c17 = c01.id.c();
        long j17 = ((int) (c17 / 1000)) - j4Var.f377565o;
        java.lang.Object[] objArr = new java.lang.Object[16];
        objArr[0] = g17;
        objArr[1] = g18;
        objArr[2] = java.lang.Long.valueOf(j4Var.f377568r);
        objArr[3] = java.lang.Integer.valueOf(j4Var.f377557d);
        objArr[4] = java.lang.Integer.valueOf(j4Var.f377569s);
        objArr[5] = java.lang.Integer.valueOf(j4Var.f377562i);
        objArr[6] = java.lang.Integer.valueOf(j4Var.f377560g);
        objArr[7] = java.lang.Integer.valueOf(j4Var.f377565o);
        objArr[8] = com.tencent.mm.sdk.platformtools.t8.v(j4Var.f377565o);
        objArr[9] = java.lang.Long.valueOf(j17);
        objArr[10] = java.lang.Integer.valueOf(j4Var.f377563m);
        objArr[11] = java.lang.Integer.valueOf(x51.j1.e(j4Var.f377564n, new byte[0]).length);
        java.lang.String str = j4Var.f377566p;
        if (str == null) {
            str = "";
        }
        objArr[12] = java.lang.Integer.valueOf(str.length());
        java.lang.String str2 = j4Var.f377567q;
        if (str2 == null) {
            str2 = "";
        }
        objArr[13] = java.lang.Integer.valueOf(str2.length());
        r45.du5 du5Var = j4Var.f377561h;
        objArr[14] = com.tencent.mm.sdk.platformtools.t8.G1(du5Var != null ? du5Var.f372756d : "");
        objArr[15] = java.lang.Long.valueOf(j4Var.f377570t);
        com.tencent.mars.xlog.Log.i("MicroMsg.MessageSyncExtension", "dkAddMsg from:%s to:%s id:[%d,%d,%d] status:%d type:%d time:[%d %s] diff:%d imgstatus:%d imgbuf:%d src:%d push:%d content:%s flag:%s", objArr);
        android.util.SparseArray sparseArray = vg3.b5.f436649a;
        synchronized (sparseArray) {
            f5Var = (vg3.f5) sparseArray.get(5);
        }
        if (f5Var != null) {
            f5Var.E0(j4Var);
        }
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(vg3.t4.class)).all()).iterator();
        while (it.hasNext()) {
            fs.q qVar = (fs.q) it.next();
            if (qVar.hasKey(5) && fs.g.d(fs.g.f266086c, qVar)) {
                ((vg3.t4) ((fs.n) qVar.get())).E0(j4Var);
            }
        }
        if (g17.equals("readerapp")) {
            j4Var.f377558e = x51.j1.i("newsapp");
            j4Var.f377560g = 12399999;
        }
        if ((g17.equals("blogapp") || g17.equals("newsapp")) && j4Var.f377560g != 10002) {
            j4Var.f377560g = 12399999;
        }
        if (j4Var.f377560g == 52) {
            j4Var.f377560g = 1000052;
        }
        if (j4Var.f377560g == 53) {
            j4Var.f377560g = 1000053;
        }
        java.util.Map map = c01.w9.f37539b;
        r45.j4 j4Var2 = p0Var.f70726a;
        if (j4Var2 != null) {
            com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(x51.j1.g(j4Var2.f377558e), j4Var2.f377568r);
            if (o27 != null && o27.getMsgId() != 0 && (o27.A0() == 0 || j4Var2.f377569s != 0)) {
                int w07 = o27.w0();
                int i18 = p0Var.f70727b ? w07 | 2 : w07 & (-3);
                int i19 = p0Var.f70728c ? i18 | 1 : i18 & (-2);
                int i27 = p0Var.f70729d ? i19 | 4 : i19 & (-5);
                if (i27 != o27.w0()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr updateMsgFlagByAddMsgInfo msgType[%d], flag new[%d], old[%d]", java.lang.Integer.valueOf(j4Var2.f377560g), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(o27.w0()));
                    o27.f1(i27);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(o27.I0(), o27);
                }
            }
        }
        com.tencent.mm.modelbase.t0 a17 = com.tencent.mm.modelbase.s0.a(java.lang.Integer.valueOf(j4Var.f377560g));
        if (a17 == null) {
            a17 = com.tencent.mm.modelbase.s0.a(g17);
        }
        if (a17 != null) {
            mm.w.e("MessageExtension");
            com.tencent.mm.modelbase.q0 b17 = a17.b1(p0Var);
            com.tencent.mm.storage.f9 f9Var = b17 == null ? null : b17.f70743a;
            if (f9Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MessageSyncExtension", "summerbadcr extension declared but skipped msg, type=%d, svrId=%d, MsgSeq=%d, createTime=%d, addMsgInfo=%s", java.lang.Integer.valueOf(j4Var.f377560g), java.lang.Long.valueOf(j4Var.f377568r), java.lang.Integer.valueOf(j4Var.f377569s), java.lang.Integer.valueOf(j4Var.f377565o), p0Var);
                java.lang.String str3 = a17.getClass().getSimpleName() + "-" + j4Var.f377560g;
                mm.w.d("MicroMsg.NotifyPowerInspector", "noteAddMsgEmpty: type=" + str3);
                if (com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
                    mm.w.f("MsgNull");
                    mm.y yVar = mm.w.f328556o;
                    if (yVar.b() || !mm.w.f328543b) {
                        yVar.c(str3);
                    }
                }
                q0Var = b17;
            } else {
                java.lang.String str4 = f9Var.G;
                if (f9Var.getCreateTime() != j4Var.f377565o * 1000) {
                    if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigAddMsgUseXmlObj()) != 0) {
                        p15.e eVar = new p15.e();
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                            eVar.B(java.lang.String.valueOf(j4Var.f377565o));
                        } else {
                            eVar.fromXml(str4);
                            eVar.B(java.lang.String.valueOf(j4Var.f377565o));
                        }
                        str4 = eVar.toXml();
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                        str4 = "<msgsource><realcreatetime>" + j4Var.f377565o + "</realcreatetime></msgsource>";
                    } else {
                        str4 = str4.replace("</msgsource>", "<realcreatetime>" + j4Var.f377565o + "</realcreatetime></msgsource>");
                    }
                }
                f9Var.u3(str4);
                mm.h hVar = mm.h.f328485a;
                if (com.tencent.mm.storage.z3.Y3(g17) && !u11.c.i()) {
                    mm.w.f("MsgPost");
                } else {
                    java.util.Objects.toString(z4Var);
                    if (f9Var.getMsgId() <= 0) {
                        mm.w.f("MsgNoId");
                    } else if (z4Var == null) {
                        mm.w.f("MsgNullNotifier");
                    } else if (!b17.f70744b || c01.g.a(j4Var)) {
                        mm.w.f("MsgTotNotify");
                    } else {
                        z4Var.b(f9Var, j4Var);
                        mm.w.e("newMsg");
                        if (f9Var.b3() && cx4Var.f371898d > 0 && com.tencent.mm.app.w.INSTANCE.f53889n) {
                            a25.q qVar2 = (a25.q) i95.n0.c(a25.q.class);
                            long j18 = j4Var.f377568r;
                            long j19 = j4Var.f377565o;
                            long j27 = cx4Var.f371899e;
                            long j28 = cx4Var.f371898d;
                            ((aq1.q0) qVar2).getClass();
                            com.tencent.mm.feature.performance.r4 r4Var = (com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class));
                            r4Var.getClass();
                            long j29 = j19 * 1000;
                            long a18 = c01.id.a();
                            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            long j37 = currentTimeMillis - a18;
                            if (java.lang.Math.abs(j37) <= 60000) {
                                if (1 <= j29 && j29 < a18) {
                                    ((ku5.t0) ku5.t0.f312615d).A("longMsgNotifyDispatch");
                                    ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.feature.performance.q3(j18, a18, j29, currentTimeMillis, j27, r4Var, "longMsgNotifyDispatch", j37, j28), 5000L, "longMsgNotifyDispatch");
                                }
                            }
                        }
                    }
                }
                q0Var = b17;
            }
            z17 = true;
            i17 = 5;
        } else {
            i17 = 5;
            q0Var = null;
            z17 = false;
        }
        vg3.b5.b(i17, j4Var);
        if (q0Var != null) {
            q0Var.f70745c = j17;
            q0Var.f70746d = c17;
            q0Var.f70747e = c01.id.c();
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.f("MicroMsg.MessageSyncExtension", "unknown add msg request, type=%d. drop now !!!", java.lang.Integer.valueOf(j4Var.f377560g));
        }
        return q0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5 A[LOOP:1: B:21:0x00e5->B:23:0x00eb, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01be  */
    @Override // vg3.w4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r18, r45.b50 r19, int r20, byte[] r21, boolean r22, r45.cx4 r23, vg3.z4 r24) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.messenger.foundation.a2.a(java.lang.Object, r45.b50, int, byte[], boolean, r45.cx4, vg3.z4):void");
    }

    public final void c(r45.j4 j4Var, java.lang.Object obj, int i17, r45.cx4 cx4Var, vg3.z4 z4Var) {
        com.tencent.mm.storage.f9 f9Var;
        if (j4Var == null) {
            return;
        }
        com.tencent.mm.modelbase.p0 p0Var = new com.tencent.mm.modelbase.p0(j4Var, false, false, false);
        com.tencent.mm.modelbase.q0 b17 = b(p0Var, cx4Var, z4Var);
        if (b17 != null && (f9Var = b17.f70743a) != null && f9Var.getMsgId() < 0) {
            com.tencent.mm.autogen.mmdata.rpt.CmdProcFailedStruct cmdProcFailedStruct = new com.tencent.mm.autogen.mmdata.rpt.CmdProcFailedStruct();
            cmdProcFailedStruct.f55702e = f9Var.I0();
            cmdProcFailedStruct.f55701d = f9Var.getType();
            cmdProcFailedStruct.f55704g = 1000 - f9Var.getMsgId();
            cmdProcFailedStruct.f55703f = cmdProcFailedStruct.b(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN, "processAddMsg insert db error", true);
            cmdProcFailedStruct.k();
        }
        if (p0Var.f70727b) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.messenger.foundation.z1(this, b17, obj, i17, j4Var));
    }
}
