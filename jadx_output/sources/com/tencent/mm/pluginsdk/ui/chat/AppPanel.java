package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class AppPanel extends android.widget.LinearLayout {

    /* renamed from: x0, reason: collision with root package name */
    public static int f189925x0 = 215;

    /* renamed from: y0, reason: collision with root package name */
    public static boolean f189926y0;
    public int A;
    public int B;
    public com.tencent.mm.pluginsdk.ui.chat.a0 C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f189927J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public boolean P;
    public boolean Q;
    public java.util.Map R;
    public boolean S;
    public java.util.List T;
    public int U;
    public final com.tencent.mm.pluginsdk.ui.chat.f V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public android.content.SharedPreferences f189928d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f189929e;

    /* renamed from: f, reason: collision with root package name */
    public int f189930f;

    /* renamed from: g, reason: collision with root package name */
    public final int f189931g;

    /* renamed from: h, reason: collision with root package name */
    public final long f189932h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f189933i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.u f189934m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.v f189935n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.y4 f189936o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f189937p;

    /* renamed from: p0, reason: collision with root package name */
    public int f189938p0;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f189939q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFlipper f189940r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMDotView f189941s;

    /* renamed from: t, reason: collision with root package name */
    public int f189942t;

    /* renamed from: u, reason: collision with root package name */
    public int f189943u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f189944v;

    /* renamed from: w, reason: collision with root package name */
    public int f189945w;

    /* renamed from: x, reason: collision with root package name */
    public int f189946x;

    /* renamed from: y, reason: collision with root package name */
    public int f189947y;

    /* renamed from: z, reason: collision with root package name */
    public int f189948z;

    public AppPanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f189931g = 4;
        this.f189932h = java.lang.System.currentTimeMillis();
        this.f189933i = new boolean[24];
        this.f189939q = new java.util.ArrayList();
        this.f189944v = false;
        this.f189945w = 24;
        this.f189946x = 24;
        this.A = 0;
        this.B = -1;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f189927J = false;
        this.K = false;
        this.L = 0;
        this.M = false;
        this.N = 0;
        this.P = false;
        this.Q = false;
        this.R = null;
        this.S = true;
        this.T = new java.util.LinkedList();
        this.U = -1;
        this.V = new com.tencent.mm.pluginsdk.ui.chat.m(this);
        this.W = true;
        this.f189938p0 = -1;
        this.f189937p = context;
    }

    public static boolean c(com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel) {
        return com.tencent.mm.storage.z3.V3(appPanel.f189936o.c()) && ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Kj().D0(appPanel.f189936o.c()).field_actionPermission == 0;
    }

    public static void d(com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel) {
        appPanel.B(appPanel.f189937p.getString(com.tencent.mm.R.string.exz));
    }

    public static boolean e(com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel) {
        if (com.tencent.mm.storage.z3.J4(appPanel.f189936o.c())) {
            gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
            java.lang.String sessionId = appPanel.f189936o.c();
            fr4.g0 g0Var = (fr4.g0) fVar;
            g0Var.getClass();
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "check if " + sessionId + "'s AppPanel is forbidden");
            if (g0Var.Vi().y0(sessionId).field_status != 2) {
                return true;
            }
        }
        return false;
    }

    public static void g(com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel) {
        appPanel.B(appPanel.f189937p.getString(com.tencent.mm.R.string.pco));
    }

    private int getPortHeightPX() {
        int i17 = this.f189938p0;
        return i17 > 0 ? i17 : com.tencent.mm.sdk.platformtools.j.d(this.f189937p, f189925x0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getScreenOrientation() {
        android.view.Display defaultDisplay = ((android.view.WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        return defaultDisplay.getWidth() < defaultDisplay.getHeight() ? 1 : 2;
    }

    public static void h(com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel, boolean z17) {
        if (!f189926y0) {
            appPanel.getClass();
            f189926y0 = true;
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.pluginsdk.ui.chat.t(appPanel));
        }
        if (z17) {
            appPanel.f189934m.c(0);
        } else {
            appPanel.f189934m.c(1);
        }
    }

    public static void l(com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel, java.lang.String str) {
        appPanel.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", appPanel.f189936o.c());
        hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(appPanel.f189936o.d())));
        hashMap.put("enter_sessionid", appPanel.f189936o.b());
        hashMap.put("view_id", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
    }

    public static void n(com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel) {
        boolean z17;
        int i17;
        java.lang.Integer num;
        appPanel.getClass();
        java.lang.Integer num2 = 0;
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.AppPanel", "initAppGrid()", new java.lang.Object[0]);
        int i18 = appPanel.f189942t;
        if (i18 == 0 || appPanel.f189943u == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppPanel", "init app grid: %s, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(appPanel.f189943u));
            return;
        }
        if (appPanel.B == -1) {
            appPanel.f189940r.setToScreen(appPanel.A);
        }
        int d17 = com.tencent.mm.sdk.platformtools.j.d(appPanel.f189937p, 82.0f);
        int d18 = com.tencent.mm.sdk.platformtools.j.d(appPanel.f189937p, 90.0f);
        appPanel.o();
        appPanel.f189930f = 4;
        if (!appPanel.S) {
            appPanel.f189930f = appPanel.f189942t / d17;
        }
        int i19 = appPanel.f189943u;
        int i27 = i19 / d18;
        if (i27 > 2) {
            i27 = 2;
        }
        int i28 = (i19 - (d18 * i27)) / (i27 + 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "in initAppGrid, gridWidth = %d, gridHeight = %d, spacing:%d", java.lang.Integer.valueOf(appPanel.f189942t), java.lang.Integer.valueOf(appPanel.f189943u), java.lang.Integer.valueOf(i28));
        int i29 = 1;
        if (appPanel.f189930f == 0) {
            appPanel.f189930f = 1;
        }
        if (i27 == 0) {
            i27 = 1;
        }
        appPanel.f189947y = i27;
        appPanel.f189948z = appPanel.f189930f * i27;
        if (appPanel.C.f190152j.f190766a) {
            appPanel.f189946x = appPanel.f189945w + appPanel.T.size();
        } else {
            appPanel.f189946x = appPanel.f189945w;
        }
        int i37 = appPanel.f189946x;
        java.util.ArrayList arrayList = appPanel.C.G;
        int size = i37 + (arrayList != null ? arrayList.size() : 0);
        appPanel.f189946x = size;
        int ceil = (int) java.lang.Math.ceil(size / appPanel.f189948z);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "in initAppGrid, totalItemCount = %d, itemsPerPage = %d, pageCount = %d visibleLocalAppCount = %d infoList = %d", java.lang.Integer.valueOf(appPanel.f189946x), java.lang.Integer.valueOf(appPanel.f189948z), java.lang.Integer.valueOf(ceil), java.lang.Integer.valueOf(appPanel.f189945w), java.lang.Integer.valueOf(appPanel.T.size()));
        int i38 = appPanel.U;
        if (i38 == ceil) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "mLastPageCount == pageCount! [%s:%s]", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(ceil));
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            appPanel.f189939q = new java.util.ArrayList();
            appPanel.f189940r.removeAllViews();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i39 = 16776;
        if (ceil > 10) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(16776, num2, 1);
            g0Var.C(999L, 1L, 1L);
        }
        com.tencent.mm.pluginsdk.ui.chat.l lVar = new com.tencent.mm.pluginsdk.ui.chat.l(appPanel);
        boolean z18 = z17;
        ((ku5.t0) ku5.t0.f312615d).k(lVar, 5000L);
        long j17 = 0;
        int i47 = 0;
        while (true) {
            if (i47 >= ceil) {
                break;
            }
            if (i47 >= ceil) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppPanel", "my god! you see a ghost! %s", java.lang.Integer.valueOf(ceil));
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.C(999L, 0L, 1L);
                g0Var2.d(i39, java.lang.Integer.valueOf(i29), num2);
                break;
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mm.pluginsdk.ui.chat.AppGrid appGrid = z18 ? (com.tencent.mm.pluginsdk.ui.chat.AppGrid) android.view.View.inflate(appPanel.f189937p, com.tencent.mm.R.layout.f488126hv, null) : (((java.util.ArrayList) appPanel.f189939q).size() <= i47 || ((java.util.ArrayList) appPanel.f189939q).get(i47) == null) ? (com.tencent.mm.pluginsdk.ui.chat.AppGrid) android.view.View.inflate(appPanel.f189937p, com.tencent.mm.R.layout.f488126hv, null) : (com.tencent.mm.pluginsdk.ui.chat.AppGrid) ((java.util.ArrayList) appPanel.f189939q).get(i47);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "[initAppGrid] i:%s cost:%sms", java.lang.Integer.valueOf(i47), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            j17 += java.lang.System.currentTimeMillis() - currentTimeMillis2;
            java.util.List list = appPanel.T;
            java.util.Map map = appPanel.R;
            java.util.ArrayList arrayList2 = appPanel.C.G;
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
            }
            com.tencent.mm.pluginsdk.ui.chat.c cVar = appGrid.f189919n;
            if (cVar == null) {
                num = num2;
                appGrid.f189919n = new com.tencent.mm.pluginsdk.ui.chat.c(appGrid, appGrid.f189913e, list, map, arrayList2);
            } else {
                num = num2;
                cVar.f(list, map, arrayList2);
            }
            appGrid.setBackgroundResource(0);
            appGrid.setAdapter((android.widget.ListAdapter) appGrid.f189919n);
            appGrid.setOnItemClickListener(appGrid.f189923r);
            appGrid.setOnItemLongClickListener(appGrid.f189924s);
            android.content.Context context = appGrid.f189913e;
            appGrid.setPadding(com.tencent.mm.sdk.platformtools.j.d(context, 16.0f), com.tencent.mm.sdk.platformtools.j.d(context, 6.0f), com.tencent.mm.sdk.platformtools.j.d(context, 16.0f), 0);
            int i48 = appPanel.f189946x;
            int i49 = appPanel.f189948z;
            int i57 = appPanel.f189930f;
            int i58 = appPanel.f189945w;
            appGrid.f189917i = i47;
            appGrid.f189914f = i48;
            appGrid.f189915g = i49;
            appGrid.f189916h = ceil;
            appGrid.f189918m = i58;
            appGrid.setNumColumns(i57);
            if (i28 > 0) {
                android.content.Context context2 = appGrid.f189913e;
                appGrid.setPadding(com.tencent.mm.sdk.platformtools.j.d(context2, 16.0f), i28, com.tencent.mm.sdk.platformtools.j.d(context2, 16.0f), 0);
                appGrid.setVerticalSpacing(i28 / 2);
            }
            appGrid.setChattingContextRef(appPanel.f189936o.a());
            if (z18) {
                appPanel.f189940r.addView(appGrid, new android.widget.LinearLayout.LayoutParams(-1, -2));
                ((java.util.ArrayList) appPanel.f189939q).add(appGrid);
            }
            i47++;
            num2 = num;
            i29 = 1;
            i39 = 16776;
        }
        lVar.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "[initAppGrid] cost:%sms inflateCost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(j17));
        java.util.Iterator it = ((java.util.ArrayList) appPanel.f189939q).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.pluginsdk.ui.chat.AppGrid) it.next()).setOnAppSelectedListener(appPanel.V);
        }
        if (((java.util.ArrayList) appPanel.f189939q).size() <= 1) {
            appPanel.f189941s.setVisibility(4);
            i17 = 0;
        } else {
            i17 = 0;
            appPanel.f189941s.setVisibility(0);
            appPanel.f189941s.setDotCount(((java.util.ArrayList) appPanel.f189939q).size());
            int curScreen = appPanel.f189940r.getCurScreen();
            appPanel.f189940r.setToScreen(curScreen);
            appPanel.f189941s.setSelectedDot(curScreen);
        }
        appPanel.U = ceil;
        appPanel.requestLayout();
        if (appPanel.B == -1) {
            return;
        }
        int size2 = appPanel.C.f190152j.f190766a ? appPanel.f189945w + appPanel.T.size() : appPanel.f189945w;
        int i59 = appPanel.B + size2 + 1;
        int i66 = appPanel.f189948z;
        int i67 = i59 / i66;
        if (i59 % i66 <= 0) {
            i67--;
        }
        if (i67 < 0) {
            i67 = i17;
        }
        appPanel.A = i67;
        appPanel.f189940r.setToScreen(i67);
        appPanel.B = -1;
        com.tencent.mm.autogen.mmdata.rpt.PanelDynamicEnterActionStruct panelDynamicEnterActionStruct = new com.tencent.mm.autogen.mmdata.rpt.PanelDynamicEnterActionStruct();
        panelDynamicEnterActionStruct.f59832d = 1L;
        panelDynamicEnterActionStruct.f59833e = 1L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i68 = i17; i68 < appPanel.getAppPanelUnCertainEnterArrayList().size(); i68++) {
            int i69 = appPanel.A;
            int i76 = appPanel.B + size2 + 1;
            int i77 = appPanel.f189948z;
            int i78 = i76 / i77;
            if (i76 % i77 <= 0) {
                i78--;
            }
            if (i78 < 0) {
                i78 = i17;
            }
            if (i69 == i78) {
                sb6.append(appPanel.getAppPanelUnCertainEnterArrayList().get(i68).f190713g2);
                sb6.append("|");
            }
        }
        panelDynamicEnterActionStruct.f59834f = panelDynamicEnterActionStruct.b("AppList", sb6.toString(), true);
        panelDynamicEnterActionStruct.k();
    }

    public void A() {
        com.tencent.mm.pluginsdk.ui.chat.a0 a0Var = this.C;
        a0Var.f190143a.f190766a = true;
        a0Var.f190144b.f190766a = true;
        a0Var.f190145c.f190766a = true;
        a0Var.f190146d.f190766a = true;
        a0Var.f190147e.f190766a = true;
        a0Var.f190148f.f190766a = true;
        a0Var.f190149g.f190766a = true;
        a0Var.f190158p.f190766a = true;
        a0Var.f190156n.f190766a = true;
        a0Var.f190150h.f190766a = true;
        a0Var.f190151i.f190766a = true;
        a0Var.f190152j.f190766a = true;
        a0Var.f190153k.f190766a = true;
        a0Var.f190154l.f190766a = true;
        a0Var.f190155m.f190766a = true;
        a0Var.f190157o.f190766a = true;
        a0Var.f190159q.f190766a = true;
        a0Var.f190160r.f190766a = false;
        a0Var.f190161s.f190766a = true;
        a0Var.f190162t.f190766a = true;
        com.tencent.mm.pluginsdk.ui.chat.z zVar = a0Var.f190164v;
        zVar.f190766a = true;
        a0Var.f190165w.f190766a = true;
        zVar.f190766a = false;
        a0Var.B.f190766a = false;
        a0Var.f190166x.f190766a = true;
        a0Var.f190167y.f190766a = true;
        a0Var.f190168z.f190766a = true;
        a0Var.C.f190766a = true;
        a0Var.D.f190766a = true;
        a0Var.E.f190766a = false;
        a0Var.F.f190766a = true;
        this.K = false;
        this.L = 0;
        this.M = false;
        this.N = 0;
        this.P = false;
        this.Q = false;
        z();
        com.tencent.mm.pluginsdk.ui.chat.a0 a0Var2 = this.C;
        a0Var2.f190150h.f190766a = this.G;
        a0Var2.f190151i.f190766a = this.H;
        a0Var2.f190162t.f190766a = this.I;
        a0Var2.f190165w.f190766a = this.f189927J;
        o();
    }

    public final void B(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "showForbiddenDialog: %s", str);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f189937p);
        u1Var.g(str);
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.l_e);
        u1Var.l(new com.tencent.mm.pluginsdk.ui.chat.s(this));
        u1Var.e(new com.tencent.mm.pluginsdk.ui.chat.r(this));
        u1Var.q(false);
    }

    public java.util.ArrayList<com.tencent.mm.pluginsdk.ui.chat.x> getAppPanelUnCertainEnterArrayList() {
        java.util.ArrayList<com.tencent.mm.pluginsdk.ui.chat.x> arrayList = this.C.G;
        return arrayList == null ? new java.util.ArrayList<>() : arrayList;
    }

    public int getCurScreen() {
        com.tencent.mm.ui.base.MMFlipper mMFlipper = this.f189940r;
        if (mMFlipper != null) {
            return mMFlipper.getCurScreen();
        }
        return -1;
    }

    public int getPageMaxRowCount() {
        int i17 = this.f189947y;
        if (i17 != 0) {
            return i17;
        }
        int i18 = (this.f189946x + 3) / 4;
        if (i18 > 2) {
            return 2;
        }
        return i18;
    }

    public final void o() {
        int i17;
        if (this.D != 0) {
            this.D = 2;
            return;
        }
        boolean[] zArr = this.f189933i;
        int length = zArr.length;
        for (int i18 = 0; i18 < length; i18++) {
            zArr[i18] = true;
        }
        com.tencent.mm.pluginsdk.ui.chat.a0 a0Var = this.C;
        if (a0Var.f190145c.f190766a) {
            i17 = 0;
        } else {
            zArr[0] = false;
            i17 = 1;
        }
        if (!a0Var.f190144b.f190766a) {
            zArr[1] = false;
            i17++;
        }
        if (!a0Var.f190166x.f190766a) {
            zArr[20] = false;
            i17++;
        }
        if (!a0Var.f190167y.f190766a) {
            zArr[13] = false;
            i17++;
        }
        if (!a0Var.f190168z.f190766a) {
            zArr[14] = false;
            i17++;
        }
        boolean z17 = a0Var.A.f190766a;
        boolean Ai = ((vd2.u0) ((ss5.c0) i95.n0.c(ss5.c0.class))).Ai();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "roomEnable:%s, hideRoomLive:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(Ai));
        if (!z17 || Ai) {
            zArr[15] = false;
            i17++;
        }
        com.tencent.mm.pluginsdk.ui.chat.a0 a0Var2 = this.C;
        if (!a0Var2.f190158p.f190766a || !a0Var2.f190159q.f190766a) {
            zArr[6] = false;
            i17++;
        }
        if (!a0Var2.f190150h.f190766a) {
            zArr[18] = false;
            i17++;
        }
        if (!a0Var2.f190151i.f190766a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "disable remittance");
            zArr[9] = false;
            i17++;
        }
        com.tencent.mm.pluginsdk.ui.chat.a0 a0Var3 = this.C;
        if (!a0Var3.f190146d.f190766a) {
            zArr[16] = false;
            i17++;
        }
        if (!a0Var3.f190160r.f190766a) {
            zArr[17] = false;
            i17++;
        }
        if (!a0Var3.f190163u.f190766a) {
            zArr[3] = false;
            i17++;
        }
        if (!a0Var3.f190147e.f190766a) {
            zArr[12] = false;
            i17++;
        }
        if (!a0Var3.f190153k.f190766a) {
            zArr[5] = false;
            i17++;
        }
        if (!a0Var3.f190155m.f190766a || !a0Var3.f190154l.f190766a) {
            zArr[4] = false;
            i17++;
        }
        if (!a0Var3.f190149g.f190766a || !a0Var3.f190148f.f190766a) {
            zArr[2] = false;
            i17++;
        }
        if (!a0Var3.f190157o.f190766a || !a0Var3.f190156n.f190766a) {
            zArr[11] = false;
            i17++;
        }
        if (!a0Var3.f190162t.f190766a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "disable lucky money");
            zArr[7] = false;
            i17++;
        }
        if (!this.C.F.f190766a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "disable gift");
            zArr[8] = false;
            i17++;
        }
        com.tencent.mm.pluginsdk.ui.chat.a0 a0Var4 = this.C;
        if (!a0Var4.f190164v.f190766a) {
            zArr[19] = false;
            i17++;
        }
        if (!a0Var4.B.f190766a) {
            zArr[21] = false;
            i17++;
        }
        a0Var4.getClass();
        zArr[10] = false;
        int i19 = i17 + 1;
        com.tencent.mm.pluginsdk.ui.chat.a0 a0Var5 = this.C;
        if (!a0Var5.D.f190766a || !a0Var5.C.f190766a) {
            zArr[22] = false;
            i19++;
        }
        if (!a0Var5.E.f190766a) {
            zArr[23] = false;
            i19++;
        }
        this.f189945w = 24 - i19;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17 = configuration.orientation;
        if (i17 == 1 || i17 == 2) {
            if (i17 == 1) {
                this.S = true;
            } else {
                this.S = false;
            }
            setNeedRefreshHeight(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "[dealOrientationChange]");
            this.f189944v = false;
            this.f189940r.setToScreen(0);
            u();
            requestLayout();
        }
    }

    public final boolean p(boolean z17) {
        if (z17) {
            return false;
        }
        int i17 = this.E;
        if (i17 == 1 || i17 == 2) {
            gm0.j1.i();
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
            if (intValue == 0 || intValue == 1 || intValue == 8) {
                return true;
            }
        }
        return false;
    }

    public void q(boolean z17) {
        this.C.f190148f.f190766a = !z17;
        o();
        boolean z18 = this.C.f190149g.f190766a;
    }

    public void r(boolean z17) {
        this.C.f190154l.f190766a = !z17;
        o();
        boolean z18 = this.C.f190155m.f190766a;
    }

    public int s(int i17) {
        boolean[] zArr = this.f189933i;
        int length = zArr.length;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i18 >= length) {
                i19 = -1;
                break;
            }
            if (zArr[i18]) {
                if (i18 == i17) {
                    break;
                }
                i19++;
            }
            i18++;
        }
        if (i19 == -1) {
            return -1;
        }
        int i27 = i19 + 1;
        int i28 = this.f189948z;
        int i29 = i27 / i28;
        if (i27 % i28 <= 0) {
            i29--;
        }
        if (i29 < 0) {
            return 0;
        }
        return i29;
    }

    public void setAppPanelListener(com.tencent.mm.pluginsdk.ui.chat.u uVar) {
        this.f189934m = uVar;
    }

    public void setAppPanelUnCertainEnterArrayList(java.util.ArrayList<com.tencent.mm.pluginsdk.ui.chat.x> arrayList) {
        this.C.G = arrayList;
    }

    public void setChattingContext(yb5.d dVar) {
    }

    public void setNeedRefreshHeight(boolean z17) {
        this.W = z17;
    }

    public void setOnSwitchPanelListener(com.tencent.mm.pluginsdk.ui.chat.v vVar) {
        this.f189935n = vVar;
    }

    public void setPortHeighDP(int i17) {
        if (f189925x0 != i17) {
            f189925x0 = i17;
            this.W = true;
        }
    }

    public void setPortHeighPx(int i17) {
        if (this.f189938p0 != i17) {
            this.f189938p0 = i17;
            this.W = true;
        }
    }

    public void setServiceShowFlag(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "setServiceShowFlag: %s", java.lang.Integer.valueOf(i17));
        this.E = i17;
    }

    public void setUncertainEnterLocation(int i17) {
        this.B = i17;
    }

    public void t(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "init: %s", java.lang.Integer.valueOf(i17));
        this.C = new com.tencent.mm.pluginsdk.ui.chat.a0();
        this.E = i17;
        android.view.View.inflate(this.f189937p, com.tencent.mm.R.layout.f488129hy, this);
        this.f189941s = (com.tencent.mm.ui.base.MMDotView) findViewById(com.tencent.mm.R.id.a1s);
        this.f189940r = (com.tencent.mm.ui.base.MMFlipper) findViewById(com.tencent.mm.R.id.a1t);
        u();
        A();
        w(1000);
    }

    public final void u() {
        this.U = -1;
        this.f189940r.removeAllViews();
        this.f189940r.setOnMeasureListener(new com.tencent.mm.pluginsdk.ui.chat.g(this));
        this.f189940r.setOnFlipperViewShowedListener(new com.tencent.mm.pluginsdk.ui.chat.h(this));
        this.f189940r.setOnScreenChangedListener(new com.tencent.mm.pluginsdk.ui.chat.i(this));
        y();
    }

    public final void v(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        com.tencent.mm.pluginsdk.model.app.m mVar = new com.tencent.mm.pluginsdk.model.app.m();
        mVar.field_appId = str;
        mVar.field_openId = str2;
        mVar.field_appInfoFlag = 4;
        mVar.field_serviceAppInfoFlag = i17;
        mVar.field_serviceAppType = 1;
        mVar.field_serviceShowFlag = 3;
        mVar.field_status = 3;
        mVar.f238391x1 = 1;
        mVar.f238381p1 = str3;
        mVar.A = true;
        ((java.util.HashMap) this.R).put(str, mVar);
    }

    public final void w(int i17) {
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.AppPanel", "loadData(%s)", java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "loadData() delay: %s", java.lang.Integer.valueOf(i17));
        ((ku5.t0) ku5.t0.f312615d).A("AppPanel-loadinfo");
        ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.pluginsdk.ui.chat.k(this), i17, "AppPanel-loadinfo");
    }

    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "app panel refleshed: %s", java.lang.Integer.valueOf(this.E));
        w(0);
    }

    public void y() {
        if (this.W) {
            if (getScreenOrientation() == 2) {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.a1r);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
                layoutParams.height = com.tencent.mm.sdk.platformtools.j.d(this.f189937p, 158);
                findViewById.setLayoutParams(layoutParams);
            } else {
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.a1r);
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, 0);
                layoutParams2.height = getPortHeightPX();
                findViewById2.setLayoutParams(layoutParams2);
            }
            this.W = false;
        }
    }

    public void z() {
        boolean z17;
        boolean z18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().i() == 2;
        com.tencent.mm.pluginsdk.ui.chat.a0 a0Var = this.C;
        a0Var.f190149g.f190766a = true;
        a0Var.f190155m.f190766a = z18;
        j45.l.g(ya.b.LOCATION);
        com.tencent.mm.pluginsdk.ui.chat.a0 a0Var2 = this.C;
        a0Var2.f190159q.f190766a = true;
        a0Var2.f190157o.f190766a = true;
        ((ma0.h) ((ka0.i0) i95.n0.c(ka0.i0.class))).getClass();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_teenmode_show_chat_music, false);
        } else {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_send_music_to_chat_enable, bm5.h0.RepairerConfig_Mv_SendMusicInChat_Int, 1) == 1;
        }
        this.C.D.f190766a = z17;
    }

    public void setChattingContext(com.tencent.mm.pluginsdk.ui.chat.y4 y4Var) {
        this.f189936o = y4Var;
    }
}
