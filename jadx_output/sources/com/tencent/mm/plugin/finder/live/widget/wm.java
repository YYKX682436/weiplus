package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wm extends xt2.m6 implements jf2.o, jf2.k {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f120206d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f120207e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f120208f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f120209g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f120210h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f120211i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f120212m;

    /* renamed from: n, reason: collision with root package name */
    public r45.xn1 f120213n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f120214o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f120215p;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Vibrator f120216q;

    /* renamed from: r, reason: collision with root package name */
    public zi2.w f120217r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.lifecycle.k0 f120218s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f120219t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f120220u;

    /* renamed from: v, reason: collision with root package name */
    public vg2.y1 f120221v;

    public wm(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f120206d = root;
        this.f120207e = basePlugin;
        this.f120208f = "Finder.FinderLiveKTVSendFlowerEntranceWidget";
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.u8a);
        this.f120209g = viewGroup;
        this.f120210h = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.u8c);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.u8d);
        this.f120211i = findViewById;
        java.lang.Object systemService = root.getContext().getSystemService("vibrator");
        this.f120216q = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        this.f120219t = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.om(this));
        findViewById.setOnLongClickListener(new com.tencent.mm.plugin.finder.live.widget.tm(this));
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.um(this));
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.vm(this));
    }

    public static void m(com.tencent.mm.plugin.finder.live.widget.wm wmVar, android.view.ViewGroup viewGroup, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String username;
        if ((i18 & 4) != 0) {
            i17 = 1;
        }
        wmVar.f120212m = str;
        zi2.w wVar = wmVar.f120217r;
        java.lang.String str2 = wmVar.f120208f;
        if (wVar == null) {
            com.tencent.mars.xlog.Log.e(str2, "jumpToSendGift failed: plugin is null");
            return;
        }
        com.tencent.mars.xlog.Log.i(str2, "jumpToSendGift: giftId=" + str + ", batchCount=" + i17);
        android.os.Vibrator vibrator = wmVar.f120216q;
        if (vibrator != null) {
            vibrator.vibrate(50L);
        }
        java.lang.String str3 = ((mm2.c1) wVar.P0(mm2.c1.class)).f328852o;
        qo0.b bVar = qo0.b.f365326a2;
        qo0.c cVar = wVar.f473153p;
        qo0.c.a(cVar, bVar, null, 2, null);
        qo0.b bVar2 = qo0.b.Z1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", wmVar.f120212m);
        bundle.putInt("PARAM_FINDER_LIVE_GIFT_BATCH_SUM", i17);
        bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_SEND_BTN", false);
        bundle.putBoolean("PARAM_FINDER_LIVE_GIFT_IS_PKG", false);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_FREE_GIFT", false);
        bundle.putBoolean("PARAM_FINDER_LIVE_GIFT_SEND_BY_KTV_OUTER", true);
        r45.xn1 xn1Var = wmVar.f120213n;
        if (xn1Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null && (username = finderContact.getUsername()) != null && !kotlin.jvm.internal.o.b(username, str3)) {
            bundle.putString("PARAM_FINDER_LIVE_SEND_GIFT_TARGET_USER_NAME", username);
        }
        cVar.statusChange(bVar2, bundle);
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f120206d;
        if (viewGroup.getVisibility() != 0) {
            zi2.w wVar = this.f120217r;
            if (wVar == null) {
                return;
            } else {
                l(wVar);
            }
        }
        viewGroup.setVisibility(0);
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f120209g;
    }

    @Override // jf2.o
    public void g() {
        this.f120206d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f120206d;
    }

    @Override // jf2.o
    public boolean i() {
        return this.f120214o;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView iconView = this.f120210h;
        kotlin.jvm.internal.o.f(iconView, "iconView");
        return iconView;
    }

    public final boolean k(android.content.Context context, int i17, java.lang.String str) {
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_KTV_SEND_GIFT_SHOWN_BOOLEAN_SYNC, false);
        if (!o17) {
            com.tencent.mars.xlog.Log.i(this.f120208f, "Showing first-time gift guide");
            this.f120220u = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488950df2, null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
            roundedCornerFrameLayout.b(com.tencent.mm.ui.zk.a(context, 12), com.tencent.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
            android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484451eb4);
            android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f2w);
            android.widget.TextView textView3 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484639q56);
            android.widget.TextView textView4 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.b5i);
            android.view.View findViewById = roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.khs);
            textView.setText(com.tencent.mm.R.string.nqn);
            com.tencent.mm.ui.fk.a(textView);
            kotlin.jvm.internal.o.d(textView4);
            com.tencent.mm.ui.fk.a(textView4);
            kotlin.jvm.internal.o.d(textView2);
            com.tencent.mm.ui.fk.a(textView2);
            kotlin.jvm.internal.o.d(textView3);
            com.tencent.mm.ui.fk.a(textView3);
            textView2.setText(java.lang.String.valueOf(i17));
            textView4.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.em(this));
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.fm(this, str, i17));
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f120220u;
            if (k0Var != null) {
                k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.gm(this, roundedCornerFrameLayout);
            }
            if (k0Var != null) {
                k0Var.e(true);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f120220u;
            if (k0Var2 != null) {
                k0Var2.v();
            }
        }
        return o17;
    }

    public final void l(zi2.w wVar) {
        if (((mm2.c1) wVar.P0(mm2.c1.class)).f328880s3 <= 0) {
            com.tencent.mm.plugin.finder.live.util.y.m(wVar, null, null, new com.tencent.mm.plugin.finder.live.widget.im(this, wVar, null), 3, null);
        }
    }

    public final void n() {
        this.f120214o = false;
        this.f120206d.setVisibility(8);
    }

    public final void o(r45.tp1 tp1Var) {
        boolean z17;
        java.lang.String str;
        if (this.f120215p) {
            return;
        }
        if (!(tp1Var != null && tp1Var.getInteger(4) == 1)) {
            com.tencent.mars.xlog.Log.i(this.f120208f, "updateGiftInfo got gift type not ktv, set func disable");
            this.f120214o = false;
            this.f120206d.setVisibility(8);
            return;
        }
        this.f120215p = true;
        com.tencent.mars.xlog.Log.i(this.f120208f, "updateGiftInfo got gift type ktv, bind success");
        r45.kv1 kv1Var = (r45.kv1) tp1Var.getCustom(0);
        zi2.w wVar = this.f120217r;
        if (wVar == null) {
            return;
        }
        boolean z18 = ((mm2.c1) this.f120207e.P0(mm2.c1.class)).T;
        boolean z19 = ((mm2.n0) this.f120207e.P0(mm2.n0.class)).f329273r;
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) this.f120207e.X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
        if (ag0Var != null) {
            jf2.k0 k0Var = (jf2.k0) ag0Var.U0(jf2.k0.class);
            com.tencent.mm.plugin.finder.live.widget.wm wmVar = ag0Var.A;
            boolean z27 = k0Var != null && k0Var.g7(wmVar);
            android.view.ViewGroup viewGroup = z27 ? ag0Var.f111879J.f253921d : wmVar.f120206d;
            com.tencent.mars.xlog.Log.i(ag0Var.f111881w, "[ktvOuterFlowerView] isFolded=" + z27 + ", result.isShown=" + viewGroup.isShown() + ", result.visibility=" + viewGroup.getVisibility());
            z17 = viewGroup.isShown();
        } else {
            z17 = false;
        }
        java.lang.String str2 = this.f120208f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUpdateOuterGift - gift: ");
        if (kv1Var == null || (str = kv1Var.getString(0)) == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append(", isAssistant: ");
        sb6.append(z18);
        sb6.append(", isCoLiveInviteeAnchor: ");
        sb6.append(z19);
        sb6.append(", isGiftEntranceVisible: ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        if (kv1Var == null || z18 || z19) {
            n();
            return;
        }
        java.lang.String string = kv1Var.getString(0);
        if (string == null) {
            com.tencent.mars.xlog.Log.w(this.f120208f, "onUpdateOuterGift: giftId is null");
            n();
            return;
        }
        if (this.f120206d.getVisibility() == 0) {
            java.lang.Object tag = this.f120206d.getTag();
            if (kotlin.jvm.internal.o.b(tag instanceof java.lang.String ? (java.lang.String) tag : null, string)) {
                com.tencent.mars.xlog.Log.i(this.f120208f, "outerGift: " + string + " already show, return");
                return;
            }
        }
        n();
        com.tencent.mm.plugin.finder.live.util.y.m(wVar, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.widget.sm(kv1Var, this, string, wVar, null), 2, null);
    }

    public final void p(om2.d0 d0Var) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.lang.String username;
        java.lang.String str = null;
        om2.e0 e0Var = d0Var instanceof om2.e0 ? (om2.e0) d0Var : null;
        om2.o oVar = e0Var != null ? e0Var.f346299a : null;
        r45.xn1 xn1Var = oVar != null ? oVar.f346361b : null;
        if ((xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (username = finderContact2.getUsername()) == null) ? false : zl2.r4.f473950a.k2(username)) {
            xn1Var = null;
        }
        this.f120213n = xn1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update self target username: ");
        r45.xn1 xn1Var2 = this.f120213n;
        if (xn1Var2 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null) {
            str = finderContact.getUsername();
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i(this.f120208f, sb6.toString());
    }

    @Override // jf2.o
    public int type() {
        return 27;
    }

    @Override // jf2.o
    public boolean u() {
        return true;
    }
}
