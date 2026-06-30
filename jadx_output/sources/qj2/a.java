package qj2;

/* loaded from: classes10.dex */
public final class a extends wj2.c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // wj2.c0, oj2.o
    public void a0() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488932do2, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.afh;
        android.widget.Space space = (android.widget.Space) x4.b.a(inflate, com.tencent.mm.R.id.afh);
        if (space != null) {
            i17 = com.tencent.mm.R.id.che;
            if (((androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.che)) != null) {
                i17 = com.tencent.mm.R.id.eop;
                android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.eop);
                if (a17 != null) {
                    fg2.j1 a18 = fg2.j1.a(a17);
                    android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f484566ep0);
                    if (a19 != null) {
                        fg2.k1 a27 = fg2.k1.a(a19);
                        android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.evg);
                        if (a28 != null) {
                            fg2.v0 a29 = fg2.v0.a(a28);
                            int i18 = com.tencent.mm.R.id.fa_;
                            com.tencent.mm.plugin.finder.live.mic.widget.VisibilityTextView visibilityTextView = (com.tencent.mm.plugin.finder.live.mic.widget.VisibilityTextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                            if (visibilityTextView != null) {
                                i18 = com.tencent.mm.R.id.fag;
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.fag);
                                if (frameLayout != null) {
                                    i18 = com.tencent.mm.R.id.fah;
                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.fah);
                                    if (weImageView != null) {
                                        i18 = com.tencent.mm.R.id.fak;
                                        android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                        if (a37 != null) {
                                            fg2.r0 a38 = fg2.r0.a(a37);
                                            android.view.View a39 = x4.b.a(inflate, com.tencent.mm.R.id.fal);
                                            if (a39 != null) {
                                                fg2.y0 a47 = fg2.y0.a(a39);
                                                int i19 = com.tencent.mm.R.id.fnz;
                                                android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.fnz);
                                                if (imageView != null) {
                                                    i19 = com.tencent.mm.R.id.f484836fo0;
                                                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.f484836fo0);
                                                    if (finderFixedTextView != null) {
                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                                                        int i27 = com.tencent.mm.R.id.f484838fo3;
                                                        android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.f484838fo3);
                                                        if (imageView2 != null) {
                                                            i27 = com.tencent.mm.R.id.f484839fo4;
                                                            if (((android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f484839fo4)) != null) {
                                                                i27 = com.tencent.mm.R.id.f486680m42;
                                                                if (((android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f486680m42)) != null) {
                                                                    setFinderLiveMicMuteIcon(frameLayout);
                                                                    setFinderLiveMicMuteIconWe(weImageView);
                                                                    kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
                                                                    setRoot(constraintLayout);
                                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = a38.f262282a;
                                                                    kotlin.jvm.internal.o.f(constraintLayout2, "getRoot(...)");
                                                                    setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout2);
                                                                    setFinderLiveVideoLinkBottomBarAvatar(imageView);
                                                                    setFinderLiveVideoLinkBottomBarName(finderFixedTextView);
                                                                    setFinderLiveVideoLinkCoverBg(imageView2);
                                                                    android.widget.LinearLayout linearLayout = a29.f262382a;
                                                                    kotlin.jvm.internal.o.f(linearLayout, "getRoot(...)");
                                                                    setFinderLivePkAnchorAudioTipsLayout(linearLayout);
                                                                    android.view.View findViewById = getFinderLivePkAnchorAudioTipsLayout().findViewById(com.tencent.mm.R.id.evh);
                                                                    kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                                                                    setPkAudioModeIcon((com.tencent.mm.view.MMPAGView) findViewById);
                                                                    ym5.l2 l2Var = ym5.l2.f463424a;
                                                                    getPkAudioModeIcon();
                                                                    ym5.j2[] j2VarArr = ym5.j2.f463392d;
                                                                    getPkAudioModeIcon().o(ae2.in.f3688a.a(ym5.f6.S));
                                                                    com.tencent.mm.view.MMPAGView pkAudioModeIcon = getPkAudioModeIcon();
                                                                    android.content.res.AssetManager assets = getRoot().getContext().getAssets();
                                                                    kotlin.jvm.internal.o.f(assets, "getAssets(...)");
                                                                    pkAudioModeIcon.k(assets, "finder_live_link_mic_wave.pag");
                                                                    getPkAudioModeIcon().setRepeatCount(-1);
                                                                    android.widget.RelativeLayout relativeLayout = a27.f262115a;
                                                                    kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
                                                                    setAnchorBattleTipWidget(new lj2.c0(relativeLayout, getPluginAbility()));
                                                                    android.widget.RelativeLayout relativeLayout2 = a18.f262109a;
                                                                    kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
                                                                    setAnchorBattleResultWidget(new lj2.p(relativeLayout2));
                                                                    android.widget.RelativeLayout relativeLayout3 = a47.f262397a;
                                                                    kotlin.jvm.internal.o.f(relativeLayout3, "getRoot(...)");
                                                                    setPkHearLayout(relativeLayout3);
                                                                    androidx.constraintlayout.widget.ConstraintLayout finderLiveMicHeartRangeLayout = a47.f262398b;
                                                                    kotlin.jvm.internal.o.f(finderLiveMicHeartRangeLayout, "finderLiveMicHeartRangeLayout");
                                                                    setSingleHeartLayout(finderLiveMicHeartRangeLayout);
                                                                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicHeartRangeText = a47.f262399c;
                                                                    kotlin.jvm.internal.o.f(finderLiveMicHeartRangeText, "finderLiveMicHeartRangeText");
                                                                    setSingleRangeText(finderLiveMicHeartRangeText);
                                                                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicSingleHeartText = a47.f262401e;
                                                                    kotlin.jvm.internal.o.f(finderLiveMicSingleHeartText, "finderLiveMicSingleHeartText");
                                                                    setSingleHeartText(finderLiveMicSingleHeartText);
                                                                    setFinderLiveMicHeartText(visibilityTextView);
                                                                    android.widget.ImageView soloGiftIcon = a47.f262403g;
                                                                    kotlin.jvm.internal.o.f(soloGiftIcon, "soloGiftIcon");
                                                                    setSoloGiftIcon(soloGiftIcon);
                                                                    android.widget.ImageView teamGiftIcon = a47.f262404h;
                                                                    kotlin.jvm.internal.o.f(teamGiftIcon, "teamGiftIcon");
                                                                    setTeamGiftIcon(teamGiftIcon);
                                                                    zl2.r4.f473950a.b3(getSingleRangeText());
                                                                    android.widget.LinearLayout finderLiveMicHeartTeamLayout = a47.f262400d;
                                                                    kotlin.jvm.internal.o.f(finderLiveMicHeartTeamLayout, "finderLiveMicHeartTeamLayout");
                                                                    setTeamHeartLayout(finderLiveMicHeartTeamLayout);
                                                                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicTeamHeartText = a47.f262402f;
                                                                    kotlin.jvm.internal.o.f(finderLiveMicTeamHeartText, "finderLiveMicTeamHeartText");
                                                                    setTeamHeartText(finderLiveMicTeamHeartText);
                                                                    setBattleBarSpace(space);
                                                                    getFinderLiveVideoLinkBottomBarAvatar().setOnClickListener(this);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        i17 = i27;
                                                    }
                                                }
                                                i17 = i19;
                                            } else {
                                                i17 = com.tencent.mm.R.id.fal;
                                            }
                                        }
                                    }
                                }
                            }
                            i17 = i18;
                        } else {
                            i17 = com.tencent.mm.R.id.evg;
                        }
                    } else {
                        i17 = com.tencent.mm.R.id.f484566ep0;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // wj2.c0
    public void c0() {
    }

    @Override // wj2.c0, oj2.o, lj2.u0
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
                yj0.a.d(pkHearLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/cross/FinderLiveMicCrossRoomAnchorOtherWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                pkHearLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(pkHearLayout, "com/tencent/mm/plugin/finder/live/mic/widget/cross/FinderLiveMicCrossRoomAnchorOtherWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView finderLiveMicHeartText = getFinderLiveMicHeartText();
                if (finderLiveMicHeartText != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(finderLiveMicHeartText, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/cross/FinderLiveMicCrossRoomAnchorOtherWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderLiveMicHeartText.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(finderLiveMicHeartText, "com/tencent/mm/plugin/finder/live/mic/widget/cross/FinderLiveMicCrossRoomAnchorOtherWidget", "onBindLinkMicUserUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (K.f234160g == 2) {
                    h0(K);
                } else {
                    g0(K);
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

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // wj2.c0, lj2.j
    public java.lang.String getTagString() {
        return "CrossRoomAnchorOtherWidget";
    }

    @Override // wj2.c0, oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // wj2.c0, lj2.j
    public boolean n() {
        return false;
    }
}
