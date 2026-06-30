package com.tencent.mm.plugin.ipcall.ui;

@db5.a(3)
/* loaded from: classes14.dex */
public class IPCallTalkUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.ipcall.ui.k6 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f142711p = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142712d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142713e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142714f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142715g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f142716h;

    /* renamed from: i, reason: collision with root package name */
    public int f142717i;

    /* renamed from: m, reason: collision with root package name */
    public int f142718m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.l6 f142719n;

    /* renamed from: o, reason: collision with root package name */
    public iq4.d f142720o;

    public final void T6() {
        int i17;
        java.lang.String str;
        int i18;
        java.lang.String str2;
        boolean z17;
        long j17;
        com.tencent.mm.plugin.ipcall.model.r Bi = com.tencent.mm.plugin.ipcall.model.r.Bi();
        if (Bi.f142506g == null) {
            Bi.f142506g = new l83.d();
        }
        l83.d dVar = Bi.f142506g;
        if (!dVar.f317097c) {
            dVar.f317096b = new j83.b();
            dVar.f317097c = true;
        }
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = new com.tencent.mm.plugin.ipcall.ui.l6(this);
        this.f142719n = l6Var;
        l6Var.f142927z = this;
        java.lang.String str3 = this.f142712d;
        java.lang.String str4 = this.f142713e;
        java.lang.String str5 = this.f142714f;
        java.lang.String str6 = this.f142715g;
        java.lang.String str7 = this.f142716h;
        int i19 = this.f142717i;
        int i27 = this.f142718m;
        boolean booleanExtra = l6Var.f142924w.getIntent().getBooleanExtra("IPCallTalkUI_isFromMiniNotification", false);
        l6Var.C = booleanExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername: %s, isFromMinimize: %b", str3, str4, str5, str6, str7, java.lang.Boolean.valueOf(booleanExtra));
        l6Var.f142905d = (android.widget.ImageView) l6Var.f142924w.findViewById(com.tencent.mm.R.id.f487223ny3);
        l6Var.f142906e = (android.widget.ImageView) l6Var.f142924w.findViewById(com.tencent.mm.R.id.f487221ny1);
        l6Var.f142902a = (android.widget.EditText) l6Var.f142924w.findViewById(com.tencent.mm.R.id.ny8);
        l6Var.f142904c = (android.widget.TextView) l6Var.f142924w.findViewById(com.tencent.mm.R.id.nya);
        l6Var.f142903b = (android.widget.TextView) l6Var.f142924w.findViewById(com.tencent.mm.R.id.ny9);
        l6Var.f142907f = (com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton) l6Var.f142924w.findViewById(com.tencent.mm.R.id.ny7);
        l6Var.f142908g = (com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton) l6Var.f142924w.findViewById(com.tencent.mm.R.id.f487224ny4);
        l6Var.f142909h = (com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton) l6Var.f142924w.findViewById(com.tencent.mm.R.id.ny_);
        l6Var.f142910i = (android.widget.ImageButton) l6Var.f142924w.findViewById(com.tencent.mm.R.id.ny6);
        l6Var.f142914m = (android.widget.ImageButton) l6Var.f142924w.findViewById(com.tencent.mm.R.id.hgp);
        l6Var.f142912k = (android.widget.TextView) l6Var.f142924w.findViewById(com.tencent.mm.R.id.f487622p80);
        l6Var.f142913l = l6Var.f142924w.findViewById(com.tencent.mm.R.id.f487623p81);
        l6Var.f142911j = (com.tencent.mm.plugin.ipcall.ui.DialPad) l6Var.f142924w.findViewById(com.tencent.mm.R.id.cyt);
        if (l6Var.C) {
            if (com.tencent.mm.plugin.ipcall.model.r.cj().f142498u != null) {
                l6Var.f142915n = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.F;
                l6Var.f142921t = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.f304897J;
                l6Var.f142920s = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.I;
                l6Var.f142918q = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.H;
                l6Var.f142916o = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.G;
                int i28 = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.L;
                l6Var.f142917p = i28;
                com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "restoreParam nickname:%s,fianlPhoneNumber:%s,toUserName:%s,contactId:%s,phoneNumber:%s,phoneType:%d", l6Var.f142915n, l6Var.f142921t, l6Var.f142920s, l6Var.f142918q, l6Var.f142916o, java.lang.Integer.valueOf(i28));
            }
            l6Var.a();
            l6Var.c();
            com.tencent.mm.plugin.ipcall.model.r.bj();
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", com.tencent.mm.plugin.ipcall.model.m.e(com.tencent.mm.plugin.ipcall.model.r.bj().f142482a));
            l6Var.g(com.tencent.mm.plugin.ipcall.model.r.bj().f142482a);
            java.lang.String str8 = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.f304897J;
            java.lang.String str9 = com.tencent.mm.plugin.ipcall.model.r.cj().f142498u.K;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
                l6Var.h(str9);
                l6Var.f142903b.setText(t83.c.c(str9));
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
                l6Var.h(str8);
                l6Var.f142903b.setText(t83.c.c(str8));
            }
            if (com.tencent.mm.plugin.ipcall.model.r.bj().b()) {
                l6Var.f142909h.setChecked(com.tencent.mm.plugin.ipcall.model.r.Di().f317096b.n());
                l6Var.f142907f.setChecked(com.tencent.mm.plugin.ipcall.model.r.Di().f317096b.f298162m.f317107d);
            }
        } else if (com.tencent.mm.plugin.ipcall.model.r.bj().d()) {
            db5.e1.o(l6Var.f142924w, com.tencent.mm.R.string.g19, com.tencent.mm.R.string.f490573yv, false, new com.tencent.mm.plugin.ipcall.ui.b6(l6Var));
        } else {
            l6Var.a();
            l6Var.f142915n = str3;
            l6Var.f142916o = str4;
            l6Var.f142918q = str5;
            l6Var.f142919r = str6;
            l6Var.f142922u = i19;
            l6Var.f142923v = i27;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                l6Var.f142916o = t83.f.i(l6Var.f142916o);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(l6Var.f142919r)) {
                if (t83.c.m(l6Var.f142916o)) {
                    java.lang.String a17 = t83.c.a(l6Var.f142916o);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                        l6Var.f142916o = t83.c.o(l6Var.f142916o);
                        l6Var.f142919r = t83.f.f();
                    } else {
                        l6Var.f142916o = t83.c.b(l6Var.f142916o);
                        l6Var.f142919r = a17;
                    }
                } else {
                    l6Var.f142919r = t83.f.f();
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "final mCountryCode: %s", l6Var.f142919r);
            com.tencent.mm.plugin.ipcall.model.j a18 = com.tencent.mm.plugin.ipcall.model.j.a();
            java.lang.String str10 = l6Var.f142919r;
            if (!a18.f142473c) {
                a18.b(false);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str10)) {
                com.tencent.mm.plugin.ipcall.model.r.Ui().y0(com.tencent.mm.sdk.platformtools.t8.P(str10.replace("+", ""), 0), java.lang.System.currentTimeMillis());
                a18.d();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(l6Var.f142915n)) {
                com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI = l6Var.f142924w;
                java.lang.String e17 = t83.c.e(iPCallTalkUI, l6Var.f142916o);
                l6Var.f142915n = !com.tencent.mm.sdk.platformtools.t8.K0(e17) ? o25.b.c(e17, iPCallTalkUI) : null;
            }
            l6Var.f142920s = str7;
            if (com.tencent.mm.sdk.platformtools.t8.K0(l6Var.f142919r) || t83.c.m(l6Var.f142916o)) {
                l6Var.f142921t = l6Var.f142916o;
            } else {
                java.lang.String str11 = l6Var.f142919r + l6Var.f142916o;
                l6Var.f142921t = str11;
                if (!str11.startsWith("+")) {
                    l6Var.f142921t = "+" + l6Var.f142921t;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "final call mPhoneNumber: %s", l6Var.f142921t);
            if (com.tencent.mm.plugin.ipcall.model.j.a().e(com.tencent.mm.sdk.platformtools.t8.P(l6Var.f142919r, -1))) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(12058, l6Var.f142919r);
                com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI2 = l6Var.f142924w;
                db5.e1.G(iPCallTalkUI2, iPCallTalkUI2.getString(com.tencent.mm.R.string.apz), l6Var.f142924w.getString(com.tencent.mm.R.string.f490772aq0), false, new com.tencent.mm.plugin.ipcall.ui.d6(l6Var));
            } else if (com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(l6Var.f142924w)) {
                long j18 = l6Var.f142924w.getSharedPreferences("IPCall_LastInputPref", 0).getLong("IPCall_LastInvite", -1L);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (j18 <= currentTimeMillis || j18 == -1) {
                    l6Var.c();
                    if (!l6Var.C || !com.tencent.mm.plugin.ipcall.model.r.bj().d()) {
                        java.lang.String str12 = l6Var.f142918q;
                        java.lang.String str13 = l6Var.f142916o;
                        com.tencent.mm.sdk.platformtools.c5 c5Var = t83.c.f416411a;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str12) || com.tencent.mm.sdk.platformtools.t8.K0(str13)) {
                            i17 = -1;
                        } else {
                            i17 = t83.c.i(str12, str13);
                            if (i17 == -1 && str13.startsWith("+")) {
                                java.lang.String a19 = t83.c.a(str13);
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(a19)) {
                                    str13 = str13.substring(("+" + a19).length());
                                }
                                i17 = t83.c.i(str12, str13);
                            }
                        }
                        l6Var.f142917p = i17;
                        l6Var.g(1);
                        java.lang.String str14 = l6Var.f142915n;
                        java.lang.String str15 = l6Var.f142916o;
                        java.lang.String str16 = l6Var.f142920s;
                        java.lang.String str17 = l6Var.f142921t;
                        java.lang.String str18 = l6Var.f142918q;
                        int i29 = l6Var.f142917p;
                        int i37 = l6Var.f142922u;
                        int i38 = l6Var.f142923v;
                        com.tencent.mm.plugin.ipcall.j jVar = l6Var.f142926y;
                        jVar.getClass();
                        if (com.tencent.mm.plugin.ipcall.model.r.bj().d()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "startIPCall, already start!");
                            str = "MicroMsg.TalkUIController";
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "startIPCall");
                            com.tencent.mm.plugin.ipcall.model.r.cj().f142489i = jVar;
                            com.tencent.mm.plugin.ipcall.model.r.Ni().f324722f = jVar;
                            com.tencent.mm.plugin.ipcall.model.r.bj().f142482a = -1;
                            com.tencent.mm.sdk.platformtools.l5 l5Var = (com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class);
                            com.tencent.mm.sdk.platformtools.h5 h5Var = jVar.f142449i;
                            l5Var.Di(h5Var);
                            com.tencent.mm.sdk.event.IListener iListener = jVar.f142451n;
                            iListener.dead();
                            str = "MicroMsg.TalkUIController";
                            com.tencent.mm.sdk.event.IListener iListener2 = jVar.f142450m;
                            iListener2.dead();
                            ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).wi(h5Var);
                            iListener.alive();
                            iListener2.alive();
                            s83.l lVar = new s83.l();
                            lVar.field_phonenumber = str17;
                            if (com.tencent.mm.sdk.platformtools.t8.K0(str18)) {
                                i18 = i38;
                                str2 = "MicroMsg.IPCallManager";
                                lVar.field_addressId = -1L;
                            } else {
                                s83.c D0 = com.tencent.mm.plugin.ipcall.model.r.wi().D0(str18);
                                if (D0 != null) {
                                    str2 = "MicroMsg.IPCallManager";
                                    long j19 = D0.systemRowid;
                                    i18 = i38;
                                    j17 = -1;
                                    if (j19 != -1) {
                                        lVar.field_addressId = j19;
                                    }
                                } else {
                                    i18 = i38;
                                    str2 = "MicroMsg.IPCallManager";
                                    j17 = -1;
                                }
                                lVar.field_addressId = j17;
                            }
                            if (i29 != -1) {
                                lVar.field_phoneType = i29;
                            } else {
                                lVar.field_phoneType = -1;
                            }
                            lVar.field_calltime = java.lang.System.currentTimeMillis();
                            lVar.field_status = 1;
                            jVar.f142445e = com.tencent.mm.plugin.ipcall.model.r.Vi().insert(lVar) ? lVar : null;
                            com.tencent.mm.sdk.platformtools.n3 n3Var = com.tencent.mm.plugin.ipcall.j.f142443u;
                            n3Var.postDelayed(jVar.f142453p, 1754L);
                            jVar.f142446f = false;
                            m83.d Zi = com.tencent.mm.plugin.ipcall.model.r.Zi();
                            Zi.f324723a = 0;
                            Zi.f324724b = 0;
                            Zi.f324725c = 0;
                            Zi.f324726d = 0;
                            Zi.f324727e = 0;
                            Zi.f324728f = 0L;
                            Zi.f324729g = 0L;
                            Zi.f324730h = 0;
                            Zi.f324731i = 0L;
                            Zi.f324732j = 0;
                            Zi.f324734l = 0;
                            Zi.f324735m = 0L;
                            Zi.f324736n = 0L;
                            Zi.f324737o = "";
                            Zi.f324738p = 0;
                            Zi.f324739q = "";
                            Zi.f324741s = 0L;
                            Zi.f324740r = 0L;
                            Zi.f324742t = 0L;
                            Zi.f324743u = 0L;
                            Zi.f324744v = 0L;
                            Zi.A = 0L;
                            Zi.f324748z = 0L;
                            Zi.f324745w = "";
                            Zi.f324746x = "";
                            Zi.B = "";
                            Zi.C = 0L;
                            Zi.D = 0;
                            Zi.E = 0;
                            Zi.F = 0;
                            Zi.G = 0;
                            com.tencent.mm.plugin.ipcall.model.r.bj().f142482a = -1;
                            com.tencent.mm.plugin.ipcall.model.p cj6 = com.tencent.mm.plugin.ipcall.model.r.cj();
                            cj6.f142500w = false;
                            cj6.f142499v = false;
                            cj6.f142484d = 0;
                            cj6.f142485e = 0;
                            cj6.f142486f = 0;
                            cj6.f142487g = false;
                            cj6.f142488h = false;
                            cj6.f142501x = false;
                            k83.g gVar = new k83.g();
                            cj6.f142498u = gVar;
                            gVar.F = str14;
                            gVar.G = str15;
                            gVar.H = str18;
                            gVar.f304897J = str17;
                            gVar.I = str16;
                            gVar.f304901d = (int) java.lang.System.currentTimeMillis();
                            k83.g gVar2 = cj6.f142498u;
                            gVar2.f304902e = i37;
                            gVar2.f304903f = i18;
                            gVar2.L = i29;
                            cj6.f142490m.j(gVar2);
                            cj6.f142495r.j(cj6.f142498u);
                            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "startIPCallInternal, inviteId: %d", java.lang.Integer.valueOf(cj6.f142498u.f304901d));
                            com.tencent.mm.plugin.ipcall.model.r.bj().f(1);
                            m83.c Ni = com.tencent.mm.plugin.ipcall.model.r.Ni();
                            if (!Ni.f324721e) {
                                Ni.f324720d = false;
                                Ni.f324719c = false;
                                Ni.f324721e = false;
                                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallEngineManager", "start engine");
                                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = Ni.f324717a;
                                if (v2protocalVar.Q1) {
                                    v2protocalVar.A(false);
                                    v2protocalVar.B();
                                }
                                v2protocalVar.f176874p = 1;
                                java.lang.System.currentTimeMillis();
                                int e18 = vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                v2protocalVar.f176847g = e18;
                                if (e18 == 5 || e18 == 6 || e18 == 7) {
                                    v2protocalVar.f176847g = 4;
                                }
                                int[] iArr = new int[v2protocalVar.f176841e * v2protocalVar.f176844f];
                                v2protocalVar.f176850h = gm0.j1.b().h();
                                int a27 = wo.r.a();
                                int i39 = android.os.Build.VERSION.SDK_INT;
                                int c17 = com.tencent.mm.plugin.voip.video.OpenGlRender.c();
                                android.view.Display defaultDisplay = ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay();
                                int width = defaultDisplay.getWidth();
                                int height = defaultDisplay.getHeight();
                                int i47 = c17 != 1 ? 1 : 4;
                                int init = v2protocalVar.init(v2protocalVar.f176847g, 65538, (v2protocalVar.f176841e << 16) | v2protocalVar.f176844f, height | (width << 16), v2protocalVar.f176850h, a27 | (i39 << 16) | (c17 << 24), lp0.b.X() + "lib/", 4, 0L, 0, 0, i47);
                                vq4.d0.a("MicroMsg.Voip", "protocalInitForPstn protocal init ret :" + init + ",uin= " + v2protocalVar.f176850h + ", groupRsCap = 0, x_vcodec2_paras = 0, outfmt = " + i47);
                                v2protocalVar.Q1 = true;
                                if (init < 0) {
                                    v2protocalVar.B();
                                }
                                java.lang.System.currentTimeMillis();
                                byte[] bArr = v2protocalVar.field_capInfo;
                                if (bArr != null && v2protocalVar.exchangeCabInfo(bArr, bArr.length) < 0) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallEngineManager", "exchangeCabInfo failed");
                                    com.tencent.mm.plugin.ipcall.model.r.Zi().f324732j = 24;
                                }
                                if (init < 0) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallEngineManager", "engine init failed!");
                                }
                                v2protocalVar.f176874p = 1;
                                Ni.f324721e = true;
                            }
                            java.lang.Runnable runnable = jVar.f142452o;
                            n3Var.removeCallbacks(runnable);
                            n3Var.postDelayed(runnable, 60000L);
                            com.tencent.mm.sdk.platformtools.Log.c(str2, "bindIPCallForegroundIfNeed", new java.lang.Object[0]);
                            if (fp.h.c(26) && !jVar.f142447g) {
                                android.content.Intent intent = new android.content.Intent();
                                intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.ipcall.model.IPCallForegroundService.class);
                                try {
                                    com.tencent.mm.sdk.platformtools.x2.f193071a.startService(intent);
                                    z17 = true;
                                } catch (java.lang.Exception e19) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace(str2, e19, "using start service to bindIPCallForegroundIfNeed error: %s", e19.getMessage());
                                    try {
                                        com.tencent.mm.sdk.platformtools.x2.f193071a.startForegroundService(intent);
                                    } catch (java.lang.Exception e27) {
                                        com.tencent.mars.xlog.Log.printErrStackTrace(str2, e27, "using start foreground service to bindIPCallForegroundIfNeed error: %s", e27.getMessage());
                                    }
                                    z17 = false;
                                }
                                if (z17) {
                                    jVar.f142447g = true;
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.i(str, "startLaunchTalk, callNumber: %s", l6Var.f142921t);
                        m83.d Zi2 = com.tencent.mm.plugin.ipcall.model.r.Zi();
                        java.lang.String str19 = l6Var.f142919r;
                        Zi2.getClass();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str19)) {
                            Zi2.B = str19;
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "onDisasterHappen");
                    com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI iPCallTalkUI3 = l6Var.f142924w;
                    db5.e1.E(iPCallTalkUI3, iPCallTalkUI3.getString(com.tencent.mm.R.string.g3m, java.lang.String.valueOf(((j18 - currentTimeMillis) / 1000) + 1)), l6Var.f142924w.getString(com.tencent.mm.R.string.g3h), l6Var.f142924w.getString(com.tencent.mm.R.string.g3i), false, new com.tencent.mm.plugin.ipcall.ui.c6(l6Var));
                }
            } else {
                dp.a.makeText(l6Var.f142924w, com.tencent.mm.R.string.f490500wu, 1).show();
                l6Var.f142924w.finish();
            }
        }
        iq4.d dVar2 = new iq4.d(new dp1.u(this));
        this.f142720o = dVar2;
        dVar2.b(9, "VOIPFloatBall");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = this.f142719n;
        if (l6Var != null) {
            l6Var.E = true;
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.blt;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().o();
        getWindow().addFlags(6946944);
        this.f142712d = getIntent().getStringExtra("IPCallTalkUI_nickname");
        this.f142713e = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
        this.f142714f = getIntent().getStringExtra("IPCallTalkUI_contactId");
        this.f142715g = getIntent().getStringExtra("IPCallTalkUI_countryCode");
        this.f142716h = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
        this.f142717i = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
        this.f142718m = getIntent().getIntExtra("IPCallTalkUI_countryType", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallTalkUI", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername:%s, mDialScene:%d ,mCountryType:%d", this.f142712d, this.f142713e, this.f142714f, this.f142715g, this.f142716h, java.lang.Integer.valueOf(this.f142717i), java.lang.Integer.valueOf(this.f142718m));
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(j35.u.a(this, "android.permission.RECORD_AUDIO", 80, null, null));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallTalkUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.MICRO_PHONE, d85.f0.L, new com.tencent.mm.plugin.ipcall.ui.h5(this))) {
            T6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        setScreenEnable(true);
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = this.f142719n;
        if (l6Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TalkUIController", "onDestroy");
            l6Var.f142926y.f142444d = null;
            com.tencent.mm.plugin.ipcall.model.r.Di().f317099e = null;
            j83.b bVar = com.tencent.mm.plugin.ipcall.model.r.Di().f317096b;
            if (bVar != null) {
                bVar.f298160k = null;
            }
            com.tencent.mm.plugin.ipcall.model.r.Di().f317098d = null;
            l83.l lVar = com.tencent.mm.plugin.ipcall.model.r.Di().f317095a;
            lVar.f317117h = null;
            lVar.f317113d.a();
            lVar.f317114e.b();
            l6Var.f142924w = null;
            l6Var.f142927z = null;
        }
        iq4.d dVar = this.f142720o;
        if (dVar != null) {
            dVar.o0();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        int i18;
        int i19;
        if (this.f142719n != null) {
            boolean z17 = false;
            if (com.tencent.mm.plugin.ipcall.model.r.bj().b()) {
                if (i17 == 25) {
                    l83.c cVar = com.tencent.mm.plugin.ipcall.model.r.Di().f317096b.f298161l;
                    if (cVar != null) {
                        com.tencent.mm.plugin.voip.model.e eVar = cVar.f317090a;
                        i19 = (eVar == null || !cVar.f317092c) ? -1 : eVar.g();
                    } else {
                        i19 = 0;
                    }
                    if (i19 != -1) {
                        i95.m c17 = i95.n0.c(ym1.f.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        xm1.h hVar = ((ym1.f) c17).f463136e;
                        if (hVar == null) {
                            hVar = new xm1.j();
                            i95.m c18 = i95.n0.c(ym1.f.class);
                            kotlin.jvm.internal.o.f(c18, "getService(...)");
                            ((ym1.f) c18).f463136e = hVar;
                            i95.m c19 = i95.n0.c(ym1.f.class);
                            kotlin.jvm.internal.o.f(c19, "getService(...)");
                            ((ym1.f) c19).f463138g[0] = "music";
                        }
                        to.a.a(hVar.c(), i19, -1, 5);
                        z17 = true;
                    }
                } else if (i17 == 24) {
                    l83.c cVar2 = com.tencent.mm.plugin.ipcall.model.r.Di().f317096b.f298161l;
                    if (cVar2 != null) {
                        com.tencent.mm.plugin.voip.model.e eVar2 = cVar2.f317090a;
                        i18 = (eVar2 == null || !cVar2.f317092c) ? -1 : eVar2.g();
                    } else {
                        i18 = 0;
                    }
                    if (i18 != -1) {
                        i95.m c27 = i95.n0.c(ym1.f.class);
                        kotlin.jvm.internal.o.f(c27, "getService(...)");
                        xm1.h hVar2 = ((ym1.f) c27).f463136e;
                        if (hVar2 == null) {
                            hVar2 = new xm1.j();
                            i95.m c28 = i95.n0.c(ym1.f.class);
                            kotlin.jvm.internal.o.f(c28, "getService(...)");
                            ((ym1.f) c28).f463136e = hVar2;
                            i95.m c29 = i95.n0.c(ym1.f.class);
                            kotlin.jvm.internal.o.f(c29, "getService(...)");
                            ((ym1.f) c29).f463138g[0] = "music";
                        }
                        to.a.a(hVar2.c(), i18, 1, 5);
                        z17 = true;
                    }
                }
            }
            if (z17) {
                return true;
            }
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = this.f142719n;
        if (l6Var != null) {
            boolean hasWindowFocus = hasWindowFocus();
            l6Var.getClass();
            l6Var.F = (hasWindowFocus || !((android.app.KeyguardManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) && ((android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power")).isScreenOn();
        }
        iq4.d dVar = this.f142720o;
        if (dVar != null) {
            dVar.z();
            qp1.h0.b();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallTalkUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallTalkUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 80) {
            return;
        }
        if (iArr[0] == 0) {
            T6();
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhn), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.plugin.ipcall.ui.j5(this), new com.tencent.mm.plugin.ipcall.ui.k5(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = this.f142719n;
        if (l6Var != null) {
            l6Var.getClass();
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).f(42);
        }
        iq4.d dVar = this.f142720o;
        if (dVar != null) {
            dVar.p0();
            qp1.h0.a(true, false, true);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallTalkUI", "onStop");
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = this.f142719n;
        if (l6Var == null || !l6Var.F || l6Var.E) {
            return;
        }
        com.tencent.mm.plugin.ipcall.model.r.Bi().f142508i.d();
    }
}
