package wj2;

/* loaded from: classes10.dex */
public final class b extends oj2.l {
    public android.view.ViewGroup T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    private final void setBubbleLayoutScale(float f17) {
        android.view.ViewGroup viewGroup = this.T;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("bubbleLayout");
            throw null;
        }
        viewGroup.setScaleX(f17);
        android.view.ViewGroup viewGroup2 = this.T;
        if (viewGroup2 != null) {
            viewGroup2.setScaleY(f17);
        } else {
            kotlin.jvm.internal.o.o("bubbleLayout");
            throw null;
        }
    }

    @Override // oj2.l, wj2.w
    public void R() {
        super.R();
        if (getPluginAbility().a0().l().size() <= 2) {
            setBubbleLayoutScale(1.0f);
        } else {
            setBubbleLayoutScale(0.8f);
        }
    }

    @Override // oj2.l
    public void a0() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488929av3, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.g9c;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.g9c);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.f484572er0;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.f484572er0);
            if (constraintLayout != null) {
                i17 = com.tencent.mm.R.id.f484711f85;
                android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.f484711f85);
                if (a17 != null) {
                    fg2.u a18 = fg2.u.a(a17);
                    android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
                    if (a19 != null) {
                        fg2.y a27 = fg2.y.a(a19);
                        int i18 = com.tencent.mm.R.id.f_i;
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f_i);
                        if (frameLayout != null) {
                            i18 = com.tencent.mm.R.id.fa_;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                            if (textView != null) {
                                i18 = com.tencent.mm.R.id.fak;
                                android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                if (a28 != null) {
                                    fg2.r0 a29 = fg2.r0.a(a28);
                                    com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate;
                                    android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.fqg);
                                    if (a37 != null) {
                                        fg2.v1 a38 = fg2.v1.a(a37);
                                        kotlin.jvm.internal.o.f(roundCornerConstraintLayout, "getRoot(...)");
                                        setRoot(roundCornerConstraintLayout);
                                        setFinderLiveMicAnchorAudioLayout(frameLayout);
                                        android.widget.RelativeLayout relativeLayout = a38.f262383a;
                                        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
                                        setFinderLiveVoteBubbleRoot(relativeLayout);
                                        android.widget.RelativeLayout relativeLayout2 = a27.f262396a;
                                        kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
                                        setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout2);
                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = a29.f262282a;
                                        kotlin.jvm.internal.o.f(constraintLayout2, "getRoot(...)");
                                        setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout2);
                                        android.widget.RelativeLayout relativeLayout3 = a18.f262342a;
                                        kotlin.jvm.internal.o.f(relativeLayout3, "getRoot(...)");
                                        setFinderLiveLotteryBubbleRoot(relativeLayout3);
                                        setFinderLiveMicHeartText(textView);
                                        this.T = constraintLayout;
                                        setAnchorAudioCoverView(imageView);
                                        return;
                                    }
                                    i17 = com.tencent.mm.R.id.fqg;
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

    @Override // oj2.l, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "CoverAnchorWidget";
    }
}
