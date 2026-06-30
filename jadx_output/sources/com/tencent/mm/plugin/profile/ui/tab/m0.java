package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public class m0 implements com.tencent.mm.modelbase.u0 {
    public static long Y;
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public long D;
    public qk.n E;
    public com.google.android.material.appbar.AppBarLayout F;
    public com.tencent.mm.plugin.profile.ui.tab.ContactWidgetActionLiveBar G;
    public com.tencent.mm.plugin.profile.ui.tab.d1 H;
    public android.os.Bundle I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f154451J;
    public com.tencent.mm.storage.z3 K;
    public int L;
    public final java.lang.String M;
    public com.tencent.mm.plugin.profile.ui.tab.c1 U;
    public zq1.v V;
    public com.tencent.mm.sdk.event.IListener W;
    public long X;

    /* renamed from: d, reason: collision with root package name */
    public final sr3.g f154452d;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f154456h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f154457i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.profile.ui.tab.e7 f154458m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f154459n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f154460o;

    /* renamed from: p, reason: collision with root package name */
    public qk.o f154461p;

    /* renamed from: q, reason: collision with root package name */
    public r45.wl f154462q;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.tab.s4 f154464s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelsns.SnsAdClick f154465t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f154466u;

    /* renamed from: v, reason: collision with root package name */
    public int f154467v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f154468w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f154470y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f154471z;

    /* renamed from: e, reason: collision with root package name */
    public boolean f154453e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f154454f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f154455g = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f154463r = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f154469x = false;
    public boolean N = false;
    public java.lang.String P = null;
    public boolean Q = false;
    public java.lang.String R = null;
    public int S = 0;
    public int T = 0;

    public m0(com.tencent.mm.ui.MMActivity mMActivity, android.view.View view, com.tencent.mm.plugin.profile.ui.tab.e7 e7Var, sr3.g gVar, java.lang.String str) {
        this.f154465t = null;
        this.B = "";
        this.C = 0;
        this.L = 0;
        this.M = "";
        com.tencent.mm.plugin.profile.ui.tab.u0 u0Var = new com.tencent.mm.plugin.profile.ui.tab.u0(this);
        this.V = null;
        this.W = null;
        this.X = 0L;
        this.f154457i = view;
        this.f154456h = mMActivity;
        this.f154458m = e7Var;
        this.f154452d = gVar;
        this.M = str == null ? "" : str;
        this.f154464s = new com.tencent.mm.plugin.profile.ui.tab.s4(view, mMActivity, u0Var, this);
        if (this.G == null) {
            this.G = new com.tencent.mm.plugin.profile.ui.tab.ContactWidgetActionLiveBar(mMActivity);
            android.view.View j17 = mMActivity.getController().G.j();
            if (j17 instanceof android.widget.LinearLayout) {
                ((android.widget.LinearLayout) j17).addView(this.G);
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.G.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.weight = 1.0f;
                layoutParams.gravity = 17;
                this.G.setLayoutParams(layoutParams);
            } else if (j17 instanceof android.widget.RelativeLayout) {
                ((android.widget.RelativeLayout) j17).addView(this.G);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.G.getLayoutParams();
                layoutParams2.width = -2;
                layoutParams2.addRule(13);
                this.G.setLayoutParams(layoutParams2);
            }
        }
        this.F = (com.google.android.material.appbar.AppBarLayout) view.findViewById(com.tencent.mm.R.id.am8);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.G, "living_label_profile_header_view");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.G, 40, 26236);
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put("live_id", "");
        arrayMap.put("finder_username", "");
        arrayMap.put("feed_id", "");
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        arrayMap.put("comment_scene", a52.a.f1584l);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this.G, arrayMap);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.G, new com.tencent.mm.plugin.profile.ui.tab.q0(this));
        this.F.a(new com.tencent.mm.plugin.profile.ui.tab.p0(this));
        this.f154465t = (com.tencent.mm.modelsns.SnsAdClick) mMActivity.getIntent().getParcelableExtra("KSnsAdTag");
        this.A = mMActivity.getIntent().getStringExtra("key_add_contact_report_info");
        this.C = mMActivity.getIntent().getIntExtra("add_more_friend_search_scene", 0);
        android.os.Bundle bundleExtra = mMActivity.getIntent().getBundleExtra("Contact_Ext_Args");
        this.I = bundleExtra;
        if (bundleExtra != null) {
            this.B = bundleExtra.getString("Contact_Ext_Args_Search_Click_Id", "");
        }
        this.D = java.lang.System.currentTimeMillis();
        mMActivity.getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
        mMActivity.getIntent().getIntExtra("biz_profile_tab_type", 0);
        int ordinal = gVar.g().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            this.L = 5;
            return;
        }
        com.tencent.mm.storage.z3 z3Var = this.f154459n;
        if (z3Var != null && z3Var.n2()) {
            this.L = 0;
            return;
        }
        com.tencent.mm.storage.z3 z3Var2 = this.f154459n;
        if (z3Var2 == null || !z3Var2.m2()) {
            return;
        }
        this.L = 1;
    }

    public static void a(com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        m0Var.getClass();
        java.lang.String i17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).i(m0Var.f154463r);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - m0Var.X >= 1000) {
            m0Var.X = currentTimeMillis;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23044, 1, m0Var.f154463r, java.lang.Integer.valueOf(m0Var.f154467v), java.lang.Integer.valueOf(com.tencent.mm.storage.c2.f193803a), i17, java.lang.Integer.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(m0Var.f154463r)), 1, "");
        }
        m0Var.G.setOnClickListener(new com.tencent.mm.plugin.profile.ui.tab.r0(m0Var, i17));
        if (!(!com.tencent.mm.sdk.platformtools.t8.K0(i17))) {
            m0Var.G.setVisibility(8);
        } else {
            m0Var.G.setVisibility(0);
            m0Var.f154456h.setMMTitle("");
        }
    }

    public static void b(final com.tencent.mm.plugin.profile.ui.tab.m0 m0Var, boolean z17) {
        boolean i17 = m0Var.i();
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).i(m0Var.f154463r));
        m0Var.f154456h.getController().D0(i17 ? 8 : 0);
        android.view.View view = m0Var.f154451J;
        if (view != null) {
            int i18 = i17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "updateTitleFollowView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "updateTitleFollowView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        final java.lang.String str = "";
        if (i17) {
            if (m0Var.f154451J == null) {
                com.tencent.mm.ui.MMActivity mMActivity = m0Var.f154456h;
                m0Var.f154451J = mMActivity.getLayoutInflater().inflate(com.tencent.mm.R.layout.a1w, (android.view.ViewGroup) null);
                android.view.View j17 = mMActivity.getController().G.j();
                if (j17 instanceof android.widget.LinearLayout) {
                    ((android.widget.LinearLayout) j17).addView(m0Var.f154451J);
                    android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) m0Var.f154451J.getLayoutParams();
                    layoutParams.width = -2;
                    layoutParams.weight = 1.0f;
                    layoutParams.gravity = 17;
                    m0Var.f154451J.setLayoutParams(layoutParams);
                } else if (j17 instanceof android.widget.RelativeLayout) {
                    ((android.widget.RelativeLayout) j17).addView(m0Var.f154451J);
                    android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) m0Var.f154451J.getLayoutParams();
                    layoutParams2.width = -2;
                    layoutParams2.addRule(13);
                    m0Var.f154451J.setLayoutParams(layoutParams2);
                }
                android.widget.ImageView imageView = (android.widget.ImageView) m0Var.f154451J.findViewById(com.tencent.mm.R.id.czn);
                android.widget.TextView textView = (android.widget.TextView) m0Var.f154451J.findViewById(com.tencent.mm.R.id.czo);
                boolean z19 = java.lang.System.currentTimeMillis() - Y < 2000;
                com.tencent.mm.storage.z3 z3Var = m0Var.f154459n;
                boolean z27 = m0Var.f154453e;
                lr1.m.a(imageView, z3Var, z27 ? "" : m0Var.f154460o, !z27 && z19);
                java.lang.String P0 = m0Var.f154459n.P0();
                if (P0 == null) {
                    P0 = "";
                }
                textView.setText(P0);
                com.tencent.mm.ui.tools.d8.a(m0Var.f154451J);
            }
            android.view.View view2 = m0Var.f154451J;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "updateActionBarInHalfScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "updateActionBarInHalfScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m0Var.f154451J.setOnClickListener(new com.tencent.mm.plugin.profile.ui.tab.x0(m0Var));
        }
        if (!i17 && !z18) {
            str = z17 ? m0Var.f154452d.f(m0Var.f154456h, m0Var.f154459n).f411848a : m0Var.f154459n.P0();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizHeaderController", "updateTitleFollowView visible=%b, dialogStyle=%b, showLive=%b, titleTag=%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(i17), java.lang.Boolean.valueOf(z18), str);
        final boolean z28 = (i17 || z18 || z17) ? false : true;
        if (android.text.TextUtils.equals(m0Var.f154456h.getMMTitle().toString(), str) && z28 == m0Var.N) {
            return;
        }
        m0Var.N = z28;
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.profile.ui.tab.m0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.profile.ui.tab.m0 m0Var2 = com.tencent.mm.plugin.profile.ui.tab.m0.this;
                java.lang.String str2 = m0Var2.P;
                java.lang.String str3 = str;
                boolean equals = android.text.TextUtils.equals(str3, str2);
                boolean z29 = z28;
                if (equals && z29 == m0Var2.Q && android.text.TextUtils.equals(m0Var2.f154460o, m0Var2.R)) {
                    return;
                }
                m0Var2.P = str3;
                m0Var2.Q = z29;
                java.lang.String str4 = m0Var2.f154460o;
                m0Var2.R = str4;
                int i19 = m0Var2.S + 1;
                m0Var2.S = i19;
                if (m0Var2.f154453e) {
                    str4 = "";
                }
                if (android.text.TextUtils.isEmpty(str4) || android.text.TextUtils.isEmpty(str3) || !z29) {
                    m0Var2.f154456h.setMMTitle(str3);
                    return;
                }
                o11.f fVar = new o11.f();
                fVar.f342077a = true;
                fVar.f342091o = com.tencent.mm.R.drawable.bhm;
                n11.a.b().i(str4, null, fVar.a(), new com.tencent.mm.plugin.profile.ui.tab.w0(m0Var2, i19, str3));
            }
        });
    }

    public boolean c() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f154456h;
        if (mMActivity.getIntent() == null) {
            return false;
        }
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID);
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("device_type");
        com.tencent.mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent exDeviceCheckDeviceIsBoundEvent = new com.tencent.mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent();
        am.f5 f5Var = exDeviceCheckDeviceIsBoundEvent.f54119g;
        f5Var.f6638b = stringExtra;
        f5Var.f6637a = stringExtra2;
        exDeviceCheckDeviceIsBoundEvent.e();
        return exDeviceCheckDeviceIsBoundEvent.f54120h.f6739a;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.tab.m0.d():void");
    }

    public void e(jz5.l lVar) {
        if (this.f154465t != null) {
            com.tencent.mm.autogen.events.ReportAdClickEvent reportAdClickEvent = new com.tencent.mm.autogen.events.ReportAdClickEvent();
            com.tencent.mm.modelsns.SnsAdClick snsAdClick = this.f154465t;
            snsAdClick.f71469g = 5;
            reportAdClickEvent.f54680g.f8210a = snsAdClick;
            reportAdClickEvent.e();
        }
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.MMActivity mMActivity = this.f154456h;
        if (mMActivity.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false)) {
            intent.setFlags(268435456);
        }
        intent.putExtra("chat_from_scene", mMActivity.getIntent().getIntExtra("chat_from_scene", 0));
        intent.putExtra("KOpenArticleSceneFromScene", 126);
        intent.putExtra("specific_chat_from_scene", 5);
        intent.putExtra("uinserve_search_click_id", mMActivity.getIntent().getBundleExtra("Contact_Ext_Args") != null ? mMActivity.getIntent().getBundleExtra("Contact_Ext_Args").getString("Contact_Ext_Args_Search_Click_Id", "") : "");
        if (this.f154468w) {
            intent.putExtra("Chat_User", this.f154459n.d1());
            intent.putExtra("Chat_Mode", 1);
            mMActivity.setResult(-1, intent);
        } else {
            intent.putExtra("Chat_User", this.f154459n.d1());
            intent.putExtra("Chat_Mode", 1);
            intent.putExtra("finish_direct", true);
            if (lVar != null) {
                intent.putExtra("extras_key_parent_index", ((java.lang.Integer) lVar.f302833d).intValue());
                intent.putExtra("extras_key_sub_index", ((java.lang.Integer) lVar.f302834e).intValue());
            }
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, mMActivity);
        }
        k(5, null);
        gr3.e.c(this.f154459n.d1(), 300, this.D, mMActivity.getIntent(), this.L, this.f154467v);
        gr3.f.f274857a.a(this.M, "chat", "", -1L);
    }

    public void f() {
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        qk.o oVar = this.f154461p;
        com.tencent.mm.ui.MMActivity mMActivity = this.f154456h;
        com.tencent.mm.storage.z3 z3Var = this.f154459n;
        com.tencent.mm.plugin.profile.ui.tab.y0 y0Var = new com.tencent.mm.plugin.profile.ui.tab.y0(this);
        int i17 = i() ? 4 : 0;
        ((com.tencent.mm.app.o7) n6Var).getClass();
        com.tencent.mm.ui.tools.n1.b(oVar, mMActivity, z3Var, true, y0Var, i17);
        gr3.e.c(this.f154459n.d1(), 1000, this.D, this.f154456h.getIntent(), this.L, this.f154467v);
        gr3.f.f274857a.a(this.M, "unfollow", "", -1L);
    }

    public void g() {
        qk.o oVar = this.f154461p;
        if (oVar == null || oVar.D0(false) == null || this.f154461p.D0(false).i() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizHeaderController", "registerSource is null, return");
            return;
        }
        java.lang.String str = this.f154461p.D0(false).i().f364249e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizHeaderController", "bizInfo aboutBizUrl is null, will not jump webView");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                android.net.Uri parse = android.net.Uri.parse(str);
                if (com.tencent.mm.sdk.platformtools.t8.K0(parse.getQueryParameter("half_mode"))) {
                    str = parse.buildUpon().appendQueryParameter("half_mode", "1").build().toString();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetTabBizHeaderController", "appendHalfModeParam fail: %s", e17.getMessage());
            }
        }
        java.lang.String d17 = this.f154459n.d1();
        long j17 = this.D;
        com.tencent.mm.ui.MMActivity mMActivity = this.f154456h;
        gr3.e.c(d17, 1600, j17, mMActivity.getIntent(), this.L, this.f154467v);
        com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = new com.tencent.mm.plugin.webview.ui.tools.widget.n1();
        n1Var.f187426i = 0;
        n1Var.f187423f = -1;
        n1Var.f187437t = 2;
        n1Var.f187422e = false;
        n1Var.f187429l = 3;
        n1Var.f187424g = true;
        n1Var.f187439v = true;
        n1Var.f187432o = false;
        ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) ((yg0.s2) ((zg0.u2) i95.n0.c(zg0.u2.class))).wi(mMActivity, str, null, n1Var)).show();
    }

    public void h() {
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = this.f154464s;
        if (s4Var != null) {
            s4Var.f154568l0 = false;
            java.lang.Object value = ((jz5.n) s4Var.f154562i0).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View view = (android.view.View) value;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "hidePhotoAccountGuideCard", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView", "hidePhotoAccountGuideCard", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public boolean i() {
        com.tencent.mm.plugin.profile.ui.tab.d1 d1Var = this.H;
        if (d1Var != null) {
            com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = ((com.tencent.mm.plugin.profile.ui.tab.d5) d1Var).f154274a.f154198d;
            contactInfoUI.getClass();
            if (contactInfoUI instanceof com.tencent.mm.plugin.profile.ui.DialogContactInfoUI) {
                return true;
            }
        }
        return false;
    }

    public final com.tencent.wechat.aff.chatbot.w1 j() {
        r45.x6 x6Var;
        byte[] decode;
        com.tencent.wechat.aff.chatbot.w1 w1Var;
        r45.wl wlVar = this.f154462q;
        com.tencent.wechat.aff.chatbot.w1 w1Var2 = null;
        if (wlVar == null || (x6Var = wlVar.G) == null) {
            return null;
        }
        java.lang.String str = x6Var.f389812i;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            decode = android.util.Base64.decode(str, 0);
            w1Var = new com.tencent.wechat.aff.chatbot.w1();
        } catch (java.io.IOException e17) {
            e = e17;
        }
        try {
            w1Var.parseFrom(decode);
            return w1Var;
        } catch (java.io.IOException e18) {
            e = e18;
            w1Var2 = w1Var;
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetTabBizHeaderController", "parseReportExtInfo error: " + e);
            return w1Var2;
        }
    }

    public final void k(int i17, java.lang.String str) {
        int i18;
        java.lang.String str2;
        android.os.Bundle bundle = this.I;
        if (bundle != null) {
            int i19 = this.f154467v;
            if (i19 == 39 || i19 == 56 || i19 == 35 || i19 == 87 || i19 == 88 || i19 == 89 || i19 == 85) {
                if (this.f154459n == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizHeaderController", "contact is null.");
                    return;
                }
                java.lang.String string = bundle.getString("Contact_Ext_Args_Search_Id");
                java.lang.String string2 = this.I.getString("Contact_Ext_Args_Query_String");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string2 == null) {
                    string2 = "";
                }
                int i27 = this.I.getInt("Contact_Ext_Args_Index");
                int i28 = this.f154467v;
                if (i28 == 35) {
                    i18 = 1;
                } else if (i28 != 85) {
                    switch (i28) {
                        case 87:
                            i18 = 2;
                            break;
                        case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                            i18 = 3;
                            break;
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_CHECK_STATE /* 89 */:
                            i18 = 4;
                            break;
                        default:
                            i18 = 0;
                            break;
                    }
                } else {
                    i18 = 5;
                }
                java.lang.String string3 = this.I.getString("Contact_Ext_Extra_Params");
                if (string3 == null) {
                    string3 = "";
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(string2);
                sb6.append(",");
                sb6.append(i17);
                sb6.append(",");
                java.lang.String d17 = this.f154459n.d1();
                sb6.append(d17 != null ? d17 : "");
                sb6.append(",");
                sb6.append(i27);
                sb6.append(",");
                sb6.append(java.lang.System.currentTimeMillis() / 1000);
                sb6.append(",");
                sb6.append(string);
                sb6.append(",");
                sb6.append(i18);
                java.lang.String sb7 = sb6.toString();
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str2 = sb7 + ",," + string3;
                } else {
                    str2 = sb7 + "," + str.replaceAll(",", ".") + "," + string3;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10866, str2 + "," + this.B + "," + java.lang.System.currentTimeMillis());
            }
        }
    }

    public void l(boolean z17) {
        com.google.android.material.appbar.AppBarLayout appBarLayout = this.F;
        if (appBarLayout != null) {
            appBarLayout.d(z17, true, true);
        }
    }

    public final void m() {
        java.util.LinkedList linkedList;
        com.tencent.mm.storage.z3 z3Var = this.f154459n;
        if (z3Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetTabBizHeaderController", "initView contact is null, return");
            return;
        }
        if (this.f154461p == null) {
            this.f154461p = r01.z.b(z3Var.d1());
        }
        qk.o oVar = this.f154461p;
        if (oVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(oVar.field_brandIconURL)) {
            this.f154460o = this.f154461p.field_brandIconURL;
        }
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = this.f154464s;
        s4Var.f154555f = this.f154459n;
        s4Var.f154557g = this.f154461p;
        s4Var.f154561i = this.f154460o;
        s4Var.f154559h = this.f154462q;
        s4Var.getClass();
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var2 = this.f154464s;
        s4Var2.f154563j = this.K;
        s4Var2.z();
        this.f154457i.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.profile.ui.tab.z0(this));
        r45.wl wlVar = this.f154462q;
        synchronized (this) {
            linkedList = null;
            if (wlVar != null) {
                r45.vm vmVar = wlVar.f389244r;
                if (vmVar != null) {
                    linkedList = vmVar.f388353e;
                }
            }
        }
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.um umVar = (r45.um) it.next();
            zq1.i0 i0Var = new zq1.i0();
            qk.o oVar2 = this.f154461p;
            i0Var.f474987e = oVar2 != null ? oVar2.field_appId : "";
            i0Var.f474983a = umVar.f387475f;
            i0Var.f474988f = umVar.f387473d;
            i0Var.f474989g = umVar.f387474e;
            i0Var.f474985c = 126;
            i0Var.f474986d = 6;
            arrayList.add(i0Var);
        }
        ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).f(arrayList, 32);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f154466u;
        if (u3Var != null && u3Var.isShowing()) {
            this.f154466u.dismiss();
        }
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetTabBizHeaderController", "scene == null");
            return;
        }
        c01.d9.e().q(m1Var.getType(), this);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactWidgetTabBizHeaderController", "scene.getType() = %s", java.lang.Integer.valueOf(m1Var.getType()));
            return;
        }
        m1Var.getType();
        if (m1Var.getType() == 536) {
            c01.d9.e().q(536, this);
            m();
        }
    }
}
