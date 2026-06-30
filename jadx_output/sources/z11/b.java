package z11;

/* loaded from: classes12.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, w11.u {

    /* renamed from: d, reason: collision with root package name */
    public final w11.d2 f469264d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469265e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.network.v0 f469266f;

    /* renamed from: g, reason: collision with root package name */
    public int f469267g;

    /* renamed from: h, reason: collision with root package name */
    public int f469268h;

    /* renamed from: i, reason: collision with root package name */
    public final int f469269i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f469270m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.cx4 f469271n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f469272o = false;

    public b(w11.d2 d2Var, int i17, int i18, int i19, r45.cx4 cx4Var) {
        this.f469264d = d2Var;
        this.f469267g = i17;
        this.f469268h = i18;
        this.f469269i = i19;
        this.f469270m = i19 > 0;
        this.f469271n = cx4Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "%s doScene", this);
        this.f469265e = u0Var;
        int i17 = this.f469267g;
        int i18 = this.f469268h;
        boolean z17 = mm.w.f328542a;
        mm.w.d("MicroMsg.NotifyPowerInspector", "netSyncMin: scene=" + i17 + ", selector=0x" + java.lang.Integer.toBinaryString(i17));
        if (com.tencent.mm.sdk.platformtools.x2.n() && com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            java.lang.String str = i17 + "-" + java.lang.Integer.toBinaryString(i18);
            mm.y yVar = mm.w.f328549h;
            if (yVar.b() || !mm.w.f328543b) {
                yVar.c(str);
            }
        }
        w11.z.f442179a = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MinSyncStatusHolder", "setMinSyncRunning true");
        return dispatch(sVar, this.f469266f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 138;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean needCheckCallback() {
        return false;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "onGYNetEnd %s %s %s %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this);
        boolean z17 = true;
        if (v0Var == null || v0Var.getType() != 138) {
            jx3.f.INSTANCE.idkeyStat(99L, 44L, 1L, false);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = this;
            objArr[1] = java.lang.Integer.valueOf(v0Var == null ? -2 : v0Var.getType());
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncService", "%s onGYNetEnd error type:%d", objArr);
            return;
        }
        if (this.f469272o) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncService", "%s onGYNetEnd has been callback  , give up  ", this);
            return;
        }
        this.f469272o = true;
        w11.d2.b("Check rr failed.", v0Var == this.f469266f);
        boolean z18 = (i18 == 0 && i19 == 0) ? false : true;
        w11.z.f442179a = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.MinSyncStatusHolder", "setMinSyncRunning false");
        boolean z19 = z18 ^ true;
        w11.z.f442180b = z19;
        com.tencent.mars.xlog.Log.i("MicroMsg.MinSyncStatusHolder", "setMinSyncResult " + z19);
        w11.d2 d2Var = this.f469264d;
        if (z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncService", "%s onGYNetEnd scene error Callback [%s,%s,%s ] rr:%s", this, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, v0Var);
            if (i18 != 4 || i19 != -2006) {
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.d(11098, 3501, "" + this.f469267g + ";" + i18 + ";" + i19 + ";" + z65.c.f470455a + ";" + a21.a.a());
                fVar.idkeyStat(99L, 43L, 1L, false);
                this.f469265e.onSceneEnd(i18, i19, str, this);
                d2Var.d(this);
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.SyncService", "%s onGYNetEnd MM_ERR_KEYBUF_INVALID , not merge key buf", this);
            jx3.f.INSTANCE.idkeyStat(99L, 42L, 1L, false);
            z17 = false;
        }
        r45.ew4 ew4Var = ((o45.yh) v0Var.getRespObj()).f343039a;
        r45.jj6 jj6Var = new r45.jj6();
        jj6Var.f377890n = 0;
        jj6Var.f377885f = this.f469267g;
        jj6Var.f377884e = z17;
        jj6Var.f377883d = ew4Var;
        jj6Var.f377887h = this.f469270m;
        jj6Var.f377886g = this.f469268h;
        r45.cx4 cx4Var = this.f469271n;
        jj6Var.f377892p = cx4Var.f371899e;
        jj6Var.f377893q = cx4Var;
        jj6Var.f377895s = this.f469269i;
        d2Var.f442006h.b(jj6Var, this);
    }

    @Override // w11.u
    public boolean t(java.util.Queue queue) {
        int i17;
        int i18;
        java.lang.String str;
        boolean isWifi;
        boolean z17;
        boolean z18;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = this;
        boolean z19 = true;
        objArr[1] = java.lang.Integer.valueOf(this.f469267g);
        objArr[2] = java.lang.Integer.valueOf(this.f469268h);
        objArr[3] = java.lang.Integer.valueOf(this.f469269i);
        objArr[4] = queue == null ? "null" : java.lang.Integer.valueOf(queue.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "%s begin run scene:%s selector:%s contSyncCnt:%s List:%s", objArr);
        java.lang.String str2 = ";";
        int i19 = 7;
        int i27 = 6;
        if (queue != null) {
            if (!queue.isEmpty()) {
                if (queue.size() >= 5) {
                    jx3.f.INSTANCE.d(11098, 3590, "" + queue.size() + ";" + z65.c.f470455a + ";" + a21.a.a());
                }
                jx3.f.INSTANCE.idkeyStat(99L, com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) jx3.f.A(queue.size(), new int[]{1, 2, 3, 4, 5, 10}, new java.lang.Integer[]{60, 61, 62, 63, 64, 65, 66})), 1L, false);
            }
            boolean z27 = false;
            boolean z28 = false;
            while (!queue.isEmpty()) {
                z11.b bVar = (z11.b) queue.poll();
                if (bVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SyncService", "NetSceneMinSync list poll value is null list.size:%d", java.lang.Integer.valueOf(queue.size()));
                } else {
                    this.f469268h |= bVar.f469268h;
                    if (bVar.f469267g == 3) {
                        z18 = z28;
                        z17 = z19;
                    } else {
                        z17 = z27;
                        z18 = bVar.f469270m ? z19 : z28;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "%s pop:%s[%s] scene:%s selector:%s isContinue:%s contSyncCnt:%s hashcont:%s hasBgfg:%s", this, java.lang.Integer.valueOf(queue.size()), bVar, java.lang.Integer.valueOf(bVar.f469267g), java.lang.Integer.valueOf(bVar.f469268h), java.lang.Boolean.valueOf(bVar.f469270m), java.lang.Integer.valueOf(bVar.f469269i), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
                    i27 = i27;
                    i19 = i19;
                    z27 = z17;
                    z28 = z18;
                    str2 = str2;
                    z19 = true;
                }
            }
            i17 = i27;
            i18 = i19;
            str = str2;
            if (z27) {
                this.f469267g = 3;
            } else if (z28) {
                this.f469267g = i17;
            }
        } else {
            i17 = 6;
            i18 = 7;
            str = ";";
        }
        if (!gm0.j1.a() || gm0.m.r() || gm0.j1.u() == null || gm0.j1.u().c() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncService", "%s accready:%s hold:%s accstg:%s ", this, java.lang.Boolean.valueOf(gm0.j1.a()), java.lang.Boolean.valueOf(gm0.m.r()), gm0.j1.u());
            return false;
        }
        long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) gm0.j1.u().c().l(8196, null), 0L);
        if (k17 != 0) {
            gm0.j1.u().c().w(8196, 0L);
            this.f469268h = ((int) (this.f469268h | k17)) & 95;
        }
        int i28 = this.f469267g;
        int i29 = i28 == 3 ? 1 : 0;
        if (i28 == 1010) {
            this.f469268h |= 16;
            this.f469267g = i18;
        } else if (i28 == 1011) {
            this.f469268h |= 64;
            this.f469267g = i18;
        } else if (i28 == 3) {
            this.f469268h |= 262144;
            this.f469267g = 3;
        }
        if (this.f469270m) {
            this.f469267g = i17;
        }
        w11.y0 y0Var = new w11.y0(false);
        this.f469266f = y0Var;
        r45.dw4 dw4Var = ((o45.xh) y0Var.getReqObj()).f343036a;
        dw4Var.f372782i = i29;
        dw4Var.f372778e = this.f469268h;
        dw4Var.f372780g = this.f469267g;
        byte[] a17 = w11.c2.f441991a.a();
        dw4Var.f372779f = x51.j1.a(a17);
        dw4Var.f372777d = new r45.c50();
        int i37 = o45.wf.f343023a;
        dw4Var.f372781h = wo.q.f447780a;
        int wi6 = ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi();
        if (wi6 != 0) {
            dw4Var.f372784n = wi6;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393259f) {
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        } else if (r75.d.f393257d == -100) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            r75.d.f393257d = netType;
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
        }
        if (isWifi) {
            dw4Var.f372783m = 1L;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "%s continueFlag:%s SyncMsgDigest:%s Selector:%d Scene:%d device:%s SyncFlag:%d", this, java.lang.Long.valueOf(k17), java.lang.Integer.valueOf(dw4Var.f372782i), java.lang.Integer.valueOf(dw4Var.f372778e), java.lang.Integer.valueOf(this.f469267g), dw4Var.f372781h, java.lang.Integer.valueOf(wi6));
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "%s Req synckey %s", this, o45.qi.d(a17));
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(99L, this.f469267g, 1L, false);
        fVar.idkeyStat(99L, 0L, 1L, false);
        fVar.idkeyStat(99L, z65.c.f470455a ? 241L : 242L, 1L, false);
        if (gm0.j1.n().f273288b.h(this, 0)) {
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(this.f469267g);
        java.lang.String str3 = str;
        sb6.append(str3);
        sb6.append(z65.c.f470455a);
        sb6.append(str3);
        sb6.append(a21.a.a());
        fVar.d(11098, 3500, sb6.toString());
        com.tencent.mars.xlog.Log.e("MicroMsg.SyncService", "%s NetSceneQueue doScene failed. ", this);
        fVar.idkeyStat(99L, 41L, 1L, false);
        return false;
    }

    public java.lang.String toString() {
        return "NetSync[" + hashCode() + "]";
    }
}
