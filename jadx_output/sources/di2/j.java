package di2;

/* loaded from: classes10.dex */
public final class j extends li2.b {
    public com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service, boolean z17) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        if (z17) {
            getFinderLiveMicUserNickText().setVisibility(4);
        }
    }

    @Override // li2.b, wj2.w
    public void R() {
        super.R();
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.W;
        if (ripperAnimateView != null) {
            ripperAnimateView.b(getService().a());
        }
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            if (com.tencent.mm.storage.z3.S3(bindLinkMicUser.f309172c)) {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView2 = this.W;
                if (ripperAnimateView2 != null) {
                    ripperAnimateView2.setAnimateMode(jj2.e.f299979d);
                }
            } else {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView3 = this.W;
                if (ripperAnimateView3 != null) {
                    ripperAnimateView3.setAnimateMode(jj2.e.f299980e);
                }
            }
        }
        android.view.ViewGroup giftRootView = getGiftRootView();
        if (giftRootView != null) {
            giftRootView.setTranslationY(-i65.a.b(getContext(), 10));
        }
        e();
        getPluginAbility().a0().b(new di2.g(this));
    }

    @Override // li2.b
    public void Z() {
        fg2.t a17 = fg2.t.a(com.tencent.mm.ui.id.b(getContext()), this, false);
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = a17.f262314j;
        this.W = ripperAnimateView;
        if (ripperAnimateView != null) {
            ripperAnimateView.b(getService().a());
        }
        setWaveViewCallback(new di2.i(this));
        android.widget.FrameLayout finderLiveMicMuteIcon = a17.f262308d;
        kotlin.jvm.internal.o.f(finderLiveMicMuteIcon, "finderLiveMicMuteIcon");
        setFinderLiveMicMuteIcon(finderLiveMicMuteIcon);
        com.tencent.mm.ui.widget.imageview.WeImageView finderLiveMicMuteIconWe = a17.f262309e;
        kotlin.jvm.internal.o.f(finderLiveMicMuteIconWe, "finderLiveMicMuteIconWe");
        setFinderLiveMicMuteIconWe(finderLiveMicMuteIconWe);
        android.widget.ImageView finderLiveMicUserAvatar = a17.f262313i;
        kotlin.jvm.internal.o.f(finderLiveMicUserAvatar, "finderLiveMicUserAvatar");
        setFinderLiveMicUserAvatar(finderLiveMicUserAvatar);
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicNickName = a17.f262311g;
        kotlin.jvm.internal.o.f(finderLiveMicNickName, "finderLiveMicNickName");
        setFinderLiveMicUserNickText(finderLiveMicNickName);
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicHeartText = a17.f262307c;
        kotlin.jvm.internal.o.f(finderLiveMicHeartText, "finderLiveMicHeartText");
        setFinderLiveMicHeartText(finderLiveMicHeartText);
        android.widget.RelativeLayout relativeLayout = a17.f262310f.f262062a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        setFinderLiveMicGiftItemLayout(relativeLayout);
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = a17.f262306b.f261957a;
        kotlin.jvm.internal.o.f(roundCornerRelativeLayout, "getRoot(...)");
        setFinderLiveLuckyMoneyBubbleUiRoot(roundCornerRelativeLayout);
        fg2.h1 h1Var = a17.f262312h;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout2 = h1Var.f262063a;
        kotlin.jvm.internal.o.f(roundCornerRelativeLayout2, "getRoot(...)");
        setMicTagLayout(roundCornerRelativeLayout2);
        android.widget.TextView tagTextView = h1Var.f262064b;
        kotlin.jvm.internal.o.f(tagTextView, "tagTextView");
        setMicTagTextView(tagTextView);
        com.tencent.mm.ui.fk.a(getMicTagTextView());
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262305a;
        kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
        setRoot(constraintLayout);
        getMicTagLayout().setVisibility(4);
    }

    @Override // li2.b, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // li2.b, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // li2.b, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // li2.b, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // li2.b, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // li2.b, wj2.w, sj2.m
    public android.animation.ValueAnimator getGiftInAnimator() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new di2.h(this));
        return ofFloat;
    }

    @Override // li2.b, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // li2.b, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "FinderLiveChatVoiceRoomVisitorWidget";
    }

    @Override // li2.b, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // lj2.j
    public void r(android.view.View view, android.widget.TextView textView, android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(4);
    }

    @Override // wj2.w
    public boolean z() {
        return false;
    }
}
