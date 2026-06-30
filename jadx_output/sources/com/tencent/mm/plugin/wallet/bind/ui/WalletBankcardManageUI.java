package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class WalletBankcardManageUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f178548y = 0;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f178556n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f178557o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f178558p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f178559q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f178560r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f178561s;

    /* renamed from: t, reason: collision with root package name */
    public at4.k0 f178562t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f178563u;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f178549d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f178550e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public at4.x1 f178551f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f178552g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f178553h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.bind.ui.c f178554i = null;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.bind.ui.c f178555m = null;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f178564v = new com.tencent.mm.plugin.wallet.bind.ui.v(this);

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f178565w = new com.tencent.mm.plugin.wallet.bind.ui.w(this);

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f178566x = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaBindCardEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.9
        {
            this.__eventId = 572563856;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent) {
            com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent2 = kindaBindCardEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "KindaBindCardEvent callback");
            if (kindaBindCardEvent2 == null) {
                return false;
            }
            com.tencent.mm.wallet_core.model.i1.a();
            com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI = com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.this;
            am.di diVar = kindaBindCardEvent2.f54454g;
            if (diVar != null) {
                if (diVar.f6453a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "KindaBindCardEvent bindCard Succ");
                    walletBankcardManageUI.V6(false);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "KindaBindCardEvent bindCard Cancel");
                }
            }
            walletBankcardManageUI.f178566x.dead();
            return true;
        }
    };

    public void U6(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        new com.tencent.mm.plugin.wallet.bind.ui.y(this, bundle).run();
    }

    public void V6(boolean z17) {
        if (z17) {
            doSceneForceProgress(new ss4.e0(null, 12));
        } else {
            doSceneProgress(new ss4.e0(null, 12), false);
        }
    }

    public com.tencent.mm.plugin.wallet.bind.ui.c W6() {
        return new com.tencent.mm.plugin.wallet.bind.ui.c(this, this.f178549d);
    }

    public void X6(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        java.lang.String str;
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BANKCARD_DETAIL_URL_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletBankcardManageUI", "jumpToH5BankDetail :: url is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "jumpToH5BankDetail :: url is not null");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String format = java.lang.String.format("bank_type=%s&card_tail=%s&bind_serial=%s", bankcard.field_bankcardType, bankcard.field_bankcardTail, bankcard.field_bindSerial);
        if (str2.contains("?")) {
            str = str2 + "&" + format;
        } else {
            str = str2 + "?" + format;
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("disable_bounce_scroll", true);
        intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
        intent.putExtra("pay_report_scene", 1);
        com.tencent.mm.wallet_core.ui.r1.T(getContext(), intent);
    }

    public void Y6(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("key_bankcard", bankcard);
        com.tencent.mm.wallet_core.a.j(this, sr4.b.class, bundle, null);
    }

    public final void Z6() {
        at4.l lVar;
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BIND_CARD_MENU_STRING_SYNC, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                lVar = new at4.l();
                lVar.f13888a = jSONObject.optInt("menu_jump_type", -1);
                lVar.f13889b = jSONObject.optString("menu_jump_url", "");
                lVar.f13890c = jSONObject.optString("menu_username", "");
                lVar.f13891d = jSONObject.optString("menu_path", "");
                lVar.f13892e = jSONObject.optString("menu_title", "");
                lVar.f13893f = jSONObject.optString("menu_icon_url", "");
                com.tencent.mars.xlog.Log.i("BindCardMenu", "parse bind card menu, type: %s, title: %s", java.lang.Integer.valueOf(lVar.f13888a), lVar.f13892e);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("BindCardMenu", e17, "", new java.lang.Object[0]);
            }
            if (lVar != null || com.tencent.mm.sdk.platformtools.t8.K0(lVar.f13892e)) {
                android.view.View view = this.f178559q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(lVar.f13893f)) {
                this.f178560r.setUrl(lVar.f13893f);
            }
            this.f178561s.setText(lVar.f13892e);
            com.tencent.mm.wallet_core.ui.r1.d(this.f178561s);
            int i17 = lVar.f13888a;
            if (i17 == 1) {
                this.f178559q.setOnClickListener(new com.tencent.mm.plugin.wallet.bind.ui.t(this, lVar));
                android.view.View view2 = this.f178559q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 2) {
                this.f178559q.setOnClickListener(new com.tencent.mm.plugin.wallet.bind.ui.u(this, lVar));
                android.view.View view3 = this.f178559q;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletBankcardManageUI", "unknown type: %d", java.lang.Integer.valueOf(i17));
            android.view.View view4 = this.f178559q;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        lVar = null;
        if (lVar != null) {
        }
        android.view.View view5 = this.f178559q;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateApplyCreditEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void a7() {
        if (this.f178551f.s()) {
            this.f178556n.setEnabled(false);
        } else if (this.f178551f.y()) {
            this.f178556n.setEnabled(true);
        } else {
            this.f178556n.setEnabled(true);
        }
        java.util.ArrayList arrayList = this.f178549d;
        if (arrayList == null || arrayList.size() <= 0) {
            this.f178552g.setVisibility(8);
        } else {
            this.f178552g.setVisibility(0);
        }
        java.util.ArrayList arrayList2 = this.f178550e;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            this.f178553h.setVisibility(8);
        } else {
            this.f178553h.setVisibility(0);
        }
        at4.k0 k0Var = this.f178562t;
        if (k0Var == null || k0Var.field_is_show_entry != 1) {
            android.view.View view = this.f178558p;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((android.widget.TextView) this.f178558p.findViewById(com.tencent.mm.R.id.pc8)).setText(this.f178562t.field_title);
            at4.k0 k0Var2 = this.f178562t;
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pcj);
            int i17 = k0Var2.field_red_dot_index;
            gm0.j1.i();
            if (((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LOAN_ENTRANCE_RED_POINT_INT, -1)).intValue() < i17 && i17 > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "red point update");
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pc7);
            if (k0Var2.field_is_overdue == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.is_overdue = true");
                textView2.setText(com.tencent.mm.R.string.kge);
                textView2.setTextColor(getResources().getColor(com.tencent.mm.R.color.a2y));
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(k0Var2.field_tips)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.tips not null");
                textView2.setText(k0Var2.field_tips);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(k0Var2.field_available_otb)) {
                textView2.setVisibility(8);
                android.view.View view2 = this.f178558p;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.available_otb not null");
                int indexOf = k0Var2.field_available_otb.indexOf(".");
                java.lang.String str = k0Var2.field_available_otb;
                if (indexOf > 0) {
                    str = str.substring(0, indexOf);
                }
                textView2.setText(getString(com.tencent.mm.R.string.kgd, str));
            }
            textView2.setVisibility(0);
            android.view.View view22 = this.f178558p;
            java.util.ArrayList arrayList42 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal22 = zj0.c.f473285a;
            arrayList42.add(0);
            java.util.Collections.reverse(arrayList42);
            yj0.a.d(view22, arrayList42.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view22.setVisibility(((java.lang.Integer) arrayList42.get(0)).intValue());
            yj0.a.f(view22, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f178554i.c(arrayList);
        this.f178554i.notifyDataSetChanged();
        this.f178555m.c(arrayList2);
        this.f178555m.notifyDataSetChanged();
        this.f178556n.setEnabled(true);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean checkProcLife() {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (!getIntent().getBooleanExtra("intent_finish_self", false)) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
            j45.l.j(this, "mall", ".ui.MallIndexUIv2", intent, null);
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5l;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.wallet.bind.ui.r(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p_t);
        this.f178556n = textView;
        textView.setOnClickListener(new com.tencent.mm.plugin.wallet.bind.ui.s(this));
        this.f178552g = (android.widget.ListView) findViewById(com.tencent.mm.R.id.aej);
        com.tencent.mm.plugin.wallet.bind.ui.c W6 = W6();
        this.f178554i = W6;
        this.f178552g.setAdapter((android.widget.ListAdapter) W6);
        android.widget.ListView listView = this.f178552g;
        android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f178565w;
        listView.setOnItemClickListener(onItemClickListener);
        this.f178553h = (android.widget.ListView) findViewById(com.tencent.mm.R.id.p3n);
        com.tencent.mm.plugin.wallet.bind.ui.c cVar = new com.tencent.mm.plugin.wallet.bind.ui.c(this, this.f178550e);
        this.f178555m = cVar;
        this.f178553h.setAdapter((android.widget.ListAdapter) cVar);
        this.f178553h.setOnItemClickListener(onItemClickListener);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487656pc1);
        this.f178557o = findViewById;
        android.view.View.OnClickListener onClickListener = this.f178564v;
        findViewById.setOnClickListener(onClickListener);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.pc6);
        this.f178558p = findViewById2;
        findViewById2.setOnClickListener(onClickListener);
        this.f178559q = findViewById(com.tencent.mm.R.id.f487659pc4);
        this.f178560r = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.f487660pc5);
        this.f178561s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487658pc3);
        Z6();
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f178563u = wcPayBannerView;
        wcPayBannerView.a();
        final com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        walletGetBulletinEvent.f54955g.f6893a = "4";
        walletGetBulletinEvent.f192364d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.f178548y;
                com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI = com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.this;
                walletBankcardManageUI.getClass();
                com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent2 = walletGetBulletinEvent;
                am.j10 j10Var = walletGetBulletinEvent2.f54956h;
                if (j10Var.f6997d == 2) {
                    walletBankcardManageUI.f178563u.setBannerData(j10Var.f6998e);
                } else {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(j10Var.f6994a)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "no bulletin data");
                        return;
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) walletBankcardManageUI.findViewById(com.tencent.mm.R.id.af7);
                    am.j10 j10Var2 = walletGetBulletinEvent2.f54956h;
                    com.tencent.mm.wallet_core.ui.r1.s0(null, textView2, j10Var2.f6994a, j10Var2.f6995b, j10Var2.f6996c);
                }
            }
        };
        walletGetBulletinEvent.e();
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.wallet.bind.ui.q(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setContentViewVisibility(4);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "index Oncreate");
        this.f178551f = vr4.f1.wi().Ai();
        setMMTitle(com.tencent.mm.R.string.f493534kn0);
        hideActionbarLine();
        initView();
        com.tencent.mm.wallet_core.model.n1.d(5, 0);
        com.tencent.mm.wallet_core.ui.r1.q0(27, 1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14422, 5);
        this.f178562t = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14001j;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f178554i.f178620g.a();
        this.f178555m.f178620g.a();
        this.f178566x.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (this.f178551f.s()) {
            V6(true);
        } else {
            this.f178551f.i(this.f178549d, this.f178550e);
            if (this.f178551f.f13999h != null) {
                setContentViewVisibility(0);
            }
            V6(false);
        }
        a7();
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "onSceneEnd");
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof ss4.e0)) {
            return false;
        }
        this.f178562t = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f14001j;
        setContentViewVisibility(0);
        this.f178551f.i(this.f178549d, this.f178550e);
        a7();
        Z6();
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet_core.utils.a.class);
    }
}
