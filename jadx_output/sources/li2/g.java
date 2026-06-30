package li2;

/* loaded from: classes10.dex */
public class g extends oj2.c {
    public android.widget.TextView P;
    public android.widget.FrameLayout Q;
    public android.view.ViewGroup R;
    public android.widget.TextView S;
    public android.view.ViewGroup T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        if (pluginAbility.f() == lj2.w0.f318958d) {
            getRoot().setOnClickListener(new li2.c(this, pluginAbility, service));
        }
    }

    @Override // oj2.c, wj2.w
    public void R() {
        super.R();
        u(getFinderLiveMicUserNickText());
        r(getFinderLiveMicUserAvatar(), getMicTagTextView(), getMicTagLayout());
        android.view.ViewGroup giftRootView = getGiftRootView();
        if (giftRootView != null) {
            giftRootView.setTranslationY(-i65.a.b(getContext(), 10));
        }
        e();
        getPluginAbility().a0().b(new li2.d(this));
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
        fg2.s a17 = fg2.s.a(com.tencent.mm.ui.id.b(getContext()), this, false);
        setWaveView(a17.f262292h);
        getPluginAbility().a0().b(new li2.f(this));
        setFinderLiveMicUserAvatar(a17.f262291g);
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicNickName = a17.f262289e;
        kotlin.jvm.internal.o.f(finderLiveMicNickName, "finderLiveMicNickName");
        setFinderLiveMicUserNickText(finderLiveMicNickName);
        setFinderLiveMicHeartText(a17.f262286b);
        android.widget.RelativeLayout relativeLayout = a17.f262288d.f262062a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        this.T = relativeLayout;
        fg2.h1 h1Var = a17.f262290f;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = h1Var.f262063a;
        kotlin.jvm.internal.o.f(roundCornerRelativeLayout, "getRoot(...)");
        setMicTagLayout(roundCornerRelativeLayout);
        android.widget.TextView tagTextView = h1Var.f262064b;
        kotlin.jvm.internal.o.f(tagTextView, "tagTextView");
        setMicTagTextView(tagTextView);
        com.tencent.mm.ui.fk.a(getMicTagTextView());
        android.widget.FrameLayout finderLiveMicMuteIcon = a17.f262287c;
        kotlin.jvm.internal.o.f(finderLiveMicMuteIcon, "finderLiveMicMuteIcon");
        setFinderLiveMicMuteIcon(finderLiveMicMuteIcon);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262285a;
        kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
        setRoot(constraintLayout);
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
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
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
        ofFloat.addUpdateListener(new li2.e(this));
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

    @Override // wj2.w
    public int getProfileSourceType() {
        return super.getProfileSourceType();
    }

    @Override // lj2.j
    public android.graphics.drawable.Drawable getTagLayoutBackgroundDrawable() {
        android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(com.tencent.mm.R.color.aaz);
        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
        return drawable;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "KTVRoomAnchorWidget";
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
