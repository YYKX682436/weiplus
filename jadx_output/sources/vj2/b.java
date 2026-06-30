package vj2;

/* loaded from: classes10.dex */
public final class b extends oj2.m {
    public com.tencent.mm.view.MMPAGView W;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.ViewGroup f437664l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.FrameLayout f437665p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.ImageView f437666p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.ViewGroup f437667x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.TextView f437668x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.ViewGroup f437669y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.ViewGroup f437670y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // oj2.m, wj2.w
    public void R() {
        super.R();
        if (a0()) {
            android.view.ViewGroup viewGroup = this.f437669y0;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("finderLiveMicSmallLayout");
                throw null;
            }
            viewGroup.setVisibility(8);
            android.view.ViewGroup viewGroup2 = this.f437667x0;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("finderLiveMicFocusLayout");
                throw null;
            }
        }
        android.view.ViewGroup viewGroup3 = this.f437669y0;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.o.o("finderLiveMicSmallLayout");
            throw null;
        }
        viewGroup3.setVisibility(0);
        android.view.ViewGroup viewGroup4 = this.f437667x0;
        if (viewGroup4 != null) {
            viewGroup4.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("finderLiveMicFocusLayout");
            throw null;
        }
    }

    @Override // oj2.m
    public void Z() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ash, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.a6r;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.a6r);
        if (constraintLayout != null) {
            i17 = com.tencent.mm.R.id.a7r;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.a7r);
            if (constraintLayout2 != null) {
                i17 = com.tencent.mm.R.id.f484627ey2;
                android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.f484627ey2);
                if (a17 != null) {
                    fg2.y a18 = fg2.y.a(a17);
                    android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
                    if (a19 != null) {
                        fg2.z a27 = fg2.z.a(a19);
                        int i18 = com.tencent.mm.R.id.f_y;
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f_y);
                        if (frameLayout != null) {
                            i18 = com.tencent.mm.R.id.f_z;
                            if (((com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.f_z)) != null) {
                                i18 = com.tencent.mm.R.id.f484724fa0;
                                android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.f484724fa0);
                                if (a28 != null) {
                                    fg2.r0 a29 = fg2.r0.a(a28);
                                    int i19 = com.tencent.mm.R.id.f484726fa2;
                                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.f484726fa2);
                                    if (imageView != null) {
                                        i19 = com.tencent.mm.R.id.f484727fa3;
                                        if (((android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.f484727fa3)) != null) {
                                            i19 = com.tencent.mm.R.id.f484728fa4;
                                            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.f484728fa4);
                                            if (finderFixedTextView != null) {
                                                i19 = com.tencent.mm.R.id.f484729fa5;
                                                com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) x4.b.a(inflate, com.tencent.mm.R.id.f484729fa5);
                                                if (mMPAGView != null) {
                                                    i19 = com.tencent.mm.R.id.fa_;
                                                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                                                    if (textView != null) {
                                                        i19 = com.tencent.mm.R.id.fag;
                                                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.fag);
                                                        if (frameLayout2 != null) {
                                                            i19 = com.tencent.mm.R.id.fah;
                                                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.fah);
                                                            if (weImageView != null) {
                                                                i19 = com.tencent.mm.R.id.fak;
                                                                android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                                                if (a37 != null) {
                                                                    fg2.r0 a38 = fg2.r0.a(a37);
                                                                    android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.faq);
                                                                    if (imageView2 != null) {
                                                                        android.widget.ImageView imageView3 = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.far);
                                                                        if (imageView3 != null) {
                                                                            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.fay);
                                                                            if (finderFixedTextView2 != null) {
                                                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                                                                                com.tencent.mm.view.MMPAGView mMPAGView2 = (com.tencent.mm.view.MMPAGView) x4.b.a(inflate, com.tencent.mm.R.id.f484730fb0);
                                                                                if (mMPAGView2 != null) {
                                                                                    i18 = com.tencent.mm.R.id.qrl;
                                                                                    android.view.View a39 = x4.b.a(inflate, com.tencent.mm.R.id.qrl);
                                                                                    if (a39 != null) {
                                                                                        fg2.s0 a47 = fg2.s0.a(a39);
                                                                                        setFinderLiveMicStateAudioWaveIcon(mMPAGView2);
                                                                                        setFinderLiveMicMuteIcon(frameLayout2);
                                                                                        setFinderLiveMicMuteIconWe(weImageView);
                                                                                        kotlin.jvm.internal.o.f(constraintLayout3, "getRoot(...)");
                                                                                        setRoot(constraintLayout3);
                                                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = a38.f262282a;
                                                                                        kotlin.jvm.internal.o.f(constraintLayout4, "getRoot(...)");
                                                                                        setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout4);
                                                                                        setFinderLiveMicStateAudioAvatar(imageView2);
                                                                                        setFinderLiveMicStateAudioName(finderFixedTextView2);
                                                                                        setFinderLiveMicStateAudioBg(imageView3);
                                                                                        setFinderLiveMicHeartText(textView);
                                                                                        android.widget.RelativeLayout relativeLayout = a27.f262406a;
                                                                                        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
                                                                                        setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout);
                                                                                        this.f437669y0 = constraintLayout2;
                                                                                        setFinderLiveMicTagText(a47.f262294b);
                                                                                        this.W = mMPAGView;
                                                                                        this.f437665p0 = frameLayout;
                                                                                        android.widget.FrameLayout frameLayout3 = this.f437665p0;
                                                                                        if (frameLayout3 == null) {
                                                                                            kotlin.jvm.internal.o.o("finderLiveMicFocusMuteIcon");
                                                                                            throw null;
                                                                                        }
                                                                                        frameLayout3.setOnClickListener(this);
                                                                                        kotlin.jvm.internal.o.f(constraintLayout3, "getRoot(...)");
                                                                                        setRoot(constraintLayout3);
                                                                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout5 = a29.f262282a;
                                                                                        kotlin.jvm.internal.o.f(constraintLayout5, "getRoot(...)");
                                                                                        this.f437664l1 = constraintLayout5;
                                                                                        this.f437666p1 = imageView;
                                                                                        this.f437668x1 = finderFixedTextView;
                                                                                        android.widget.RelativeLayout relativeLayout2 = a18.f262396a;
                                                                                        kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
                                                                                        this.f437670y1 = relativeLayout2;
                                                                                        this.f437667x0 = constraintLayout;
                                                                                        return;
                                                                                    }
                                                                                } else {
                                                                                    i17 = com.tencent.mm.R.id.f484730fb0;
                                                                                }
                                                                            } else {
                                                                                i17 = com.tencent.mm.R.id.fay;
                                                                            }
                                                                        } else {
                                                                            i17 = com.tencent.mm.R.id.far;
                                                                        }
                                                                    } else {
                                                                        i17 = com.tencent.mm.R.id.faq;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i17 = i19;
                                }
                            }
                        }
                        i17 = i18;
                    } else {
                        i17 = com.tencent.mm.R.id.f8q;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    public final boolean a0() {
        xh2.i iVar;
        xh2.a bindMicData = getBindMicData();
        return (bindMicData == null || (iVar = bindMicData.f454521b) == null || iVar.f454553e != 1) ? false : true;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // oj2.m
    public android.widget.ImageView getAvatarView() {
        if (!a0()) {
            return getFinderLiveMicStateAudioAvatar();
        }
        android.widget.ImageView imageView = this.f437666p1;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicFocusStateAudioAvatar");
        throw null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // oj2.m, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // oj2.m, wj2.w, sj2.m
    public android.view.ViewGroup getGiftRootView() {
        if (!a0()) {
            return getFinderLiveMicNewNormalMicGiftItemLayout();
        }
        android.view.ViewGroup viewGroup = this.f437664l1;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveMicFocusGiftItemLayout");
        throw null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public android.view.ViewGroup getLuckyMoneyRootView() {
        com.tencent.mars.xlog.Log.i(getTAG(), "getLuckyMoneyRootView");
        if (!a0()) {
            return getFinderLiveLuckyMoneyBubbleUiRoot();
        }
        android.view.ViewGroup viewGroup = this.f437670y1;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveFocusLuckyMoneyBubbleUiRoot");
        throw null;
    }

    @Override // oj2.m
    public com.tencent.mm.view.MMPAGView getMicAudioWaveIcon() {
        if (!a0()) {
            return super.getMicAudioWaveIcon();
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.W;
        if (mMPAGView != null) {
            return mMPAGView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicFocusStateAudioWaveIcon");
        throw null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // oj2.m
    public android.widget.FrameLayout getMicMuteIcon() {
        if (!a0()) {
            return super.getMicMuteIcon();
        }
        android.widget.FrameLayout frameLayout = this.f437665p0;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("finderLiveMicFocusMuteIcon");
        throw null;
    }

    @Override // oj2.m
    public android.widget.TextView getNickTextView() {
        if (!a0()) {
            return getFinderLiveMicStateAudioName();
        }
        android.widget.TextView textView = this.f437668x1;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicFocusStateAudioName");
        throw null;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "GrabCoverAudioWidget";
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // oj2.m, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/grabfocus/FinderLiveMicGrabFocusCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        super.onClick(view);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.widget.FrameLayout frameLayout = this.f437665p0;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("finderLiveMicFocusMuteIcon");
            throw null;
        }
        int id6 = frameLayout.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            L();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/grabfocus/FinderLiveMicGrabFocusCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
