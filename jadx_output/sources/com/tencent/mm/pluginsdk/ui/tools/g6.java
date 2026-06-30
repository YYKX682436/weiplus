package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public final class g6 implements com.tencent.mm.pluginsdk.ui.tools.y3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f191644a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.x3 f191645b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.w3 f191646c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f191647d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f191648e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f191649f;

    /* renamed from: g, reason: collision with root package name */
    public final o25.y1 f191650g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f191651h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f191652i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f191653j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f191654k;

    public g6(android.app.Activity context, com.tencent.mm.pluginsdk.ui.tools.x3 config, com.tencent.mm.pluginsdk.ui.tools.w3 creator) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(creator, "creator");
        this.f191644a = context;
        this.f191645b = config;
        this.f191646c = creator;
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.f191650g = new com.tencent.mm.pluginsdk.forward.m();
        java.lang.String str = ((com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(config.f191985h), com.tencent.mm.pluginsdk.ui.tools.p5.class)).f68406d;
        com.tencent.mars.xlog.Log.i("MicroMsg.QBMenuBottomSheetHelper", "init defaultPkgName:" + str);
        kotlin.jvm.internal.o.f(str, "also(...)");
        this.f191653j = str;
        this.f191654k = jz5.h.b(new com.tencent.mm.pluginsdk.ui.tools.f6(this));
    }

    public static final void a(com.tencent.mm.pluginsdk.ui.tools.g6 g6Var, android.view.MenuItem menuItem) {
        com.tencent.mm.pluginsdk.ui.tools.r5 r5Var;
        g6Var.getClass();
        com.tencent.mm.pluginsdk.ui.tools.r5[] values = com.tencent.mm.pluginsdk.ui.tools.r5.values();
        int length = values.length;
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                r5Var = null;
                break;
            }
            r5Var = values[i17];
            if (r5Var.ordinal() == menuItem.getItemId()) {
                break;
            } else {
                i17++;
            }
        }
        com.tencent.mm.pluginsdk.ui.tools.x3 x3Var = g6Var.f191645b;
        if (r5Var != null) {
            ((sy.x) ((ty.m0) i95.n0.c(ty.m0.class))).wi(java.lang.Integer.toString(g6Var.hashCode()), x3Var.f191981d, com.tencent.mm.sdk.platformtools.w2.a(x3Var.f191983f), r5Var.f191878d, x3Var.f191985h, g6Var.f191646c.i5());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.QBMenuBottomSheetHelper", "dealMenuClick: " + menuItem.getItemId());
        int itemId = menuItem.getItemId();
        com.tencent.mm.pluginsdk.ui.tools.r5[] r5VarArr = com.tencent.mm.pluginsdk.ui.tools.r5.f191877e;
        android.app.Activity activity = g6Var.f191644a;
        if (itemId == 0) {
            by5.s0.j(x3Var.f191981d);
            boolean z18 = x3Var.f191989l;
            if (z18 || (!z18 && x3Var.f191994q)) {
                com.tencent.mm.xwebutil.i.f(g6Var.f191644a, x3Var.f191982e, x3Var.f191983f, x3Var.f191981d, x3Var.f191987j, x3Var.f191988k, !z18 && x3Var.f191994q);
                return;
            } else {
                db5.e1.E(activity, x3Var.f191990m, "", activity.getResources().getString(com.tencent.mm.R.string.l_e), false, com.tencent.mm.pluginsdk.ui.tools.v5.f191955d);
                return;
            }
        }
        if (itemId == 1) {
            yz5.a aVar = g6Var.f191647d;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        if (itemId == 3) {
            if (x3Var.f191980c != null) {
                d73.i iVar = (d73.i) i95.n0.c(d73.i.class);
                com.tencent.mm.plugin.handoff.model.HandOff handOff = x3Var.f191980c;
                kotlin.jvm.internal.o.d(handOff);
                iVar.f6(handOff);
                return;
            }
            return;
        }
        if (itemId == 5) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
            u1Var.g(activity.getString(com.tencent.mm.R.string.g_6));
            u1Var.a(true);
            u1Var.m(com.tencent.mm.R.string.f490002i4);
            u1Var.l(new com.tencent.mm.pluginsdk.ui.tools.w5(g6Var));
            u1Var.i(com.tencent.mm.pluginsdk.ui.tools.x5.f191999a);
            u1Var.q(false);
            return;
        }
        if (itemId == 6) {
            by5.s0.i(x3Var.f191981d);
            ((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).wi(activity, new com.tencent.mm.pluginsdk.ui.tools.y5(g6Var));
            return;
        }
        if (itemId == 4) {
            ((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).wi(activity, new com.tencent.mm.pluginsdk.ui.tools.z5(g6Var));
            return;
        }
        if (itemId == 8) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = x3Var.f191978a.f300077a;
            if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() && multiTaskInfo != null) {
                z17 = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo);
            }
            x3Var.f191978a.B(!z17);
            return;
        }
        if (itemId == 9) {
            ((com.tencent.mm.plugin.ball.service.d) x3Var.f191979b).A(true, 2);
            g6Var.c("view_clk");
            return;
        }
        if (itemId == 10) {
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            java.lang.String str = x3Var.f191982e;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = x3Var.f191983f;
            java.lang.String str3 = str2 != null ? str2 : "";
            com.tencent.mm.pluginsdk.ui.tools.a6 a6Var = new com.tencent.mm.pluginsdk.ui.tools.a6(g6Var);
            ((yb0.g) b0Var).getClass();
            com.tencent.mm.platformtools.ExportFileUtil.e(activity, str, str3, a6Var);
            return;
        }
        if (itemId == 7) {
            com.tencent.mm.ui.ee.f(activity.getTaskId(), null);
            return;
        }
        if (itemId == 13) {
            yz5.a aVar2 = g6Var.f191648e;
            if (aVar2 != null) {
                aVar2.invoke();
                return;
            }
            return;
        }
        if (itemId == 2) {
            jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
            java.lang.String str4 = x3Var.f191982e;
            java.lang.String str5 = x3Var.f191983f;
            java.lang.String str6 = x3Var.f191981d;
            java.lang.String valueOf = java.lang.String.valueOf(activity.hashCode());
            java.lang.String str7 = x3Var.f191984g;
            ((ht.s) a0Var).getClass();
            com.tencent.mm.pluginsdk.model.t3.r(activity, str4, str5, str6, valueOf, "FROM_SCENE_OPEN_BY_QB", str7);
            return;
        }
        if (itemId == 11) {
            jt.a0 a0Var2 = (jt.a0) i95.n0.c(jt.a0.class);
            android.app.Activity activity2 = g6Var.f191644a;
            java.lang.String str8 = x3Var.f191982e;
            java.lang.String str9 = x3Var.f191983f;
            java.lang.String str10 = x3Var.f191981d;
            java.lang.String valueOf2 = java.lang.String.valueOf(activity.hashCode());
            java.lang.String str11 = x3Var.f191984g;
            ((ht.s) a0Var2).getClass();
            com.tencent.mm.pluginsdk.model.t3.r(activity2, str8, str9, str10, valueOf2, "SEARCH_IN_FILE", str11);
            return;
        }
        if (itemId != 12) {
            if (itemId == 14) {
                ((qg5.h2) ((ct.x2) i95.n0.c(ct.x2.class))).wi(activity, x3Var.f191987j, x3Var.f191988k);
                ((v02.f0) ((a00.j) i95.n0.c(a00.j.class))).wj();
                return;
            }
            return;
        }
        jt.a0 a0Var3 = (jt.a0) i95.n0.c(jt.a0.class);
        android.app.Activity activity3 = g6Var.f191644a;
        java.lang.String str12 = x3Var.f191982e;
        java.lang.String str13 = str12 == null ? "" : str12;
        java.lang.String str14 = x3Var.f191983f;
        java.lang.String str15 = str14 == null ? "" : str14;
        java.lang.String str16 = x3Var.f191981d;
        java.lang.String str17 = str16 == null ? "" : str16;
        java.lang.String valueOf3 = java.lang.String.valueOf(activity.hashCode());
        java.lang.String str18 = x3Var.f191984g;
        java.lang.String str19 = str18 == null ? "" : str18;
        com.tencent.mm.pluginsdk.ui.tools.w3 w3Var = g6Var.f191646c;
        ((ht.s) a0Var3).getClass();
        new com.tencent.mm.pluginsdk.ui.q2(activity3, str13, str15, str17, valueOf3, str19, w3Var).f191090h.C();
    }

    public void b() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f191649f;
        boolean z17 = false;
        if (k0Var != null) {
            k0Var.V1 = false;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f191644a, 0, false);
        this.f191649f = k0Var2;
        com.tencent.mm.pluginsdk.ui.tools.x3 x3Var = this.f191645b;
        if (!x3Var.f191998u) {
            boolean z18 = x3Var.f191989l;
            boolean z19 = true;
            if (!z18) {
                if (!z18 && x3Var.f191994q) {
                    z17 = true;
                }
                z19 = z17;
            }
            if (z19) {
                ((com.tencent.mm.pluginsdk.forward.m) this.f191650g).Di(this.f191644a, k0Var2, 1, null, new com.tencent.mm.pluginsdk.ui.tools.t5(this));
            }
        }
        k0Var2.f211872n = new com.tencent.mm.pluginsdk.ui.tools.b6(this, k0Var2);
        k0Var2.f211874o = new com.tencent.mm.pluginsdk.ui.tools.c6(this, k0Var2);
        k0Var2.f211881s = new com.tencent.mm.pluginsdk.ui.tools.d6(this);
        k0Var2.f211884v = new com.tencent.mm.pluginsdk.ui.tools.e6(this);
    }

    public final void c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("btn_scene", 7);
        hashMap.put("view_id", "float_win_btn");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, hashMap, 33488);
    }
}
