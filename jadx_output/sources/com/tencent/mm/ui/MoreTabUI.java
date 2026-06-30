package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class MoreTabUI extends com.tencent.mm.ui.AbstractTabChildPreference implements l75.z0, ze4.h, bi4.l0, bi4.s0 {
    public static final /* synthetic */ int B1 = 0;
    public final com.tencent.mm.ui.MoreTabUI.StoryCgiWatch A1;
    public android.view.View H;
    public com.tencent.mm.plugin.setting.ui.setting.b V;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.ui.MoreTabUI.NewTipsXmlListener f196945l1;
    public com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback mPullDownCallback;

    /* renamed from: p1, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f196947p1;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f196948s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f196949t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.listview.PullDownListView f196950u;

    /* renamed from: x0, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f196954x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f196955x1;

    /* renamed from: y0, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f196957y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f196958y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f196960z1;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.story.api.AbsStoryMuteView f196951v = null;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.RelativeLayout f196952w = null;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f196953x = null;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.FrostedContentView f196956y = null;
    private com.tencent.mm.plugin.story.api.AbsStoryGallery storyGallery = null;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f196959z = null;
    public final com.tencent.mm.ui.MoreTabUI.StoryStatusMachine A = new com.tencent.mm.ui.MoreTabUI.StoryStatusMachine(null);
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference G = null;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public int f196944J = 0;
    public int K = 0;
    public boolean L = false;
    public boolean M = false;
    public boolean N = false;
    public boolean P = false;
    public boolean Q = false;
    public boolean R = false;
    public int S = 0;
    public final com.tencent.mm.sdk.platformtools.n3 T = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public final d70.j U = new d70.j() { // from class: com.tencent.mm.ui.MoreTabUI.1
        @Override // d70.j
        public void a(com.tencent.mm.storage.u3 u3Var, int i17, java.lang.String str) {
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_NEW_CARD_REDDOT_WORDING_STRING_SYNC;
            com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
            if (u3Var == u3Var2) {
                int i18 = com.tencent.mm.ui.MoreTabUI.B1;
                moreTabUI.X0();
            } else if (u3Var == com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_NEW_CARD_ICON_STRING_SYNC) {
                int i19 = com.tencent.mm.ui.MoreTabUI.B1;
                moreTabUI.X0();
            } else if (u3Var == com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_WALLET_MORE_TAB_STRING_SYNC || u3Var == com.tencent.mm.storage.u3.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC) {
                int i27 = com.tencent.mm.ui.MoreTabUI.B1;
                moreTabUI.f1();
            } else if (u3Var == com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC) {
                int i28 = com.tencent.mm.ui.MoreTabUI.B1;
                moreTabUI.d1();
            }
            ((com.tencent.mm.ui.base.preference.h0) moreTabUI.f196948s).notifyDataSetChanged();
        }

        @Override // d70.j
        public void b(int i17, int i18, java.lang.String str) {
            com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference;
            com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
            if (i17 == 262145 || i17 == 266260 || i17 == 262157 || i17 == 266267 || i17 == 262158 || i17 == 262164) {
                int i19 = com.tencent.mm.ui.MoreTabUI.B1;
                moreTabUI.d1();
                moreTabUI.c1();
            } else if (i17 == 262147) {
                int i27 = com.tencent.mm.ui.MoreTabUI.B1;
                moreTabUI.Z0();
            } else if (i17 == 262156) {
                int i28 = com.tencent.mm.ui.MoreTabUI.B1;
                moreTabUI.f1();
            } else if (i17 == 262152) {
                int i29 = com.tencent.mm.ui.MoreTabUI.B1;
                moreTabUI.X0();
            } else if (i17 == 352279) {
                int i37 = com.tencent.mm.ui.MoreTabUI.B1;
                moreTabUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "updateBubbleTip %s", str);
                if (!moreTabUI.F && (accountInfoPreference = moreTabUI.G) != null && moreTabUI.f196950u != null) {
                    accountInfoPreference.M();
                }
            } else if (i17 == 352280 && moreTabUI.P) {
                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                if (bk0.a.g().l(352280)) {
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().p(352280, false);
                }
            }
            ((com.tencent.mm.ui.base.preference.h0) moreTabUI.f196948s).notifyDataSetChanged();
        }
    };
    public final p90.i W = new p90.i() { // from class: com.tencent.mm.ui.MoreTabUI.3
        @Override // p90.i
        public void a() {
            int i17 = com.tencent.mm.ui.MoreTabUI.B1;
            com.tencent.mm.ui.MoreTabUI.this.L0();
        }
    };
    public final c00.s3 X = new com.tencent.mm.ui.MoreTabUI$$a(this);
    public androidx.lifecycle.k0 Y = null;
    public androidx.lifecycle.k0 Z = null;

    /* renamed from: p0, reason: collision with root package name */
    public androidx.lifecycle.k0 f196946p0 = null;

    /* loaded from: classes11.dex */
    public static class NewTipsXmlListener implements com.tencent.mm.plugin.newtips.model.n {

        /* renamed from: a, reason: collision with root package name */
        public com.tencent.mm.ui.base.preference.IconPreference f196991a;

        public NewTipsXmlListener(com.tencent.mm.ui.base.preference.IconPreference iconPreference) {
            this.f196991a = iconPreference;
        }

        @Override // com.tencent.mm.plugin.newtips.model.n
        public void a(com.tencent.mm.plugin.newtips.model.d dVar) {
            if (dVar != null && dVar.field_tipId == 1 && rn3.i.Ai().e(1)) {
                this.f196991a.c0(0);
                this.f196991a.a0(8);
                com.tencent.mm.ui.base.preference.IconPreference iconPreference = this.f196991a;
                iconPreference.V = "";
                iconPreference.W = -1;
            }
        }
    }

    /* loaded from: classes11.dex */
    public class StoryCgiWatch implements com.tencent.mm.modelbase.u0 {
        public StoryCgiWatch(com.tencent.mm.ui.MoreTabUI moreTabUI) {
        }

        @Override // com.tencent.mm.modelbase.u0
        public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        }
    }

    /* loaded from: classes11.dex */
    public class StoryStatusMachine {

        /* renamed from: a, reason: collision with root package name */
        public int f196992a = 2;

        public StoryStatusMachine(com.tencent.mm.ui.MoreTabUI.AnonymousClass1 anonymousClass1) {
        }

        public void a() {
            com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
            if (moreTabUI.D) {
                if (moreTabUI.M) {
                    moreTabUI.C = false;
                    this.f196992a = 2;
                } else {
                    if (((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(en1.a.a())) {
                        moreTabUI.C = true;
                        this.f196992a = 3;
                    } else {
                        moreTabUI.C = false;
                        this.f196992a = 2;
                    }
                }
                moreTabUI.B = false;
            } else {
                moreTabUI.B = false;
                this.f196992a = 2;
                moreTabUI.C = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "checkStoryStatus status=%s", java.lang.Integer.valueOf(this.f196992a));
            c();
        }

        public void b(int i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "forceToStatus %s", java.lang.Integer.valueOf(i17));
            com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
            if (i17 == 0) {
                moreTabUI.B = true;
            } else {
                moreTabUI.B = false;
            }
            if (i17 == 3) {
                moreTabUI.C = true;
            } else {
                moreTabUI.C = false;
            }
            this.f196992a = i17;
            c();
        }

        public void c() {
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "updateUIByStory status:%s", java.lang.Integer.valueOf(this.f196992a));
            com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
            if (moreTabUI.getActivity() == null) {
                return;
            }
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).cj(moreTabUI.getActivity(), moreTabUI.f196950u);
            if (this.f196992a == 3) {
                moreTabUI.f196950u.setSelector(com.tencent.mm.R.color.f478489a);
                if (moreTabUI.getBounceView() != null) {
                    ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) moreTabUI.getBounceView()).g(false);
                }
            } else {
                moreTabUI.f196950u.setSelector(com.tencent.mm.R.color.a9e);
                if (moreTabUI.getBounceView() != null) {
                    ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) moreTabUI.getBounceView()).g(true);
                }
            }
            int i17 = this.f196992a;
            if (i17 == 0) {
                moreTabUI.f196950u.setBackground(com.tencent.mm.ui.zk.d(moreTabUI.getContext(), com.tencent.mm.R.attr.f478348hf));
                moreTabUI.f196950u.setSupportOverscroll(moreTabUI.B);
                moreTabUI.N = false;
                moreTabUI.f196944J = i65.a.f(moreTabUI.getContext(), com.tencent.mm.R.dimen.a8f);
                if (moreTabUI.storyGallery != null) {
                    ((android.widget.RelativeLayout.LayoutParams) moreTabUI.storyGallery.getLayoutParams()).topMargin = moreTabUI.K;
                    com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = moreTabUI.f196950u;
                    com.tencent.mm.plugin.story.api.AbsStoryGallery absStoryGallery = moreTabUI.storyGallery;
                    int i18 = moreTabUI.f196944J;
                    int i19 = moreTabUI.K;
                    pullDownListView.G = absStoryGallery;
                    pullDownListView.Q = i18;
                    pullDownListView.P = i19;
                    pullDownListView.f212156n = 0;
                    pullDownListView.f212155m = 0;
                }
                moreTabUI.f196950u.setMuteView(moreTabUI.f196951v);
                com.tencent.mm.ui.MoreTabUI.x0(moreTabUI, moreTabUI.B);
                moreTabUI.N0(0);
                moreTabUI.R0(moreTabUI.B);
                com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView2 = moreTabUI.f196950u;
                pullDownListView2.f212150f = false;
                pullDownListView2.f212151g = true;
                com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference = moreTabUI.G;
                if (accountInfoPreference != null) {
                    accountInfoPreference.O(moreTabUI.B, moreTabUI.N, moreTabUI.C);
                    return;
                }
                return;
            }
            if (i17 == 1) {
                moreTabUI.f196950u.setSupportOverscroll(true);
                moreTabUI.B0();
                if (moreTabUI.N) {
                    moreTabUI.f196950u.setBackground(com.tencent.mm.ui.zk.d(moreTabUI.getContext(), com.tencent.mm.R.attr.f478349hg));
                } else {
                    moreTabUI.f196950u.setBackground(com.tencent.mm.ui.zk.d(moreTabUI.getContext(), com.tencent.mm.R.attr.f478348hf));
                }
                if (moreTabUI.storyGallery != null) {
                    ((android.widget.RelativeLayout.LayoutParams) moreTabUI.storyGallery.getLayoutParams()).topMargin = moreTabUI.I;
                    com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView3 = moreTabUI.f196950u;
                    com.tencent.mm.plugin.story.api.AbsStoryGallery absStoryGallery2 = moreTabUI.storyGallery;
                    int i27 = moreTabUI.f196944J;
                    int i28 = moreTabUI.I;
                    pullDownListView3.G = absStoryGallery2;
                    pullDownListView3.Q = i27;
                    pullDownListView3.P = i28;
                    pullDownListView3.f212156n = 0;
                    pullDownListView3.f212155m = 0;
                }
                moreTabUI.f196950u.setMuteView(null);
                com.tencent.mm.ui.MoreTabUI.x0(moreTabUI, moreTabUI.B);
                moreTabUI.N0(0);
                moreTabUI.R0(moreTabUI.B);
                com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference2 = moreTabUI.G;
                if (accountInfoPreference2 != null) {
                    accountInfoPreference2.O(moreTabUI.B, moreTabUI.N, moreTabUI.C);
                }
                com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView4 = moreTabUI.f196950u;
                pullDownListView4.f212150f = false;
                pullDownListView4.f212151g = true;
                return;
            }
            if (i17 == 2) {
                moreTabUI.f196950u.setBackground(com.tencent.mm.ui.zk.d(moreTabUI.getContext(), com.tencent.mm.R.attr.f478349hg));
                moreTabUI.f196950u.setSupportOverscroll(moreTabUI.B);
                com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView5 = moreTabUI.f196950u;
                pullDownListView5.f212150f = false;
                pullDownListView5.f212151g = true;
                com.tencent.mm.ui.MoreTabUI.x0(moreTabUI, moreTabUI.B);
                if (moreTabUI.getContext() instanceof com.tencent.mm.ui.LauncherUI) {
                    ((com.tencent.mm.ui.LauncherUI) moreTabUI.getContext()).getHomeUI().getClass();
                }
                com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference3 = moreTabUI.G;
                if (accountInfoPreference3 != null) {
                    accountInfoPreference3.O(moreTabUI.B, moreTabUI.N, moreTabUI.C);
                    return;
                }
                return;
            }
            if (i17 != 3) {
                return;
            }
            android.app.Activity context = moreTabUI.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            moreTabUI.f196950u.setSupportOverscroll(((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).X6());
            moreTabUI.f196950u.setBackground(null);
            moreTabUI.f196950u.setMuteView(null);
            com.tencent.mm.ui.MoreTabUI.x0(moreTabUI, moreTabUI.C);
            com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference4 = moreTabUI.G;
            if (accountInfoPreference4 != null) {
                accountInfoPreference4.O(moreTabUI.B, moreTabUI.N, moreTabUI.C);
            }
        }
    }

    public MoreTabUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f196954x0 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ConfigUpdatedEvent>(this, a0Var) { // from class: com.tencent.mm.ui.MoreTabUI.4
            {
                this.__eventId = 320120113;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ConfigUpdatedEvent configUpdatedEvent) {
                am.k3 k3Var;
                int i17;
                com.tencent.mm.autogen.events.ConfigUpdatedEvent configUpdatedEvent2 = configUpdatedEvent;
                if (configUpdatedEvent2 != null && (k3Var = configUpdatedEvent2.f54072g) != null) {
                    if (!o45.wf.f343031i && !x51.t1.b(k3Var.f7126a)) {
                        java.lang.String str = k3Var.f7126a;
                        e42.d0 d0Var = e42.d0.clicfg_full_pkg_update_default_params;
                        if (str.equals("clicfg_full_pkg_update_default_params")) {
                            ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).bj();
                            ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).getClass();
                            try {
                                i17 = new org.json.JSONObject(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(d0Var, "", true)).optInt("reddotType", 0);
                                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "getXFullCheckOnlyShowNewRedDot: %d", java.lang.Integer.valueOf(i17));
                            } catch (org.json.JSONException e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Updater.PluginUpdater", e17, "", new java.lang.Object[0]);
                                i17 = 0;
                            }
                            java.lang.String Ui = ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Ui(i17);
                            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                            bk0.a.g().r(262145, false);
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 33L, 1L, false);
                            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "listener clicfg_full_pkg_update_default_params, canShowReddot = %s.", java.lang.Boolean.valueOf(!android.text.TextUtils.isEmpty(Ui)));
                            java.util.HashMap Vi = ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Vi();
                            com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("update_has_new_package", (Vi == null || Vi.isEmpty()) ? false : true);
                        }
                    }
                    if (!x51.t1.b(k3Var.f7126a) && (k3Var.f7126a.startsWith("clicfg_mmdiff_patch_pkg_update_params") || k3Var.f7126a.startsWith("clicfg_tinker_patch_pkg_update_params"))) {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Ni(true, false, false);
                    }
                }
                return false;
            }
        };
        this.f196957y0 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpgradeConfigEvent>(this, a0Var) { // from class: com.tencent.mm.ui.MoreTabUI.5
            {
                this.__eventId = -423338260;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UpgradeConfigEvent upgradeConfigEvent) {
                am.i00 i00Var;
                com.tencent.mm.autogen.events.UpgradeConfigEvent upgradeConfigEvent2 = upgradeConfigEvent;
                if (upgradeConfigEvent2 != null && (i00Var = upgradeConfigEvent2.f54929g) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "listener upgradeConfigEventIListener， event.data.configName = %s， event.data.updateClientVersionCode = %s", i00Var.f6889a, java.lang.Integer.valueOf(i00Var.f6890b));
                    ((un4.e) i95.n0.c(un4.e.class)).getClass();
                    if ("mmdiff_apk_has_update_notify".equals(i00Var.f6889a)) {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).uj(i00Var.f6890b);
                        xv.l0 l0Var = (xv.l0) i95.n0.c(xv.l0.class);
                        int i17 = i00Var.f6891c;
                        int i18 = i17 != 3 ? 101 : 201;
                        ((wv.e0) l0Var).getClass();
                        w73.f.h(i18, i17);
                    } else if ("mmdiff_clear_update_redot".equals(i00Var.f6889a)) {
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).bj();
                    } else if ("mmdiff_apk_has_ready".equals(i00Var.f6889a)) {
                        try {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "listener upgradeConfigEventIListener，showNotification apk install.");
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("notify_type_extra", "mmdiff_apk_has_ready");
                            intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService");
                            ((qf0.q) ((rf0.o) i95.n0.c(rf0.o.class))).wi(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l88), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.k3y), android.app.PendingIntent.getService(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, intent, fp.g0.a(268435456)));
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.MoreTabUI", "run result service fail, exception:" + th6);
                        }
                        xv.l0 l0Var2 = (xv.l0) i95.n0.c(xv.l0.class);
                        int i19 = i00Var.f6891c;
                        int i27 = i19 != 3 ? 102 : 202;
                        ((wv.e0) l0Var2).getClass();
                        w73.f.h(i27, i19);
                    } else if ("mmdiff_goto_apk_install".equals(i00Var.f6889a)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "upgradeConfigEventIListener, checkMMDiffBoostInstall.");
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Di();
                        ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
                        w73.f.h(104, 4);
                    }
                }
                return false;
            }
        };
        this.f196947p1 = new android.view.View.OnLayoutChangeListener() { // from class: com.tencent.mm.ui.MoreTabUI.16
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
                int i39 = com.tencent.mm.ui.MoreTabUI.B1;
                final com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                moreTabUI.z0(i27 - i18);
                int b17 = bi4.e.b(moreTabUI.getContext(), view);
                android.app.Activity context = moreTabUI.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                boolean X6 = ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).X6();
                if (moreTabUI.S == b17 || !X6 || moreTabUI.f196950u == null || moreTabUI.f196959z == null) {
                    return;
                }
                moreTabUI.S = bi4.e.b(moreTabUI.getContext(), view);
                android.app.Activity context2 = moreTabUI.getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(uj4.e.class)).W6(moreTabUI.S);
                final int i47 = moreTabUI.S;
                com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = moreTabUI.f196950u;
                int i48 = bi4.e.a(moreTabUI.getActivity())[1];
                pullDownListView.f212150f = true;
                pullDownListView.A = i47;
                pullDownListView.f212151g = false;
                pullDownListView.B = i48;
                moreTabUI.f196950u.setTranslationListener(new ql5.n() { // from class: com.tencent.mm.ui.MoreTabUI.17
                    @Override // ql5.n
                    public void a(float f17) {
                        com.tencent.mm.ui.MoreTabUI moreTabUI2 = com.tencent.mm.ui.MoreTabUI.this;
                        if (moreTabUI2.D) {
                            int i49 = i47;
                            float f18 = f17 / i49;
                            if (f17 < 0.0f) {
                                f18 = 0.0f;
                            }
                            if (f17 > i49) {
                                f18 = 1.0f;
                            }
                            moreTabUI2.f196959z.setTranslationY(f17);
                            android.app.Activity context3 = moreTabUI2.getContext();
                            kotlin.jvm.internal.o.g(context3, "context");
                            pf5.z zVar2 = pf5.z.f353948a;
                            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            ((uj4.e) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(uj4.e.class)).Y6(f18, f17, i49);
                            com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference = moreTabUI2.G;
                            if (accountInfoPreference != null) {
                                android.view.View view2 = accountInfoPreference.R;
                                if (view2 != null) {
                                    float f19 = 1.0f * (1.0f - f18);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                    arrayList.add(java.lang.Float.valueOf(f19));
                                    java.util.Collections.reverse(arrayList);
                                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/MoreTabUI$17", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                    view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                                    yj0.a.f(view2, "com/tencent/mm/ui/MoreTabUI$17", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                    android.view.View view3 = moreTabUI2.G.T;
                                    if (view3 != null) {
                                        if (f19 <= 0.0f) {
                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                            arrayList2.add(0);
                                            java.util.Collections.reverse(arrayList2);
                                            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/MoreTabUI$17", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                            yj0.a.f(view3, "com/tencent/mm/ui/MoreTabUI$17", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        } else {
                                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                            arrayList3.add(8);
                                            java.util.Collections.reverse(arrayList3);
                                            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/MoreTabUI$17", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                            yj0.a.f(view3, "com/tencent/mm/ui/MoreTabUI$17", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        }
                                    }
                                }
                                bi4.i0 H0 = moreTabUI2.H0();
                                if (H0 != null) {
                                    H0.r(f18, f17, i49);
                                }
                                moreTabUI2.f196950u.getTranslationY();
                            }
                        }
                    }
                });
            }
        };
        i65.a.b(getContext(), 48);
        i65.a.b(getContext(), 120);
        this.mPullDownCallback = new com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback() { // from class: com.tencent.mm.ui.MoreTabUI.18
            @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
            public void b(int i17) {
                com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                if (moreTabUI.D || moreTabUI.storyGallery == null) {
                    return;
                }
                moreTabUI.storyGallery.d(i17);
            }

            @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
            public void e() {
                com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "story_cat onMuteIn");
                com.tencent.mm.ui.MoreTabUI.this.f196951v.a();
            }

            @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
            public void j(int i17) {
                com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                if (moreTabUI.D || moreTabUI.storyGallery == null) {
                    return;
                }
                moreTabUI.storyGallery.f(i17);
            }

            @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
            public void onPostClose() {
                bi4.i0 H0;
                yj0.a.a("com/tencent/mm/ui/MoreTabUI$18", "com/tencent/mm/ui/MoreTabUI$com/tencent/mm/ui/widget/listview/PullDownListView$IPullDownCallback", "onPostClose", "()V", this);
                com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                if (moreTabUI.D) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "status_cat onPostClose, hasStatus=%s", java.lang.Boolean.valueOf(moreTabUI.C));
                    if (moreTabUI.G != null && (H0 = moreTabUI.H0()) != null) {
                        H0.W(false);
                        H0.onPostClose();
                    }
                    java.lang.Object bounceView = moreTabUI.getBounceView();
                    if (bounceView != null) {
                        ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).mPullDownEnableFlag |= 2;
                    }
                    android.app.Activity context = moreTabUI.getContext();
                    kotlin.jvm.internal.o.g(context, "context");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).a7(true);
                    android.app.Activity context2 = moreTabUI.getContext();
                    kotlin.jvm.internal.o.g(context2, "context");
                    if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(uj4.e.class)).Q6();
                } else {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Boolean.valueOf(moreTabUI.storyGallery == null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "story_cat onPostClose, storyGallery is null?:%s", objArr);
                    if (moreTabUI.storyGallery != null) {
                        moreTabUI.storyGallery.n(true);
                        moreTabUI.storyGallery.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.MoreTabUI.18.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com.tencent.mm.ui.MoreTabUI.AnonymousClass18 anonymousClass18 = com.tencent.mm.ui.MoreTabUI.AnonymousClass18.this;
                                com.tencent.mm.ui.MoreTabUI moreTabUI2 = com.tencent.mm.ui.MoreTabUI.this;
                                int i17 = com.tencent.mm.ui.MoreTabUI.B1;
                                moreTabUI2.V0();
                                com.tencent.mm.ui.MoreTabUI.this.N0(0);
                                com.tencent.mm.ui.MoreTabUI moreTabUI3 = com.tencent.mm.ui.MoreTabUI.this;
                                moreTabUI3.R0(moreTabUI3.B);
                                android.view.View view = com.tencent.mm.ui.MoreTabUI.this.f196953x;
                                if (view != null) {
                                    view.setTranslationY(0.0f);
                                }
                            }
                        });
                    }
                    moreTabUI.F = false;
                    moreTabUI.A.c();
                    if (moreTabUI.P && !moreTabUI.B) {
                        mf4.d.f326173n.f60942i = java.lang.System.currentTimeMillis();
                    }
                }
                com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference = moreTabUI.G;
                if (accountInfoPreference != null && moreTabUI.f196950u != null) {
                    accountInfoPreference.M();
                }
                yj0.a.h(this, "com/tencent/mm/ui/MoreTabUI$18", "com/tencent/mm/ui/MoreTabUI$com/tencent/mm/ui/widget/listview/PullDownListView$IPullDownCallback", "onPostClose", "()V");
            }

            @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
            public void onPostOpen(boolean z17) {
                bi4.i0 H0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(java.lang.Boolean.valueOf(z17));
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/MoreTabUI$18", "com/tencent/mm/ui/MoreTabUI$com/tencent/mm/ui/widget/listview/PullDownListView$IPullDownCallback", "onPostOpen", "(Z)V", this, array);
                com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                if (moreTabUI.D) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "onPostOpen: hasStatus=%s", java.lang.Boolean.valueOf(moreTabUI.C));
                    if (moreTabUI.G != null && (H0 = moreTabUI.H0()) != null) {
                        H0.onPostOpen(z17);
                    }
                    moreTabUI.N0(8);
                    java.lang.Object bounceView = moreTabUI.getBounceView();
                    if (bounceView != null) {
                        ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).mPullDownEnableFlag &= -3;
                    }
                    android.app.Activity context = moreTabUI.getContext();
                    kotlin.jvm.internal.o.g(context, "context");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).a7(false);
                    android.app.Activity context2 = moreTabUI.getContext();
                    kotlin.jvm.internal.o.g(context2, "context");
                    if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(uj4.e.class)).R6();
                } else {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Boolean.valueOf(moreTabUI.storyGallery == null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "story_cat onPostOpen, storyGallery is null?:%s", objArr);
                    if (moreTabUI.storyGallery != null) {
                        com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct storyPreviewReportStruct = mf4.d.f326163d;
                        storyPreviewReportStruct.f60919e = 1L;
                        storyPreviewReportStruct.f60935u = 1L;
                        moreTabUI.storyGallery.o(z17, true);
                        moreTabUI.N0(8);
                        if (moreTabUI.getContext() instanceof com.tencent.mm.ui.LauncherUI) {
                            ((com.tencent.mm.ui.LauncherUI) moreTabUI.getContext()).getHomeUI().getClass();
                        }
                        if (fp.h.c(19)) {
                            moreTabUI.getWindow().setFlags(201327616, 201327616);
                        } else {
                            moreTabUI.getWindow().setFlags(1024, 1024);
                        }
                    }
                    moreTabUI.F = true;
                    if (!moreTabUI.B && !moreTabUI.N) {
                        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_STORY_PULL_DOWN_COUNT_INT;
                        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(c17.r(u3Var, 0) + 1));
                        moreTabUI.B0();
                    }
                }
                com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference = moreTabUI.G;
                if (accountInfoPreference != null) {
                    accountInfoPreference.N();
                }
                yj0.a.h(this, "com/tencent/mm/ui/MoreTabUI$18", "com/tencent/mm/ui/MoreTabUI$com/tencent/mm/ui/widget/listview/PullDownListView$IPullDownCallback", "onPostOpen", "(Z)V");
            }

            @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
            public void onPreClose() {
                com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView;
                bi4.i0 H0;
                com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                if (moreTabUI.D) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "status_cat onPreClose, hasStatus=%s", java.lang.Boolean.valueOf(moreTabUI.C));
                    if (moreTabUI.G != null && (H0 = moreTabUI.H0()) != null) {
                        H0.onPreClose();
                    }
                    android.app.Activity context = moreTabUI.getContext();
                    kotlin.jvm.internal.o.g(context, "context");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).S6();
                } else if (moreTabUI.storyGallery != null) {
                    moreTabUI.storyGallery.i();
                }
                com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference = moreTabUI.G;
                if (accountInfoPreference == null || (pullDownListView = moreTabUI.f196950u) == null) {
                    return;
                }
                accountInfoPreference.f191055p1 = pullDownListView.f212147J;
            }

            @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
            public void onPreOpen() {
                com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView;
                bi4.i0 H0;
                com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                if (moreTabUI.D) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "status_cat onPreOpen, HasStatus=%s", java.lang.Boolean.valueOf(moreTabUI.C));
                    if (moreTabUI.G != null && (H0 = moreTabUI.H0()) != null) {
                        H0.W(true);
                        H0.onPreOpen();
                    }
                    android.app.Activity context = moreTabUI.getContext();
                    kotlin.jvm.internal.o.g(context, "context");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.tencent.mm.plugin.textstatus.ui.n2 U6 = ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).U6();
                    if (U6 != null) {
                        U6.onPreOpen();
                    }
                } else {
                    if (moreTabUI.storyGallery != null) {
                        moreTabUI.storyGallery.j();
                    }
                    if (moreTabUI.P && !moreTabUI.B) {
                        mf4.d dVar = mf4.d.f326160a;
                        mf4.d.f326173n.f60939f = java.lang.System.currentTimeMillis();
                        dVar.d();
                    }
                }
                com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference = moreTabUI.G;
                if (accountInfoPreference == null || (pullDownListView = moreTabUI.f196950u) == null) {
                    return;
                }
                accountInfoPreference.f191055p1 = pullDownListView.f212147J;
            }

            @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
            public void p() {
                com.tencent.mm.ui.MoreTabUI.this.f196951v.b();
            }

            @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
            public void q(int i17) {
                com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                if (moreTabUI.D || moreTabUI.storyGallery == null) {
                    return;
                }
                moreTabUI.storyGallery.g(i17);
            }
        };
        this.f196955x1 = false;
        this.f196958y1 = false;
        this.f196960z1 = false;
        this.A1 = new com.tencent.mm.ui.MoreTabUI.StoryCgiWatch(this);
    }

    public static void x0(com.tencent.mm.ui.MoreTabUI moreTabUI, boolean z17) {
        android.view.Window window;
        android.view.View decorView;
        moreTabUI.getClass();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        int i17 = x51.t1.f452086a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "updateStatusBarCell %s stack: %s", valueOf, new x51.s1().toString());
        androidx.fragment.app.FragmentActivity activity = moreTabUI.getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility((z17 || com.tencent.mm.ui.bk.C()) ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
    }

    public final void A0(boolean z17) {
        if (getActivity() != null) {
            if (this.H == null) {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482435ei);
                if (findViewById != null) {
                    this.H = findViewById.findViewById(com.tencent.mm.R.id.f482432ef);
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(this.H != null);
                com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "checkActionBarClick: findActionBar %s", objArr);
            }
            android.view.View view = this.H;
            if (view != null) {
                if (!z17 || this.D) {
                    view.setOnClickListener(null);
                } else {
                    view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.MoreTabUI.22
                        @Override // android.view.View.OnClickListener
                        public void onClick(android.view.View view2) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(view2);
                            java.lang.Object[] array = arrayList.toArray();
                            arrayList.clear();
                            yj0.a.b("com/tencent/mm/ui/MoreTabUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "onClick: mActionBarRoot");
                            com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                            if (moreTabUI.M) {
                                db5.t7.makeText(moreTabUI.getContext(), moreTabUI.getResources().getString(com.tencent.mm.R.string.f493295jn0), 0).show();
                            } else {
                                com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = moreTabUI.f196950u;
                                if (pullDownListView != null && pullDownListView.f212147J && moreTabUI.D) {
                                    pullDownListView.o();
                                }
                            }
                            yj0.a.h(this, "com/tencent/mm/ui/MoreTabUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        }
                    });
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.y7
    public void B() {
        this.P = false;
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
        if (pullDownListView != null) {
            pullDownListView.getClass();
            com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "onPause", new java.lang.Object[0]);
            pullDownListView.f212163s = false;
            com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView2 = this.f196950u;
            if (!pullDownListView2.f212147J) {
                pullDownListView2.n();
            }
        }
        com.tencent.mm.plugin.story.api.AbsStoryMuteView absStoryMuteView = this.f196951v;
        if (absStoryMuteView != null) {
            absStoryMuteView.setVisibility(8);
        }
        N0(0);
        new com.tencent.mm.autogen.events.StoryVideoViewDetachEvent().e();
        A0(false);
        mf4.d.f326160a.d();
        if (getActivity() != null && getActivity().getWindow() != null) {
            getActivity().getWindow().setSoftInputMode(50);
        }
        this.f196958y1 = true;
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ni();
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().q("setting");
    }

    public final void B0() {
        if (this.N || !gm0.j1.a()) {
            return;
        }
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_STORY_PULL_DOWN_COUNT_INT, 0);
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_STORY_CAPTURE_FIRST_BOOLEAN_SYNC, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "checkSmallHead: %s", java.lang.Integer.valueOf(r17));
        boolean z17 = this.B;
        if (z17) {
            return;
        }
        if (o17 || r17 >= 1) {
            this.N = true;
            com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference = this.G;
            if (accountInfoPreference != null) {
                accountInfoPreference.O(z17, true, this.C);
            }
            this.f196944J = this.N ? i65.a.f(getContext(), com.tencent.mm.R.dimen.a8g) : i65.a.f(getContext(), com.tencent.mm.R.dimen.a8f);
        }
    }

    public final void C0() {
        if (getActivity() == null) {
            return;
        }
        boolean g17 = bi4.v1.g();
        if (!g17 && getBounceView() != null) {
            getBounceView().setBounceEnabled(false);
        }
        if (g17 == this.D) {
            return;
        }
        F0(g17);
    }

    public final void F0(boolean z17) {
        this.D = z17;
        com.tencent.mm.plugin.story.api.AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            this.f196952w.removeView(absStoryGallery);
            this.storyGallery.e();
            com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
            pullDownListView.G = null;
            pullDownListView.Q = 0;
            pullDownListView.P = 0;
            pullDownListView.f212156n = 0;
            pullDownListView.f212155m = 0;
            this.storyGallery = null;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).f428428r = null;
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(uj4.e.class)).Z6();
        android.view.View view = this.f196959z;
        if (view != null) {
            this.f196952w.removeView(view);
        }
        this.E = false;
        y0();
        B0();
        if (this.G != null) {
            W0();
        }
    }

    public final com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference G0() {
        if (this.G == null) {
            this.G = (com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference) this.f197764d.h("more_tab_setting_personal_info");
        }
        return this.G;
    }

    public bi4.i0 H0() {
        return G0().U;
    }

    @Override // ze4.h
    public void H2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "story_cat storyUIHasStory");
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
        if (pullDownListView != null && pullDownListView.f212147J && this.P) {
            boolean z17 = this.M;
            com.tencent.mm.ui.MoreTabUI.StoryStatusMachine storyStatusMachine = this.A;
            if (z17) {
                storyStatusMachine.b(2);
            } else {
                storyStatusMachine.b(0);
            }
        }
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f196948s).h("settings_my_album");
        if (iconPreference != null) {
            if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_STORY_NEED_DISPLAY_ALBUM_GUIDE_BOOLEAN_SYNC, true)) {
                this.Q = true;
                iconPreference.c0(0);
            } else {
                this.Q = false;
                iconPreference.c0(8);
            }
        }
    }

    @Override // bi4.s0
    public void I5(java.lang.String str) {
    }

    public final void J0() {
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Zi("", "moreTabClear");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_profile_type", 13);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.x(getContext(), intent, 13, 2);
    }

    public final boolean K0(com.tencent.mm.ui.base.preference.IconPreference iconPreference) {
        java.lang.String str;
        if (iconPreference != null && (str = iconPreference.f197780q) != null && !str.equals("")) {
            android.view.View view = iconPreference.W1;
            if (view != null) {
                com.tencent.mm.autogen.events.NotifyPreferenceBindViewEvent notifyPreferenceBindViewEvent = new com.tencent.mm.autogen.events.NotifyPreferenceBindViewEvent();
                am.wl wlVar = notifyPreferenceBindViewEvent.f54551g;
                wlVar.f8296a = view;
                wlVar.f8297b = str;
                wlVar.f8298c = iconPreference.V1;
                f55.e eVar = f55.e.f259771e;
                wlVar.f8299d = 3;
                wlVar.f8300e = ((com.tencent.mm.ui.base.preference.h0) this.f196948s).q(str);
                notifyPreferenceBindViewEvent.e();
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MoreTabUI", "entryKey = [%s] get root view is null", str);
        }
        return false;
    }

    @Override // bi4.l0
    public void K5(boolean z17) {
        if (this.f196959z == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "changeStatusBgVisibility: failed, %s", java.lang.Boolean.valueOf(z17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "changeStatusBgVisibility: %s", java.lang.Boolean.valueOf(z17));
        if (!z17 || this.M) {
            android.view.View view = this.f196959z;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MoreTabUI", "changeStatusBgVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/MoreTabUI", "changeStatusBgVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f196959z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/MoreTabUI", "changeStatusBgVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/MoreTabUI", "changeStatusBgVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void L0() {
        android.view.View view = this.f196949t;
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.MoreTabUI.12
                @Override // java.lang.Runnable
                public void run() {
                    int i17 = com.tencent.mm.ui.MoreTabUI.B1;
                    com.tencent.mm.ui.MoreTabUI.this.X0();
                }
            });
        }
    }

    public final void M0(android.view.View view) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, "wx_profile_finder_entrance");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 40, 25496);
        r45.ct4 Ri = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ri(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(getContext()), 0);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "if_yesterday_play", java.lang.Integer.valueOf(!((Ri == null || Ri.getString(1) == null) ? "" : Ri.getString(1)).isEmpty() ? 1 : 0));
    }

    @Override // bi4.l0
    public void M2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "statusUIHasStatus");
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
        if (pullDownListView != null && pullDownListView.f212147J && this.P) {
            boolean z17 = this.M;
            com.tencent.mm.ui.MoreTabUI.StoryStatusMachine storyStatusMachine = this.A;
            if (z17) {
                storyStatusMachine.b(2);
            } else {
                storyStatusMachine.b(3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(int r12) {
        /*
            r11 = this;
            androidx.fragment.app.FragmentActivity r0 = r11.getActivity()
            if (r0 == 0) goto Le
            r0 = 2131296469(0x7f0900d5, float:1.8210856E38)
            android.view.View r0 = r11.findViewById(r0)     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r9 = "MicroMsg.MoreTabUI"
            if (r0 == 0) goto L64
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f473285a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r10.add(r1)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r2 = r10.toArray()
            java.lang.String r3 = "com/tencent/mm/ui/MoreTabUI"
            java.lang.String r4 = "setActionbarContainer"
            java.lang.String r5 = "(I)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r1 = r10.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/ui/MoreTabUI"
            java.lang.String r3 = "setActionbarContainer"
            java.lang.String r4 = "(I)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r0 = "setActionbarContainer type:%s"
            com.tencent.mars.xlog.Log.i(r9, r0, r12)
            goto L69
        L64:
            java.lang.String r12 = "setActionbarContainer is null!!"
            com.tencent.mars.xlog.Log.i(r9, r12)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.MoreTabUI.N0(int):void");
    }

    public boolean P0() {
        return ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).aj() || ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).nj();
    }

    public final void Q0(com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference) {
        normalIconNewTipPreference.c0(0);
        normalIconNewTipPreference.a0(8);
        normalIconNewTipPreference.V = "";
        normalIconNewTipPreference.W = -1;
        normalIconNewTipPreference.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT, true);
    }

    public final void R0(boolean z17) {
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView;
        if ((getContext() instanceof com.tencent.mm.ui.LauncherUI) && (pullDownListView = this.f196950u) != null && pullDownListView.f212147J) {
            ((com.tencent.mm.ui.LauncherUI) getContext()).getHomeUI().getClass();
        }
    }

    @Override // com.tencent.mm.ui.y7
    public void T() {
    }

    public final boolean T0() {
        android.content.Intent intent = new android.content.Intent();
        android.app.Activity context = getContext();
        java.util.Objects.requireNonNull(context);
        intent.setClassName(context, "com.tencent.mm.feature.ecs.test.EcsTestUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/MoreTabUI", "startEcsTestUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/MoreTabUI", "startEcsTestUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    public final boolean U0(boolean z17) {
        com.tencent.mm.plugin.appbrand.profile.j jVar = com.tencent.mm.plugin.appbrand.profile.j.INSTANCE;
        com.tencent.mm.plugin.appbrand.profile.i iVar = com.tencent.mm.plugin.appbrand.profile.i.AppStart;
        ((java.util.HashMap) jVar.f87689d).put(iVar, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        com.tencent.mm.plugin.appbrand.profile.i iVar2 = com.tencent.mm.plugin.appbrand.profile.i.StartUp;
        ((java.util.HashMap) jVar.f87689d).put(iVar2, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("preceding_scence", 2);
        intent.putExtra("isNativeView", z17);
        j45.l.j(getContext(), "appbrand", ".functions.emojistore.LFEmojiStoreContainerActivity", intent, null);
        return true;
    }

    @Override // com.tencent.mm.ui.y7
    public void V() {
    }

    public final void V0() {
        if (fp.h.c(19)) {
            getWindow().clearFlags(201327616);
        } else {
            getWindow().clearFlags(1024);
        }
    }

    public final void W0() {
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("more_tab_setting_personal_info", false);
        this.G = (com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference) this.f197764d.h("more_tab_setting_personal_info");
        java.lang.String c17 = c01.z1.c();
        if (x51.t1.b(c17)) {
            java.lang.String r17 = c01.z1.r();
            if (com.tencent.mm.storage.z3.y3(r17)) {
                this.G.N = null;
            } else {
                this.G.N = r17;
            }
        } else {
            this.G.N = c17;
        }
        this.G.M = c01.z1.r();
        java.lang.String l17 = c01.z1.l();
        if (x51.t1.b(l17)) {
            l17 = c01.z1.b();
        }
        com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference = this.G;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity context = getContext();
        ((ke0.e) xVar).getClass();
        accountInfoPreference.L = com.tencent.mm.pluginsdk.ui.span.c0.i(context, l17);
        this.G.O(this.B, this.N, this.C);
        this.G.f191060z1 = new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.MoreTabUI.13
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/MoreTabUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                if (moreTabUI.D) {
                    yj0.a.h(this, "com/tencent/mm/ui/MoreTabUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (moreTabUI.storyGallery != null && moreTabUI.B && (pullDownListView = moreTabUI.f196950u) != null && pullDownListView.f212147J) {
                    moreTabUI.storyGallery.p();
                }
                if (moreTabUI.M) {
                    db5.t7.makeText(moreTabUI.getContext(), moreTabUI.getResources().getString(com.tencent.mm.R.string.f493295jn0), 0).show();
                } else {
                    com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView2 = moreTabUI.f196950u;
                    if (pullDownListView2 != null && moreTabUI.D) {
                        pullDownListView2.o();
                    }
                }
                yj0.a.h(this, "com/tencent/mm/ui/MoreTabUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        ((com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference) ((com.tencent.mm.ui.base.preference.h0) this.f196948s).h("more_tab_setting_personal_info")).getClass();
        if (this.f196959z == null || G0() == null) {
            return;
        }
        android.view.View view = G0().S;
        if (view != null && view.getMeasuredHeight() != 0) {
            this.f196959z.getWidth();
            this.f196959z.getHeight();
            z0(view.getMeasuredHeight());
        }
        com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference G0 = G0();
        android.view.View.OnLayoutChangeListener onLayoutChangeListener = this.f196947p1;
        G0.f191059y1 = onLayoutChangeListener;
        android.view.View view2 = G0.S;
        if (view2 == null || onLayoutChangeListener == null) {
            return;
        }
        view2.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    public final void X0() {
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_mm_cardpackage", true);
        f10.c Ai = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Ai();
        int i17 = Ai.f258545a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "[updateCardEntry] HIDE!");
            ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_mm_cardpackage_new", true);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "[updateCardEntry] SHOW!");
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_mm_cardpackage_new", false);
        com.tencent.mm.ui.mmec.NewCardPackageTipPreference newCardPackageTipPreference = (com.tencent.mm.ui.mmec.NewCardPackageTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f196948s).h("settings_mm_cardpackage_new");
        int i18 = Ai.f258548d;
        if (newCardPackageTipPreference != null) {
            com.tencent.mm.ui.MoreTabUI$$e moreTabUI$$e = new com.tencent.mm.ui.MoreTabUI$$e();
            newCardPackageTipPreference.getClass();
            android.view.View view = newCardPackageTipPreference.W1;
            if (view != null) {
                moreTabUI$$e.invoke(view);
            } else {
                newCardPackageTipPreference.f209153q3 = new java.lang.ref.WeakReference(moreTabUI$$e);
            }
            if (i17 == 2) {
                newCardPackageTipPreference.L(((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Di(i18));
                android.graphics.drawable.Drawable i19 = i65.a.i(getContext(), com.tencent.mm.R.raw.weixin_store_regular);
                com.tencent.mm.ui.uk.f(i19, android.graphics.Color.parseColor("#FF6146"));
                if (i19 != null && !i19.equals(newCardPackageTipPreference.U)) {
                    newCardPackageTipPreference.U = i19;
                }
            } else {
                newCardPackageTipPreference.J(com.tencent.mm.R.string.mcc);
            }
        }
        if (i17 == 2) {
            switch (i18) {
                case 1:
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 101);
                    break;
                case 2:
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 103);
                    break;
                case 3:
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 105);
                    break;
                case 4:
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 107);
                    break;
                case 5:
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 109);
                    break;
                case 6:
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 111);
                    break;
                default:
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 32);
                    break;
            }
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 1);
        }
        K0(newCardPackageTipPreference);
    }

    @Override // ze4.h
    public void Y0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "story_cat storyUIBackPressed");
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
        if (pullDownListView != null && !pullDownListView.f212147J) {
            pullDownListView.n();
        }
        N0(0);
        R0(this.B);
    }

    public final void Z0() {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).ag() == 2) {
            ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_emoji_store", true);
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_emoji_store", false);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean e17 = bk0.a.g().e(262147, 266244);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean e18 = bk0.a.g().e(262149, 266244);
        final com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f196948s).h("settings_emoji_store");
        if (iconPreference == null) {
            return;
        }
        iconPreference.L(getString(com.tencent.mm.R.string.iqn));
        if (e17) {
            iconPreference.a0(0);
            iconPreference.V = getString(com.tencent.mm.R.string.f490501wv);
            iconPreference.W = com.tencent.mm.R.drawable.asx;
        } else if (e18) {
            iconPreference.a0(0);
            iconPreference.V = getString(com.tencent.mm.R.string.f490444v8);
            iconPreference.W = com.tencent.mm.R.drawable.asx;
        } else {
            iconPreference.a0(8);
            iconPreference.V = "";
            iconPreference.W = -1;
        }
        if (e18 || e17) {
            n11.a.b().m((java.lang.String) c01.d9.b().p().l(229633, null), iconPreference.S, new p11.h(this) { // from class: com.tencent.mm.ui.MoreTabUI.15
                @Override // p11.h
                public void a(java.lang.String str, android.view.View view) {
                }

                @Override // p11.h
                public void b(java.lang.String str, android.view.View view, q11.b bVar) {
                    final android.graphics.Bitmap bitmap;
                    if (bVar.f359531a != 0 || (bitmap = bVar.f359534d) == null) {
                        com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.MoreTabUI.15.2
                            @Override // java.lang.Runnable
                            public void run() {
                                iconPreference.T(8);
                            }
                        });
                    } else {
                        com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.MoreTabUI.15.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com.tencent.mm.ui.MoreTabUI.AnonymousClass15 anonymousClass15 = com.tencent.mm.ui.MoreTabUI.AnonymousClass15.this;
                                iconPreference.R(bitmap);
                                iconPreference.T(0);
                            }
                        });
                    }
                }

                @Override // p11.h
                public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
                    return null;
                }
            });
        } else {
            iconPreference.T(8);
        }
        if (com.tencent.mm.storage.h5.f195006d.Ui()) {
            com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f196948s).h("settings_emoji_store");
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().i("140001001_1");
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().k(normalIconNewTipPreference);
        }
        K0(iconPreference);
    }

    public final void a1() {
        com.tencent.mm.ui.pref.MoreTabFinderPreference moreTabFinderPreference;
        com.tencent.mm.ui.base.preference.r rVar = this.f196948s;
        if (rVar == null || (moreTabFinderPreference = (com.tencent.mm.ui.pref.MoreTabFinderPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_my_finder_and_biz")) == null || moreTabFinderPreference.f209521c2) {
            return;
        }
        moreTabFinderPreference.n0();
    }

    @Override // bi4.l0
    public void a6() {
        if (!isAdded()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MoreTabUI", "addStatusBackPreview fail,not added");
            this.f196960z1 = true;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "addStatusBackPreview: hoverOffset=%s", java.lang.Integer.valueOf(this.S));
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).Z6();
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
        int i17 = this.S;
        int i18 = bi4.e.a(getActivity())[1];
        pullDownListView.f212150f = true;
        pullDownListView.A = i17;
        pullDownListView.f212151g = false;
        pullDownListView.B = i18;
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(uj4.e.class)).O6(getChildFragmentManager(), this.f196952w, en1.a.a(), "SCENE_MORE_TAB", false);
        this.f196950u.setSupportOverscroll(true);
    }

    public final void b1() {
        com.tencent.mm.ui.pref.MoreTabFinderPreference moreTabFinderPreference;
        com.tencent.mm.ui.base.preference.r rVar = this.f196948s;
        if (rVar == null || (moreTabFinderPreference = (com.tencent.mm.ui.pref.MoreTabFinderPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_my_finder_album")) == null || moreTabFinderPreference.R1) {
            return;
        }
        moreTabFinderPreference.n0();
    }

    @Override // bi4.s0
    public void b4(java.lang.String str) {
        if (this.C || !str.equals(en1.a.a())) {
            return;
        }
        if (((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(en1.a.a()) && this.D) {
            this.S = -1;
            a6();
            this.A.b(3);
            if (this.G != null) {
                W0();
            }
        }
    }

    public final void c1() {
        boolean fj6;
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_my_album", false);
        com.tencent.mm.ui.pref.MoreTabSnsPreference moreTabSnsPreference = (com.tencent.mm.ui.pref.MoreTabSnsPreference) ((com.tencent.mm.ui.base.preference.h0) this.f196948s).h("settings_my_album");
        boolean z17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_STORY_NEED_DISPLAY_ALBUM_GUIDE_BOOLEAN_SYNC, true) && this.Q;
        moreTabSnsPreference.n0(this.f196948s);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(moreTabSnsPreference);
        moreTabSnsPreference.h0();
        if (moreTabSnsPreference.o0(z17)) {
            return;
        }
        if (z17) {
            moreTabSnsPreference.c0(0);
        } else {
            this.Q = false;
            moreTabSnsPreference.c0(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            fj6 = r17 != 1 ? r17 != 2 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false) : false : true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            fj6 = false;
        }
        android.content.Context context = moreTabSnsPreference.Y1;
        if (!fj6 || getContext() == null) {
            moreTabSnsPreference.B(com.tencent.mm.R.raw.icons_outlined_album);
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_album);
            moreTabSnsPreference.U = drawable;
            android.widget.ImageView imageView = moreTabSnsPreference.L1;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            int color = getResources().getColor(com.tencent.mm.R.color.Indigo_100);
            if (moreTabSnsPreference.f209525i2 != color) {
                moreTabSnsPreference.f209525i2 = color;
                moreTabSnsPreference.p0();
            }
        } else {
            moreTabSnsPreference.B(com.tencent.mm.R.raw.icons_outlined_colorful_moment);
            android.graphics.drawable.Drawable drawable2 = context.getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_colorful_moment);
            moreTabSnsPreference.U = drawable2;
            android.widget.ImageView imageView2 = moreTabSnsPreference.L1;
            if (imageView2 != null) {
                imageView2.setImageDrawable(drawable2);
            }
            if (moreTabSnsPreference.f209525i2 != 0) {
                moreTabSnsPreference.f209525i2 = 0;
                moreTabSnsPreference.p0();
            }
        }
        K0(moreTabSnsPreference);
    }

    @Override // ze4.h
    public void c2() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "story_cat storyUINoStory");
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
        if (pullDownListView != null && !pullDownListView.f212147J) {
            pullDownListView.n();
        }
        this.A.b(2);
        com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference = this.G;
        if (accountInfoPreference != null) {
            accountInfoPreference.N();
        }
    }

    public final void d1() {
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("more_setting", false);
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f196948s).h("more_setting");
        if (normalIconNewTipPreference != null) {
            normalIconNewTipPreference.L(getString(com.tencent.mm.R.string.izw));
            normalIconNewTipPreference.Y(8);
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().k(normalIconNewTipPreference);
            normalIconNewTipPreference.n0(this.f196948s);
            normalIconNewTipPreference.h0();
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            boolean e17 = bk0.a.g().e(262145, 266242);
            boolean z17 = ((ty4.q) ((uy4.x) i95.n0.c(uy4.x.class))).wi() || ((ty4.q) ((uy4.x) i95.n0.c(uy4.x.class))).Ai() || ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SETTING_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue() > ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SETTING_RED_DOT_DID_SHOW_ID_INT, 0)).intValue();
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            boolean b17 = bk0.a.g().b(262157, 266261);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            boolean b18 = bk0.a.g().b(262164, 266268);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            boolean b19 = bk0.a.g().b(262158, 266264);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            boolean c17 = bk0.a.g().c(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266242);
            boolean z18 = (com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1 ? ((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_MORE_TAB_DOT_SHOW_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue() : false) && ((c01.d9.b().p().q(40, 0) & 131072) == 0);
            com.tencent.mm.plugin.newtips.model.d y07 = rn3.i.wi().y0(1);
            boolean z19 = y07 != null && y07.field_isExit && rn3.i.Ai().e(1);
            ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).getClass();
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
            kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
            boolean z27 = sharedPreferences.getInt("RedDotSettingTab", 0) == 1;
            boolean z28 = e17 || z17 || b17 || b18 || b19 || c17 || z18;
            if (!z28 && y07 != null && !y07.field_isExit) {
                this.f196945l1 = new com.tencent.mm.ui.MoreTabUI.NewTipsXmlListener(normalIconNewTipPreference);
                rn3.i.Di().f152386e = this.f196945l1;
            }
            if (normalIconNewTipPreference.o0(z28 || z19 || z27)) {
                return;
            }
            normalIconNewTipPreference.c0(8);
            if (e17) {
                Q0(normalIconNewTipPreference);
                return;
            }
            normalIconNewTipPreference.a0(8);
            normalIconNewTipPreference.V = "";
            normalIconNewTipPreference.W = -1;
            if (z27) {
                Q0(normalIconNewTipPreference);
                return;
            }
            normalIconNewTipPreference.c0(8);
            if (z17) {
                Q0(normalIconNewTipPreference);
                return;
            }
            normalIconNewTipPreference.c0(8);
            if (b17) {
                Q0(normalIconNewTipPreference);
                return;
            }
            normalIconNewTipPreference.c0(8);
            if (b18) {
                Q0(normalIconNewTipPreference);
                return;
            }
            normalIconNewTipPreference.c0(8);
            if (b19) {
                Q0(normalIconNewTipPreference);
                return;
            }
            if (c17) {
                Q0(normalIconNewTipPreference);
                return;
            }
            normalIconNewTipPreference.c0(8);
            if (z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "show voiceprint dot");
                Q0(normalIconNewTipPreference);
                return;
            }
            normalIconNewTipPreference.c0(8);
            if (z19) {
                Q0(normalIconNewTipPreference);
                return;
            }
            com.tencent.mm.plugin.setting.ui.setting.g gVar = com.tencent.mm.plugin.setting.ui.setting.g.f161052a;
            if (this.V == null) {
                this.V = new com.tencent.mm.plugin.setting.ui.setting.e(this.f196948s, "more_setting");
            }
            if (gVar.c(this.V)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "Show roam task error status.");
                return;
            }
        }
        K0(normalIconNewTipPreference);
    }

    @Override // com.tencent.mm.ui.y7
    public void e0() {
    }

    public final void e1() {
        if (this.G != null) {
            if (this.C) {
                if (!((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(en1.a.a())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "handleTabSwitchInForStatus wiht no status");
                    F0(bi4.v1.g());
                    if (this.f196950u != null) {
                        this.A.a();
                    }
                }
            }
            bi4.i0 H0 = H0();
            if (H0 != null) {
                H0.b4(en1.a.a());
            }
        }
        this.T.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.MoreTabUI.20
            @Override // java.lang.Runnable
            public void run() {
                final com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                com.tencent.mm.ui.base.preference.r rVar = moreTabUI.f196948s;
                if (rVar != null) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) ((com.tencent.mm.ui.base.preference.h0) rVar).j();
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) it.next();
                        if (preference instanceof com.tencent.mm.ui.base.preference.IconPreference) {
                            final com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) preference;
                            if (!moreTabUI.K0(iconPreference)) {
                                if (((com.tencent.mm.ui.base.preference.h0) moreTabUI.f196948s).q(iconPreference.f197780q)) {
                                    moreTabUI.T.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.ui.MoreTabUI.24
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            int i17 = com.tencent.mm.ui.MoreTabUI.B1;
                                            if (com.tencent.mm.ui.MoreTabUI.this.K0(iconPreference)) {
                                                return;
                                            }
                                            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "retry bind red dot failed");
                                        }
                                    }, 100L);
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    public final void f1() {
        java.lang.String str;
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference;
        int i17;
        boolean z17;
        boolean z18;
        boolean z19;
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference2;
        boolean z27;
        com.tencent.mm.ui.MoreTabUI moreTabUI;
        java.lang.Integer num = (java.lang.Integer) c01.d9.b().p().l(204820, null);
        int i18 = x51.t1.f452086a;
        int intValue = num == null ? 0 : num.intValue();
        java.lang.Integer num2 = (java.lang.Integer) c01.d9.b().p().l(204817, null);
        int intValue2 = intValue + (num2 == null ? 0 : num2.intValue());
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean e17 = bk0.a.g().e(262156, 266248);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b17 = bk0.a.g().b(262156, 266248);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean d17 = bk0.a.g().d(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_WALLET_MORE_TAB_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC);
        java.lang.String str2 = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_WALLET_MORE_TAB_REDDOT_WORDING_STRING_SYNC, "");
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference3 = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f196948s).h("settings_mm_wallet");
        if (normalIconNewTipPreference3 == null) {
            return;
        }
        gm0.j1.i();
        int intValue3 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        gm0.j1.i();
        int intValue4 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC, 0)).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "currentWalletRegion: %s", java.lang.Integer.valueOf(intValue3));
        java.lang.String Ai = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ai();
        if (!x51.t1.b(Ai)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "get wechat user wallet entry : %s", Ai);
            normalIconNewTipPreference3.L(Ai);
        } else if (intValue3 == 0 || intValue3 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", " cn wallet open new name ：%s", java.lang.Boolean.TRUE);
            normalIconNewTipPreference3.L(getString(com.tencent.mm.R.string.isw));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", " oversea wallet open new name ：%s", java.lang.Boolean.TRUE);
            normalIconNewTipPreference3.L(getString(com.tencent.mm.R.string.isw));
        }
        if (intValue3 != 0 && intValue3 != 1) {
            gm0.j1.i();
            int intValue5 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
            if (intValue3 == intValue4) {
                if (intValue5 == 1) {
                    e17 = true;
                    b17 = false;
                } else if (intValue5 == 2) {
                    b17 = true;
                    e17 = false;
                }
            }
            e17 = false;
            b17 = false;
        }
        normalIconNewTipPreference3.n0(this.f196948s);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(normalIconNewTipPreference3);
        normalIconNewTipPreference3.h0();
        java.lang.String str3 = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_LQT_WALLET_RED_DOT_WORDING_STRING, "");
        int intValue6 = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_LQT_WALLET_RED_DOT_INT, -1)).intValue();
        if (e17 || b17) {
            long j17 = -1;
            long longValue = ((java.lang.Long) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_PUSH_DATE_LONG_SYNC, -1L)).longValue();
            java.lang.String d18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("PayWalletRedDotExpire");
            if (d18 != null) {
                try {
                    j17 = java.lang.Long.parseLong(d18);
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            boolean z28 = e17;
            long j18 = j17;
            str = str2;
            normalIconNewTipPreference = normalIconNewTipPreference3;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            i17 = intValue2;
            z17 = b17;
            z18 = d17;
            double d19 = (currentTimeMillis - longValue) / 8.64E7d;
            z19 = z28;
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "pushTick: %s, expireTime: %s, expireTick: %s, currentTick: %s, passDay: %s", java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(86400000 * j18), java.lang.Long.valueOf(currentTimeMillis), java.lang.Double.valueOf(d19));
            if (longValue > 0 && j18 > 0 && d19 >= j18) {
                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                bk0.a.g().r(262156, false);
                z17 = false;
                z19 = false;
            }
        } else {
            i17 = intValue2;
            z19 = e17;
            z17 = b17;
            z18 = d17;
            str = str2;
            normalIconNewTipPreference = normalIconNewTipPreference3;
        }
        gm0.j1.i();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_MY_ENTRY_REDDOT_BOOLEAN_SYNC;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        boolean booleanValue = ((java.lang.Boolean) c17.m(u3Var, bool)).booleanValue();
        gm0.j1.i();
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_WALLET_MY_ENTRY_REDDOT_EXPIRETIME_LONG_SYNC;
        long longValue2 = ((java.lang.Long) c18.m(u3Var2, 0L)).longValue();
        if (booleanValue && longValue2 > 0 && java.lang.System.currentTimeMillis() > longValue2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "walletMyEntryRedDot expire, ignore redDot");
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, bool);
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var2, 0L);
            booleanValue = false;
        }
        boolean z29 = z17 | booleanValue;
        gm0.j1.i();
        java.lang.String str4 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_WORDING_STRING_SYNC, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "after check, isShowNew: %s, isShowDot: %s, walletEntryWording: %s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z29), str4);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a g17 = bk0.a.g();
        com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC;
        com.tencent.mm.storage.u3 u3Var4 = com.tencent.mm.storage.u3.USERINFO_NEW_BANDAGE_WATCHER_PAY_ENTRANCE_STRING_SYNC;
        boolean d27 = g17.d(u3Var3, u3Var4);
        gm0.j1.i();
        com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var5 = com.tencent.mm.storage.u3.USERINFO_WALLET_New_MY_ENTRY_REDDOT_EXPIRETIME_LONG_SYNC;
        long longValue3 = ((java.lang.Long) c19.m(u3Var5, 0L)).longValue();
        if (d27 && longValue3 > 0 && java.lang.System.currentTimeMillis() > longValue3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "walletMyEntryRedDot expire, ignore redDot");
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().j(u3Var3, u3Var4);
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var5, 0L);
            d27 = false;
        }
        boolean z37 = (z29 ? 1 : 0) | d27;
        gm0.j1.i();
        java.lang.String str5 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MY_ENTRY_WORDING_STRING_SYNC, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "after check, isShowNew: %s, isShowDot: %s, walletEntryWording: %s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z37), str5);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(14872, 6, java.lang.Integer.valueOf(z37 ? 1 : 0), "", "", 1);
        if (z18 || z19 || i17 > 0 || z37 || intValue6 == 1) {
            normalIconNewTipPreference2 = normalIconNewTipPreference;
            z27 = true;
        } else {
            normalIconNewTipPreference2 = normalIconNewTipPreference;
            z27 = false;
        }
        if (normalIconNewTipPreference2.o0(z27)) {
            return;
        }
        if (d27) {
            moreTabUI = this;
            if (!moreTabUI.L) {
                g0Var.d(25075, 1, 0);
                moreTabUI.L = true;
            }
        } else {
            moreTabUI = this;
        }
        com.tencent.mm.plugin.newtips.model.r rVar = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE;
        com.tencent.mm.plugin.newtips.model.r rVar2 = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
        if (z18) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                normalIconNewTipPreference2.d0("", -1, normalIconNewTipPreference2.f197754x1);
                normalIconNewTipPreference2.b0(8);
                normalIconNewTipPreference2.c0(0);
                normalIconNewTipPreference2.e5(rVar2, true);
            } else {
                normalIconNewTipPreference2.b0(0);
                normalIconNewTipPreference2.d0(str, -1, -7566196);
                normalIconNewTipPreference2.e0(true);
                normalIconNewTipPreference2.c0(8);
                normalIconNewTipPreference2.e5(rVar, true);
            }
        } else if (z19) {
            normalIconNewTipPreference2.a0(0);
            normalIconNewTipPreference2.V = moreTabUI.getString(com.tencent.mm.R.string.f490501wv);
            normalIconNewTipPreference2.W = com.tencent.mm.R.drawable.asx;
            normalIconNewTipPreference2.c0(8);
            normalIconNewTipPreference2.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NEW, true);
        } else {
            com.tencent.mm.plugin.newtips.model.r rVar3 = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_COUNTER;
            int i19 = i17;
            if (i19 > 99) {
                normalIconNewTipPreference2.a0(0);
                java.lang.String string = moreTabUI.getString(com.tencent.mm.R.string.f493304jo3);
                int b18 = com.tencent.mm.ui.tools.pd.b(getContext(), i19);
                normalIconNewTipPreference2.V = string;
                normalIconNewTipPreference2.W = b18;
                normalIconNewTipPreference2.c0(8);
                normalIconNewTipPreference2.e5(rVar3, true);
            } else if (i19 > 0) {
                normalIconNewTipPreference2.a0(0);
                int b19 = com.tencent.mm.ui.tools.pd.b(getContext(), i19);
                normalIconNewTipPreference2.V = i19 + "";
                normalIconNewTipPreference2.W = b19;
                normalIconNewTipPreference2.c0(8);
                normalIconNewTipPreference2.e5(rVar3, true);
            } else if (z37) {
                normalIconNewTipPreference2.V = "";
                normalIconNewTipPreference2.W = -1;
                normalIconNewTipPreference2.a0(8);
                normalIconNewTipPreference2.c0(0);
                normalIconNewTipPreference2.e5(rVar2, true);
            } else if (intValue6 == 1) {
                normalIconNewTipPreference2.V = "";
                normalIconNewTipPreference2.W = -1;
                normalIconNewTipPreference2.a0(8);
                normalIconNewTipPreference2.b0(0);
                normalIconNewTipPreference2.e0(true);
                if (!x51.t1.b(str3)) {
                    normalIconNewTipPreference2.d0(str3, -1, android.graphics.Color.parseColor("#888888"));
                }
                normalIconNewTipPreference2.Y(8);
                normalIconNewTipPreference2.e5(rVar, true);
            } else {
                normalIconNewTipPreference2.V = "";
                normalIconNewTipPreference2.W = -1;
                normalIconNewTipPreference2.a0(8);
                normalIconNewTipPreference2.c0(8);
                normalIconNewTipPreference2.b0(8);
                normalIconNewTipPreference2.d0("", -1, normalIconNewTipPreference2.f197754x1);
                normalIconNewTipPreference2.h0();
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            str4 = str5;
        }
        if (x51.t1.b(str4) || !z37) {
            normalIconNewTipPreference2.H("");
        } else {
            normalIconNewTipPreference2.H(str4);
        }
        moreTabUI.K0(normalIconNewTipPreference2);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int i18 = x51.t1.f452086a;
        int i19 = 0;
        if (obj != null) {
            if (obj instanceof java.lang.Integer) {
                i19 = ((java.lang.Integer) obj).intValue();
            } else if (obj instanceof java.lang.Long) {
                i19 = ((java.lang.Long) obj).intValue();
            }
        }
        if (a1Var != c01.d9.b().p() || i19 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MoreTabUI", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(i19), a1Var);
            return;
        }
        if (204817 == i19 || 204820 == i19) {
            f1();
        } else if (40 == i19) {
            g1();
        } else if ("208899".equals(java.lang.Integer.valueOf(i17))) {
            Z0();
        }
    }

    public final void g1() {
        boolean z17 = c01.z1.G() && com.tencent.mm.plugin.wallet_core.utils.z0.f181008a.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "wallet status: is open" + z17);
        if (!z17) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_open_pay_entry_default_logic, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "clicfg_android_open_pay_entry_default_logic is false");
            } else if (c01.e2.a0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "wechat user, ignore");
            } else {
                int intValue = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
                if (intValue > 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "walletRegion is " + intValue + ", not chain mainland wallet, ignore");
                } else {
                    jx3.f.INSTANCE.kvStat(34167, "3");
                    com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "chain mainland wallet weixin user, need open wallet entry");
                    z17 = true;
                }
            }
            z17 = false;
        }
        boolean q17 = ((com.tencent.mm.ui.base.preference.h0) this.f196948s).q("settings_mm_wallet");
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_mm_wallet", !z17);
        if (!q17 && z17) {
            ((nh0.i) ((ph0.i) i95.n0.c(ph0.i.class))).wi(new n05.a(true, true, 300L, null, 0, "settings_mm_wallet", (com.tencent.mm.ui.MMFragmentActivity) thisActivity(), false, 0, com.tencent.mm.R.id.l2w));
        }
        this.f197764d.notifyDataSetChanged();
        int i17 = dn1.i.f241873e;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i17 == -1) {
            return;
        }
        boolean z19 = (i17 & 32768) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "wallet status entrance idkey[isOpen:%s, isOpenCurScene:%s]", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z19));
        if (z17 != z19) {
            if (z17) {
                jx3.f.INSTANCE.idkeyStat(1056L, 1L, 1L, false);
            } else {
                jx3.f.INSTANCE.idkeyStat(1056L, 0L, 1L, false);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment, com.tencent.mm.ui.MMFragment
    public android.view.View getLayoutView() {
        return com.tencent.mm.ui.td.f209893c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(getContext()), com.tencent.mm.R.layout.dvi, null, false);
    }

    @Override // bi4.l0
    public void j1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "status statusUINoStatus");
        this.f196950u.setSupportOverscroll(false);
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
        if (pullDownListView != null && !pullDownListView.f212147J) {
            pullDownListView.n();
        }
        this.A.b(2);
        com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference = this.G;
        if (accountInfoPreference != null) {
            accountInfoPreference.N();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment
    public int m0() {
        return com.tencent.mm.R.xml.f494904b5;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0641  */
    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n0(com.tencent.mm.ui.base.preference.r r35, com.tencent.mm.ui.base.preference.Preference r36, com.tencent.mm.ui.base.preference.n0 r37) {
        /*
            Method dump skipped, instructions count: 3422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.MoreTabUI.n0(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference, com.tencent.mm.ui.base.preference.n0):boolean");
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreferenceFragment
    public boolean o0(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference, android.view.View view) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MoreTabUI", "account has not already!");
            return true;
        }
        try {
            if (com.tencent.mm.sdk.platformtools.s9.f192974b || com.tencent.mm.sdk.platformtools.s9.f192975c || z65.c.a()) {
                java.lang.String str = preference.f197780q;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                if (str.equals("settings_emoji_store")) {
                    U0(true);
                    return true;
                }
                java.lang.String str3 = preference.f197780q;
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.equals("more_setting")) {
                    U0(false);
                    return true;
                }
                java.lang.String str4 = preference.f197780q;
                if (str4 != null) {
                    str2 = str4;
                }
                if (str2.equals("settings_mm_cardpackage_new")) {
                    T0();
                    return true;
                }
            } else {
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
        } catch (android.content.ActivityNotFoundException unused) {
        }
        return false;
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference, com.tencent.mm.ui.base.preference.MMPreferenceFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "onActivityCreated");
        super.onActivityCreated(bundle);
        com.tencent.mm.ui.base.preference.h0 h0Var = this.f197764d;
        this.f196948s = h0Var;
        h0Var.m("more_setting", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_emoji_store", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_mm_wallet", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_mm_cardpackage", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_mm_favorite", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_my_album", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_my_finder_album", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_my_finder_and_biz", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_order_center_album", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_my_address", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("more_tab_setting_personal_info", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("more_uishow", true);
        ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("settings_privacy_agreements", true);
        this.f196953x = getView().getRootView().findViewById(com.tencent.mm.R.id.huj);
        this.f196952w = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.l2w);
        this.f196956y = (com.tencent.mm.ui.FrostedContentView) findViewById(com.tencent.mm.R.id.jlt);
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = (com.tencent.mm.ui.widget.listview.PullDownListView) this.f197765e;
        this.f196950u = pullDownListView;
        pullDownListView.setTabView(this.f196953x);
        if (com.tencent.mm.ui.a4.f197117a.h(thisActivity())) {
            this.f196950u.setOnTabViewTranslationListener(new ql5.m() { // from class: com.tencent.mm.ui.MoreTabUI.6

                /* renamed from: a, reason: collision with root package name */
                public int f196988a = 0;

                @Override // ql5.m
                public void a(float f17) {
                    int i17 = this.f196988a;
                    com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                    if (i17 == 0) {
                        this.f196988a = moreTabUI.f196953x.getHeight();
                    }
                    int i18 = this.f196988a - ((int) (f17 + 0.5f));
                    if (i18 <= 0) {
                        moreTabUI.f196956y.a(false, 0, 0.0f);
                        return;
                    }
                    com.tencent.mm.ui.FrostedContentView frostedContentView = moreTabUI.f196956y;
                    frostedContentView.getClass();
                    frostedContentView.a(true, i18, 0.0f);
                }
            });
        }
        this.f196950u.setBackground(com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478348hf));
        this.f196950u.setOnScrollListener(new android.widget.AbsListView.OnScrollListener(this) { // from class: com.tencent.mm.ui.MoreTabUI.7
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(absListView);
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(java.lang.Integer.valueOf(i19));
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/MoreTabUI$7", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
                yj0.a.h(this, "com/tencent/mm/ui/MoreTabUI$7", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(absListView);
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/MoreTabUI$7", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
                yj0.a.h(this, "com/tencent/mm/ui/MoreTabUI$7", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i17 = configuration.orientation;
        bi4.e.c(getContext());
        boolean z17 = this.D;
        com.tencent.mm.ui.MoreTabUI.StoryStatusMachine storyStatusMachine = this.A;
        if (z17) {
            boolean z18 = !bi4.e.c(getContext());
            this.M = z18;
            if (z18) {
                com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
                if (pullDownListView != null) {
                    if (!pullDownListView.f212147J) {
                        pullDownListView.getClass();
                        com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "switchNormalStatusImme", new java.lang.Object[0]);
                        if (!pullDownListView.f212147J) {
                            if (pullDownListView.f212150f) {
                                pullDownListView.l((int) (pullDownListView.A * (1.0f - pullDownListView.f212153i)), 0, false);
                            } else {
                                pullDownListView.l(pullDownListView.c() - 1, 0, false);
                            }
                        }
                        F0(bi4.v1.g());
                    }
                    storyStatusMachine.b(2);
                }
            } else {
                F0(bi4.v1.g());
                if (this.f196950u != null) {
                    storyStatusMachine.a();
                }
            }
            android.view.View view = this.f196959z;
            if (view != null) {
                if (this.M) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MoreTabUI", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/MoreTabUI", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/MoreTabUI", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/MoreTabUI", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            e1();
            return;
        }
        int i18 = configuration.orientation;
        if (i18 == 1) {
            this.M = false;
            if (this.f196950u != null) {
                storyStatusMachine.a();
            }
        } else if (i18 == 2) {
            this.M = true;
            com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView2 = this.f196950u;
            if (pullDownListView2 != null) {
                if (!pullDownListView2.f212147J) {
                    pullDownListView2.n();
                }
                storyStatusMachine.b(2);
            }
        }
        int i19 = configuration.screenLayout;
        boolean z19 = ((i19 & 3) == 0 || (i19 & 16) == 0) ? false : true;
        if (z19 != this.R) {
            this.R = z19;
            com.tencent.mm.plugin.story.api.AbsStoryGallery absStoryGallery = this.storyGallery;
            if (absStoryGallery == null || this.f196952w == null || this.f196950u == null) {
                return;
            }
            absStoryGallery.e();
            this.f196952w.removeView(this.storyGallery);
            y0();
            this.storyGallery.k();
            com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView3 = this.f196950u;
            boolean z27 = pullDownListView3.f212147J;
            if (!z27) {
                pullDownListView3.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.ui.MoreTabUI.23
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.ui.MoreTabUI.this.f196950u.n();
                    }
                }, 200L);
            } else {
                if (!z27 || pullDownListView3.getTranslationY() == 0.0f) {
                    return;
                }
                this.f196950u.setTranslationY(0.0f);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "onCreate:  %s", java.lang.Integer.valueOf(hashCode()));
        if (!gm0.j1.a() || gm0.m.r()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MoreTabUI", "Create MoreTabUI when accready:%b ishold:%b", java.lang.Boolean.valueOf(gm0.j1.a()), java.lang.Boolean.valueOf(gm0.m.r()));
            return;
        }
        this.D = bi4.v1.g();
        B0();
        A0(false);
        try {
            android.app.Activity context = getContext();
            if (context == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(getActivity() != null);
                com.tencent.mars.xlog.Log.e("MicroMsg.MoreTabUI", "context is null : getActivity valid =%s", objArr);
            } else {
                ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(context, new o04.e(pj4.p0.class, 9, true));
                pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getContext(), 9, pj4.p0.class);
                if (p0Var != null) {
                    p0Var.f355236d = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Vi();
                }
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                objArr2[0] = java.lang.Boolean.valueOf(p0Var != null);
                com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "initStatusReportData : data valid = %s", objArr2);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MoreTabUI", th6, "[initStatusReportData]err", new java.lang.Object[0]);
        }
        if (getBounceView() != null) {
            getBounceView().setStart2EndBgColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        }
        this.f196954x0.alive();
        this.f196957y0.alive();
        ((h00.m) ((c00.t3) i95.n0.c(c00.t3.class))).getClass();
        if (((java.lang.Boolean) ((jz5.n) h00.h.f277821b).getValue()).booleanValue()) {
            c00.t3 t3Var = (c00.t3) i95.n0.c(c00.t3.class);
            c00.s3 listener = this.X;
            ((h00.m) t3Var).getClass();
            kotlin.jvm.internal.o.g(listener, "listener");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = h00.h.f277824e;
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(1, new java.util.concurrent.CopyOnWriteArraySet());
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) concurrentHashMap.get(1);
            }
            if (copyOnWriteArraySet != null) {
                copyOnWriteArraySet.add(listener);
            }
        } else {
            p90.j jVar = (p90.j) i95.n0.c(p90.j.class);
            p90.i listener2 = this.W;
            oh3.q qVar = (oh3.q) jVar;
            qVar.getClass();
            kotlin.jvm.internal.o.g(listener2, "listener");
            qVar.f345457m.add(listener2);
        }
        if (x51.t1.b(gm0.j1.b().k())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MoreTabUI", "onCreate: status listener failed, username null");
        } else {
            ((zh4.k) i95.n0.c(zh4.k.class)).wi(new yz5.a() { // from class: com.tencent.mm.ui.MoreTabUI$$c
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i17 = com.tencent.mm.ui.MoreTabUI.B1;
                    com.tencent.mm.ui.MoreTabUI moreTabUI = com.tencent.mm.ui.MoreTabUI.this;
                    moreTabUI.getClass();
                    new ej4.a0(gm0.j1.b().k(), moreTabUI, "");
                    return null;
                }
            });
        }
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "onDestroy:  %s", java.lang.Integer.valueOf(hashCode()));
        if (this.Y != null) {
            zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
            androidx.lifecycle.k0 observer = this.Y;
            ((c61.t8) caVar).getClass();
            kotlin.jvm.internal.o.g(observer, "observer");
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105375l.removeObserver(observer);
        }
        if (this.f196946p0 != null) {
            zy2.ca caVar2 = (zy2.ca) i95.n0.c(zy2.ca.class);
            androidx.lifecycle.k0 observer2 = this.f196946p0;
            ((c61.t8) caVar2).getClass();
            kotlin.jvm.internal.o.g(observer2, "observer");
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105377m.removeObserver(observer2);
        }
        this.f196954x0.dead();
        this.f196957y0.dead();
        ((h00.m) ((c00.t3) i95.n0.c(c00.t3.class))).getClass();
        if (((java.lang.Boolean) ((jz5.n) h00.h.f277821b).getValue()).booleanValue()) {
            c00.t3 t3Var = (c00.t3) i95.n0.c(c00.t3.class);
            c00.s3 listener = this.X;
            ((h00.m) t3Var).getClass();
            kotlin.jvm.internal.o.g(listener, "listener");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = h00.h.f277824e;
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) concurrentHashMap.get(1);
            if (copyOnWriteArraySet != null) {
                copyOnWriteArraySet.remove(listener);
                if (copyOnWriteArraySet.isEmpty()) {
                    concurrentHashMap.remove(1, copyOnWriteArraySet);
                }
            }
        } else {
            p90.j jVar = (p90.j) i95.n0.c(p90.j.class);
            p90.i listener2 = this.W;
            oh3.q qVar = (oh3.q) jVar;
            qVar.getClass();
            kotlin.jvm.internal.o.g(listener2, "listener");
            qVar.f345457m.remove(listener2);
        }
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ni();
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference, com.tencent.mm.ui.MMFragment
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.story.api.AbsStoryGallery absStoryGallery;
        return ((i17 != 4 || keyEvent.getAction() != 0 || (absStoryGallery = this.storyGallery) == null) ? false : absStoryGallery.c()) || super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "onPause:  %s", java.lang.Integer.valueOf(hashCode()));
        if (this.P) {
            mf4.d.f326160a.d();
        }
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference, com.tencent.mm.ui.base.preference.MMPreferenceFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "onResume:  %s", java.lang.Integer.valueOf(hashCode()));
        B0();
        if (this.P) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            mf4.d dVar = mf4.d.f326160a;
            mf4.d.f326173n.f60942i = currentTimeMillis;
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f196960z1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "retry addStatusBackPreview");
            this.f196960z1 = false;
            a6();
        }
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference
    public void p0(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "onTabCreate:  %s", java.lang.Integer.valueOf(hashCode()));
        android.content.res.Configuration configuration = getResources().getConfiguration();
        this.M = !bi4.e.c(getContext());
        int i17 = configuration.screenLayout;
        this.R = ((i17 & 3) == 0 || (i17 & 16) == 0) ? false : true;
        this.f196948s = this.f197764d;
        this.f196949t = getContentView();
        fp.a.c(getContext());
        this.A1.getClass();
        ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
        e51.f fVar = ef4.j0.f252452a;
        android.app.Activity context = getContext();
        this.f196951v = context != null ? new com.tencent.mm.plugin.story.ui.view.StoryMuteView(context) : null;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i65.a.f(getContext(), com.tencent.mm.R.dimen.a8e), i65.a.f(getContext(), com.tencent.mm.R.dimen.a8e));
        layoutParams.gravity = 83;
        ((android.view.ViewGroup) getContext().findViewById(com.tencent.mm.R.id.kod).getParent()).addView(this.f196951v, 0, layoutParams);
        this.f196950u.f212173z = this.mPullDownCallback;
        if (com.tencent.mm.ui.a4.f197117a.h(thisActivity())) {
            ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("bottom_empty_place_holder", false);
            com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
            pullDownListView.setPadding(pullDownListView.getPaddingLeft(), this.f196950u.getPaddingTop(), this.f196950u.getPaddingRight(), 0);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f196948s).m("bottom_empty_place_holder", true);
            com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView2 = this.f196950u;
            pullDownListView2.setPadding(pullDownListView2.getPaddingLeft(), this.f196950u.getPaddingTop(), this.f196950u.getPaddingRight(), this.f196953x.getHeight());
        }
        if (this.f196952w != null) {
            y0();
        }
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference
    public void q0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "onTabDestroy:  %s", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.plugin.story.api.AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            absStoryGallery.e();
        }
        com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference = this.G;
        if (accountInfoPreference != null && accountInfoPreference.f191057x1) {
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
            e51.f fVar = ef4.j0.f252452a;
            android.widget.ImageView anchor = accountInfoPreference.f191054p0;
            kotlin.jvm.internal.o.g(anchor, "anchor");
            java.util.HashMap hashMap = ef4.j0.f252453b;
            if (hashMap.containsKey(anchor)) {
                hashMap.remove(anchor);
            }
        }
        this.A1.getClass();
    }

    @Override // com.tencent.mm.ui.y7
    public void r() {
        this.P = true;
        C0();
        if (getContext() != null) {
            android.content.res.Configuration configuration = getResources().getConfiguration();
            this.M = !bi4.e.c(getContext());
            int i17 = configuration.screenLayout;
            this.R = ((i17 & 3) == 0 || (i17 & 16) == 0) ? false : true;
        }
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
        if (pullDownListView != null) {
            pullDownListView.getClass();
            com.tencent.mm.ui.yk.c("MicroMsg.PullDownListView", "onResume", new java.lang.Object[0]);
            pullDownListView.f212163s = true;
            com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView2 = this.f196950u;
            if (!pullDownListView2.f212147J || pullDownListView2.getTranslationY() == 0.0f) {
                com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView3 = this.f196950u;
                if (!pullDownListView3.f212147J) {
                    pullDownListView3.n();
                }
            } else {
                this.f196950u.setTranslationY(0.0f);
            }
        }
        com.tencent.mm.plugin.story.api.AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            absStoryGallery.b();
        }
        if (this.f196958y1) {
            try {
                pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getContext(), 9, pj4.p0.class);
                if (p0Var != null) {
                    p0Var.f355236d = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Vi();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MoreTabUI", th6, "[handleTabSwitchOutForStatus]err", new java.lang.Object[0]);
            }
            e1();
        }
        this.f196958y1 = false;
        ((f50.c0) i95.n0.c(f50.c0.class)).getClass();
        com.tencent.mm.feature.emoji.f4 f4Var = (com.tencent.mm.feature.emoji.f4) ((com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class));
        if (f4Var.f66267g) {
            com.tencent.mars.xlog.Log.i(f4Var.f66264d, "emoticonGlobalStore has created");
        } else {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(f4Var.f66265e, -1, true, 10L, new com.tencent.mm.feature.emoji.e4(f4Var));
        }
        A0(true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        mf4.d dVar = mf4.d.f326160a;
        com.tencent.mm.autogen.mmdata.rpt.StoryProfileTabExposeStruct storyProfileTabExposeStruct = mf4.d.f326173n;
        storyProfileTabExposeStruct.f60942i = currentTimeMillis;
        storyProfileTabExposeStruct.f60937d = java.lang.System.currentTimeMillis();
        if (getActivity() != null && getActivity().getWindow() != null) {
            getActivity().getWindow().setSoftInputMode(34);
        }
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "clickBottomTabRedDot");
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        sharedPreferences.edit().putInt("RedDotBottomTab", 0).apply();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("MyTab");
        b1();
        a1();
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference
    public void r0() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).P6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabUI", "onTabPause: skip %s", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        hashCode();
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().m(this.U);
        c01.d9.b().p().e(this);
        com.tencent.mm.plugin.setting.ui.setting.g gVar = com.tencent.mm.plugin.setting.ui.setting.g.f161052a;
        if (this.V == null) {
            this.V = new com.tencent.mm.plugin.setting.ui.setting.e(this.f196948s, "more_setting");
        }
        gVar.d(this.V);
        com.tencent.mm.plugin.story.api.AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            absStoryGallery.h();
        }
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
        if (pullDownListView != null) {
            boolean z17 = pullDownListView.f212147J;
            if (!z17 && !this.B) {
                pullDownListView.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.ui.MoreTabUI.21
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.ui.MoreTabUI.this.f196950u.n();
                    }
                }, 200L);
            } else if (z17 && pullDownListView.getTranslationY() != 0.0f) {
                this.f196950u.setTranslationY(0.0f);
            }
        }
        com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference accountInfoPreference = this.G;
        if (accountInfoPreference != null) {
            accountInfoPreference.N();
        }
        A0(false);
        com.tencent.mm.ui.MoreTabUI.NewTipsXmlListener newTipsXmlListener = this.f196945l1;
        if (newTipsXmlListener != null) {
            newTipsXmlListener.f196991a = null;
            this.f196945l1 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x045a  */
    @Override // com.tencent.mm.ui.AbstractTabChildPreference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s0() {
        /*
            Method dump skipped, instructions count: 1422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.MoreTabUI.s0():void");
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        return false;
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference
    public void t0() {
        com.tencent.mm.plugin.story.api.AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            absStoryGallery.l();
        }
    }

    @Override // com.tencent.mm.ui.AbstractTabChildPreference
    public void u0() {
        com.tencent.mm.plugin.story.api.AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            absStoryGallery.m();
        }
    }

    public final void y0() {
        if (this.E) {
            return;
        }
        this.E = true;
        if (this.D) {
            android.view.View view = new android.view.View(getContext());
            this.f196959z = view;
            view.setId(com.tencent.mm.R.id.s1d);
            this.f196952w.addView(this.f196959z, 0);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f196959z.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.topMargin = com.tencent.mm.ui.bl.b(getContext()).x;
            this.f196959z.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478489a));
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(uj4.e.class)).f428428r = this;
            android.app.Activity context2 = getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            uj4.e eVar = (uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(uj4.e.class);
            java.lang.String a17 = en1.a.a();
            eVar.getClass();
            com.tencent.mars.xlog.Log.i(eVar.f428417d, "addDBNotifyListener: " + a17);
            if (a17 != null) {
                new ej4.s(a17, eVar);
            }
        } else {
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
            e51.f fVar = ef4.j0.f252452a;
            android.app.Activity context3 = getContext();
            ze4.k kVar = ze4.k.SelfTabGallery;
            kotlin.jvm.internal.o.g(context3, "context");
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = new com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView(context3, kVar, 0, false, null, 28, null);
            this.storyGallery = storyGalleryView;
            storyGalleryView.w();
            this.K = -(com.tencent.mm.ui.bl.b(getContext()).y / 10);
            this.f196944J = this.N ? i65.a.f(getContext(), com.tencent.mm.R.dimen.a8g) : i65.a.f(getContext(), com.tencent.mm.R.dimen.a8f);
            this.I = -i65.a.b(getContext(), 330);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, com.tencent.mm.ui.bl.b(getContext()).y);
            layoutParams2.topMargin = this.K;
            layoutParams2.bottomMargin = -com.tencent.mm.ui.bl.c(getContext());
            this.f196952w.addView(this.storyGallery, 0, layoutParams2);
            com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f196950u;
            com.tencent.mm.plugin.story.api.AbsStoryGallery absStoryGallery = this.storyGallery;
            int i17 = this.f196944J;
            int i18 = this.K;
            pullDownListView.G = absStoryGallery;
            pullDownListView.Q = i17;
            pullDownListView.P = i18;
            pullDownListView.f212156n = 0;
            pullDownListView.f212155m = 0;
            pullDownListView.setNavigationBarHeight(com.tencent.mm.ui.bl.c(getActivity()));
            this.f196950u.setTranslationListener(null);
            this.storyGallery.setDataSeed(c01.z1.r());
            this.storyGallery.a(this.f196950u);
            this.storyGallery.setStoryBrowseUIListener(this);
        }
        this.A.a();
        if (this.D) {
            if (!this.C) {
                j1();
            } else {
                a6();
                M2();
            }
        }
    }

    public final void z0(int i17) {
        try {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f196959z.getLayoutParams();
            int i18 = layoutParams.topMargin;
            this.f196959z.getWidth();
            this.f196959z.getHeight();
            if (layoutParams.topMargin != i17) {
                layoutParams.topMargin = i17;
                this.f196959z.setLayoutParams(layoutParams);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MoreTabUI", th6, "adjustStatusBgPosition", new java.lang.Object[0]);
        }
    }
}
