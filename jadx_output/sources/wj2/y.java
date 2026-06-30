package wj2;

/* loaded from: classes10.dex */
public class y extends oj2.l {
    public android.view.ViewGroup A1;
    public android.widget.FrameLayout B1;
    public android.widget.FrameLayout C1;
    public android.widget.TextView D1;
    public android.animation.Animator E1;
    public lj2.c0 T;
    public lj2.p U;
    public androidx.constraintlayout.widget.ConstraintLayout V;
    public android.view.ViewGroup W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.ImageView f446736l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.ViewGroup f446737p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.ImageView f446738p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f446739x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.ViewGroup f446740x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.TextView f446741y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.TextView f446742y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.Space f446743z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    private final void setPkExtraValue(long j17) {
        android.widget.TextView pkExtraView = getPkExtraView();
        pkExtraView.setText(pkExtraView.getContext().getString(com.tencent.mm.R.string.lvh, java.lang.Long.valueOf(j17)));
    }

    @Override // oj2.l, wj2.w
    public void R() {
        android.widget.TextView micHeartText;
        java.lang.String str;
        java.lang.String str2;
        S(getMicHeartText());
        Z(this.f318877h);
        e();
        xh2.a bindMicData = getBindMicData();
        if (bindMicData != null) {
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
        if (getPluginAbility().a0().g().size() <= 2) {
            setBubbleLayoutScale(1.0f);
        } else {
            setBubbleLayoutScale(0.6f);
        }
        if (!A() || (micHeartText = getMicHeartText()) == null) {
            return;
        }
        setTouchDelegate(micHeartText);
        micHeartText.setOnClickListener(this);
    }

    @Override // oj2.l
    public void a0() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.av8, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.g9c;
        if (((android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.g9c)) != null) {
            i17 = com.tencent.mm.R.id.f1j;
            if (((androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.f1j)) != null) {
                i17 = com.tencent.mm.R.id.afh;
                if (((android.widget.Space) x4.b.a(inflate, com.tencent.mm.R.id.afh)) != null) {
                    i17 = com.tencent.mm.R.id.ejn;
                    if (((android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.ejn)) != null) {
                        i17 = com.tencent.mm.R.id.eop;
                        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.eop);
                        if (a17 != null) {
                            fg2.j1.a(a17);
                            i17 = com.tencent.mm.R.id.f484566ep0;
                            android.view.View a18 = x4.b.a(inflate, com.tencent.mm.R.id.f484566ep0);
                            if (a18 != null) {
                                fg2.k1.a(a18);
                                i17 = com.tencent.mm.R.id.f484572er0;
                                if (((androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.f484572er0)) != null) {
                                    i17 = com.tencent.mm.R.id.ewh;
                                    if (((android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.ewh)) != null) {
                                        i17 = com.tencent.mm.R.id.f484711f85;
                                        android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f484711f85);
                                        if (a19 != null) {
                                            fg2.u.a(a19);
                                            i17 = com.tencent.mm.R.id.f8q;
                                            android.view.View a27 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
                                            if (a27 != null) {
                                                fg2.y.a(a27);
                                                i17 = com.tencent.mm.R.id.f_i;
                                                if (((android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f_i)) != null) {
                                                    i17 = com.tencent.mm.R.id.fa_;
                                                    if (((com.tencent.mm.plugin.finder.live.mic.widget.VisibilityTextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_)) != null) {
                                                        i17 = com.tencent.mm.R.id.fak;
                                                        android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                                        if (a28 != null) {
                                                            fg2.r0.a(a28);
                                                            i17 = com.tencent.mm.R.id.fal;
                                                            android.view.View a29 = x4.b.a(inflate, com.tencent.mm.R.id.fal);
                                                            if (a29 != null) {
                                                                fg2.x0.a(a29);
                                                                com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate;
                                                                int i18 = com.tencent.mm.R.id.fqg;
                                                                android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.fqg);
                                                                if (a37 != null) {
                                                                    fg2.v1.a(a37);
                                                                    i18 = com.tencent.mm.R.id.f486317qn3;
                                                                    if (((android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f486317qn3)) != null) {
                                                                        kotlin.jvm.internal.o.f(roundCornerConstraintLayout, "getRoot(...)");
                                                                        d0(roundCornerConstraintLayout);
                                                                        return;
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    public void b0() {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.d(getAudioPkLayout());
        if (m()) {
            cVar.e(getPkHearLayout().getId(), 3, getBattleBarSpace().getId(), 4);
            cVar.f(getPkHearLayout().getId(), 1, 0, 1, i65.a.b(getRoot().getContext(), 8));
            cVar.e(getPkHearLayout().getId(), 2, getFinderLiveMicAnchorAudioLayout().getId(), 1);
            cVar.e(getFinderLiveMicAnchorAudioLayout().getId(), 1, getPkHearLayout().getId(), 2);
            cVar.e(getFinderLiveMicAnchorAudioLayout().getId(), 3, getBattleBarSpace().getId(), 4);
        } else {
            cVar.f(getPkHearLayout().getId(), 2, 0, 2, i65.a.b(getRoot().getContext(), 8));
            cVar.e(getPkHearLayout().getId(), 3, getBattleBarSpace().getId(), 4);
            cVar.e(getFinderLiveMicAnchorAudioLayout().getId(), 3, getBattleBarSpace().getId(), 4);
            cVar.e(getFinderLiveMicAnchorAudioLayout().getId(), 1, 0, 1);
        }
        android.view.ViewGroup root = getRoot();
        kotlin.jvm.internal.o.e(root, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) root;
        cVar.b(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    @Override // lj2.u0
    public void c(dk2.u4 battleInfo) {
        java.util.LinkedList<r45.qn0> list;
        kotlin.jvm.internal.o.g(battleInfo, "battleInfo");
        r45.hm1 hm1Var = battleInfo.f234165l;
        if (hm1Var == null || (list = hm1Var.getList(1)) == null) {
            return;
        }
        for (r45.qn0 qn0Var : list) {
            kotlin.jvm.internal.o.d(qn0Var);
            com.tencent.mars.xlog.Log.i(getTAG(), "on battle extra type = " + qn0Var.getInteger(2) + " total = " + qn0Var.getLong(1) + ", diff = " + qn0Var.getLong(0));
            if (qn0Var.getInteger(2) == 1 && qn0Var.getLong(0) > 0) {
                setPkExtraValue(qn0Var.getLong(0));
                android.animation.Animator animator = this.E1;
                if (animator != null) {
                    animator.cancel();
                }
                boolean z17 = getFinderLiveMicAnchorAudioLayout().getVisibility() == 0;
                if (z17) {
                    getFinderLiveMicAnchorAudioLayout().setVisibility(8);
                }
                getPkExtraView().setVisibility(0);
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(getPkExtraView(), "alpha", 0.5f, 1.0f);
                ofFloat.setDuration(300L);
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(getPkExtraView(), "scaleX", 1.25f, 1.0f);
                ofFloat2.setDuration(300L);
                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(getPkExtraView(), "scaleY", 1.25f, 1.0f);
                ofFloat3.setDuration(300L);
                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(getPkExtraView(), "alpha", 1.0f, 0.0f);
                ofFloat4.setDuration(300L);
                ofFloat4.setStartDelay(3000L);
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                animatorSet.addListener(new wj2.x(this, z17));
                this.E1 = animatorSet;
                animatorSet.start();
            }
        }
    }

    public final void c0() {
        jz5.f0 f0Var;
        lj2.t0 a07 = getPluginAbility().a0();
        if (a07 == null || a07.K() == null) {
            f0Var = null;
        } else {
            getSingleHeartLayout().setOnClickListener(this);
            getTeamHeartLayout().setOnClickListener(this);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            getSingleHeartLayout().setOnClickListener(null);
            getTeamHeartLayout().setOnClickListener(null);
        }
    }

    public final void d0(android.view.ViewGroup rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        setRoot(rootView);
        android.view.View findViewById = getRoot().findViewById(com.tencent.mm.R.id.f1j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setAudioPkLayout((androidx.constraintlayout.widget.ConstraintLayout) findViewById);
        android.view.View findViewById2 = getRoot().findViewById(com.tencent.mm.R.id.f_i);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setFinderLiveMicAnchorAudioLayout((android.view.ViewGroup) findViewById2);
        android.view.View findViewById3 = getRoot().findViewById(com.tencent.mm.R.id.fqg);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        setFinderLiveVoteBubbleRoot((android.view.ViewGroup) findViewById3);
        android.view.View findViewById4 = getRoot().findViewById(com.tencent.mm.R.id.f8q);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        setFinderLiveLuckyMoneyBubbleUiRoot((android.view.ViewGroup) findViewById4);
        android.view.View findViewById5 = getRoot().findViewById(com.tencent.mm.R.id.fak);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        setFinderLiveMicNewNormalMicGiftItemLayout((android.view.ViewGroup) findViewById5);
        android.view.View findViewById6 = getRoot().findViewById(com.tencent.mm.R.id.f484711f85);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        setFinderLiveLotteryBubbleRoot((android.view.ViewGroup) findViewById6);
        android.view.View findViewById7 = getRoot().findViewById(com.tencent.mm.R.id.fa_);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        setFinderLiveMicHeartText((android.widget.TextView) findViewById7);
        android.view.View findViewById8 = getRoot().findViewById(com.tencent.mm.R.id.f484566ep0);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        setAnchorBattleTipWidget(new lj2.c0(findViewById8, getPluginAbility()));
        android.view.View findViewById9 = getRoot().findViewById(com.tencent.mm.R.id.eop);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        setAnchorBattleResultWidget(new lj2.p((android.view.ViewGroup) findViewById9));
        android.view.View findViewById10 = getRoot().findViewById(com.tencent.mm.R.id.fal);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        setPkHearLayout((android.view.ViewGroup) findViewById10);
        android.view.View findViewById11 = getRoot().findViewById(com.tencent.mm.R.id.fa7);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        setSingleHeartLayout((android.view.ViewGroup) findViewById11);
        android.view.View findViewById12 = getRoot().findViewById(com.tencent.mm.R.id.fa8);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        setSingleRangeText((android.widget.TextView) findViewById12);
        android.view.View findViewById13 = getRoot().findViewById(com.tencent.mm.R.id.fap);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        setSingleHeartText((android.widget.TextView) findViewById13);
        android.view.View findViewById14 = getRoot().findViewById(com.tencent.mm.R.id.qag);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        setSoloGiftIcon((android.widget.ImageView) findViewById14);
        android.view.View findViewById15 = getRoot().findViewById(com.tencent.mm.R.id.qam);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        setTeamGiftIcon((android.widget.ImageView) findViewById15);
        zl2.r4.f473950a.b3(getSingleRangeText());
        android.view.View findViewById16 = getRoot().findViewById(com.tencent.mm.R.id.fa9);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        setTeamHeartLayout((android.view.ViewGroup) findViewById16);
        android.view.View findViewById17 = getRoot().findViewById(com.tencent.mm.R.id.qrm);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        setTeamHeartText((android.widget.TextView) findViewById17);
        android.view.View findViewById18 = getRoot().findViewById(com.tencent.mm.R.id.afh);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        setBattleBarSpace((android.widget.Space) findViewById18);
        android.view.View findViewById19 = getRoot().findViewById(com.tencent.mm.R.id.f484572er0);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        setBubbleLayout((android.view.ViewGroup) findViewById19);
        android.view.View findViewById20 = getRoot().findViewById(com.tencent.mm.R.id.ejn);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        setAnchorCriticalLayoutView((android.widget.FrameLayout) findViewById20);
        android.view.View findViewById21 = getRoot().findViewById(com.tencent.mm.R.id.ewh);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        setAnchorCriticalGiftLayout((android.widget.FrameLayout) findViewById21);
        setAnchorAudioCoverView((android.widget.ImageView) getRoot().findViewById(com.tencent.mm.R.id.g9c));
        android.view.View findViewById22 = getRoot().findViewById(com.tencent.mm.R.id.f486317qn3);
        android.widget.TextView textView = (android.widget.TextView) findViewById22;
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        kotlin.jvm.internal.o.f(findViewById22, "also(...)");
        setPkExtraView((android.widget.TextView) findViewById22);
    }

    @Override // oj2.l, lj2.u0
    public void e() {
        jz5.f0 f0Var;
        dk2.u4 K;
        c0();
        lj2.t0 a07 = getPluginAbility().a0();
        if (a07 == null || (K = a07.K()) == null) {
            f0Var = null;
        } else {
            if (K.h() || K.i()) {
                android.view.ViewGroup pkHearLayout = getPkHearLayout();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(pkHearLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                pkHearLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(pkHearLayout, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView finderLiveMicHeartText = getFinderLiveMicHeartText();
                if (finderLiveMicHeartText != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(finderLiveMicHeartText, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderLiveMicHeartText.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(finderLiveMicHeartText, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                java.util.List g17 = getPluginAbility().a0().g();
                if (g17.size() > 1) {
                    if (K.f234160g == 2) {
                        f0(K);
                    } else {
                        e0(K);
                    }
                } else if (g17.size() == 1 && (!getPluginAbility().a0().l().isEmpty())) {
                    f0(K);
                } else {
                    super.e();
                    android.view.ViewGroup pkHearLayout2 = getPkHearLayout();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(pkHearLayout2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    pkHearLayout2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(pkHearLayout2, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                super.e();
                android.view.ViewGroup pkHearLayout3 = getPkHearLayout();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(pkHearLayout3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                pkHearLayout3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(pkHearLayout3, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            super.e();
            getPkHearLayout().setVisibility(8);
        }
    }

    public final void e0(dk2.u4 finderLiveBattleData) {
        kotlin.jvm.internal.o.g(finderLiveBattleData, "finderLiveBattleData");
        b0();
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
        if (finderLiveBattleData.f234161h != 1) {
            getSingleRangeText().setVisibility(0);
            W(getSingleHeartText());
        } else {
            if (finderLiveBattleData.j()) {
                getSingleRangeText().setVisibility(0);
            }
            V(getSingleHeartText(), getSoloGiftIcon());
        }
    }

    public final void f0(dk2.u4 battleData) {
        kotlin.jvm.internal.o.g(battleData, "battleData");
        b0();
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

    public final lj2.p getAnchorBattleResultWidget() {
        lj2.p pVar = this.U;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.o.o("anchorBattleResultWidget");
        throw null;
    }

    public final lj2.c0 getAnchorBattleTipWidget() {
        lj2.c0 c0Var = this.T;
        if (c0Var != null) {
            return c0Var;
        }
        kotlin.jvm.internal.o.o("anchorBattleTipWidget");
        throw null;
    }

    public final android.widget.FrameLayout getAnchorCriticalGiftLayout() {
        android.widget.FrameLayout frameLayout = this.C1;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("anchorCriticalGiftLayout");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public android.widget.FrameLayout getAnchorCriticalLayout() {
        return getAnchorCriticalLayoutView();
    }

    public final android.widget.FrameLayout getAnchorCriticalLayoutView() {
        android.widget.FrameLayout frameLayout = this.B1;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("anchorCriticalLayoutView");
        throw null;
    }

    public final androidx.constraintlayout.widget.ConstraintLayout getAudioPkLayout() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.V;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        kotlin.jvm.internal.o.o("audioPkLayout");
        throw null;
    }

    public final android.widget.Space getBattleBarSpace() {
        android.widget.Space space = this.f446743z1;
        if (space != null) {
            return space;
        }
        kotlin.jvm.internal.o.o("battleBarSpace");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public ai2.a getBattleResultWidget() {
        return getAnchorBattleResultWidget();
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public qi2.s1 getBattleTipsWidget() {
        return getAnchorBattleTipWidget();
    }

    public final android.view.ViewGroup getBubbleLayout() {
        android.view.ViewGroup viewGroup = this.A1;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("bubbleLayout");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public android.widget.FrameLayout getCriticalGiftLayout() {
        return getAnchorCriticalGiftLayout();
    }

    @Override // oj2.l, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    public final android.widget.TextView getPkExtraView() {
        android.widget.TextView textView = this.D1;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("pkExtraView");
        throw null;
    }

    public final android.view.ViewGroup getPkHearLayout() {
        android.view.ViewGroup viewGroup = this.W;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("pkHearLayout");
        throw null;
    }

    public final android.view.ViewGroup getSingleHeartLayout() {
        android.view.ViewGroup viewGroup = this.f446737p0;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("singleHeartLayout");
        throw null;
    }

    public final android.widget.TextView getSingleHeartText() {
        android.widget.TextView textView = this.f446741y0;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("singleHeartText");
        throw null;
    }

    public final android.widget.TextView getSingleRangeText() {
        android.widget.TextView textView = this.f446739x0;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("singleRangeText");
        throw null;
    }

    public final android.widget.ImageView getSoloGiftIcon() {
        android.widget.ImageView imageView = this.f446738p1;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("soloGiftIcon");
        throw null;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "PkAnchorSelfWidget";
    }

    public final android.widget.ImageView getTeamGiftIcon() {
        android.widget.ImageView imageView = this.f446736l1;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("teamGiftIcon");
        throw null;
    }

    public final android.view.ViewGroup getTeamHeartLayout() {
        android.view.ViewGroup viewGroup = this.f446740x1;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("teamHeartLayout");
        throw null;
    }

    public final android.widget.TextView getTeamHeartText() {
        android.widget.TextView textView = this.f446742y1;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("teamHeartText");
        throw null;
    }

    @Override // oj2.l, sj2.m
    public void h() {
        super.h();
        android.view.ViewGroup giftRootView = getGiftRootView();
        if (giftRootView != null) {
            giftRootView.setVisibility(8);
        }
        android.widget.FrameLayout criticalGiftLayout = getCriticalGiftLayout();
        if (criticalGiftLayout == null) {
            return;
        }
        criticalGiftLayout.setVisibility(8);
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
            yj0.a.d(battleBarSpace, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            battleBarSpace.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(battleBarSpace, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            yj0.a.d(battleBarSpace2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            battleBarSpace2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(battleBarSpace2, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget", "onBattleBarVisibilityChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    @Override // oj2.l, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            r0 = 0
            if (r7 == 0) goto L27
            int r7 = r7.getId()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L28
        L27:
            r7 = r0
        L28:
            android.view.ViewGroup r1 = r6.getSingleHeartLayout()
            int r1 = r1.getId()
            r2 = 0
            r3 = 1
            if (r7 != 0) goto L35
            goto L3d
        L35:
            int r4 = r7.intValue()
            if (r4 != r1) goto L3d
        L3b:
            r1 = r3
            goto L50
        L3d:
            android.view.ViewGroup r1 = r6.getTeamHeartLayout()
            int r1 = r1.getId()
            if (r7 != 0) goto L48
            goto L4f
        L48:
            int r4 = r7.intValue()
            if (r4 != r1) goto L4f
            goto L3b
        L4f:
            r1 = r2
        L50:
            if (r1 == 0) goto L56
            r6.H()
            goto L81
        L56:
            android.widget.TextView r1 = r6.getMicHeartText()
            if (r1 == 0) goto L64
            int r0 = r1.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L64:
            boolean r7 = kotlin.jvm.internal.o.b(r7, r0)
            if (r7 == 0) goto L81
            android.widget.TextView r7 = r6.getMicHeartText()
            if (r7 == 0) goto L7c
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L78
            r7 = r3
            goto L79
        L78:
            r7 = r2
        L79:
            if (r7 != r3) goto L7c
            r2 = r3
        L7c:
            if (r2 == 0) goto L81
            r6.H()
        L81:
            java.lang.String r7 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverPkAnchorSelfWidget"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r1, r2, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.y.onClick(android.view.View):void");
    }

    public final void setAnchorBattleResultWidget(lj2.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<set-?>");
        this.U = pVar;
    }

    public final void setAnchorBattleTipWidget(lj2.c0 c0Var) {
        kotlin.jvm.internal.o.g(c0Var, "<set-?>");
        this.T = c0Var;
    }

    public final void setAnchorCriticalGiftLayout(android.widget.FrameLayout frameLayout) {
        kotlin.jvm.internal.o.g(frameLayout, "<set-?>");
        this.C1 = frameLayout;
    }

    public final void setAnchorCriticalLayoutView(android.widget.FrameLayout frameLayout) {
        kotlin.jvm.internal.o.g(frameLayout, "<set-?>");
        this.B1 = frameLayout;
    }

    public final void setAudioPkLayout(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        kotlin.jvm.internal.o.g(constraintLayout, "<set-?>");
        this.V = constraintLayout;
    }

    public final void setBattleBarSpace(android.widget.Space space) {
        kotlin.jvm.internal.o.g(space, "<set-?>");
        this.f446743z1 = space;
    }

    public final void setBubbleLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.A1 = viewGroup;
    }

    public final void setBubbleLayoutScale(float f17) {
        getBubbleLayout().setScaleX(f17);
        getBubbleLayout().setScaleY(f17);
    }

    public final void setPkExtraView(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.D1 = textView;
    }

    public final void setPkHearLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.W = viewGroup;
    }

    public final void setSingleHeartLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.f446737p0 = viewGroup;
    }

    public final void setSingleHeartText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.f446741y0 = textView;
    }

    public final void setSingleRangeText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.f446739x0 = textView;
    }

    public final void setSoloGiftIcon(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.f446738p1 = imageView;
    }

    public final void setTeamGiftIcon(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.f446736l1 = imageView;
    }

    public final void setTeamHeartLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.f446740x1 = viewGroup;
    }

    public final void setTeamHeartText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.f446742y1 = textView;
    }
}
