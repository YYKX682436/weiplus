package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class MainTabUI {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.HashMap f196920p;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.MMFragmentActivity f196921a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.he f196922b = new com.tencent.mm.ui.he();

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.p8 f196923c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f196924d;

    /* renamed from: e, reason: collision with root package name */
    public int f196925e;

    /* renamed from: f, reason: collision with root package name */
    public int f196926f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.fe f196927g;

    /* renamed from: h, reason: collision with root package name */
    public hh4.a f196928h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f196929i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f196930j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f196931k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f196932l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f196933m;
    private com.tencent.mm.ui.MainTabUI.TabsAdapter mTabsAdapter;
    private com.tencent.mm.ui.base.CustomViewPager mViewPager;

    /* renamed from: n, reason: collision with root package name */
    public boolean f196934n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f196935o;

    /* loaded from: classes11.dex */
    public class TabsAdapter extends androidx.fragment.app.e2 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, com.tencent.mm.ui.s1 {
        private byte _hellAccFlag_;
        private com.tencent.mm.ui.contact.address.BaseAddressUIFragment addressFragment;
        private int clickCount;
        private boolean isTabClicked;
        private boolean isUserSwiping;
        boolean[] mFragmentResumedFlags;
        private final com.tencent.mm.ui.mogic.WxViewPager mViewPager;

        public TabsAdapter(androidx.fragment.app.FragmentActivity fragmentActivity, com.tencent.mm.ui.mogic.WxViewPager wxViewPager) {
            super(fragmentActivity.getSupportFragmentManager(), 0);
            this.isTabClicked = false;
            this.clickCount = 0;
            this.isUserSwiping = false;
            this.mFragmentResumedFlags = new boolean[]{true, false, false, false};
            this.mViewPager = wxViewPager;
            wxViewPager.setAdapter(this);
            wxViewPager.setOnPageChangeListener(this);
        }

        private void fixAndroidOProgressBarOutScreenFlashProblem(int i17, float f17, int i18) {
            if (i18 != 0) {
                for (java.lang.Integer num : com.tencent.mm.ui.MainTabUI.f196920p.values()) {
                    if (num.intValue() != i17 && !this.mFragmentResumedFlags[num.intValue()]) {
                        setFragmentLoadingIconVisibility(num.intValue(), 0);
                    }
                }
                return;
            }
            for (java.lang.Integer num2 : com.tencent.mm.ui.MainTabUI.f196920p.values()) {
                if (num2.intValue() != i17) {
                    setFragmentLoadingIconVisibility(num2.intValue(), 8);
                } else if (!this.mFragmentResumedFlags[num2.intValue()]) {
                    setFragmentLoadingIconVisibility(num2.intValue(), 0);
                }
            }
        }

        private void reportSwitch(int i17) {
            int i18 = this.clickCount;
            if (i18 > 0) {
                this.clickCount = i18 - 1;
                if (i17 == 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10957, "1");
                } else if (i17 == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10957, "2");
                } else if (i17 == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10957, "3");
                } else if (i17 == 3) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10957, "4");
                }
            } else if (!this.isUserSwiping) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.MainTabUI", "reportSwitch skip, not click or swipe, pos:%d", java.lang.Integer.valueOf(i17));
            } else if (i17 == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10957, "5");
            } else if (i17 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10957, "6");
            } else if (i17 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10957, "7");
            } else if (i17 == 3) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10957, "8");
            }
            this.isTabClicked = false;
            this.isUserSwiping = false;
        }

        private void setFragmentLoadingIconVisibility(int i17, int i18) {
            android.view.View findViewById;
            if (com.tencent.mm.ui.MainTabUI.this.h(i17) == null || com.tencent.mm.ui.MainTabUI.this.h(i17).getActivity() == null || (findViewById = com.tencent.mm.ui.MainTabUI.this.h(i17).findViewById(com.tencent.mm.R.id.imd)) == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/MainTabUI$TabsAdapter", "setFragmentLoadingIconVisibility", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "setFragmentLoadingIconVisibility", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 4;
        }

        @Override // androidx.fragment.app.e2
        public androidx.fragment.app.Fragment getItem(int i17) {
            return com.tencent.mm.ui.MainTabUI.this.h(i17);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i17) {
            com.tencent.mm.ui.contact.address.BaseAddressUIFragment baseAddressUIFragment;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object[] array = arrayList.toArray();
            arrayList.clear();
            yj0.a.b("com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageScrollStateChanged", "(I)V", this, array);
            if (i17 == 1) {
                this.isUserSwiping = true;
            }
            if (i17 == 0 && (baseAddressUIFragment = this.addressFragment) != null) {
                baseAddressUIFragment.w0(true);
                this.addressFragment = null;
            }
            com.tencent.mm.ui.fe feVar = com.tencent.mm.ui.MainTabUI.this.f196927g;
            if (feVar != null) {
                com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
                int i18 = homeUI.f196756o;
                com.tencent.mm.ui.MainTabUI mainTabUI = homeUI.f196761t;
                if (i18 == 0 && i17 == 1) {
                    homeUI.f196754m = mainTabUI.f196925e;
                } else if (i17 == 2) {
                    homeUI.f196755n = mainTabUI.f196925e;
                } else if (i17 == 0) {
                    homeUI.f196754m = 0;
                    homeUI.f196755n = 0;
                }
                homeUI.f196756o = i17;
            }
            yj0.a.h(this, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageScrollStateChanged", "(I)V");
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i17, float f17, int i18) {
            com.tencent.mm.ui.t1 t1Var = com.tencent.mm.ui.MainTabUI.this.f196922b.f208866g;
            if (t1Var != null) {
                com.tencent.mm.ui.LauncherUIBottomTabView launcherUIBottomTabView = (com.tencent.mm.ui.LauncherUIBottomTabView) t1Var;
                int i19 = (int) (255.0f * f17);
                int i27 = 255 - i19;
                float f18 = launcherUIBottomTabView.f196858u;
                float f19 = launcherUIBottomTabView.f196855r;
                float f27 = launcherUIBottomTabView.f196859v;
                float f28 = launcherUIBottomTabView.f196856s;
                float f29 = launcherUIBottomTabView.f196860w;
                float f37 = launcherUIBottomTabView.f196857t;
                int i28 = launcherUIBottomTabView.f196854q & (-16777216);
                int i29 = (((int) ((f18 * f17) + f19)) << 16) + (((int) ((f27 * f17) + f28)) << 8) + ((int) ((f29 * f17) + f37)) + i28;
                float f38 = 1.0f - f17;
                int i37 = (((int) ((f18 * f38) + f19)) << 16) + (((int) ((f27 * f38) + f28)) << 8) + ((int) ((f29 * f38) + f37)) + i28;
                if (i17 == 0) {
                    launcherUIBottomTabView.f196846f.f209885e.setFocusAlpha(i27);
                    launcherUIBottomTabView.f196848h.f209885e.setFocusAlpha(i19);
                    launcherUIBottomTabView.f196846f.f209886f.setTextColor(i37);
                    launcherUIBottomTabView.f196848h.f209886f.setTextColor(i29);
                } else if (i17 == 1) {
                    launcherUIBottomTabView.f196848h.f209885e.setFocusAlpha(i27);
                    launcherUIBottomTabView.f196847g.f209885e.setFocusAlpha(i19);
                    launcherUIBottomTabView.f196848h.f209886f.setTextColor(i37);
                    launcherUIBottomTabView.f196847g.f209886f.setTextColor(i29);
                } else if (i17 == 2) {
                    launcherUIBottomTabView.f196847g.f209885e.setFocusAlpha(i27);
                    launcherUIBottomTabView.f196849i.f209885e.setFocusAlpha(i19);
                    launcherUIBottomTabView.f196847g.f209886f.setTextColor(i37);
                    launcherUIBottomTabView.f196849i.f209886f.setTextColor(i29);
                }
                if (f17 == 0.0f) {
                    launcherUIBottomTabView.setTo(i17);
                }
            }
            com.tencent.mm.ui.fe feVar = com.tencent.mm.ui.MainTabUI.this.f196927g;
            if (feVar != null) {
                com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
                if ((!r7.q()) & (homeUI.f196744c != null)) {
                    homeUI.f196744c.L();
                }
                homeUI.f196753l = false;
                int i38 = homeUI.f196761t.f196925e;
                if (!(i38 == 3 && i17 == 2)) {
                    if (i38 == 2 && i17 == 2 && f17 > 0.0f) {
                        homeUI.q(homeUI.f196758q.getResources().getColor(com.tencent.mm.R.color.a9e));
                        android.view.MenuItem menuItem = homeUI.F;
                        if (menuItem != null) {
                            menuItem.setVisible(false);
                        }
                        android.view.MenuItem menuItem2 = homeUI.G;
                        if (menuItem2 != null) {
                            menuItem2.setVisible(false);
                        }
                        android.widget.TextView textView = homeUI.f196746e;
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                    } else {
                        if (i38 == 3 && i17 == 3 && f17 == 0.0f) {
                            homeUI.f196753l = true;
                            homeUI.w(true);
                        } else {
                            if (i38 == 2 && i17 == 2 && f17 == 0.0f) {
                                homeUI.f196753l = true;
                                homeUI.w(true);
                            } else {
                                homeUI.f196753l = true;
                            }
                        }
                    }
                }
            }
            if (0.0f != f17) {
                if (this.addressFragment == null) {
                    this.addressFragment = (com.tencent.mm.ui.contact.address.BaseAddressUIFragment) com.tencent.mm.ui.MainTabUI.this.h(1);
                }
                this.addressFragment.w0(false);
            } else {
                int i39 = com.tencent.mm.ui.MainTabUI.this.f196926f;
                com.tencent.mm.ui.MainTabUI mainTabUI = com.tencent.mm.ui.MainTabUI.this;
                int i47 = mainTabUI.f196926f;
                if (-1 == i47) {
                    mainTabUI.b(i47, mainTabUI.f196925e);
                    com.tencent.mm.ui.MainTabUI.this.c(i17);
                } else {
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.ge(this, i17));
                }
            }
            fixAndroidOProgressBarOutScreenFlashProblem(i17, f17, i18);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object[] array = arrayList.toArray();
            arrayList.clear();
            yj0.a.b("com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageSelected", "(I)V", this, array);
            if (!gm0.j1.b().m()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.MainTabUI", "on page position %d selected, but account not initialized.", java.lang.Integer.valueOf(i17));
                yj0.a.h(this, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageSelected", "(I)V");
                return;
            }
            kc2.g1 b17 = ((com.tencent.mm.plugin.finder.extension.reddot.x2) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk()).b1();
            if (b17 != null) {
                b17.k().post(new kc2.w0(b17, i17));
            }
            if (i17 == 2) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                com.tencent.mm.plugin.finder.extension.reddot.b3 b3Var = com.tencent.mm.plugin.finder.extension.reddot.b3.f105413d;
                c61.l7 l7Var = (c61.l7) b6Var;
                l7Var.getClass();
                l7Var.nk().r(b3Var, null);
            } else {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yj(com.tencent.mm.plugin.finder.extension.reddot.b3.f105413d);
            }
            zy2.e9 e9Var = (zy2.e9) i95.n0.c(zy2.e9.class);
            boolean z17 = true;
            int i18 = i17 == 2 ? 1 : 0;
            com.tencent.mm.plugin.finder.extension.reddot.w1 w1Var = (com.tencent.mm.plugin.finder.extension.reddot.w1) e9Var;
            w1Var.f105948i = i18;
            if (i18 != 0) {
                boolean z18 = (com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "是否允许撤回发现页底部tab红点", e42.c0.clicfg_enable_revoke_finder_discovery_reddot, 0, false, com.tencent.mm.plugin.finder.storage.yh0.f128390d, 8, null)).intValue() : ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126461o).getValue()).r()).intValue()) == 1;
                if (z18 != w1Var.f105951o) {
                    com.tencent.mars.xlog.Log.i("Finder.NewDiscoveryRedDotHandler", "modify enableRevokeReddot from " + w1Var.f105951o + " to " + z18);
                }
                w1Var.f105951o = z18;
                w1Var.Di(false);
            } else {
                r45.gl0 bj6 = w1Var.bj();
                if (bj6.getBoolean(26)) {
                    w1Var.f105944e = 105;
                    com.tencent.mm.sdk.platformtools.n3 n3Var = w1Var.f105945f;
                    n3Var.removeCallbacksAndMessages(null);
                    n3Var.post(new com.tencent.mm.plugin.finder.extension.reddot.l1(w1Var, false, "4Tab", bj6, 0));
                }
            }
            i95.n0.c(m33.q1.class);
            sg0.a2 a2Var = (sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class));
            a2Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onPageSelected, " + i17);
            if (i17 == 0) {
                a2Var.Vi("chats");
                a2Var.cj(3, 0);
            } else if (i17 == 1) {
                a2Var.Vi("contacts");
                a2Var.cj(3, 0);
            } else if (i17 == 2) {
                a2Var.Vi("discover");
            } else if (i17 == 3) {
                a2Var.Vi("me");
            }
            if (i17 == 2) {
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().a(2);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("Discovery");
            } else if (i17 == 3) {
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().a(1);
            }
            reportSwitch(i17);
            com.tencent.mm.ui.MainTabUI mainTabUI = com.tencent.mm.ui.MainTabUI.this;
            mainTabUI.f196926f = mainTabUI.f196925e;
            mainTabUI.f196925e = i17;
            mainTabUI.f196922b.a(i17);
            com.tencent.mm.ui.MainTabUI.this.f196921a.supportInvalidateOptionsMenu();
            com.tencent.mm.ui.MainTabUI mainTabUI2 = com.tencent.mm.ui.MainTabUI.this;
            com.tencent.mm.ui.MMFragment h17 = mainTabUI2.h(mainTabUI2.f196925e);
            com.tencent.mm.ui.MainTabUI mainTabUI3 = com.tencent.mm.ui.MainTabUI.this;
            if (mainTabUI3.f196926f == 1 && mainTabUI3.f196925e != 1) {
                c01.d9.b().p().w(340226, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
            if (com.tencent.mm.ui.MainTabUI.this.f196925e == 1 && java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c01.d9.b().p().l(340226, null), 0L) >= 180000) {
                ((com.tencent.mm.ui.contact.address.BaseAddressUIFragment) h17).u0();
            }
            if (com.tencent.mm.ui.MainTabUI.this.f196925e == 0) {
                ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(true);
            } else {
                ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(false);
            }
            if (h17 != null) {
                java.lang.String name = com.tencent.mm.ui.MainTabUI.this.f196921a.getClass().getName();
                com.tencent.matrix.lifecycle.owners.f0.f52742x.g(name + "#" + h17.getClass().getSimpleName());
            }
            com.tencent.mm.ui.MainTabUI mainTabUI4 = com.tencent.mm.ui.MainTabUI.this;
            com.tencent.mm.ui.fe feVar = mainTabUI4.f196927g;
            if (feVar != null) {
                int i19 = mainTabUI4.f196925e;
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "tabChange %s", java.lang.Integer.valueOf(i19));
                com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
                if (i19 == 3) {
                    homeUI.f196753l = true;
                }
                if (i19 != 0) {
                    homeUI.getClass();
                    int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getColor(com.tencent.mm.R.color.a07);
                    if (homeUI.K != null) {
                        homeUI.K.setBackgroundColor(color);
                    }
                } else if (homeUI.K != null) {
                    homeUI.K.setBackground(null);
                }
                java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                homeUI.w(true);
                int color2 = homeUI.f196758q.getResources().getColor(com.tencent.mm.R.color.a07);
                int color3 = homeUI.f196758q.getResources().getColor(com.tencent.mm.R.color.f478599bx);
                int color4 = homeUI.f196758q.getResources().getColor(com.tencent.mm.R.color.FG_0);
                homeUI.a(1.0f, color2, 0);
                homeUI.c(1.0f, color3, color4);
                com.tencent.mm.ui.MMFragment h18 = homeUI.f196761t.h(0);
                if (h18 instanceof com.tencent.mm.ui.conversation.MainUI) {
                    boolean z19 = i19 == 0;
                    com.tencent.mm.ui.conversation.ConversationListView conversationListView = ((com.tencent.mm.ui.conversation.MainUI) h18).f207372o;
                    if (conversationListView != null) {
                        conversationListView.setIsCurrentMainUI(z19);
                    }
                    if (z19) {
                        o25.q qVar = o25.q.f342574a;
                        if (qVar.f()) {
                            if (!qVar.g() ? false : qVar.e().getBoolean("biz_time_preload_at_chat_list", false)) {
                                qVar.i();
                            }
                        }
                    }
                }
                homeUI.g();
            }
            com.tencent.mm.autogen.events.HomeUITabChangeEvent homeUITabChangeEvent = new com.tencent.mm.autogen.events.HomeUITabChangeEvent();
            homeUITabChangeEvent.f54438g.f7425a = com.tencent.mm.ui.MainTabUI.this.f196925e;
            homeUITabChangeEvent.e();
            boolean z27 = com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.N(com.tencent.mm.ui.MainTabUI.this.f196921a.getTaskId());
            if (com.tencent.mm.ui.bk.w0() && com.tencent.mm.ui.bk.O(com.tencent.mm.ui.MainTabUI.this.f196921a.getContentResolver()) && com.tencent.mm.ui.bk.A()) {
                int i27 = com.tencent.mm.ui.MainTabUI.this.f196921a.getResources().getConfiguration().orientation;
            }
            if (z27) {
                com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = com.tencent.mm.ui.MainTabUI.this.f196921a;
                if (com.tencent.mm.ui.fl.a(com.tencent.mm.ui.fl.f208605a, mMFragmentActivity.getTaskId()) != 1 && com.tencent.mm.ui.v7.a(com.tencent.mm.ui.v7.f211108a, mMFragmentActivity.getTaskId()) != 1 && com.tencent.mm.ui.w9.a(com.tencent.mm.ui.w9.f211214a, mMFragmentActivity.getTaskId()) != 1 && com.tencent.mm.ui.rk.a(mMFragmentActivity.getTaskId()) != 1 && com.tencent.mm.ui.eg.a(mMFragmentActivity.getTaskId()) != 1) {
                    z17 = false;
                }
                if (!z17) {
                    com.tencent.mm.ui.MainTabUI mainTabUI5 = com.tencent.mm.ui.MainTabUI.this;
                    if (mainTabUI5.f196925e == 0 && mainTabUI5.f196929i.booleanValue()) {
                        yj0.a.h(this, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageSelected", "(I)V");
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent(com.tencent.mm.ui.MainTabUI.this.f196921a, (java.lang.Class<?>) com.tencent.mm.ui.EmptyActivity.class);
                    intent.addFlags(67108864);
                    com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity2 = com.tencent.mm.ui.MainTabUI.this.f196921a;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(mMFragmentActivity2, arrayList2.toArray(), "com/tencent/mm/ui/MainTabUI$TabsAdapter", "onPageSelected", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMFragmentActivity2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(mMFragmentActivity2, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "onPageSelected", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.MainTabUI", "start empty activity");
                }
            }
            yj0.a.h(this, "com/tencent/mm/ui/MainTabUI$TabsAdapter", "com/tencent/mm/ui/MainTabUI$TabsAdapterandroidx/viewpager/widget/ViewPager$OnPageChangeListener", "onPageSelected", "(I)V");
        }

        @Override // com.tencent.mm.ui.s1
        public void onTabClick(int i17) {
            com.tencent.mm.ui.he heVar;
            zy2.ka kaVar;
            com.tencent.mm.plugin.finder.extension.reddot.g gVar;
            com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var;
            com.tencent.mm.ui.MainTabUI mainTabUI = com.tencent.mm.ui.MainTabUI.this;
            if (!mainTabUI.f196931k) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.MainTabUI", "now cannot change tab");
                return;
            }
            if (i17 == mainTabUI.f196925e) {
                com.tencent.mm.ui.MMFragment h17 = mainTabUI.h(i17);
                if (h17 instanceof com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment) {
                    ((com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment) h17).r0();
                    return;
                }
                return;
            }
            this.isTabClicked = true;
            this.clickCount++;
            this.mViewPager.setCurrentItem(i17, false);
            if (i17 != 3) {
                if (i17 != 2 || (heVar = com.tencent.mm.ui.MainTabUI.this.f196922b) == null || (kaVar = heVar.f208865f) == null || (z9Var = (gVar = (com.tencent.mm.plugin.finder.extension.reddot.g) kaVar).f105529c) == null) {
                    return;
                }
                gVar.e(2, z9Var.f105329c, z9Var.f105328b);
                return;
            }
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262145, 266241);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262156, 266241);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262147, 266241);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262149, 266241);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262152, 266241);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().i(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266241);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().j(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC, com.tencent.mm.storage.u3.USERINFO_NEW_BANDAGE_WATCHER_ME_TAB_STRING_SYNC);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            boolean l17 = bk0.a.g().l(352280);
            if (l17) {
                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                bk0.a.g().p(352280, false);
            }
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14872, 6, java.lang.Integer.valueOf(bk0.a.g().b(262156, 266241) ? 1 : 0), "", "", 0);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_MY_ENTRY_TAB_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).fj(l17 ? 7L : 8L, "");
            com.tencent.mm.plugin.setting.ui.setting.g gVar2 = com.tencent.mm.plugin.setting.ui.setting.g.f161052a;
            com.tencent.mm.plugin.setting.ui.setting.g.f161054c = false;
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f196920p = hashMap;
        hashMap.put("tab_main", 0);
        hashMap.put("tab_address", 1);
        hashMap.put("tab_find_friend", 2);
        hashMap.put("tab_settings", 3);
    }

    public MainTabUI() {
        new java.util.HashSet();
        this.f196925e = -1;
        this.f196926f = -1;
        this.f196929i = java.lang.Boolean.FALSE;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f196930j = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTabbarToEvent>(a0Var) { // from class: com.tencent.mm.ui.MainTabUI.1
            {
                this.__eventId = 277569697;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangeTabbarToEvent changeTabbarToEvent) {
                int i17 = changeTabbarToEvent.f54034g.f8420a;
                if (i17 < 0 || i17 > 3) {
                    return false;
                }
                com.tencent.mm.ui.MainTabUI mainTabUI = com.tencent.mm.ui.MainTabUI.this;
                if (i17 == 0) {
                    mainTabUI.o("tab_main");
                    return false;
                }
                if (i17 == 1) {
                    mainTabUI.o("tab_address");
                    return false;
                }
                if (i17 == 2) {
                    mainTabUI.o("tab_find_friend");
                    return false;
                }
                if (i17 != 3) {
                    return false;
                }
                mainTabUI.o("tab_settings");
                return false;
            }
        };
        this.f196931k = true;
        this.f196932l = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EnableMainBottomTabSwitchEvent>(a0Var) { // from class: com.tencent.mm.ui.MainTabUI.2
            {
                this.__eventId = -1510309336;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.EnableMainBottomTabSwitchEvent enableMainBottomTabSwitchEvent) {
                com.tencent.mm.autogen.events.EnableMainBottomTabSwitchEvent enableMainBottomTabSwitchEvent2 = enableMainBottomTabSwitchEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.MainTabUI", "EnableMainBottomTabSwitchEvent enable: %b", java.lang.Boolean.valueOf(enableMainBottomTabSwitchEvent2.f54108g.f8052a));
                boolean z17 = enableMainBottomTabSwitchEvent2.f54108g.f8052a;
                com.tencent.mm.ui.MainTabUI mainTabUI = com.tencent.mm.ui.MainTabUI.this;
                mainTabUI.f196931k = z17;
                mainTabUI.m(z17);
                return true;
            }
        };
        this.f196933m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetMainTabUnReadCountEvent>(a0Var) { // from class: com.tencent.mm.ui.MainTabUI.3
            {
                this.__eventId = 1812910384;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetMainTabUnReadCountEvent getMainTabUnReadCountEvent) {
                com.tencent.mm.autogen.events.GetMainTabUnReadCountEvent getMainTabUnReadCountEvent2 = getMainTabUnReadCountEvent;
                getMainTabUnReadCountEvent2.f54404g.f6674a = com.tencent.mm.ui.MainTabUI.this.i();
                int i17 = getMainTabUnReadCountEvent2.f54404g.f6674a;
                return true;
            }
        };
        this.f196934n = false;
        this.f196935o = new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r7) {
        /*
            r6 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            r0[r2] = r1
            int r1 = r6.f196925e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 1
            r0[r3] = r1
            com.tencent.mm.ui.base.CustomViewPager r1 = r6.mViewPager
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = r2
        L1a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4 = 2
            r0[r4] = r1
            java.util.HashMap r1 = r6.f196935o
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 3
            r0[r4] = r1
            java.lang.String r1 = "MicroMsg.LauncherUI.MainTabUI"
            java.lang.String r4 = "change tab to %d, cur tab %d, has init tab %B, tab cache size %d"
            com.tencent.mars.xlog.Log.i(r1, r4, r0)
            com.tencent.mm.ui.base.CustomViewPager r0 = r6.mViewPager
            if (r0 == 0) goto Lbe
            if (r7 < 0) goto Lbe
            com.tencent.mm.ui.MainTabUI$TabsAdapter r0 = r6.mTabsAdapter
            if (r0 == 0) goto L48
            int r0 = r0.getCount()
            int r0 = r0 - r3
            if (r7 <= r0) goto L48
            goto Lbe
        L48:
            int r0 = r6.f196925e
            if (r0 != r7) goto L55
            java.util.HashMap r0 = r6.f196935o
            int r0 = r0.size()
            if (r0 == 0) goto L55
            return
        L55:
            int r0 = r6.f196925e
            r6.f196925e = r7
            com.tencent.mm.ui.he r1 = r6.f196922b
            r1.a(r7)
            com.tencent.mm.ui.base.CustomViewPager r7 = r6.mViewPager
            if (r7 == 0) goto L75
            r1 = -1
            if (r0 != r1) goto L6b
            int r0 = r6.f196925e
            r7.setCurrentItemNotify(r0, r2)
            goto L70
        L6b:
            int r0 = r6.f196925e
            r7.setCurrentItem(r0, r2)
        L70:
            int r7 = r6.f196925e
            r6.c(r7)
        L75:
            int r7 = r6.f196925e
            if (r7 != 0) goto L89
            java.lang.String r7 = com.tencent.matrix.lifecycle.owners.f0.f52719a
            boolean r7 = com.tencent.matrix.lifecycle.owners.f0.f52739u
            if (r7 == 0) goto L89
            c01.m8 r7 = c01.d9.f()
            com.tencent.mm.booter.notification.x r7 = (com.tencent.mm.booter.notification.x) r7
            r7.k(r3)
            goto L92
        L89:
            c01.m8 r7 = c01.d9.f()
            com.tencent.mm.booter.notification.x r7 = (com.tencent.mm.booter.notification.x) r7
            r7.k(r2)
        L92:
            int r7 = r6.f196925e
            if (r7 == 0) goto Lbe
            com.tencent.mm.ui.MMFragment r7 = r6.h(r2)
            boolean r0 = r7 instanceof com.tencent.mm.ui.conversation.MainUI
            if (r0 == 0) goto Lbe
            com.tencent.mm.ui.conversation.MainUI r7 = (com.tencent.mm.ui.conversation.MainUI) r7
            com.tencent.mm.ui.conversation.ConversationListView r0 = r7.f207372o
            if (r0 == 0) goto Lbe
            boolean r0 = r0.r()
            if (r0 == 0) goto Lbe
            com.tencent.mm.ui.conversation.ConversationListView r7 = r7.f207372o
            boolean r0 = r7.f207315g
            if (r0 == 0) goto Lbb
            com.tencent.mm.plugin.taskbar.ui.r r0 = r7.f207318m
            if (r0 == 0) goto Lbb
            com.tencent.mm.plugin.taskbar.ui.z r0 = (com.tencent.mm.plugin.taskbar.ui.z) r0
            r4 = 0
            r0.b(r4, r2, r3)
        Lbb:
            r7.u()
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.MainTabUI.a(int):void");
    }

    public void b(int i17, int i18) {
        if (i17 == i18) {
            return;
        }
        androidx.lifecycle.m1 h17 = h(i17);
        if (h17 != null && (h17 instanceof com.tencent.mm.ui.y7)) {
            ((com.tencent.mm.ui.y7) h17).B();
        }
        androidx.lifecycle.m1 h18 = h(i18);
        if (h18 != null && (h18 instanceof com.tencent.mm.ui.y7)) {
            ((com.tencent.mm.ui.y7) h18).r();
        }
        kn4.i0 i0Var = (kn4.i0) ((pf0.u) i95.n0.c(pf0.u.class));
        i0Var.getClass();
        java.lang.String str = null;
        java.lang.String str2 = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? null : "MoreTabUI" : "FindMoreFriendUI" : "AddressUI" : "MainUI";
        if (str2 != null) {
            i0Var.Ai(str2, 4);
        }
        if (i18 == 0) {
            str = "MainUI";
        } else if (i18 == 1) {
            str = "AddressUI";
        } else if (i18 == 2) {
            str = "FindMoreFriendUI";
        } else if (i18 == 3) {
            str = "MoreTabUI";
        }
        if (str == null) {
            return;
        }
        i0Var.Ai(str, 3);
    }

    public void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.MainTabUI", "deliverOnTabResume %s", java.lang.Integer.valueOf(i17));
        androidx.lifecycle.m1 h17 = h(i17);
        if (h17 == null) {
            return;
        }
        if (h17 instanceof com.tencent.mm.ui.y7) {
            ((com.tencent.mm.ui.y7) h17).v();
            this.f196923c.getClass();
        }
        this.mTabsAdapter.mFragmentResumedFlags[i17] = true;
    }

    public void d() {
        android.view.View settingsPointView;
        c00.b4 b4Var;
        com.tencent.mm.ui.t1 t1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.MainTabUI", "doOnCreate");
        com.tencent.mm.ui.base.CustomViewPager customViewPager = (com.tencent.mm.ui.base.CustomViewPager) this.f196921a.findViewById(com.tencent.mm.R.id.kod);
        this.mViewPager = customViewPager;
        customViewPager.setOffscreenPageLimit(4);
        m(true);
        this.mViewPager.setCanSlideBySide(false);
        this.mTabsAdapter = new com.tencent.mm.ui.MainTabUI.TabsAdapter(this.f196921a, this.mViewPager);
        com.tencent.mm.ui.he heVar = this.f196922b;
        com.tencent.mm.ui.t1 t1Var2 = heVar.f208866g;
        if (t1Var2 != null) {
            ((com.tencent.mm.ui.LauncherUIBottomTabView) t1Var2).f196846f.f209886f.setText(com.tencent.mm.R.string.gqz);
        }
        if (com.tencent.mm.ui.LauncherUI.getInstance() != null) {
            a(com.tencent.mm.ui.LauncherUI.getInstance().f196840w);
        } else {
            a(0);
        }
        android.view.ViewGroup contentView = (android.view.ViewGroup) this.mViewPager.getParent();
        com.tencent.mm.ui.MainTabUI.TabsAdapter tabsAdapter = this.mTabsAdapter;
        com.tencent.mm.ui.t1 t1Var3 = heVar.f208866g;
        if (t1Var3 != null) {
            t1Var3.setOnTabClickListener(null);
            android.view.View view = (android.view.View) heVar.f208866g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MainTabUnreadMgr", "resetNavBarPos", "(Landroid/view/ViewGroup;Lcom/tencent/mm/ui/BaseLauncherUITabView$IOnTabClick;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/MainTabUnreadMgr", "resetNavBarPos", "(Landroid/view/ViewGroup;Lcom/tencent/mm/ui/BaseLauncherUITabView$IOnTabClick;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (contentView != null) {
                contentView.removeView((android.view.View) heVar.f208866g);
            }
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        com.tencent.mm.ui.LauncherUIBottomTabView launcherUIBottomTabView = new com.tencent.mm.ui.LauncherUIBottomTabView(heVar.f208863d);
        if (com.tencent.mm.ui.b4.c(heVar.f208863d)) {
            launcherUIBottomTabView.setClickable(true);
        }
        launcherUIBottomTabView.setId(com.tencent.mm.R.id.huj);
        if (contentView != null) {
            layoutParams.gravity = 80;
            contentView.addView(launcherUIBottomTabView, layoutParams);
        }
        heVar.f208866g = launcherUIBottomTabView;
        com.tencent.mm.ui.a4 a4Var = com.tencent.mm.ui.a4.f197117a;
        if (a4Var.h(heVar.f208863d)) {
            com.tencent.mm.ui.LauncherUIBottomTabView launcherUIBottomTabView2 = (com.tencent.mm.ui.LauncherUIBottomTabView) heVar.f208866g;
            kotlin.jvm.internal.o.g(launcherUIBottomTabView2, "<this>");
            kotlin.jvm.internal.o.g(contentView, "contentView");
            a4Var.l(launcherUIBottomTabView2, new com.tencent.mm.ui.s3(true, contentView, launcherUIBottomTabView2, false), null);
        }
        android.view.View view2 = (android.view.View) heVar.f208866g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/MainTabUnreadMgr", "resetNavBarPos", "(Landroid/view/ViewGroup;Lcom/tencent/mm/ui/BaseLauncherUITabView$IOnTabClick;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/MainTabUnreadMgr", "resetNavBarPos", "(Landroid/view/ViewGroup;Lcom/tencent/mm/ui/BaseLauncherUITabView$IOnTabClick;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        heVar.f208866g.setOnTabClickListener(tabsAdapter);
        if (t1Var3 != null && t1Var3 != (t1Var = heVar.f208866g)) {
            ((com.tencent.mm.ui.LauncherUIBottomTabView) t1Var).f(t1Var3.getShowFriendPoint());
            ((com.tencent.mm.ui.LauncherUIBottomTabView) heVar.f208866g).h(t1Var3.getSettingsPoint());
            ((com.tencent.mm.ui.LauncherUIBottomTabView) heVar.f208866g).k(t1Var3.getMainTabUnread());
            ((com.tencent.mm.ui.LauncherUIBottomTabView) heVar.f208866g).i(t1Var3.getContactTabUnread());
            ((com.tencent.mm.ui.LauncherUIBottomTabView) heVar.f208866g).j(t1Var3.getFriendTabUnread());
            ((com.tencent.mm.ui.LauncherUIBottomTabView) heVar.f208866g).l(t1Var3.getSettingsTabUnread());
            heVar.f208866g.setTo(t1Var3.getCurIdx());
        }
        zy2.ka kaVar = heVar.f208865f;
        if (kaVar != null) {
            com.tencent.mm.ui.MMFragmentActivity activity = heVar.f208863d;
            com.tencent.mm.plugin.finder.extension.reddot.g gVar = (com.tencent.mm.plugin.finder.extension.reddot.g) kaVar;
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mars.xlog.Log.i("DiscoveryFinderRedDotMgr", "registerDiscoveryObserver...");
            androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.f105355b;
            androidx.lifecycle.k0 k0Var = gVar.f105531e;
            pm0.v.y(j0Var, activity, k0Var);
            pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.f105359d, activity, gVar.f105532f);
            pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.U, activity, k0Var);
            ((com.tencent.mm.plugin.finder.extension.reddot.g) heVar.f208865f).f105527a = heVar.f208877u;
            com.tencent.mm.ui.t1 t1Var4 = heVar.f208866g;
            if (t1Var4 instanceof com.tencent.mm.ui.LauncherUIBottomTabView) {
                android.widget.TextView friendUnreadCountView = ((com.tencent.mm.ui.LauncherUIBottomTabView) t1Var4).getFriendUnreadCountView();
                if (friendUnreadCountView != null) {
                    com.tencent.mm.plugin.finder.extension.reddot.g gVar2 = (com.tencent.mm.plugin.finder.extension.reddot.g) heVar.f208865f;
                    gVar2.getClass();
                    ym5.a1.h(friendUnreadCountView, new com.tencent.mm.plugin.finder.extension.reddot.e(gVar2));
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.MainTabUnreadMgr", "registerFinderRedDotObserve unReadView is null!");
                }
                android.widget.ImageView imageView = ((com.tencent.mm.ui.LauncherUIBottomTabView) heVar.f208866g).f196847g.f209888h;
                if (imageView != null) {
                    com.tencent.mm.plugin.finder.extension.reddot.g gVar3 = (com.tencent.mm.plugin.finder.extension.reddot.g) heVar.f208865f;
                    gVar3.getClass();
                    ym5.a1.h(imageView, new com.tencent.mm.plugin.finder.extension.reddot.d(gVar3));
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.MainTabUnreadMgr", "registerFinderRedDotObserve unReadView is null!");
                }
            }
        }
        zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
        com.tencent.mm.ui.MMFragmentActivity owner = heVar.f208863d;
        com.tencent.mm.ui.qe qeVar = new com.tencent.mm.ui.qe(heVar);
        ((c61.t8) caVar).getClass();
        kotlin.jvm.internal.o.g(owner, "owner");
        pm0.v.X(new c61.q8(owner, qeVar));
        com.tencent.mm.ui.t1 t1Var5 = heVar.f208866g;
        if ((t1Var5 instanceof com.tencent.mm.ui.LauncherUIBottomTabView) && (settingsPointView = ((com.tencent.mm.ui.LauncherUIBottomTabView) t1Var5).getSettingsPointView()) != null && (b4Var = (c00.b4) i95.n0.c(c00.b4.class)) != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(settingsPointView, 32, new b00.o2((b00.q2) b4Var));
        }
        com.tencent.mm.ui.tools.id.b(new com.tencent.mm.ui.tools.hd() { // from class: com.tencent.mm.ui.MainTabUI$$c
            @Override // com.tencent.mm.ui.tools.hd
            public final void a() {
                ((com.tencent.mm.ui.LauncherUIBottomTabView) com.tencent.mm.ui.MainTabUI.this.f196922b.f208866g).f196846f.f209886f.setText(com.tencent.mm.R.string.gqz);
            }
        }, this.f196921a);
    }

    public void e() {
        this.f196930j.dead();
        this.f196932l.dead();
        this.f196933m.dead();
        this.f196935o.clear();
        com.tencent.mm.ui.base.CustomViewPager customViewPager = this.mViewPager;
        if (customViewPager != null) {
            customViewPager.setCanSlide(false);
            this.mViewPager.setCanSlideBySide(false);
        }
        com.tencent.mm.ui.he heVar = this.f196922b;
        zy2.ka kaVar = heVar.f208865f;
        if (kaVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.MainTabUnreadMgr", "[unRegisterFinderRedDotObserve] iFinderTabRedDotManager is null!");
            return;
        }
        com.tencent.mm.ui.MMFragmentActivity activity = heVar.f208863d;
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean e17 = com.tencent.mm.sdk.platformtools.u3.e();
        com.tencent.mars.xlog.Log.i("DiscoveryFinderRedDotMgr", "unregisterDiscoveryObserver... isMainThread=" + e17);
        if (e17) {
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105355b.removeObservers(activity);
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105359d.removeObservers(activity);
            com.tencent.mm.plugin.finder.extension.reddot.aa.U.removeObservers(activity);
        }
        ((com.tencent.mm.plugin.finder.extension.reddot.g) kaVar).f105527a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(boolean z17) {
        zy2.c9 c9Var;
        com.tencent.mm.ui.conversation.MainUI mainUI;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.MainTabUI", "onResume start :%d, chattingShow:%s", java.lang.Integer.valueOf(this.f196925e), java.lang.Boolean.valueOf(z17));
        java.util.HashMap hashMap = this.f196935o;
        if (hashMap.size() != 0) {
            com.tencent.mm.ui.MMFragment h17 = h(this.f196925e);
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.MainTabUI", "notifyCurrentTabResumeUI, mCurIndex:%s", java.lang.Integer.valueOf(this.f196925e));
            if (h17 != 0) {
                ((com.tencent.mm.ui.y7) h17).T();
            }
            if (h17 != 0 && ih.d.c() && h17.getActivity() != null) {
                com.tencent.matrix.lifecycle.owners.f0.f52742x.g(h17.getActivity().getClass().getName() + "#" + h17.getClass().getSimpleName());
            }
        }
        if (this.f196924d && this.f196921a.getIntent().hasExtra("isScrollFirst") && this.f196921a.getIntent().hasExtra("isShowHeader") && (mainUI = (com.tencent.mm.ui.conversation.MainUI) hashMap.get(0)) != null) {
            mainUI.u0(this.f196921a.getIntent().getBooleanExtra("isShowHeader", false), this.f196921a.getIntent().getBooleanExtra("isShowHeaderWithAnim", false), this.f196921a.getIntent().getBooleanExtra("isScrollFirst", true));
        }
        if (this.f196924d) {
            this.f196924d = false;
            o("tab_main");
        }
        com.tencent.mm.ui.conversation.MainUI mainUI2 = (com.tencent.mm.ui.conversation.MainUI) hashMap.get(0);
        if (mainUI2 != null) {
            mainUI2.s0();
        }
        if (this.f196925e != 0 || z17) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(false);
        } else {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(true);
        }
        com.tencent.mm.ui.y7 y7Var = (com.tencent.mm.ui.y7) h(this.f196925e);
        if (y7Var != null) {
            y7Var.U();
        }
        this.f196924d = false;
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(this.f196921a.getIntent(), "preferred_tab", 0);
        if (g17 != 0) {
            a(g17);
            this.f196921a.getIntent().putExtra("preferred_tab", 0);
        }
        this.f196930j.alive();
        this.f196932l.alive();
        this.f196933m.alive();
        final com.tencent.mm.ui.he heVar = this.f196922b;
        com.tencent.mm.ui.t1 t1Var = heVar.f208866g;
        if (gm0.j1.a()) {
            c01.d9.b().p().a(heVar.f208874r);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().a(heVar.f208873q);
            ((l75.a1) c01.d9.b().r()).a(heVar);
            heVar.f208870n.alive();
            heVar.f208876t.alive();
            heVar.f208871o.alive();
        }
        zy2.ka kaVar = heVar.f208865f;
        if (kaVar != null) {
            ((com.tencent.mm.plugin.finder.extension.reddot.g) kaVar).f105533g.alive();
            zy2.ia.n0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "Discovery", null, 2, null);
        }
        nm.j.f338443g.a(new com.tencent.mm.ui.ue(heVar, new java.lang.Runnable() { // from class: com.tencent.mm.ui.he$$b
            @Override // java.lang.Runnable
            public final void run() {
                ((oh3.i) ((p90.k) i95.n0.c(p90.k.class))).wi(1, com.tencent.mm.ui.he.this.f208866g.getSettingsPoint());
            }
        }));
        ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).aj(false);
        ((nv.v1) ((mv.a0) i95.n0.c(mv.a0.class))).Ni(heVar.f208875s);
        if (!this.f196934n && (c9Var = (zy2.c9) i95.n0.c(zy2.c9.class)) != null) {
            ((com.tencent.mm.plugin.finder.service.l3) c9Var).Bi(this.f196921a, 1);
        }
        this.f196934n = false;
    }

    public com.tencent.mm.ui.MMFragment g() {
        return (com.tencent.mm.ui.MMFragment) this.f196935o.get(java.lang.Integer.valueOf(this.f196925e));
    }

    public com.tencent.mm.ui.MMFragment h(int i17) {
        com.tencent.mm.ui.MMFragment mMFragment = null;
        if (i17 < 0) {
            return null;
        }
        java.util.HashMap hashMap = this.f196935o;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return (com.tencent.mm.ui.MMFragment) hashMap.get(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.MainTabUI", "create tab %d", java.lang.Integer.valueOf(i17));
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 == 0) {
            bundle.putInt(com.tencent.mm.ui.conversation.MainUI.class.getName(), 0);
            mMFragment = (com.tencent.mm.ui.MMFragment) androidx.fragment.app.Fragment.instantiate(this.f196921a, com.tencent.mm.ui.conversation.MainUI.class.getName(), bundle);
            if (mMFragment instanceof com.tencent.mm.ui.conversation.MainUI) {
                com.tencent.mm.ui.conversation.MainUI mainUI = (com.tencent.mm.ui.conversation.MainUI) mMFragment;
                com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f196921a;
                mainUI.f207371n = mMFragmentActivity;
                com.tencent.mm.ui.conversation.ConversationListView conversationListView = mainUI.f207372o;
                if (conversationListView != null) {
                    conversationListView.setActivity(mMFragmentActivity);
                }
                hh4.a aVar = this.f196928h;
                mainUI.C = aVar;
                com.tencent.mm.ui.conversation.ConversationListView conversationListView2 = mainUI.f207372o;
                if (conversationListView2 != null) {
                    conversationListView2.setActionBarUpdateCallback(aVar);
                }
            }
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(true);
            cy1.a aVar2 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(mMFragment, iy1.c.MainUI);
            aVar2.Rj(mMFragment, iy1.a.Main);
            aVar2.Tj(mMFragment, 4, 16, false);
        } else if (i17 == 1) {
            mMFragment = (com.tencent.mm.ui.MMFragment) androidx.fragment.app.Fragment.instantiate(this.f196921a, com.tencent.mm.ui.contact.address.MvvmAddressUIFragment.class.getName(), bundle);
            cy1.a aVar3 = (cy1.a) ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(mMFragment, iy1.c.MvvmAddressUIFragment)).ik(mMFragment, 4, 33926);
            aVar3.Ai(mMFragment, new ly1.a() { // from class: com.tencent.mm.ui.MainTabUI$$a
                @Override // ly1.a
                public final java.util.Map b(java.lang.String str) {
                    java.util.HashMap hashMap2 = com.tencent.mm.ui.MainTabUI.f196920p;
                    com.tencent.mm.ui.MainTabUI mainTabUI = com.tencent.mm.ui.MainTabUI.this;
                    mainTabUI.getClass();
                    java.util.HashMap hashMap3 = new java.util.HashMap();
                    if (android.text.TextUtils.equals("page_in", str)) {
                        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity2 = mainTabUI.f196921a;
                        tf5.m mVar = mMFragmentActivity2 == null ? null : (tf5.m) pf5.z.f353948a.a(mMFragmentActivity2).e(tf5.m.class);
                        if (mVar != null) {
                            hashMap3.put("page_sessionid", java.lang.Long.valueOf(mVar.f419003d));
                        }
                    }
                    return hashMap3;
                }
            });
            aVar3.Rj(mMFragment, iy1.a.Contacts);
        } else if (i17 == 2) {
            bundle.putInt(com.tencent.mm.ui.FindMoreFriendsUI.class.getName(), 2);
            mMFragment = (com.tencent.mm.ui.MMFragment) androidx.fragment.app.Fragment.instantiate(this.f196921a, com.tencent.mm.ui.FindMoreFriendsUI.class.getName(), bundle);
            cy1.a aVar4 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(mMFragment, iy1.c.FindMoreFriendsUI);
            aVar4.Rj(mMFragment, iy1.a.Discover);
            aVar4.Tj(mMFragment, 4, 16, false);
            aVar4.Vj(mMFragment, 4, new com.tencent.mm.ui.MainTabUI$$b());
        } else if (i17 == 3) {
            bundle.putInt(com.tencent.mm.ui.MoreTabUI.class.getName(), 3);
            mMFragment = (com.tencent.mm.ui.MMFragment) androidx.fragment.app.Fragment.instantiate(this.f196921a, com.tencent.mm.ui.MoreTabUI.class.getName(), bundle);
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(mMFragment, iy1.c.MoreTabUI)).Rj(mMFragment, iy1.a.More);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.MainTabUI", "createFragment index:%d", java.lang.Integer.valueOf(i17));
        if (mMFragment != null) {
            mMFragment.setParent(this.f196921a);
        }
        hashMap.put(java.lang.Integer.valueOf(i17), mMFragment);
        return mMFragment;
    }

    public int i() {
        com.tencent.mm.ui.he heVar = this.f196922b;
        com.tencent.mm.ui.t1 t1Var = heVar.f208866g;
        if (t1Var == null || t1Var.getMainTabUnread() <= 0) {
            return 0;
        }
        return heVar.f208866g.getMainTabUnread();
    }

    public boolean j() {
        com.tencent.mm.ui.conversation.ConversationListView conversationListView;
        com.tencent.mm.ui.conversation.MainUI mainUI = (com.tencent.mm.ui.conversation.MainUI) this.f196935o.get(0);
        if (mainUI == null || (conversationListView = mainUI.f207372o) == null) {
            return false;
        }
        return conversationListView.r();
    }

    public void k(int i17, int i18) {
        com.tencent.mm.ui.fe feVar = this.f196927g;
        if (feVar != null) {
            com.tencent.mm.ui.HomeUI.AnonymousClass1 anonymousClass1 = (com.tencent.mm.ui.HomeUI.AnonymousClass1) feVar;
            if (i17 != 1) {
                anonymousClass1.getClass();
                return;
            }
            com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
            if (i18 == 0) {
                homeUI.v(homeUI.f196758q.getResources().getColor(com.tencent.mm.R.color.a9e));
            } else if (homeUI.f196761t.f196925e == 0) {
                homeUI.v(homeUI.f196758q.getResources().getColor(com.tencent.mm.R.color.a9e));
            }
        }
    }

    public void l(int i17) {
        com.tencent.mm.ui.fe feVar = this.f196927g;
        if (feVar != null) {
            com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
            if (i17 == 0) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                int hashCode = homeUI.hashCode();
                iy1.c cVar = iy1.c.MainUI;
                ((cy1.a) rVar).uj("MainUI_LeftScreen", hashCode, 1006, 0);
                dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
                com.tencent.mm.ui.MainTabUI mainTabUI = homeUI.f196761t;
                ((cy1.a) rVar2).bk(mainTabUI.h(mainTabUI.f196925e), true);
                homeUI.f196762u = true;
                homeUI.v(homeUI.f196758q.getResources().getColor(com.tencent.mm.R.color.a9e));
            } else {
                dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
                com.tencent.mm.ui.MainTabUI mainTabUI2 = homeUI.f196761t;
                ((cy1.a) rVar3).bk(mainTabUI2.h(mainTabUI2.f196925e), false);
                dy1.r rVar4 = (dy1.r) i95.n0.c(dy1.r.class);
                int hashCode2 = homeUI.hashCode();
                iy1.c cVar2 = iy1.c.MainUI;
                ((cy1.a) rVar4).vj("MainUI_LeftScreen", hashCode2, 1006, 0);
                homeUI.f196762u = false;
                if (homeUI.f196761t.f196925e == 3) {
                    homeUI.v(homeUI.f196758q.getResources().getColor(com.tencent.mm.R.color.a9e));
                } else {
                    homeUI.v(homeUI.f196758q.getResources().getColor(com.tencent.mm.R.color.a07));
                }
            }
            com.tencent.mm.autogen.events.MultiTaskTabChangedEvent multiTaskTabChangedEvent = new com.tencent.mm.autogen.events.MultiTaskTabChangedEvent();
            multiTaskTabChangedEvent.f54507g.f6562a = i17;
            multiTaskTabChangedEvent.e();
        }
    }

    public final void m(boolean z17) {
        this.mViewPager.setCanSlide(z17);
    }

    public void n() {
        com.tencent.mm.ui.he heVar = this.f196922b;
        heVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.ui.ne(heVar), "setConversationTagUnread");
    }

    public void o(java.lang.String str) {
        if (str == null || str.equals("")) {
            return;
        }
        a(((java.lang.Integer) f196920p.get(str)).intValue());
    }
}
