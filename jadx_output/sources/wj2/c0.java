package wj2;

/* loaded from: classes10.dex */
public class c0 extends oj2.o {
    public android.widget.ImageView A1;
    public android.widget.ImageView B1;
    public android.widget.Space C1;
    public android.widget.ImageView T;
    public android.view.ViewGroup U;
    public com.tencent.mm.view.MMPAGView V;
    public lj2.c0 W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.TextView f446649l1;

    /* renamed from: p0, reason: collision with root package name */
    public lj2.p f446650p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.TextView f446651p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.ViewGroup f446652x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.ImageView f446653x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.ViewGroup f446654y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.ViewGroup f446655y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.TextView f446656z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    private final int getAvatarSize() {
        return wj2.z.f446744a[getCurWidgetMode().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs) : getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
    }

    private final int getMuteIconCircleSize() {
        return wj2.z.f446744a[getCurWidgetMode().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9) : getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479673ca);
    }

    private final int getMuteIconSize() {
        return wj2.z.f446744a[getCurWidgetMode().ordinal()] == 1 ? getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) : getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r0.f309177h == true) goto L8;
     */
    @Override // wj2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P() {
        /*
            r5 = this;
            super.P()
            km2.q r0 = r5.getBindLinkMicUser()
            r1 = 0
            if (r0 == 0) goto L10
            r2 = 1
            boolean r0 = r0.f309177h
            if (r0 != r2) goto L10
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L45
            zl2.r4 r0 = zl2.r4.f473950a
            boolean r0 = r0.x1()
            if (r0 == 0) goto L45
            lj2.v0 r0 = r5.getPluginAbility()
            qo0.c r0 = r0.q()
            if (r0 == 0) goto L45
            qo0.b r2 = qo0.b.f365337c5
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "PARAM_FINDER_LIVE_PK_ANCHOR_IS_MUTE"
            r3.putBoolean(r4, r1)
            km2.q r1 = r5.getBindLinkMicUser()
            if (r1 == 0) goto L3b
            java.lang.String r1 = r1.f309172c
            if (r1 != 0) goto L3d
        L3b:
            java.lang.String r1 = ""
        L3d:
            java.lang.String r4 = "PARAM_FINDER_LIVE_MIC_USER_NAME"
            r3.putString(r4, r1)
            r0.statusChange(r2, r3)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.c0.P():void");
    }

    @Override // oj2.o, wj2.w
    public void R() {
        java.lang.String str;
        java.lang.String str2;
        super.R();
        xh2.a bindMicData = getBindMicData();
        if (bindMicData != null) {
            t(getFinderLiveVideoLinkBottomBarAvatar());
            lj2.p anchorBattleResultWidget = getAnchorBattleResultWidget();
            km2.q qVar = bindMicData.f454520a;
            java.lang.String str3 = "";
            if (qVar == null || (str = qVar.f309172c) == null) {
                str = "";
            }
            if (qVar != null && (str2 = qVar.f309170a) != null) {
                str3 = str2;
            }
            anchorBattleResultWidget.a(str, str3);
            getAnchorBattleTipWidget().f(bindMicData.f454521b.f282609a < 0.5f);
        }
        pm0.v.X(new wj2.b0(this));
        e();
    }

    @Override // oj2.o, sj2.m
    public void a() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationStart");
    }

    @Override // oj2.o
    public void a0() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.av6, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.afh;
        if (((android.widget.Space) x4.b.a(inflate, com.tencent.mm.R.id.afh)) != null) {
            i17 = com.tencent.mm.R.id.che;
            if (((androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.che)) != null) {
                i17 = com.tencent.mm.R.id.eop;
                android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.eop);
                if (a17 != null) {
                    fg2.j1.a(a17);
                    i17 = com.tencent.mm.R.id.f484566ep0;
                    android.view.View a18 = x4.b.a(inflate, com.tencent.mm.R.id.f484566ep0);
                    if (a18 != null) {
                        fg2.k1.a(a18);
                        i17 = com.tencent.mm.R.id.evg;
                        android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.evg);
                        if (a19 != null) {
                            fg2.v0.a(a19);
                            i17 = com.tencent.mm.R.id.fa_;
                            if (((com.tencent.mm.plugin.finder.live.mic.widget.VisibilityTextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_)) != null) {
                                i17 = com.tencent.mm.R.id.fag;
                                if (((android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.fag)) != null) {
                                    i17 = com.tencent.mm.R.id.fah;
                                    if (((com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.fah)) != null) {
                                        i17 = com.tencent.mm.R.id.fak;
                                        android.view.View a27 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                        if (a27 != null) {
                                            fg2.r0.a(a27);
                                            i17 = com.tencent.mm.R.id.fal;
                                            android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.fal);
                                            if (a28 != null) {
                                                fg2.x0.a(a28);
                                                i17 = com.tencent.mm.R.id.fnz;
                                                if (((android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.fnz)) != null) {
                                                    i17 = com.tencent.mm.R.id.f484836fo0;
                                                    if (((com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.f484836fo0)) != null) {
                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                                                        int i18 = com.tencent.mm.R.id.f484838fo3;
                                                        if (((android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.f484838fo3)) != null) {
                                                            i18 = com.tencent.mm.R.id.f484839fo4;
                                                            if (((android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f484839fo4)) != null) {
                                                                i18 = com.tencent.mm.R.id.f486680m42;
                                                                if (((android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f486680m42)) != null) {
                                                                    kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
                                                                    f0(constraintLayout);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        i17 = i18;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    public void c0() {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        android.view.ViewGroup root = getRoot();
        kotlin.jvm.internal.o.e(root, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        cVar.d((androidx.constraintlayout.widget.ConstraintLayout) root);
        if (m()) {
            cVar.c(getPkHearLayout().getId(), 1);
            cVar.c(getPkHearLayout().getId(), 2);
            cVar.c(getFinderLivePkAnchorAudioTipsLayout().getId(), 1);
            cVar.c(getFinderLivePkAnchorAudioTipsLayout().getId(), 2);
            cVar.e(getPkHearLayout().getId(), 3, getBattleBarSpace().getId(), 4);
            cVar.f(getPkHearLayout().getId(), 1, 0, 1, i65.a.b(getRoot().getContext(), 8));
            cVar.e(getPkHearLayout().getId(), 2, getFinderLivePkAnchorAudioTipsLayout().getId(), 1);
            cVar.e(getFinderLivePkAnchorAudioTipsLayout().getId(), 1, getPkHearLayout().getId(), 2);
            cVar.e(getFinderLivePkAnchorAudioTipsLayout().getId(), 3, getBattleBarSpace().getId(), 4);
        } else {
            cVar.c(getPkHearLayout().getId(), 1);
            cVar.c(getPkHearLayout().getId(), 2);
            cVar.c(getFinderLivePkAnchorAudioTipsLayout().getId(), 1);
            cVar.c(getFinderLivePkAnchorAudioTipsLayout().getId(), 2);
            cVar.f(getPkHearLayout().getId(), 2, 0, 2, i65.a.b(getRoot().getContext(), 8));
            cVar.e(getPkHearLayout().getId(), 3, getBattleBarSpace().getId(), 4);
            cVar.e(getFinderLivePkAnchorAudioTipsLayout().getId(), 3, getBattleBarSpace().getId(), 4);
            cVar.e(getFinderLivePkAnchorAudioTipsLayout().getId(), 1, 0, 1);
        }
        android.view.ViewGroup root2 = getRoot();
        kotlin.jvm.internal.o.e(root2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) root2;
        cVar.b(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    @Override // oj2.o, sj2.m
    public void d() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationEnd");
    }

    public final void d0(boolean z17) {
        if (z17) {
            getPkAudioModeIcon().setVisibility(4);
            getPkAudioModeIcon().n();
        } else {
            getPkAudioModeIcon().setVisibility(0);
            getPkAudioModeIcon().g();
        }
    }

    @Override // oj2.o, lj2.u0
    public void e() {
        jz5.f0 f0Var;
        e0();
        dk2.u4 K = getPluginAbility().a0().K();
        if (K != null) {
            if (K.h() || K.i()) {
                android.view.ViewGroup pkHearLayout = getPkHearLayout();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(pkHearLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                pkHearLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(pkHearLayout, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView finderLiveMicHeartText = getFinderLiveMicHeartText();
                if (finderLiveMicHeartText != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(finderLiveMicHeartText, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderLiveMicHeartText.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(finderLiveMicHeartText, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                java.util.List g17 = getPluginAbility().a0().g();
                if (g17.size() > 1) {
                    if (K.f234160g == 2) {
                        h0(K);
                    } else {
                        g0(K);
                    }
                } else if (g17.size() == 1 && (!getPluginAbility().a0().l().isEmpty())) {
                    h0(K);
                } else {
                    super.e();
                    android.view.ViewGroup pkHearLayout2 = getPkHearLayout();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(pkHearLayout2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    pkHearLayout2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(pkHearLayout2, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                super.e();
                getPkHearLayout().setVisibility(8);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.e();
            getPkHearLayout().setVisibility(8);
        }
    }

    public final void e0() {
        jz5.f0 f0Var;
        if (getPluginAbility().a0().K() != null) {
            getSingleHeartLayout().setOnClickListener(this);
            getTeamHeartLayout().setOnClickListener(this);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            getSingleHeartLayout().setOnClickListener(null);
            getTeamHeartLayout().setOnClickListener(null);
        }
    }

    public final void f0(android.view.ViewGroup rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        setRoot(rootView);
        android.view.View findViewById = getRoot().findViewById(com.tencent.mm.R.id.fag);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setFinderLiveMicMuteIcon((android.widget.FrameLayout) findViewById);
        android.view.View findViewById2 = getRoot().findViewById(com.tencent.mm.R.id.fah);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setFinderLiveMicMuteIconWe((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2);
        android.view.View findViewById3 = getRoot().findViewById(com.tencent.mm.R.id.fak);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        setFinderLiveMicNewNormalMicGiftItemLayout((android.view.ViewGroup) findViewById3);
        android.view.View findViewById4 = getRoot().findViewById(com.tencent.mm.R.id.fnz);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        setFinderLiveVideoLinkBottomBarAvatar((android.widget.ImageView) findViewById4);
        android.view.View findViewById5 = getRoot().findViewById(com.tencent.mm.R.id.f484836fo0);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        setFinderLiveVideoLinkBottomBarName((android.widget.TextView) findViewById5);
        android.view.View findViewById6 = getRoot().findViewById(com.tencent.mm.R.id.f484838fo3);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        setFinderLiveVideoLinkCoverBg((android.widget.ImageView) findViewById6);
        android.view.View findViewById7 = getRoot().findViewById(com.tencent.mm.R.id.evg);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        setFinderLivePkAnchorAudioTipsLayout((android.view.ViewGroup) findViewById7);
        android.view.View findViewById8 = getRoot().findViewById(com.tencent.mm.R.id.fal);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        setPkHearLayout((android.view.ViewGroup) findViewById8);
        android.view.View findViewById9 = getRoot().findViewById(com.tencent.mm.R.id.fa7);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        setSingleHeartLayout((android.view.ViewGroup) findViewById9);
        android.view.View findViewById10 = getRoot().findViewById(com.tencent.mm.R.id.fa8);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        setSingleRangeText((android.widget.TextView) findViewById10);
        android.view.View findViewById11 = getRoot().findViewById(com.tencent.mm.R.id.fap);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        setSingleHeartText((android.widget.TextView) findViewById11);
        setFinderLiveMicHeartText((android.widget.TextView) getRoot().findViewById(com.tencent.mm.R.id.fa_));
        android.view.View findViewById12 = getRoot().findViewById(com.tencent.mm.R.id.qag);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        setSoloGiftIcon((android.widget.ImageView) findViewById12);
        android.view.View findViewById13 = getRoot().findViewById(com.tencent.mm.R.id.qam);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        setTeamGiftIcon((android.widget.ImageView) findViewById13);
        android.view.View findViewById14 = getRoot().findViewById(com.tencent.mm.R.id.fa9);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        setTeamHeartLayout((android.view.ViewGroup) findViewById14);
        android.view.View findViewById15 = getRoot().findViewById(com.tencent.mm.R.id.qrm);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        setTeamHeartText((android.widget.TextView) findViewById15);
        android.view.View findViewById16 = getRoot().findViewById(com.tencent.mm.R.id.afh);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        setBattleBarSpace((android.widget.Space) findViewById16);
        android.view.View findViewById17 = getFinderLivePkAnchorAudioTipsLayout().findViewById(com.tencent.mm.R.id.evh);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        setPkAudioModeIcon((com.tencent.mm.view.MMPAGView) findViewById17);
        ym5.l2 l2Var = ym5.l2.f463424a;
        getPkAudioModeIcon();
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        getPkAudioModeIcon().o(ae2.in.f3688a.a(ym5.f6.W));
        com.tencent.mm.view.MMPAGView pkAudioModeIcon = getPkAudioModeIcon();
        android.content.res.AssetManager assets = getRoot().getContext().getAssets();
        kotlin.jvm.internal.o.f(assets, "getAssets(...)");
        pkAudioModeIcon.k(assets, "finder_live_link_mic_wave.pag");
        getPkAudioModeIcon().setRepeatCount(-1);
        android.view.View findViewById18 = getRoot().findViewById(com.tencent.mm.R.id.f484566ep0);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        setAnchorBattleTipWidget(new lj2.c0(findViewById18, getPluginAbility()));
        android.view.View findViewById19 = getRoot().findViewById(com.tencent.mm.R.id.eop);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        setAnchorBattleResultWidget(new lj2.p((android.view.ViewGroup) findViewById19));
        zl2.r4.f473950a.b3(getSingleRangeText());
        getFinderLiveVideoLinkBottomBarAvatar().setOnClickListener(this);
    }

    public final void g0(dk2.u4 battleData) {
        kotlin.jvm.internal.o.g(battleData, "battleData");
        c0();
        getTeamHeartLayout().setVisibility(8);
        getTeamHeartText().setText("0");
        getSingleHeartLayout().setVisibility(0);
        getSoloGiftIcon().setVisibility(8);
        getSingleHeartText().setTypeface(android.graphics.Typeface.defaultFromStyle(0));
        getSingleHeartText().setVisibility(8);
        getSingleRangeText().setVisibility(8);
        int h17 = getPluginAbility().a0().h(getBindLinkMicUser());
        getSingleRangeText().setText(java.lang.String.valueOf(h17));
        if (h17 == 1) {
            getSingleRangeText().setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479078pg));
            getSingleRangeText().setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.ck_));
            getSingleHeartLayout().setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a8v));
        } else if (h17 == 2) {
            getSingleRangeText().setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479106q5));
            getSingleRangeText().setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.cnp));
            getSingleHeartLayout().setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a8u));
        } else if (h17 != 3) {
            getSingleRangeText().setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479105q4));
            getSingleRangeText().setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.cl6));
            getSingleHeartLayout().setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a8u));
        } else {
            getSingleRangeText().setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479105q4));
            getSingleRangeText().setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.cnq));
            getSingleHeartLayout().setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a8u));
        }
        if (battleData.f234161h != 1) {
            getSingleRangeText().setVisibility(0);
            W(getSingleHeartText());
        } else {
            if (battleData.j()) {
                getSingleRangeText().setVisibility(0);
            }
            V(getSingleHeartText(), getSoloGiftIcon());
        }
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    public final lj2.p getAnchorBattleResultWidget() {
        lj2.p pVar = this.f446650p0;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.o.o("anchorBattleResultWidget");
        throw null;
    }

    public final lj2.c0 getAnchorBattleTipWidget() {
        lj2.c0 c0Var = this.W;
        if (c0Var != null) {
            return c0Var;
        }
        kotlin.jvm.internal.o.o("anchorBattleTipWidget");
        throw null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    public final android.widget.Space getBattleBarSpace() {
        android.widget.Space space = this.C1;
        if (space != null) {
            return space;
        }
        kotlin.jvm.internal.o.o("battleBarSpace");
        throw null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public ai2.a getBattleResultWidget() {
        return getAnchorBattleResultWidget();
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public qi2.s1 getBattleTipsWidget() {
        return getAnchorBattleTipWidget();
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    public final android.view.ViewGroup getFinderLivePkAnchorAudioTipsLayout() {
        android.view.ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLivePkAnchorAudioTipsLayout");
        throw null;
    }

    public final android.widget.ImageView getFinderLiveVideoLinkBottomBarAvatar() {
        android.widget.ImageView imageView = this.f446653x1;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("finderLiveVideoLinkBottomBarAvatar");
        throw null;
    }

    public final android.widget.ImageView getFinderLiveVideoLinkCoverBg() {
        android.widget.ImageView imageView = this.T;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("finderLiveVideoLinkCoverBg");
        throw null;
    }

    @Override // oj2.o, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // oj2.o, wj2.w, sj2.m
    public android.view.ViewGroup getGiftRootView() {
        return getFinderLiveMicNewNormalMicGiftItemLayout();
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public android.view.ViewGroup getLuckyMoneyRootView() {
        com.tencent.mars.xlog.Log.i(getTAG(), "getLuckyMoneyRootView");
        return new android.widget.RelativeLayout(getRoot().getContext());
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    public final com.tencent.mm.view.MMPAGView getPkAudioModeIcon() {
        com.tencent.mm.view.MMPAGView mMPAGView = this.V;
        if (mMPAGView != null) {
            return mMPAGView;
        }
        kotlin.jvm.internal.o.o("pkAudioModeIcon");
        throw null;
    }

    public final android.view.ViewGroup getPkHearLayout() {
        android.view.ViewGroup viewGroup = this.f446652x0;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("pkHearLayout");
        throw null;
    }

    public final android.view.ViewGroup getSingleHeartLayout() {
        android.view.ViewGroup viewGroup = this.f446654y0;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("singleHeartLayout");
        throw null;
    }

    public final android.widget.TextView getSingleHeartText() {
        android.widget.TextView textView = this.f446651p1;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("singleHeartText");
        throw null;
    }

    public final android.widget.TextView getSingleRangeText() {
        android.widget.TextView textView = this.f446649l1;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("singleRangeText");
        throw null;
    }

    public final android.widget.ImageView getSoloGiftIcon() {
        android.widget.ImageView imageView = this.B1;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("soloGiftIcon");
        throw null;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "PkAnchorWidget";
    }

    public final android.widget.ImageView getTeamGiftIcon() {
        android.widget.ImageView imageView = this.A1;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("teamGiftIcon");
        throw null;
    }

    public final android.view.ViewGroup getTeamHeartLayout() {
        android.view.ViewGroup viewGroup = this.f446655y1;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("teamHeartLayout");
        throw null;
    }

    public final android.widget.TextView getTeamHeartText() {
        android.widget.TextView textView = this.f446656z1;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("teamHeartText");
        throw null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // oj2.o, sj2.m
    public void h() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationEnd");
        android.view.ViewGroup giftRootView = getGiftRootView();
        if (giftRootView == null) {
            return;
        }
        giftRootView.setVisibility(8);
    }

    public final void h0(dk2.u4 battleData) {
        kotlin.jvm.internal.o.g(battleData, "battleData");
        c0();
        getSingleHeartLayout().setVisibility(8);
        getSingleRangeText().setText("0");
        getSingleHeartText().setText("0");
        getTeamHeartLayout().setVisibility(0);
        getTeamGiftIcon().setVisibility(8);
        getTeamHeartText().setTypeface(android.graphics.Typeface.defaultFromStyle(0));
        getTeamHeartText().setVisibility(8);
        if (battleData.f234161h == 1) {
            V(getTeamHeartText(), getTeamGiftIcon());
        } else {
            W(getTeamHeartText());
        }
        if (n()) {
            getTeamHeartLayout().setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481798a93));
        } else {
            getTeamHeartLayout().setBackgroundDrawable(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481797a92));
        }
    }

    @Override // lj2.u0
    public void i(boolean z17) {
        xh2.i iVar;
        com.tencent.mars.xlog.Log.i(getTAG(), "onBattleBarVisibilityChange " + z17);
        xh2.a aVar = this.f318876g;
        if (!(((aVar == null || (iVar = aVar.f454521b) == null) ? 0.0f : iVar.f282610b) <= 0.1f)) {
            android.widget.Space battleBarSpace = getBattleBarSpace();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(battleBarSpace, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            battleBarSpace.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(battleBarSpace, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (z17 != (getBattleBarSpace().getVisibility() == 0)) {
            u4.g1.a(getRoot(), null);
            android.widget.Space battleBarSpace2 = getBattleBarSpace();
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(battleBarSpace2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            battleBarSpace2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(battleBarSpace2, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams = getFinderLivePkAnchorAudioTipsLayout().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = z17 ? i65.a.b(getContext(), 24) : i65.a.b(getContext(), 8);
            }
        }
    }

    public final void i0() {
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCoverBg isPk:");
        km2.q bindLinkMicUser = getBindLinkMicUser();
        sb6.append(bindLinkMicUser != null ? java.lang.Boolean.valueOf(bindLinkMicUser.f309177h) : null);
        sb6.append(" audioMode:");
        km2.q bindLinkMicUser2 = getBindLinkMicUser();
        sb6.append(bindLinkMicUser2 != null ? java.lang.Boolean.valueOf(bindLinkMicUser2.f309185p) : null);
        sb6.append(" bgUrl:");
        km2.q bindLinkMicUser3 = getBindLinkMicUser();
        sb6.append(bindLinkMicUser3 != null ? bindLinkMicUser3.f309184o : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        km2.q bindLinkMicUser4 = getBindLinkMicUser();
        if (bindLinkMicUser4 != null) {
            if (bindLinkMicUser4.f309185p) {
                getFinderLivePkAnchorAudioTipsLayout().setVisibility(0);
                km2.q bindLinkMicUser5 = getBindLinkMicUser();
                if (bindLinkMicUser5 != null) {
                    d0(bindLinkMicUser5.f309183n);
                }
            } else {
                getPkAudioModeIcon().n();
                getFinderLivePkAnchorAudioTipsLayout().setVisibility(4);
            }
            if (!bindLinkMicUser4.f309185p) {
                getFinderLiveVideoLinkCoverBg().setVisibility(8);
                return;
            }
            java.lang.String tag2 = getTAG();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[loadMicUserBg] liveRoomImg = ");
            r45.ba4 ba4Var = bindLinkMicUser4.f309190u;
            sb7.append(ba4Var != null ? pm0.b0.g(ba4Var) : null);
            com.tencent.mars.xlog.Log.i(tag2, sb7.toString());
            getRoot().post(new wj2.a0(bindLinkMicUser4, this));
        }
    }

    @Override // lj2.j
    public boolean n() {
        java.lang.String str;
        lj2.t0 a07 = getPluginAbility().a0();
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser == null || (str = bindLinkMicUser.f309170a) == null) {
            str = "";
        }
        return a07.m(str) == fj2.k.f263175d;
    }

    @Override // oj2.o, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        super.onClick(view);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = getFinderLiveVideoLinkBottomBarAvatar().getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            b0();
        } else {
            int id7 = getSingleHeartLayout().getId();
            boolean z17 = true;
            if (valueOf == null || valueOf.intValue() != id7) {
                int id8 = getTeamHeartLayout().getId();
                if (valueOf == null || valueOf.intValue() != id8) {
                    z17 = false;
                }
            }
            if (z17) {
                H();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setAnchorBattleResultWidget(lj2.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<set-?>");
        this.f446650p0 = pVar;
    }

    public final void setAnchorBattleTipWidget(lj2.c0 c0Var) {
        kotlin.jvm.internal.o.g(c0Var, "<set-?>");
        this.W = c0Var;
    }

    public final void setBattleBarSpace(android.widget.Space space) {
        kotlin.jvm.internal.o.g(space, "<set-?>");
        this.C1 = space;
    }

    public final void setFinderLivePkAnchorAudioTipsLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.U = viewGroup;
    }

    public final void setFinderLiveVideoLinkBottomBarAvatar(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.f446653x1 = imageView;
    }

    public final void setFinderLiveVideoLinkCoverBg(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.T = imageView;
    }

    public final void setPkAudioModeIcon(com.tencent.mm.view.MMPAGView mMPAGView) {
        kotlin.jvm.internal.o.g(mMPAGView, "<set-?>");
        this.V = mMPAGView;
    }

    public final void setPkHearLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.f446652x0 = viewGroup;
    }

    public final void setSingleHeartLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.f446654y0 = viewGroup;
    }

    public final void setSingleHeartText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.f446651p1 = textView;
    }

    public final void setSingleRangeText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.f446649l1 = textView;
    }

    public final void setSoloGiftIcon(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.B1 = imageView;
    }

    public final void setTeamGiftIcon(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.A1 = imageView;
    }

    public final void setTeamHeartLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.f446655y1 = viewGroup;
    }

    public final void setTeamHeartText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.f446656z1 = textView;
    }

    @Override // wj2.w
    public void x() {
        android.view.ViewGroup.LayoutParams layoutParams = getFinderLiveVideoLinkBottomBarAvatar().getLayoutParams();
        if (layoutParams != null) {
            int avatarSize = getAvatarSize();
            layoutParams.width = avatarSize;
            layoutParams.height = avatarSize;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = getFinderLiveMicMuteIcon().getLayoutParams();
        if (layoutParams2 != null) {
            int muteIconSize = getMuteIconSize();
            layoutParams2.width = muteIconSize;
            layoutParams2.height = muteIconSize;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = getFinderLiveMicMuteIconWe().getLayoutParams();
        if (layoutParams3 != null) {
            int muteIconCircleSize = getMuteIconCircleSize();
            layoutParams3.width = muteIconCircleSize;
            layoutParams3.height = muteIconCircleSize;
        }
    }
}
