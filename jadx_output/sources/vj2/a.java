package vj2;

/* loaded from: classes10.dex */
public final class a extends oj2.l {
    public android.view.ViewGroup T;
    public android.view.ViewGroup U;
    public android.view.ViewGroup V;
    public android.view.ViewGroup W;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.TextView f437660l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.ViewGroup f437661p0;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.ViewGroup f437662x0;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.ViewGroup f437663y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // oj2.l, wj2.w
    public void R() {
        super.R();
        if (b0()) {
            android.view.ViewGroup viewGroup = this.f437662x0;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("smallLayout");
                throw null;
            }
            viewGroup.setVisibility(8);
            android.view.ViewGroup viewGroup2 = this.f437663y0;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("focusLayout");
                throw null;
            }
        }
        android.view.ViewGroup viewGroup3 = this.f437662x0;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.o.o("smallLayout");
            throw null;
        }
        viewGroup3.setVisibility(0);
        android.view.ViewGroup viewGroup4 = this.f437663y0;
        if (viewGroup4 != null) {
            viewGroup4.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("focusLayout");
            throw null;
        }
    }

    @Override // oj2.l, sj2.m
    public void a() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationStart");
    }

    @Override // oj2.l
    public void a0() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.aun, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.g9c;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.g9c);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.f484626ey1;
            android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.f484626ey1);
            if (a17 != null) {
                fg2.u a18 = fg2.u.a(a17);
                android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f484627ey2);
                if (a19 != null) {
                    fg2.y a27 = fg2.y.a(a19);
                    android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.f484631ey5);
                    if (a28 != null) {
                        fg2.v1 a29 = fg2.v1.a(a28);
                        android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.f484711f85);
                        if (a37 != null) {
                            fg2.x a38 = fg2.x.a(a37);
                            android.view.View a39 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
                            if (a39 != null) {
                                fg2.z a47 = fg2.z.a(a39);
                                int i18 = com.tencent.mm.R.id.f_i;
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f_i);
                                if (frameLayout != null) {
                                    i18 = com.tencent.mm.R.id.f_v;
                                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f_v);
                                    if (frameLayout2 != null) {
                                        i18 = com.tencent.mm.R.id.f_w;
                                        android.view.View a48 = x4.b.a(inflate, com.tencent.mm.R.id.f_w);
                                        if (a48 != null) {
                                            fg2.r0 a49 = fg2.r0.a(a48);
                                            android.view.View a57 = x4.b.a(inflate, com.tencent.mm.R.id.q7d);
                                            if (a57 != null) {
                                                fg2.s0 a58 = fg2.s0.a(a57);
                                                int i19 = com.tencent.mm.R.id.fa_;
                                                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                                                if (textView != null) {
                                                    i19 = com.tencent.mm.R.id.fak;
                                                    android.view.View a59 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                                    if (a59 != null) {
                                                        fg2.r0 a67 = fg2.r0.a(a59);
                                                        com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate;
                                                        android.view.View a68 = x4.b.a(inflate, com.tencent.mm.R.id.qrl);
                                                        if (a68 != null) {
                                                            fg2.s0 a69 = fg2.s0.a(a68);
                                                            int i27 = com.tencent.mm.R.id.fm8;
                                                            if (((androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.fm8)) != null) {
                                                                i27 = com.tencent.mm.R.id.fqg;
                                                                android.view.View a76 = x4.b.a(inflate, com.tencent.mm.R.id.fqg);
                                                                if (a76 != null) {
                                                                    fg2.y1 a77 = fg2.y1.a(a76);
                                                                    com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout2 = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.g_m);
                                                                    if (roundCornerConstraintLayout2 != null) {
                                                                        com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout3 = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.n0k);
                                                                        if (roundCornerConstraintLayout3 != null) {
                                                                            kotlin.jvm.internal.o.f(roundCornerConstraintLayout, "getRoot(...)");
                                                                            setRoot(roundCornerConstraintLayout);
                                                                            setFinderLiveMicHeartText(textView);
                                                                            setFinderLiveMicAnchorAudioLayout(frameLayout);
                                                                            android.widget.RelativeLayout relativeLayout = a77.f262405a;
                                                                            kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
                                                                            setFinderLiveVoteBubbleRoot(relativeLayout);
                                                                            android.widget.RelativeLayout relativeLayout2 = a47.f262406a;
                                                                            kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
                                                                            setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout2);
                                                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a67.f262282a;
                                                                            kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
                                                                            setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout);
                                                                            android.widget.RelativeLayout relativeLayout3 = a38.f262390a;
                                                                            kotlin.jvm.internal.o.f(relativeLayout3, "getRoot(...)");
                                                                            setFinderLiveLotteryBubbleRoot(relativeLayout3);
                                                                            this.f437662x0 = roundCornerConstraintLayout3;
                                                                            setFinderLiveMicTagText(a69.f262294b);
                                                                            this.f437661p0 = frameLayout2;
                                                                            android.widget.RelativeLayout relativeLayout4 = a29.f262383a;
                                                                            kotlin.jvm.internal.o.f(relativeLayout4, "getRoot(...)");
                                                                            this.W = relativeLayout4;
                                                                            android.widget.RelativeLayout relativeLayout5 = a27.f262396a;
                                                                            kotlin.jvm.internal.o.f(relativeLayout5, "getRoot(...)");
                                                                            this.V = relativeLayout5;
                                                                            android.widget.RelativeLayout relativeLayout6 = a18.f262342a;
                                                                            kotlin.jvm.internal.o.f(relativeLayout6, "getRoot(...)");
                                                                            this.T = relativeLayout6;
                                                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = a49.f262282a;
                                                                            kotlin.jvm.internal.o.f(constraintLayout2, "getRoot(...)");
                                                                            this.U = constraintLayout2;
                                                                            this.f437663y0 = roundCornerConstraintLayout2;
                                                                            this.f437660l1 = a58.f262294b;
                                                                            setAnchorAudioCoverView(imageView);
                                                                            return;
                                                                        }
                                                                        i17 = com.tencent.mm.R.id.n0k;
                                                                    } else {
                                                                        i17 = com.tencent.mm.R.id.g_m;
                                                                    }
                                                                }
                                                            }
                                                            i17 = i27;
                                                        } else {
                                                            i17 = com.tencent.mm.R.id.qrl;
                                                        }
                                                    }
                                                }
                                                i17 = i19;
                                            } else {
                                                i17 = com.tencent.mm.R.id.q7d;
                                            }
                                        }
                                    }
                                }
                                i17 = i18;
                            } else {
                                i17 = com.tencent.mm.R.id.f8q;
                            }
                        } else {
                            i17 = com.tencent.mm.R.id.f484711f85;
                        }
                    } else {
                        i17 = com.tencent.mm.R.id.f484631ey5;
                    }
                } else {
                    i17 = com.tencent.mm.R.id.f484627ey2;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    public final boolean b0() {
        xh2.i iVar;
        xh2.a bindMicData = getBindMicData();
        return (bindMicData == null || (iVar = bindMicData.f454521b) == null || iVar.f454553e != 1) ? false : true;
    }

    @Override // oj2.l, sj2.m
    public void d() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationEnd");
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public android.view.ViewGroup getAnchorAudioModeLayout() {
        if (!b0()) {
            return getFinderLiveMicAnchorAudioLayout();
        }
        android.view.ViewGroup viewGroup = this.f437661p0;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveMicFocusAnchorAudioLayout");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // oj2.l, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // oj2.l, wj2.w, sj2.m
    public android.view.ViewGroup getGiftRootView() {
        if (!b0()) {
            return getFinderLiveMicNewNormalMicGiftItemLayout();
        }
        android.view.ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveFocusMicGiftItemLayout");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public android.view.ViewGroup getLotteryBubbleRootView() {
        if (!b0()) {
            return getFinderLiveLotteryBubbleRoot();
        }
        android.view.ViewGroup viewGroup = this.T;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveFocusLotteryBubbleRoot");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public android.view.ViewGroup getLuckyMoneyRootView() {
        if (!b0()) {
            return getFinderLiveLuckyMoneyBubbleUiRoot();
        }
        android.view.ViewGroup viewGroup = this.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveFocusLuckyMoneyBubbleUiRoot");
        throw null;
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // oj2.l
    public android.widget.TextView getMicTagText() {
        return b0() ? this.f437660l1 : getFinderLiveMicTagText();
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "GrabFocusCoverAnchorWidget";
    }

    @Override // oj2.l, wj2.w, lj2.u0
    public android.view.ViewGroup getVoteBubbleRootView() {
        if (!b0()) {
            return getFinderLiveVoteBubbleRoot();
        }
        android.view.ViewGroup viewGroup = this.W;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("finderLiveFocusVoteBubbleRoot");
        throw null;
    }
}
