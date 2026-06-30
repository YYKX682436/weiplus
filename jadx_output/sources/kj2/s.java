package kj2;

/* loaded from: classes10.dex */
public final class s extends oj2.c {
    public android.widget.TextView P;
    public android.widget.FrameLayout Q;
    public android.view.ViewGroup R;
    public android.widget.TextView S;
    public android.view.ViewGroup T;
    public final int U;
    public lj2.s0 V;
    public oj2.s W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        this.U = android.graphics.Color.parseColor("#A18B98");
    }

    @Override // oj2.c, wj2.w
    public void R() {
        java.lang.String str;
        java.lang.String str2;
        super.R();
        u(getFinderLiveMicUserNickText());
        r(getFinderLiveMicUserAvatar(), getMicTagTextView(), getMicTagLayout());
        android.view.ViewGroup giftRootView = getGiftRootView();
        if (giftRootView != null) {
            giftRootView.setTranslationY(-i65.a.b(getContext(), 10));
        }
        xh2.a bindMicData = getBindMicData();
        if (bindMicData != null) {
            lj2.s0 s0Var = this.V;
            if (s0Var != null) {
                km2.q qVar = bindMicData.f454520a;
                java.lang.String str3 = "";
                if (qVar == null || (str = qVar.f309172c) == null) {
                    str = "";
                }
                if (qVar != null && (str2 = qVar.f309170a) != null) {
                    str3 = str2;
                }
                s0Var.a(str, str3);
            }
            oj2.s sVar = this.W;
            if (sVar != null) {
                sVar.b(getTagTextColor(), bindMicData);
            }
        }
        e();
        if (getPluginAbility().a0().K() == null || getCurWidgetMode() != pm2.a.f356862r) {
            getPluginAbility().a0().b(new kj2.p(this));
        } else {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = getWaveView();
            if (waveView != null) {
                waveView.setColor(this.U);
            }
        }
        k(getPluginAbility().a0().F());
    }

    @Override // wj2.w
    public void S(android.widget.TextView textView) {
        if (textView != null) {
            textView.setText("0");
        }
        super.S(textView);
    }

    @Override // oj2.c
    public void Z() {
        fg2.i a17 = fg2.i.a(com.tencent.mm.ui.id.b(getContext()), this, false);
        setWaveView(a17.f262073i);
        getPluginAbility().a0().b(new kj2.r(this));
        setFinderLiveMicUserAvatar(a17.f262072h);
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicNickName = a17.f262070f;
        kotlin.jvm.internal.o.f(finderLiveMicNickName, "finderLiveMicNickName");
        setFinderLiveMicUserNickText(finderLiveMicNickName);
        setFinderLiveMicHeartText(a17.f262067c);
        android.widget.RelativeLayout relativeLayout = a17.f262069e.f262062a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        this.T = relativeLayout;
        fg2.h1 h1Var = a17.f262071g;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = h1Var.f262063a;
        kotlin.jvm.internal.o.f(roundCornerRelativeLayout, "getRoot(...)");
        setMicTagLayout(roundCornerRelativeLayout);
        android.widget.TextView tagTextView = h1Var.f262064b;
        kotlin.jvm.internal.o.f(tagTextView, "tagTextView");
        setMicTagTextView(tagTextView);
        this.W = new oj2.s(getMicTagLayout(), getPluginAbility());
        android.widget.FrameLayout finderLiveMicMuteIcon = a17.f262068d;
        kotlin.jvm.internal.o.f(finderLiveMicMuteIcon, "finderLiveMicMuteIcon");
        setFinderLiveMicMuteIcon(finderLiveMicMuteIcon);
        fg2.r1 r1Var = a17.f262066b;
        android.widget.RelativeLayout relativeLayout2 = r1Var.f262284a;
        kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
        this.V = new lj2.s0(relativeLayout2);
        r1Var.f262284a.setTranslationY(i65.a.b(getContext(), 14));
        r1Var.f262284a.setTranslationX(i65.a.b(getContext(), -3));
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262065a;
        kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
        setRoot(constraintLayout);
    }

    @Override // oj2.c, lj2.u0
    public void e() {
        jz5.f0 f0Var;
        oj2.s sVar;
        android.widget.TextView finderLiveMicHeartText = getFinderLiveMicHeartText();
        if (finderLiveMicHeartText != null) {
            finderLiveMicHeartText.setVisibility(8);
        }
        android.widget.TextView finderLiveMicHeartText2 = getFinderLiveMicHeartText();
        int i17 = com.tencent.mm.R.drawable.a5v;
        if (finderLiveMicHeartText2 != null) {
            finderLiveMicHeartText2.setBackgroundResource(com.tencent.mm.R.drawable.a5v);
        }
        dk2.u4 K = getPluginAbility().a0().K();
        if (K != null) {
            if (K.h() || K.i()) {
                android.widget.TextView finderLiveMicHeartText3 = getFinderLiveMicHeartText();
                if (finderLiveMicHeartText3 != null) {
                    finderLiveMicHeartText3.setText("0");
                }
                if (K.f234160g == 1) {
                    int h17 = getPluginAbility().a0().h(getBindLinkMicUser());
                    android.widget.TextView finderLiveMicHeartText4 = getFinderLiveMicHeartText();
                    if (finderLiveMicHeartText4 != null) {
                        if (h17 == 1) {
                            i17 = com.tencent.mm.R.drawable.a2y;
                        }
                        finderLiveMicHeartText4.setBackgroundResource(i17);
                    }
                    W(getFinderLiveMicHeartText());
                    android.widget.TextView finderLiveMicHeartText5 = getFinderLiveMicHeartText();
                    if (finderLiveMicHeartText5 != null) {
                        finderLiveMicHeartText5.setVisibility(0);
                    }
                } else {
                    S(getFinderLiveMicHeartText());
                }
            } else {
                super.e();
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.e();
        }
        xh2.a bindMicData = getBindMicData();
        if (bindMicData == null || (sVar = this.W) == null) {
            return;
        }
        sVar.b(getTagTextColor(), bindMicData);
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public ai2.a getBattleResultWidget() {
        return this.V;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    public final android.widget.FrameLayout getFinderLiveMicMuteIcon() {
        android.widget.FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.o.o("finderLiveMicMuteIcon");
        throw null;
    }

    public final android.widget.TextView getFinderLiveMicUserNickText() {
        android.widget.TextView textView = this.P;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("finderLiveMicUserNickText");
        throw null;
    }

    @Override // oj2.c, wj2.w, sj2.m
    public android.animation.ValueAnimator getGiftInAnimator() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new kj2.q(this));
        return ofFloat;
    }

    @Override // oj2.c, wj2.w, sj2.m
    public android.view.ViewGroup getGiftRootView() {
        android.view.ViewGroup viewGroup = this.T;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("giftRootView");
        throw null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    public final android.view.ViewGroup getMicTagLayout() {
        android.view.ViewGroup viewGroup = this.R;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("micTagLayout");
        throw null;
    }

    public final android.widget.TextView getMicTagTextView() {
        android.widget.TextView textView = this.S;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("micTagTextView");
        throw null;
    }

    @Override // lj2.j
    public android.graphics.drawable.Drawable getTagLayoutBackgroundDrawable() {
        android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(com.tencent.mm.R.color.aaz);
        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
        return drawable;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "GrabCoverAnchorWidget";
    }

    @Override // wj2.w, lj2.j
    public java.lang.String getTagText() {
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.m0l);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // lj2.j
    public int getTagTextColor() {
        return android.graphics.Color.parseColor("#E6000000");
    }

    @Override // oj2.c, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // lj2.u0
    public void k(boolean z17) {
        if (G() && z17) {
            getFinderLiveMicMuteIcon().setVisibility(0);
        } else {
            getFinderLiveMicMuteIcon().setVisibility(8);
        }
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oj2.s sVar = this.W;
        if (sVar != null) {
            sVar.c();
        }
    }

    public final void setFinderLiveMicMuteIcon(android.widget.FrameLayout frameLayout) {
        kotlin.jvm.internal.o.g(frameLayout, "<set-?>");
        this.Q = frameLayout;
    }

    public final void setFinderLiveMicUserNickText(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.P = textView;
    }

    public final void setMicTagLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.R = viewGroup;
    }

    public final void setMicTagTextView(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.S = textView;
    }
}
