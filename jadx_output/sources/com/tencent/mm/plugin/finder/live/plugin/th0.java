package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class th0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.y0 f114402p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.h1 f114403q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.gg f114404r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.aj f114405s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.bh f114406t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f114407u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114402p = kotlinx.coroutines.z0.b();
        this.f114407u = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.sh0(root, this));
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.th0 th0Var) {
        java.lang.String str;
        th0Var.getClass();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Lj((ml2.r0) c17, ml2.j4.f327620p, null, null, 6, null);
        android.content.Intent intent = new android.content.Intent();
        r45.eq1 eq1Var = ((mm2.n2) th0Var.P0(mm2.n2.class)).f329279g;
        if (eq1Var == null || (str = eq1Var.getString(3)) == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.j(th0Var.f365323d.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static final void u1(com.tencent.mm.plugin.finder.live.plugin.th0 th0Var, com.tencent.mm.plugin.finder.live.plugin.eh0 fromScene) {
        dk2.xf W0;
        dm.o4 o4Var = ((mm2.n2) th0Var.P0(mm2.n2.class)).f329282m;
        jz5.f0 f0Var = null;
        ce2.i iVar = o4Var instanceof ce2.i ? (ce2.i) o4Var : null;
        android.view.ViewGroup viewGroup = th0Var.f365323d;
        if (iVar != null) {
            if (th0Var.f114404r == null) {
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.live.widget.gg ggVar = new com.tencent.mm.plugin.finder.live.widget.gg(context);
                ggVar.setWecoinClickCallBack(new com.tencent.mm.plugin.finder.live.plugin.nh0(th0Var));
                ggVar.setJoinCallBack(new com.tencent.mm.plugin.finder.live.plugin.oh0(th0Var));
                ggVar.a(th0Var);
                th0Var.f114404r = ggVar;
            }
            com.tencent.mm.plugin.finder.live.widget.gg ggVar2 = th0Var.f114404r;
            if (ggVar2 != null) {
                kotlin.jvm.internal.o.g(fromScene, "fromScene");
                com.tencent.mars.xlog.Log.i("FinderLiveFansJoinWidget", "show fromScene:" + fromScene + ",payGift:" + iVar.field_name);
                ggVar2.f118442w = iVar;
                com.tencent.mm.plugin.finder.live.plugin.dh0 dh0Var = com.tencent.mm.plugin.finder.live.plugin.eh0.f112415e;
                ggVar2.f118443x = fromScene;
                ggVar2.f118440u = false;
                if (fromScene != com.tencent.mm.plugin.finder.live.plugin.eh0.f112420m && com.tencent.mm.plugin.finder.live.widget.m10.T == 9) {
                    com.tencent.mm.plugin.finder.live.widget.m10.S = 0L;
                    com.tencent.mm.plugin.finder.live.widget.m10.T = 0;
                    com.tencent.mm.plugin.finder.live.widget.m10.U = "";
                    com.tencent.mm.plugin.finder.live.widget.m10.V = null;
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "resetLastGameTeamClick, from:".concat("FansWidgetShow"));
                }
                ggVar2.f118436q.setText(java.lang.String.valueOf((int) iVar.P0()));
                ggVar2.f118437r.setText(ggVar2.getContext().getString(com.tencent.mm.R.string.ddv, iVar.field_name));
                wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(iVar.field_thumbnailFileUrl, com.tencent.mm.plugin.finder.storage.y90.f128356f));
                android.widget.ImageView giftImage = ggVar2.f118438s;
                kotlin.jvm.internal.o.f(giftImage, "giftImage");
                ((wo0.b) a17).c(giftImage);
                ggVar2.f118439t.setText(iVar.field_name);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.finder.live.plugin.l basePlugin = ggVar2.getBasePlugin();
                if (basePlugin != null && (W0 = basePlugin.W0()) != null) {
                    ((dk2.r4) W0).T(currentTimeMillis, new com.tencent.mm.plugin.finder.live.widget.fg(currentTimeMillis, ggVar2));
                }
                android.view.View view = ggVar2.f118433n;
                com.tencent.mm.plugin.finder.live.widget.io ioVar = new com.tencent.mm.plugin.finder.live.widget.io(view.getContext());
                zl2.r4.f473950a.Q2(view);
                ioVar.k(view);
                ioVar.B.setBackgroundResource(com.tencent.mm.R.drawable.b8l);
                ioVar.s();
                ggVar2.f118432m = ioVar;
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.Lj((ml2.r0) c17, ml2.j4.f327618n, null, fromScene, 2, null);
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            db5.t7.makeText(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.ddu), 0).show();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 27 || ordinal == 28) {
            O0();
            return;
        }
        if (ordinal != 223) {
            return;
        }
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorFansClubPanelPlugin", "青少年模式不展示粉丝");
            zl2.r4 r4Var = zl2.r4.f473950a;
            android.content.Context context = this.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r4Var.f3(context, "青少年模式不展示粉丝");
            return;
        }
        if (!((mm2.n2) P0(mm2.n2.class)).f329278f) {
            v1(com.tencent.mm.plugin.finder.live.plugin.eh0.f112416f);
            return;
        }
        x1();
        com.tencent.mm.plugin.finder.live.widget.aj ajVar = this.f114405s;
        if (ajVar != null) {
            ajVar.c(false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        com.tencent.mm.plugin.finder.live.widget.gg ggVar = this.f114404r;
        if (ggVar != null) {
            ggVar.f119168f = null;
            ggVar.b();
        }
        com.tencent.mm.plugin.finder.live.widget.aj ajVar = this.f114405s;
        if (ajVar != null) {
            ajVar.f119168f = null;
            ajVar.b();
            ajVar.f117776r.setOnVisibilityListener(null);
        }
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f114406t;
        if (bhVar != null) {
            bhVar.i();
        }
        com.tencent.mm.plugin.finder.live.widget.h1 h1Var = this.f114403q;
        if (h1Var != null) {
            h1Var.f119168f = null;
            h1Var.d();
            h1Var.f118498r = null;
            h1Var.f118494n = null;
            h1Var.f118496p = null;
            h1Var.f118499s = false;
            h1Var.f118502v = false;
        }
        com.tencent.mm.plugin.finder.live.widget.bw bwVar = (com.tencent.mm.plugin.finder.live.widget.bw) ((jz5.n) this.f114407u).getValue();
        if (bwVar != null) {
            bwVar.a();
        }
        kotlinx.coroutines.z0.e(this.f114402p, null, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void h1(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var;
        r45.eq1 eq1Var = ((mm2.n2) P0(mm2.n2.class)).f329279g;
        if (eq1Var != null && eq1Var.getBoolean(4)) {
            r45.eq1 eq1Var2 = ((mm2.n2) P0(mm2.n2.class)).f329279g;
            if (eq1Var2 != null && eq1Var2.getBoolean(1)) {
                w1();
                com.tencent.mm.plugin.finder.live.widget.h1 h1Var = this.f114403q;
                if (h1Var != null) {
                    com.tencent.mars.xlog.Log.i(h1Var.f118491h, "followSuccess tryFollowing:" + h1Var.f118503w + ",isFollow:" + z17);
                    if (z17 && h1Var.f118503w) {
                        h1Var.f118503w = false;
                        com.tencent.mm.plugin.finder.live.plugin.l basePlugin = h1Var.getBasePlugin();
                        if (basePlugin != null && (nd0Var = (com.tencent.mm.plugin.finder.live.plugin.nd0) basePlugin.X0(com.tencent.mm.plugin.finder.live.plugin.nd0.class)) != null) {
                            com.tencent.mm.plugin.finder.live.plugin.nd0.B1(nd0Var, false, 1, null);
                        }
                        h1Var.c();
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.eh0 eh0Var;
        jz5.f0 f0Var = null;
        if (!kotlin.jvm.internal.o.b(bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null, "PORTRAIT_ACTION_JOIN_FANS_CLUB") || a1()) {
            return;
        }
        android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
        if (bundle2 != null) {
            boolean z17 = bundle2.getBoolean("JOIN_FANS_CLUB_NEED_PURCHASE", false);
            com.tencent.mm.plugin.finder.live.plugin.dh0 dh0Var = com.tencent.mm.plugin.finder.live.plugin.eh0.f112415e;
            int i17 = bundle2.getInt("JOIN_FANS_CLUB_FROM_SCENE", 0);
            dh0Var.getClass();
            com.tencent.mm.plugin.finder.live.plugin.eh0[] values = com.tencent.mm.plugin.finder.live.plugin.eh0.values();
            int length = values.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    eh0Var = null;
                    break;
                }
                eh0Var = values[i18];
                if (eh0Var.f112423d == i17) {
                    break;
                } else {
                    i18++;
                }
            }
            if (eh0Var == null) {
                eh0Var = com.tencent.mm.plugin.finder.live.plugin.eh0.f112416f;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorFansClubPanelPlugin", "onPortraitAction needPurcase:" + z17 + ",fromScene:" + eh0Var);
            w1();
            com.tencent.mm.plugin.finder.live.widget.h1 h1Var = this.f114403q;
            if (h1Var != null) {
                h1Var.e(S0(), z17, eh0Var);
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorFansClubPanelPlugin", "onPortraitAction extraData:" + obj);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void v1(com.tencent.mm.plugin.finder.live.plugin.eh0 fromScene) {
        kotlin.jvm.internal.o.g(fromScene, "fromScene");
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorFansClubPanelPlugin", "checkFansClubState fromScene:" + fromScene + ", isActivate:" + kotlinx.coroutines.z0.h(this.f114402p));
        kotlinx.coroutines.l.d(this.f114402p, null, null, new com.tencent.mm.plugin.finder.live.plugin.gh0(this, fromScene, null), 3, null);
    }

    public final void w1() {
        com.tencent.mm.plugin.finder.live.widget.h1 pfVar;
        if (this.f114403q == null) {
            r45.eq1 eq1Var = ((mm2.n2) P0(mm2.n2.class)).f329279g;
            boolean z17 = false;
            if (eq1Var != null && eq1Var.getBoolean(10)) {
                z17 = true;
            }
            boolean z18 = ((mm2.n2) P0(mm2.n2.class)).f329281i;
            android.view.ViewGroup viewGroup = this.f365323d;
            if (!z17 || z18) {
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pfVar = new com.tencent.mm.plugin.finder.live.widget.pf(context);
            } else {
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                pfVar = new com.tencent.mm.plugin.finder.live.widget.rf(context2);
            }
            pfVar.setJoinClickListener(new com.tencent.mm.plugin.finder.live.plugin.jh0(this));
            pfVar.setDirectJoinListener(new com.tencent.mm.plugin.finder.live.plugin.kh0(this));
            pfVar.setHelpClickListener(new com.tencent.mm.plugin.finder.live.plugin.lh0(this));
            pfVar.setSubscribeSuperFansCallback(new com.tencent.mm.plugin.finder.live.plugin.mh0(pfVar));
            pfVar.a(this);
            this.f114403q = pfVar;
        }
    }

    public final void x1() {
        if (this.f114405s == null) {
            android.content.Context context = this.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.live.widget.aj ajVar = new com.tencent.mm.plugin.finder.live.widget.aj(context);
            ajVar.setHelpIconClickListener(new com.tencent.mm.plugin.finder.live.plugin.ph0(this));
            ajVar.setFansGroupClickListener(new com.tencent.mm.plugin.finder.live.plugin.qh0(this, ajVar));
            ajVar.a(this);
            this.f114405s = ajVar;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mm.plugin.finder.live.widget.gg ggVar = this.f114404r;
        if (ggVar != null) {
            ggVar.a(this);
        }
        com.tencent.mm.plugin.finder.live.widget.aj ajVar = this.f114405s;
        if (ajVar != null) {
            ajVar.a(this);
        }
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f114406t;
        if (bhVar != null) {
            bhVar.a(this);
        }
        com.tencent.mm.plugin.finder.live.widget.h1 h1Var = this.f114403q;
        if (h1Var != null) {
            h1Var.a(this);
        }
        com.tencent.mm.plugin.finder.live.widget.bw bwVar = (com.tencent.mm.plugin.finder.live.widget.bw) ((jz5.n) this.f114407u).getValue();
        bwVar.getClass();
        bwVar.f117925i = this;
        if (kotlinx.coroutines.z0.h(this.f114402p)) {
            return;
        }
        this.f114402p = kotlinx.coroutines.z0.b();
    }
}
