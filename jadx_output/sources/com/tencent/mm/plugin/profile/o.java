package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.ContactInfoUI f153541a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f153542b;

    /* renamed from: c, reason: collision with root package name */
    public r45.wl f153543c;

    /* renamed from: d, reason: collision with root package name */
    public sr3.g f153544d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.tab.m0 f153545e;

    /* renamed from: f, reason: collision with root package name */
    public qk.o f153546f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f153547g;

    /* renamed from: h, reason: collision with root package name */
    public final int f153548h;

    /* renamed from: i, reason: collision with root package name */
    public jz5.l f153549i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f153550j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.ViewGroup f153551k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f153552l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f153553m;

    /* renamed from: n, reason: collision with root package name */
    public int f153554n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f153555o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f153556p;

    /* renamed from: q, reason: collision with root package name */
    public int f153557q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f153558r;

    /* renamed from: s, reason: collision with root package name */
    public int f153559s;

    /* renamed from: t, reason: collision with root package name */
    public int f153560t;

    public o(com.tencent.mm.plugin.profile.ui.ContactInfoUI context, com.tencent.mm.storage.z3 z3Var, r45.wl wlVar, sr3.g config, com.tencent.mm.plugin.profile.ui.tab.m0 m0Var, qk.o oVar, java.lang.String pageId) {
        int i17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(pageId, "pageId");
        this.f153541a = context;
        this.f153542b = z3Var;
        this.f153543c = wlVar;
        this.f153544d = config;
        this.f153545e = m0Var;
        this.f153546f = oVar;
        this.f153547g = pageId;
        int ordinal = config.g().ordinal();
        if (ordinal == 0) {
            com.tencent.mm.storage.z3 z3Var2 = this.f153542b;
            i17 = z3Var2 != null && z3Var2.n2() ? 0 : 1;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            i17 = 5;
        }
        this.f153548h = i17;
        sr3.a g17 = this.f153544d.g();
        sr3.a aVar = sr3.a.f411830f;
        if (g17 == aVar && this.f153544d.a() && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wj()) {
            if (this.f153544d.g() == aVar) {
                try {
                    tk.s[] sVarArr = tk.s.f419870d;
                    ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Ni(2).h("BrandProfileInteractionRedDot", new com.tencent.mm.plugin.profile.i(this));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("BizProfileMenuController", "subscribeInteractionRedDotEvent error: " + e17.getMessage());
                }
            }
            a();
        }
        this.f153549i = new jz5.l("", "");
        this.f153555o = true;
    }

    public final void a() {
        if (this.f153544d.g() != sr3.a.f411830f) {
            return;
        }
        int i17 = this.f153560t + 1;
        this.f153560t = i17;
        try {
            tk.s[] sVarArr = tk.s.f419870d;
            ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Ni(2).b(com.tencent.wechat.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_PROFILE, new com.tencent.mm.plugin.profile.b(i17, this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("BizProfileMenuController", "fetchInteractionRedDotCount error: " + e17.getMessage());
        }
    }

    public final android.widget.TextView b(android.view.View view, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewWithTag("interaction_badge");
        if (textView == null) {
            textView = new android.widget.TextView(this.f153541a);
            textView.setTag("interaction_badge");
            textView.setTextColor(textView.getContext().getColor(com.tencent.mm.R.color.aaw));
            textView.setGravity(17);
            textView.setIncludeFontPadding(false);
            textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.a(textView.getContext()));
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(1, weImageView.getId());
            layoutParams.addRule(6, weImageView.getId());
            layoutParams.leftMargin = i65.a.b(this.f153541a, 32);
            layoutParams.topMargin = i65.a.b(this.f153541a, 4);
            android.view.ViewParent parent = weImageView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.addView(textView, layoutParams);
            }
        }
        return textView;
    }

    public final void c() {
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        com.tencent.mm.storage.z3 z3Var = this.f153542b;
        com.tencent.mm.storage.z3 n17 = Bi.n(z3Var != null ? z3Var.d1() : null, true);
        if (n17 == null) {
            n17 = this.f153542b;
        }
        this.f153542b = n17;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f153541a, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.profile.e(this);
        k0Var.f211881s = new com.tencent.mm.plugin.profile.g(this);
        k0Var.v();
        com.tencent.mm.storage.z3 z3Var2 = this.f153542b;
        java.lang.String d17 = z3Var2 != null ? z3Var2.d1() : null;
        if (d17 == null) {
            d17 = "";
        }
        gr3.e.d(d17, 600, this.f153544d.c(), this.f153541a.getIntent(), this.f153548h, this.f153544d.b(), 0, null, null, null, 0, 0, 4032, null);
    }

    public final void d(boolean z17) {
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f153545e;
        if (m0Var != null) {
            if (!(m0Var.f154454f & (!com.tencent.mm.sdk.platformtools.t8.K0(m0Var.f154455g)))) {
                m0Var = null;
            }
            if (m0Var != null) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f153541a);
                u1Var.g(m0Var.f154455g);
                u1Var.n(this.f153541a.getString(com.tencent.mm.R.string.ak7));
                u1Var.l(com.tencent.mm.plugin.profile.h.f153480a);
                u1Var.q(false);
                return;
            }
        }
        com.tencent.mm.storage.z3 z3Var = this.f153542b;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("ftsneedkeyboard", true);
        int i17 = z17 ? 261 : this.f153544d.g() == sr3.a.f411830f ? 244 : 136;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(i17, true, 0);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        hashMap.put("userName", d17);
        hashMap.put("fromProfileTab", java.lang.String.valueOf(this.f153559s));
        r45.wl wlVar = this.f153543c;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(wlVar != null ? wlVar.f389243q : null)) {
            r45.wl wlVar2 = this.f153543c;
            hashMap.put("thirdExtParam", wlVar2 != null ? wlVar2.f389243q : null);
        }
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsbizusername", d17);
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f153541a;
        ((c61.l7) b6Var).getClass();
        if (contactInfoUI != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(contactInfoUI).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            com.tencent.mm.plugin.finder.report.s0.f125340b = nyVar != null ? nyVar.f135382p : null;
        }
        if (this.f153544d.a()) {
            a17.putExtra(com.tencent.mm.ui.w2.f211201n, 33723);
            java.lang.String str = com.tencent.mm.ui.w2.f211202o;
            byte[] decode = android.util.Base64.decode(((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Bi(), 0);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            a17.putStringArrayListExtra(str, kz5.c0.d(java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.t8.V(new java.lang.String(decode, r26.c.f368865a), 0L)), java.lang.String.valueOf((java.lang.Object) 0L), java.lang.String.valueOf((java.lang.Object) 0L), java.lang.String.valueOf(502L), java.lang.String.valueOf(0L)));
            a17.addFlags(67108864);
            gr3.b.f274847a.b(0L, 0L, 501L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, this.f153544d.b(), (r29 & 128) != 0 ? 0 : this.f153548h, (r29 & 256) != 0 ? 0 : 0);
        } else {
            a17.putExtra(com.tencent.mm.ui.w2.f211201n, 13307);
            java.lang.String str2 = com.tencent.mm.ui.w2.f211202o;
            java.lang.String str3 = d17 == null ? "" : d17;
            int b18 = this.f153544d.b();
            sr3.j y07 = com.tencent.mm.plugin.profile.p2.Ai().y0(str3);
            java.lang.String str4 = y07 != null ? y07.field_decryptUserName : null;
            a17.putStringArrayListExtra(str2, kz5.c0.d(str3, "3", java.lang.String.valueOf(com.tencent.mm.plugin.appbrand.jsapi.finder.v.CTRL_INDEX), "4", str4 == null ? "" : str4, java.lang.String.valueOf(com.tencent.mm.storage.c2.f193803a), java.lang.String.valueOf(b18)));
            a17.addFlags(67108864);
            gr3.e.d(d17 == null ? "" : d17, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, this.f153544d.c(), this.f153541a.getIntent(), this.f153548h, 0, (this.f153541a.isFragmentMode() || (this.f153541a instanceof com.tencent.mm.plugin.profile.ui.DialogContactInfoUI)) ? 1 : 0, null, null, null, 0, 0, 3968, null);
        }
        a17.putExtra("ftsbizscene", i17);
        a17.putExtra("ftsInitToSearch", true);
        j45.l.y(this.f153541a, a17);
    }

    public final void e(boolean z17, boolean z18) {
        boolean z19;
        if (!this.f153552l) {
            com.tencent.mars.xlog.Log.w("BizProfileMenuController", "contentView not set, skip updateActionBarMenu");
            return;
        }
        if (z18 || z17 != this.f153553m) {
            com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f153541a;
            contactInfoUI.getClass();
            if (contactInfoUI instanceof com.tencent.mm.plugin.profile.ui.DialogContactInfoUI) {
                com.tencent.mars.xlog.Log.i("BizProfileMenuController", "isDialogStyle");
                return;
            }
            com.tencent.mars.xlog.Log.i("BizProfileMenuController", "updateActionBarMenu  return");
            this.f153553m = z17;
            this.f153541a.removeAllOptionMenu();
            boolean z27 = true;
            if (!this.f153555o && !z17 && !this.f153544d.a()) {
                if (!this.f153541a.isFragmentMode() && !(this.f153541a instanceof com.tencent.mm.plugin.profile.ui.DialogContactInfoUI)) {
                    z27 = false;
                }
                if (z27) {
                    android.view.View view = this.f153550j;
                    if (view != null) {
                        view.post(new com.tencent.mm.plugin.profile.n(this));
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("contentView");
                        throw null;
                    }
                }
                return;
            }
            com.tencent.mm.storage.z3 z3Var = this.f153542b;
            if (z3Var != null && z3Var.l2()) {
                if (!this.f153556p) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_biz_photo_search_android, false)) {
                        z19 = true;
                    }
                }
                z19 = false;
            } else {
                z19 = !this.f153556p;
            }
            if (z19) {
                this.f153541a.addIconOptionMenu(1, com.tencent.mm.R.string.jzr, com.tencent.mm.R.raw.actionbar_icon_dark_search, new com.tencent.mm.plugin.profile.j(this));
            }
            if (this.f153544d.g() == sr3.a.f411830f && this.f153544d.a() && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wj()) {
                com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI2 = this.f153541a;
                contactInfoUI2.addIconOptionMenu(9, contactInfoUI2.getString(com.tencent.mm.R.string.pgs), com.tencent.mm.R.raw.bell_on_regular, new com.tencent.mm.plugin.profile.k(this));
                this.f153558r = true;
                android.view.View view2 = this.f153550j;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("contentView");
                    throw null;
                }
                view2.post(new com.tencent.mm.plugin.profile.l(this));
            } else {
                this.f153558r = false;
            }
            this.f153541a.addIconOptionMenu(0, com.tencent.mm.R.string.b4l, com.tencent.mm.R.raw.actionbar_icon_dark_more, new com.tencent.mm.plugin.profile.m(this));
        }
    }

    public final void f(android.widget.TextView textView, int i17) {
        if (i17 <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setTextSize(0, i65.a.f(this.f153541a, com.tencent.mm.R.dimen.f479930ja) * i65.a.m(this.f153541a));
        if (i17 > 99) {
            textView.setText("");
            textView.setBackgroundResource(com.tencent.mm.R.raw.badge_count_more);
        } else {
            textView.setText(java.lang.String.valueOf(i17));
            textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(this.f153541a, i17));
        }
    }

    public final void g() {
        com.tencent.mm.ui.eb E;
        try {
            com.tencent.mm.ui.ga controller = this.f153541a.getController();
            android.view.View view = (controller == null || (E = controller.E(9)) == null) ? null : E.f208385k;
            if (view == null) {
                com.tencent.mars.xlog.Log.w("BizProfileMenuController", "updateInteractionBadge: normalActionView is null");
                return;
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f482482fq);
            if (weImageView == null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f482483fr)) == null) {
                weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f482484fs);
            }
            if (weImageView == null) {
                com.tencent.mars.xlog.Log.w("BizProfileMenuController", "updateInteractionBadge: iconView not found");
            } else {
                f(b(view, weImageView), this.f153557q);
                this.f153541a.updateOptionMenuRedDot(9, false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("BizProfileMenuController", "updateInteractionBadge error: " + e17.getMessage());
        }
    }

    public final void h(as3.m0 tabType, boolean z17) {
        kotlin.jvm.internal.o.g(tabType, "tabType");
        int ordinal = tabType.ordinal();
        int i17 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                i17 = 5;
                if (ordinal != 2) {
                    i17 = ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? 0 : 7 : 6 : 3;
                }
            } else {
                i17 = z17 ? 4 : 2;
            }
        }
        this.f153559s = i17;
    }
}
