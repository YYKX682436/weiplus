package com.tencent.mm.plugin.ipcall.model;

/* loaded from: classes14.dex */
public class p implements k83.a, k83.e {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.model.o f142489i;

    /* renamed from: u, reason: collision with root package name */
    public k83.g f142498u;

    /* renamed from: d, reason: collision with root package name */
    public int f142484d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f142485e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f142486f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f142487g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f142488h = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f142499v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f142500w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f142501x = false;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f142502y = new com.tencent.mm.plugin.ipcall.model.n(this);

    /* renamed from: m, reason: collision with root package name */
    public final r83.d f142490m = new r83.d();

    /* renamed from: n, reason: collision with root package name */
    public final r83.i f142491n = new r83.i();

    /* renamed from: o, reason: collision with root package name */
    public final r83.a f142492o = new r83.a();

    /* renamed from: p, reason: collision with root package name */
    public final r83.h f142493p = new r83.h();

    /* renamed from: q, reason: collision with root package name */
    public final r83.c f142494q = new r83.c();

    /* renamed from: r, reason: collision with root package name */
    public final r83.e f142495r = new r83.e();

    /* renamed from: s, reason: collision with root package name */
    public final r83.g f142496s = new r83.g();

    /* renamed from: t, reason: collision with root package name */
    public final r83.f f142497t = new r83.f();

    @Override // k83.a
    public void a(int i17, java.lang.Object obj, int i18, int i19) {
        if (i(i17, obj, i18, i19)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "onServiceFailed different room ignore");
            return;
        }
        if (i17 == 1) {
            f(false);
            return;
        }
        if (i17 == 6) {
            h(false);
            return;
        }
        if (i17 == 8) {
            g(false);
        } else if (i17 == 3) {
            d(false, i19);
        } else {
            if (i17 != 4) {
                return;
            }
            l(false, i19);
        }
    }

    @Override // k83.a
    public void b(int i17, java.lang.Object obj, int i18, int i19) {
        if (i(i17, obj, i18, i19)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "onServiceResult different room ignore");
            return;
        }
        if (i17 == 1) {
            f(true);
            return;
        }
        if (i17 == 6) {
            h(true);
            return;
        }
        if (i17 == 8) {
            g(true);
        } else if (i17 == 3) {
            d(true, i19);
        } else {
            if (i17 != 4) {
                return;
            }
            l(true, i19);
        }
    }

    public void c() {
        if (this.f142498u.M) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrLogic", "cancelIPCall, already accept");
        }
        this.f142487g = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "cancelIPCall, roomId: %d, inviteId: %d", java.lang.Integer.valueOf(this.f142498u.f304898a), java.lang.Integer.valueOf(this.f142498u.f304901d));
        this.f142494q.p();
        this.f142491n.p();
        this.f142492o.j(this.f142498u);
        this.f142496s.j(this.f142498u);
    }

    public final void d(boolean z17, int i17) {
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleCancel, success: %b", java.lang.Boolean.valueOf(z17));
        if (z17 || i17 >= 0 || (i18 = this.f142486f) >= 1) {
            return;
        }
        int i19 = i18 + 1;
        this.f142486f = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "cancel failed, retry count: %d", java.lang.Integer.valueOf(i19));
        this.f142492o.j(this.f142498u);
    }

    public final void e(boolean z17) {
        com.tencent.mm.plugin.ipcall.model.o oVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleHeartbeat, success: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f142484d = 0;
            return;
        }
        int i17 = this.f142484d + 1;
        this.f142484d = i17;
        if (i17 >= 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrLogic", "heartbeat failed twice!");
            this.f142494q.p();
            if (!com.tencent.mm.plugin.ipcall.model.r.bj().c() || (oVar = this.f142489i) == null) {
                return;
            }
            com.tencent.mm.plugin.ipcall.j jVar = (com.tencent.mm.plugin.ipcall.j) oVar;
            jVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onHeartbeatFailed");
            if (jVar.j(7, 29)) {
                jVar.i(7, null, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.apy), 1);
            }
        }
    }

    public final void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleInvite, success: %b, isLaunchCancel: %b, isLaunchShutdown: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f142487g), java.lang.Boolean.valueOf(this.f142488h));
        if (this.f142487g || this.f142488h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleInvite, ignore this");
            return;
        }
        boolean z18 = false;
        if (!z17) {
            com.tencent.mm.plugin.ipcall.model.o oVar = this.f142489i;
            if (oVar != null) {
                k83.g gVar = this.f142498u;
                if (gVar.f304913p) {
                    ((com.tencent.mm.plugin.ipcall.j) oVar).e(gVar.f304904g, gVar.f304907j, gVar.f304905h, gVar.f304906i);
                    return;
                }
                if (gVar.f304914q) {
                    int i17 = gVar.f304904g;
                    java.lang.String str = gVar.f304907j;
                    java.lang.String str2 = gVar.f304905h;
                    int i18 = gVar.f304906i;
                    com.tencent.mm.plugin.ipcall.j jVar = (com.tencent.mm.plugin.ipcall.j) oVar;
                    jVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onCallRestricted, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
                    if (jVar.j(10, 0)) {
                        jVar.i(10, str, str2, i18);
                        return;
                    }
                    return;
                }
                if (gVar.f304915r) {
                    ((com.tencent.mm.plugin.ipcall.j) oVar).f(gVar.f304904g, gVar.f304907j, gVar.f304905h, gVar.f304906i);
                    return;
                }
                if (!gVar.f304916s) {
                    ((com.tencent.mm.plugin.ipcall.j) oVar).h(gVar.f304904g, gVar.f304907j, gVar.f304905h, gVar.f304906i, gVar.f304912o);
                    return;
                }
                int i19 = gVar.f304904g;
                java.lang.String str3 = gVar.f304907j;
                java.lang.String str4 = gVar.f304905h;
                int i27 = gVar.f304906i;
                com.tencent.mm.plugin.ipcall.j jVar2 = (com.tencent.mm.plugin.ipcall.j) oVar;
                jVar2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onInviteFailed, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
                if (jVar2.j(2, 0)) {
                    jVar2.i(2, str3, str4, i27);
                    return;
                }
                return;
            }
            return;
        }
        com.tencent.mm.plugin.ipcall.model.o oVar2 = this.f142489i;
        if (oVar2 != null) {
            k83.g gVar2 = this.f142498u;
            if (gVar2.f304916s) {
                com.tencent.mm.plugin.ipcall.j jVar3 = (com.tencent.mm.plugin.ipcall.j) oVar2;
                jVar3.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onInviteSuccess");
                if (com.tencent.mm.plugin.ipcall.model.r.bj().f(3)) {
                    m83.d Zi = com.tencent.mm.plugin.ipcall.model.r.Zi();
                    if (Zi.f324740r == 0) {
                        Zi.f324740r = java.lang.System.currentTimeMillis();
                    }
                    k83.g gVar3 = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u;
                    m83.d Zi2 = com.tencent.mm.plugin.ipcall.model.r.Zi();
                    int i28 = gVar3.f304901d;
                    java.lang.String str5 = gVar3.I;
                    java.lang.String str6 = gVar3.f304897J;
                    int i29 = gVar3.f304898a;
                    long j17 = gVar3.f304899b;
                    long j18 = gVar3.f304900c;
                    Zi2.f324733k = i28;
                    Zi2.f324739q = str5;
                    Zi2.f324737o = str6;
                    Zi2.f324734l = i29;
                    Zi2.f324735m = j17;
                    Zi2.f324736n = j18;
                    com.tencent.mm.plugin.ipcall.l lVar = jVar3.f142444d;
                    if (lVar != null) {
                        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = (com.tencent.mm.plugin.ipcall.ui.l6) lVar;
                        com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "onInviteSuccess");
                        java.lang.String str7 = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.f304897J;
                        java.lang.String str8 = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.K;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str7) && !com.tencent.mm.sdk.platformtools.t8.K0(str8) && !str7.equals(str8)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "toPhoneNumber:%s,serverRetPhoneNumber:%s", str7, str8);
                            l6Var.h(str8);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "callFlag:" + com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.f304917t);
                        int i37 = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.f304917t;
                        if ((i37 & 1) > 0 && (i37 & 2) > 0 && (i37 & 8) <= 0) {
                            z18 = true;
                        }
                        if (z18) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "isNotFree");
                            db5.e1.k(l6Var.f142924w, com.tencent.mm.R.string.f492348g54, com.tencent.mm.R.string.f492349g55, com.tencent.mm.R.string.f492347g53, com.tencent.mm.R.string.f492346g52, true, null, new com.tencent.mm.plugin.ipcall.ui.z5(l6Var));
                        }
                        l6Var.g(3);
                    }
                }
            } else {
                ((com.tencent.mm.plugin.ipcall.j) oVar2).h(gVar2.f304904g, gVar2.f304907j, gVar2.f304905h, gVar2.f304906i, gVar2.f304912o);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "start sync");
        this.f142491n.j(this.f142498u);
    }

    public final void g(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleNotify, success: %b", java.lang.Boolean.valueOf(z17));
        if (z17 && com.tencent.mm.plugin.ipcall.model.r.Ni().f324720d) {
            com.tencent.mm.plugin.ipcall.model.r.Ni().b(this.f142498u.f304922y);
        }
        k83.g gVar = this.f142498u;
        if (gVar == null || !z17) {
            return;
        }
        int a17 = gVar.a();
        if (a17 == 2 || a17 == 1) {
            if (this.f142501x) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "current status has jni accepted, ignore notify accept");
                return;
            } else {
                k83.g gVar2 = this.f142498u;
                c01.d9.e().g(new p83.o(gVar2.f304898a, gVar2.f304899b, gVar2.b(), this.f142498u.f304900c, false));
            }
        }
        k(this.f142498u.a());
    }

    public final void h(boolean z17) {
        byte[] bArr;
        int AddNewRelayConns;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.util.LinkedList linkedList4;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleRedirect, isSuccess: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            m83.c Ni = com.tencent.mm.plugin.ipcall.model.r.Ni();
            k83.g gVar = this.f142498u;
            Ni.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallEngineManager", "redirectSvrAddr");
            if (gVar != null && (linkedList4 = gVar.B) != null && linkedList4.size() > 0) {
                t83.f.g(gVar.B);
            }
            if (gVar != null && (linkedList3 = gVar.C) != null && linkedList3.size() > 0) {
                t83.f.g(gVar.C);
            }
            r45.do5 do5Var = new r45.do5();
            r45.co5 co5Var = new r45.co5();
            co5Var.f371724d = 0;
            co5Var.f371725e = "";
            co5Var.f371726f = "";
            co5Var.f371727g = 4;
            co5Var.f371728h = 4;
            co5Var.f371729i = 2;
            co5Var.f371730m = new r45.c27();
            co5Var.f371731n = new r45.c27();
            if (gVar != null && (linkedList2 = gVar.B) != null && linkedList2.size() > 0) {
                co5Var.f371730m = t83.f.g(gVar.B);
            }
            if (gVar != null && (linkedList = gVar.C) != null && linkedList.size() > 0) {
                co5Var.f371731n = t83.f.g(gVar.C);
            }
            do5Var.f372625e.add(co5Var);
            do5Var.f372624d = 1;
            try {
                bArr = do5Var.toByteArray();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallEngineManager", "conn info to byte array fail..");
                bArr = null;
            }
            if (bArr == null || (AddNewRelayConns = Ni.f324717a.AddNewRelayConns(bArr, bArr.length, 1, false)) == 0) {
                return;
            }
            vq4.d0.b("MicroMsg.IPCallEngineManager", "redirect relay conns fail ret:" + AddNewRelayConns);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean i(int i17, java.lang.Object obj, int i18, int i19) {
        k83.g gVar = this.f142498u;
        if (gVar == null || obj == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrLogic", "callInfo = null or result = null");
            return true;
        }
        switch (i17) {
            case 1:
                if (!(obj instanceof p83.i)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited result error");
                    return true;
                }
                p83.i iVar = (p83.i) obj;
                r45.ne5 ne5Var = iVar.f352755f;
                int i27 = gVar.f304901d;
                r45.me5 me5Var = iVar.f352754e;
                if (i27 != me5Var.f380421h) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited finished but invite id not the same, now room inviteId:%d, before room inviteId:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(me5Var.f380421h));
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited finished invite id:%d", java.lang.Integer.valueOf(i27));
                m83.d Zi = com.tencent.mm.plugin.ipcall.model.r.Zi();
                k83.g gVar2 = this.f142498u;
                if (Zi.f324733k == gVar2.f304901d) {
                    Zi.f324738p = i19;
                }
                if (i18 != 0 || i19 != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invite failed");
                    if (ne5Var.BaseResponse != null) {
                        if (i19 == 433) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo account overdue");
                            this.f142498u.f304913p = true;
                        } else if (i19 == 434) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo restrict call");
                            this.f142498u.f304914q = true;
                        } else if (i19 == 435) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo phonenumber invalid");
                            this.f142498u.f304915r = true;
                        }
                        int i28 = ne5Var.f381322q;
                        if (i28 > 0) {
                            k83.g gVar3 = this.f142498u;
                            gVar3.f304916s = false;
                            gVar3.f304912o = i28;
                        } else {
                            k83.g gVar4 = this.f142498u;
                            gVar4.f304916s = true;
                            gVar4.f304912o = 0;
                        }
                        k83.g gVar5 = this.f142498u;
                        gVar5.f304907j = ne5Var.f381324s;
                        gVar5.f304906i = ne5Var.f381323r;
                        gVar5.f304904g = i19;
                        if (ne5Var.getBaseResponse() != null) {
                            k83.g gVar6 = this.f142498u;
                            java.lang.String g17 = x51.j1.g(ne5Var.BaseResponse.f376960e);
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            gVar6.f304905h = g17 != null ? g17 : "";
                            java.lang.String str = this.f142498u.f304905h;
                        }
                    } else {
                        k83.g gVar7 = this.f142498u;
                        gVar7.f304907j = "";
                        gVar7.f304906i = 2;
                        gVar7.f304905h = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490773aq1);
                        this.f142498u.f304904g = i19;
                    }
                } else if (gVar2 != null) {
                    gVar2.f304898a = ne5Var.f381312d;
                    gVar2.f304899b = ne5Var.f381313e;
                    gVar2.f304900c = ne5Var.f381319n;
                    gVar2.f304908k = ne5Var.f381314f;
                    gVar2.f304911n = ne5Var.f381316h * 1000;
                    gVar2.f304918u = ne5Var.f381317i;
                    gVar2.f304919v = ne5Var.f381318m;
                    gVar2.B = ne5Var.f381315g;
                    gVar2.C = ne5Var.f381326u;
                    gVar2.K = ne5Var.f381328w;
                    int i29 = ne5Var.f381327v;
                    if (i29 > 0) {
                        gVar2.D = i29;
                    }
                    gVar2.f304920w = ne5Var.f381320o;
                    gVar2.f304921x = ne5Var.f381321p;
                    gVar2.f304917t = ne5Var.f381330y;
                    int i37 = ne5Var.f381325t;
                    if (i37 > 0) {
                        gVar2.f304923z = i37 - 1;
                        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo zhengxue[ENCRYPT] got encryptStrategy[" + this.f142498u.f304923z + "] from Invite resp");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo zhengxue[ENCRYPT] got no encryptStrategy from Invite resp");
                        this.f142498u.f304923z = 2;
                    }
                    this.f142498u.A = ne5Var.f381329x;
                    int i38 = ne5Var.f381322q;
                    if (i38 > 0) {
                        k83.g gVar8 = this.f142498u;
                        gVar8.f304916s = false;
                        gVar8.f304912o = i38;
                    } else {
                        k83.g gVar9 = this.f142498u;
                        gVar9.f304916s = true;
                        gVar9.f304912o = 0;
                    }
                    k83.g gVar10 = this.f142498u;
                    gVar10.f304907j = ne5Var.f381324s;
                    gVar10.f304906i = ne5Var.f381323r;
                    gVar10.f304904g = i19;
                    java.lang.String g18 = x51.j1.g(ne5Var.BaseResponse.f376960e);
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    gVar10.f304905h = g18 != null ? g18 : "";
                }
                return false;
            case 2:
                if (!(obj instanceof p83.o)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync result error");
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync finished errType:%d,errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                p83.o oVar = (p83.o) obj;
                r45.we5 we5Var = oVar.f352773f;
                int i39 = this.f142498u.f304898a;
                r45.ve5 ve5Var = oVar.f352772e;
                if (i39 != ve5Var.f388167e) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync finished but room id not the same, now room roomId:%d, before room roomId:%d", java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(ve5Var.f388167e));
                    return true;
                }
                if (i18 == 0 && i19 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync roomId: %d, status: %d, memberId: %d, syncKey: %d", java.lang.Integer.valueOf(we5Var.f389105d), java.lang.Integer.valueOf(we5Var.f389107f), java.lang.Integer.valueOf(we5Var.f389110i), java.lang.Integer.valueOf(we5Var.f389108g));
                    int i47 = we5Var.f389105d;
                    k83.g gVar11 = this.f142498u;
                    if (i47 == gVar11.f304898a && we5Var.f389106e == gVar11.f304899b) {
                        if (we5Var.f389110i == gVar11.f304908k) {
                            int i48 = we5Var.f389108g;
                            if (i48 > gVar11.f304909l) {
                                gVar11.f304909l = i48;
                                int i49 = we5Var.f389107f;
                                if (i49 != 0) {
                                    gVar11.f304910m = i49;
                                }
                            }
                        } else {
                            java.util.Iterator it = gVar11.E.iterator();
                            boolean z19 = false;
                            while (it.hasNext()) {
                                k83.h hVar = (k83.h) it.next();
                                if (hVar.f304926c == we5Var.f389110i) {
                                    int i57 = we5Var.f389108g;
                                    if (i57 > hVar.f304925b) {
                                        hVar.f304925b = i57;
                                        int i58 = we5Var.f389107f;
                                        if (i58 != 0) {
                                            hVar.f304924a = i58;
                                        }
                                    }
                                    z19 = true;
                                }
                            }
                            if (!z19) {
                                k83.h hVar2 = new k83.h();
                                hVar2.f304926c = we5Var.f389110i;
                                hVar2.f304924a = we5Var.f389107f;
                                hVar2.f304925b = we5Var.f389108g;
                                this.f142498u.E.add(hVar2);
                            }
                        }
                        int i59 = we5Var.f389111m;
                        if (i59 == 404 || i59 == 484) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync phonenumber invalid");
                            this.f142498u.f304915r = true;
                        }
                        k83.g gVar12 = this.f142498u;
                        gVar12.f304905h = we5Var.f389112n;
                        gVar12.f304904g = we5Var.f389111m;
                        gVar12.f304906i = we5Var.f389113o;
                        gVar12.f304907j = we5Var.f389114p;
                        gVar12.f304922y = we5Var.f389109h;
                    }
                }
                return false;
            case 3:
                if (!(obj instanceof p83.a)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel result error");
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel finished errType:%d,errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                p83.a aVar = (p83.a) obj;
                int i66 = this.f142498u.f304901d;
                if (i66 != aVar.f352729e.f375173h) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel finished but invite id not the same, now room inviteId:%d, before room inviteId:%d", java.lang.Integer.valueOf(i66), java.lang.Integer.valueOf(aVar.f352729e.f375173h));
                    return true;
                }
                return false;
            case 4:
                if (!(obj instanceof p83.n)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown result error");
                    return true;
                }
                p83.n nVar = (p83.n) obj;
                int i67 = gVar.f304898a;
                if (i67 != nVar.f352769e.f386354e) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown finished but room id not the same, now room roomId:%d, before room roomId:%d", java.lang.Integer.valueOf(i67), java.lang.Integer.valueOf(nVar.f352769e.f386354e));
                    return true;
                }
                if (i18 == 0 && i19 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown success!");
                    this.f142498u.f304910m = 5;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown failed");
                }
                return false;
            case 5:
                if (!(obj instanceof p83.h)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat result error");
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat finished errType:%d,errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                p83.h hVar3 = (p83.h) obj;
                int i68 = this.f142498u.f304898a;
                if (i68 != hVar3.f352751e.f378625d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat finished but room id not the same, now room roomId:%d, before room roomId:%d", java.lang.Integer.valueOf(i68), java.lang.Integer.valueOf(hVar3.f352751e.f378625d));
                    return true;
                }
                return false;
            case 6:
                if (!(obj instanceof p83.k)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect result error");
                    return true;
                }
                p83.k kVar = (p83.k) obj;
                r45.qe5 qe5Var = kVar.f352762f;
                int i69 = gVar.f304898a;
                r45.pe5 pe5Var = kVar.f352761e;
                if (i69 != pe5Var.f382983d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect finished but room id not the same, now room roomId:%d, before room roomId:%d", java.lang.Integer.valueOf(i69), java.lang.Integer.valueOf(pe5Var.f382983d));
                    return true;
                }
                if (i18 == 0 && i19 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect success");
                    k83.g gVar13 = this.f142498u;
                    gVar13.B = qe5Var.f383914f;
                    gVar13.C = qe5Var.f383915g;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect failed");
                }
                return false;
            case 7:
            default:
                return false;
            case 8:
                if (!(obj instanceof r45.oe5)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify result error");
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify finished");
                r45.oe5 oe5Var = (r45.oe5) obj;
                k83.g gVar14 = this.f142498u;
                int i76 = gVar14.f304898a;
                if (i76 != oe5Var.f382200d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown finished but room id not the same, now room roomId:%d, before room roomId:%d", java.lang.Integer.valueOf(i76), java.lang.Integer.valueOf(oe5Var.f382200d));
                    return true;
                }
                if (i18 == 0 && i19 == 0) {
                    gVar14.f304922y = oe5Var.f382203g;
                    java.util.LinkedList linkedList = oe5Var.f382202f;
                    linkedList.size();
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        r45.xe5 xe5Var = (r45.xe5) it6.next();
                        int i77 = this.f142498u.f304908k;
                        int i78 = xe5Var.f390016f;
                        if (i77 == i78) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo update self userStatus, memberId: %d, status: %d, syncKey: %d", java.lang.Integer.valueOf(i77), java.lang.Integer.valueOf(xe5Var.f390014d), java.lang.Integer.valueOf(xe5Var.f390015e));
                            int i79 = xe5Var.f390015e;
                            k83.g gVar15 = this.f142498u;
                            if (i79 > gVar15.f304909l) {
                                gVar15.f304909l = i79;
                                int i86 = xe5Var.f390014d;
                                if (i86 != 0) {
                                    gVar15.f304910m = i86;
                                }
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo update others userStatus, memberId: %d, status: %d, syncKey: %d", java.lang.Integer.valueOf(i78), java.lang.Integer.valueOf(xe5Var.f390014d), java.lang.Integer.valueOf(xe5Var.f390015e));
                            java.util.Iterator it7 = this.f142498u.E.iterator();
                            boolean z27 = false;
                            while (it7.hasNext()) {
                                k83.h hVar4 = (k83.h) it7.next();
                                if (hVar4.f304926c == xe5Var.f390016f) {
                                    int i87 = xe5Var.f390015e;
                                    if (i87 > hVar4.f304925b) {
                                        hVar4.f304925b = i87;
                                        int i88 = xe5Var.f390014d;
                                        if (i88 != 0) {
                                            hVar4.f304924a = i88;
                                        }
                                    }
                                    z27 = true;
                                }
                            }
                            if (!z27) {
                                k83.h hVar5 = new k83.h();
                                hVar5.f304926c = xe5Var.f390016f;
                                hVar5.f304924a = xe5Var.f390014d;
                                hVar5.f304925b = xe5Var.f390015e;
                                this.f142498u.E.add(hVar5);
                            }
                        }
                        int i89 = xe5Var.f390017g;
                        if (i89 == 404 || i89 == 484) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify phonenumber invalid");
                            this.f142498u.f304915r = true;
                        }
                        k83.g gVar16 = this.f142498u;
                        gVar16.f304905h = xe5Var.f390018h;
                        gVar16.f304904g = xe5Var.f390017g;
                        gVar16.f304906i = xe5Var.f390019i;
                        gVar16.f304907j = xe5Var.f390020m;
                    }
                }
                return false;
        }
    }

    public final void j(boolean z17) {
        com.tencent.mm.plugin.ipcall.model.o oVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleSync, success: %b", java.lang.Boolean.valueOf(z17));
        if (z17 && com.tencent.mm.plugin.ipcall.model.r.Ni().f324720d) {
            com.tencent.mm.plugin.ipcall.model.r.Ni().b(this.f142498u.f304922y);
        }
        if (z17) {
            k83.g gVar = this.f142498u;
            if (gVar == null || !z17) {
                return;
            }
            k(gVar.a());
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrLogic", "sync failed!");
        this.f142491n.p();
        if (!(com.tencent.mm.plugin.ipcall.model.r.bj().f142482a == 3) || (oVar = this.f142489i) == null) {
            return;
        }
        k83.g gVar2 = this.f142498u;
        int i17 = gVar2.f304904g;
        java.lang.String str = gVar2.f304905h;
        int i18 = gVar2.f304906i;
        com.tencent.mm.plugin.ipcall.j jVar = (com.tencent.mm.plugin.ipcall.j) oVar;
        jVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onSyncFailed");
        if (jVar.j(7, 35)) {
            jVar.i(7, null, str, i18);
        }
    }

    public final boolean k(int i17) {
        r83.c cVar = this.f142494q;
        r83.i iVar = this.f142491n;
        switch (i17) {
            case 1:
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user ringing");
                if (!this.f142499v) {
                    this.f142499v = true;
                    com.tencent.mm.plugin.ipcall.model.o oVar = this.f142489i;
                    if (oVar != null) {
                        com.tencent.mm.plugin.ipcall.j jVar = (com.tencent.mm.plugin.ipcall.j) oVar;
                        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onStartRing, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
                        if (com.tencent.mm.plugin.ipcall.model.r.bj().f(4)) {
                            m83.d Zi = com.tencent.mm.plugin.ipcall.model.r.Zi();
                            if (Zi.f324741s == 0) {
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                Zi.f324741s = currentTimeMillis;
                                Zi.f324728f = currentTimeMillis - Zi.f324740r;
                            }
                            com.tencent.mm.plugin.ipcall.model.r.Ni().a();
                            m83.d Zi2 = com.tencent.mm.plugin.ipcall.model.r.Zi();
                            Zi2.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallReportHelper", "startRing");
                            Zi2.f324723a = 1;
                            com.tencent.mm.plugin.ipcall.l lVar = jVar.f142444d;
                            if (lVar != null) {
                                com.tencent.mm.plugin.ipcall.ui.l6 l6Var = (com.tencent.mm.plugin.ipcall.ui.l6) lVar;
                                if (com.tencent.mm.plugin.ipcall.model.r.bj().b()) {
                                    boolean a17 = l6Var.f142909h.a();
                                    j83.b Ai = com.tencent.mm.plugin.ipcall.model.r.Ai();
                                    if (Ai != null) {
                                        Ai.f298165p = a17;
                                    }
                                    boolean a18 = l6Var.f142909h.a();
                                    j83.b Ai2 = com.tencent.mm.plugin.ipcall.model.r.Ai();
                                    if (Ai2 != null) {
                                        Ai2.f298166q = a18;
                                    }
                                    com.tencent.mm.plugin.ipcall.model.r.Di().b(l6Var.f142909h.a());
                                }
                            }
                        }
                    }
                }
                return true;
            case 2:
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user accept, isLaunchCancel: %b, isLaunchShutdown: %b", java.lang.Boolean.valueOf(this.f142487g), java.lang.Boolean.valueOf(this.f142488h));
                if (!this.f142487g && !this.f142488h) {
                    iVar.p();
                    if (!this.f142500w) {
                        this.f142500w = true;
                        k83.g gVar = this.f142498u;
                        if (gVar != null) {
                            gVar.M = true;
                        }
                        com.tencent.mm.plugin.ipcall.model.o oVar2 = this.f142489i;
                        if (oVar2 != null) {
                            com.tencent.mm.plugin.ipcall.j jVar2 = (com.tencent.mm.plugin.ipcall.j) oVar2;
                            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onAccept, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
                            if (com.tencent.mm.plugin.ipcall.model.r.bj().f(5)) {
                                m83.d Zi3 = com.tencent.mm.plugin.ipcall.model.r.Zi();
                                if (Zi3.f324742t == 0) {
                                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                                    Zi3.f324742t = currentTimeMillis2;
                                    Zi3.f324729g = currentTimeMillis2 - Zi3.f324740r;
                                }
                                com.tencent.mm.plugin.ipcall.model.r.Ni().a();
                                m83.d Zi4 = com.tencent.mm.plugin.ipcall.model.r.Zi();
                                Zi4.getClass();
                                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallReportHelper", "userAccept");
                                Zi4.f324724b = 1;
                                com.tencent.mm.sdk.platformtools.n3 n3Var = com.tencent.mm.plugin.ipcall.j.f142443u;
                                n3Var.removeCallbacks(jVar2.f142452o);
                                com.tencent.mm.plugin.ipcall.model.r.aj().e();
                                n3Var.removeCallbacks(jVar2.f142453p);
                                com.tencent.mm.plugin.ipcall.model.r.Di().c();
                                if (com.tencent.mm.plugin.ipcall.model.r.Ni().f324720d && !jVar2.f142446f) {
                                    m83.d Zi5 = com.tencent.mm.plugin.ipcall.model.r.Zi();
                                    Zi5.getClass();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallReportHelper", "channelConnect");
                                    Zi5.f324730h = 1;
                                    m83.d Zi6 = com.tencent.mm.plugin.ipcall.model.r.Zi();
                                    if (Zi6.f324743u == 0) {
                                        Zi6.f324743u = java.lang.System.currentTimeMillis();
                                    }
                                    jVar2.f142446f = true;
                                    jVar2.f142456s = com.tencent.mm.sdk.platformtools.t8.i1();
                                    jVar2.n();
                                    com.tencent.mm.plugin.ipcall.model.r.Ni().f324717a.setActive();
                                    com.tencent.mm.plugin.ipcall.l lVar2 = jVar2.f142444d;
                                    if (lVar2 != null) {
                                        ((com.tencent.mm.plugin.ipcall.ui.l6) lVar2).f();
                                    }
                                    m83.d Zi7 = com.tencent.mm.plugin.ipcall.model.r.Zi();
                                    if (Zi7.f324748z == 0) {
                                        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                                        Zi7.f324748z = currentTimeMillis3;
                                        Zi7.A = currentTimeMillis3 - Zi7.f324740r;
                                    }
                                    com.tencent.mm.plugin.voip.model.a2.a().c();
                                    com.tencent.mm.plugin.voip.model.a2 a19 = com.tencent.mm.plugin.voip.model.a2.a();
                                    a19.getClass();
                                    a19.f176328f = new java.lang.ref.WeakReference(jVar2);
                                }
                            }
                        }
                        cVar.j(this.f142498u);
                    }
                }
                return true;
            case 3:
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user busy");
                iVar.p();
                cVar.p();
                com.tencent.mm.plugin.ipcall.model.o oVar3 = this.f142489i;
                if (oVar3 != null) {
                    k83.g gVar2 = this.f142498u;
                    int i18 = gVar2.f304904g;
                    java.lang.String str = gVar2.f304905h;
                    int i19 = gVar2.f304906i;
                    com.tencent.mm.plugin.ipcall.j jVar3 = (com.tencent.mm.plugin.ipcall.j) oVar3;
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onBusy, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
                    if (jVar3.j(1, 4)) {
                        jVar3.i(1, null, str, i19);
                    }
                }
                return true;
            case 4:
            case 7:
            case 8:
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user unavailable");
                k83.g gVar3 = this.f142498u;
                if (gVar3.f304915r) {
                    com.tencent.mm.plugin.ipcall.model.o oVar4 = this.f142489i;
                    if (oVar4 != null) {
                        ((com.tencent.mm.plugin.ipcall.j) oVar4).f(gVar3.f304904g, gVar3.f304907j, gVar3.f304905h, gVar3.f304906i);
                    }
                } else {
                    com.tencent.mm.plugin.ipcall.model.o oVar5 = this.f142489i;
                    if (oVar5 != null) {
                        java.lang.String str2 = gVar3.f304905h;
                        int i27 = gVar3.f304906i;
                        com.tencent.mm.plugin.ipcall.j jVar4 = (com.tencent.mm.plugin.ipcall.j) oVar5;
                        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onUnAvaliable, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
                        if (jVar4.j(3, 5)) {
                            jVar4.i(3, null, str2, i27);
                        }
                    }
                }
                return true;
            case 5:
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, other side user shutdown");
                com.tencent.mm.plugin.ipcall.model.o oVar6 = this.f142489i;
                if (oVar6 != null) {
                    com.tencent.mm.plugin.ipcall.j jVar5 = (com.tencent.mm.plugin.ipcall.j) oVar6;
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onShutdownByOtherSide, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
                    if (jVar5.c(10, 0, 32)) {
                        com.tencent.mm.plugin.ipcall.l lVar3 = jVar5.f142444d;
                        if (lVar3 != null) {
                            com.tencent.mm.plugin.ipcall.ui.l6 l6Var2 = (com.tencent.mm.plugin.ipcall.ui.l6) lVar3;
                            l6Var2.b();
                            l6Var2.g(10);
                            ((com.tencent.mm.booter.notification.x) c01.d9.f()).f(42);
                            com.tencent.mm.plugin.ipcall.ui.k6 k6Var = l6Var2.f142927z;
                            if (k6Var != null) {
                                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.ipcall.ui.i5((com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI) k6Var), 3000L);
                            }
                        } else {
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.g4y), 1).show();
                        }
                    }
                }
                return true;
            case 6:
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, shutdown overdue");
                k83.g gVar4 = this.f142498u;
                gVar4.f304913p = true;
                com.tencent.mm.plugin.ipcall.model.o oVar7 = this.f142489i;
                if (oVar7 != null) {
                    ((com.tencent.mm.plugin.ipcall.j) oVar7).e(gVar4.f304904g, gVar4.f304907j, gVar4.f304905h, gVar4.f304906i);
                }
                return true;
            default:
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, do nothing:%d", java.lang.Integer.valueOf(i17));
                return false;
        }
    }

    public final void l(boolean z17, int i17) {
        int i18;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        r83.h hVar = this.f142493p;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleUserSelfShutdown, success: %b, isFromNotify: %b", valueOf, java.lang.Boolean.valueOf(hVar.f393316g));
        if (z17 || i17 >= 0 || (i18 = this.f142485e) >= 1) {
            return;
        }
        int i19 = i18 + 1;
        this.f142485e = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "shutdown failed, retry count: %d, isFromNotify: %b", java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(hVar.f393316g));
        hVar.j(this.f142498u);
    }

    public void m(int i17) {
        if (!this.f142498u.M) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallSvrLogic", "shutdownIPCall, user not accept");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "shutdownIPCall, roomId: %d, inviteId: %d", java.lang.Integer.valueOf(this.f142498u.f304898a), java.lang.Integer.valueOf(this.f142498u.f304901d));
        this.f142488h = true;
        this.f142494q.p();
        this.f142491n.p();
        r83.h hVar = this.f142493p;
        hVar.f393316g = false;
        hVar.f393315f = i17;
        hVar.j(this.f142498u);
        this.f142496s.j(this.f142498u);
    }
}
