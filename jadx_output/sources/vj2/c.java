package vj2;

/* loaded from: classes10.dex */
public final class c extends oj2.o {
    public android.view.ViewGroup T;
    public android.view.ViewGroup U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // oj2.o
    public void a0() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.auo, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.che;
        if (((androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.che)) != null) {
            i17 = com.tencent.mm.R.id.tig;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.tig);
            if (weImageView != null) {
                i17 = com.tencent.mm.R.id.f484627ey2;
                android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.f484627ey2);
                if (a17 != null) {
                    fg2.y a18 = fg2.y.a(a17);
                    android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f484629ey4);
                    if (a19 != null) {
                        fg2.r0 a27 = fg2.r0.a(a19);
                        android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
                        if (a28 != null) {
                            fg2.z a29 = fg2.z.a(a28);
                            int i18 = com.tencent.mm.R.id.fa_;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                            if (textView != null) {
                                i18 = com.tencent.mm.R.id.fag;
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.fag);
                                if (frameLayout != null) {
                                    i18 = com.tencent.mm.R.id.fah;
                                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.fah);
                                    if (weImageView2 != null) {
                                        i18 = com.tencent.mm.R.id.fak;
                                        android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                        if (a37 != null) {
                                            fg2.r0 a38 = fg2.r0.a(a37);
                                            android.view.View a39 = x4.b.a(inflate, com.tencent.mm.R.id.qrl);
                                            if (a39 != null) {
                                                fg2.s0 a47 = fg2.s0.a(a39);
                                                com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.f484836fo0);
                                                if (finderFixedTextView != null) {
                                                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
                                                    setFinderLiveMicMuteIcon(frameLayout);
                                                    setFinderLiveMicMuteIconWe(weImageView2);
                                                    kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
                                                    setRoot(relativeLayout);
                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a38.f262282a;
                                                    kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
                                                    setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout);
                                                    setFinderLiveVideoLinkBottomBarName(finderFixedTextView);
                                                    setFinderLiveFinderLogo(weImageView);
                                                    setFinderLiveMicHeartText(textView);
                                                    android.widget.RelativeLayout relativeLayout2 = a29.f262406a;
                                                    kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
                                                    setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout2);
                                                    android.widget.RelativeLayout relativeLayout3 = a18.f262396a;
                                                    kotlin.jvm.internal.o.f(relativeLayout3, "getRoot(...)");
                                                    this.T = relativeLayout3;
                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = a27.f262282a;
                                                    kotlin.jvm.internal.o.f(constraintLayout2, "getRoot(...)");
                                                    this.U = constraintLayout2;
                                                    setFinderLiveMicTagText(a47.f262294b);
                                                    return;
                                                }
                                                i17 = com.tencent.mm.R.id.f484836fo0;
                                            } else {
                                                i17 = com.tencent.mm.R.id.qrl;
                                            }
                                        }
                                    }
                                }
                            }
                            i17 = i18;
                        } else {
                            i17 = com.tencent.mm.R.id.f8q;
                        }
                    } else {
                        i17 = com.tencent.mm.R.id.f484629ey4;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // oj2.o, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r0.f454553e == 1) goto L10;
     */
    @Override // oj2.o, wj2.w, sj2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.ViewGroup getGiftRootView() {
        /*
            r2 = this;
            xh2.a r0 = r2.getBindMicData()
            if (r0 == 0) goto L10
            xh2.i r0 = r0.f454521b
            if (r0 == 0) goto L10
            int r0 = r0.f454553e
            r1 = 1
            if (r0 != r1) goto L10
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L1f
            android.view.ViewGroup r0 = r2.U
            if (r0 == 0) goto L18
            goto L23
        L18:
            java.lang.String r0 = "finderLiveMicFocusNewNormalMicGiftItemLayout"
            kotlin.jvm.internal.o.o(r0)
            r0 = 0
            throw r0
        L1f:
            android.view.ViewGroup r0 = r2.getFinderLiveMicNewNormalMicGiftItemLayout()
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vj2.c.getGiftRootView():android.view.ViewGroup");
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r0.f454553e == 1) goto L10;
     */
    @Override // oj2.o, wj2.w, lj2.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.ViewGroup getLuckyMoneyRootView() {
        /*
            r2 = this;
            xh2.a r0 = r2.getBindMicData()
            if (r0 == 0) goto L10
            xh2.i r0 = r0.f454521b
            if (r0 == 0) goto L10
            int r0 = r0.f454553e
            r1 = 1
            if (r0 != r1) goto L10
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 == 0) goto L1f
            android.view.ViewGroup r0 = r2.T
            if (r0 == 0) goto L18
            goto L23
        L18:
            java.lang.String r0 = "finderLiveFocusLuckyMoneyBubbleUiRoot"
            kotlin.jvm.internal.o.o(r0)
            r0 = 0
            throw r0
        L1f:
            android.view.ViewGroup r0 = r2.getFinderLiveLuckyMoneyBubbleUiRoot()
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vj2.c.getLuckyMoneyRootView():android.view.ViewGroup");
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "GrabCoverVideoWidget";
    }

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }
}
