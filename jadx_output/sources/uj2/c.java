package uj2;

/* loaded from: classes10.dex */
public final class c extends oj2.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // oj2.o
    public void a0() {
        fg2.l0 a17 = fg2.l0.a(com.tencent.mm.ui.id.b(getContext()), this, false);
        android.widget.FrameLayout finderLiveMicMuteIcon = a17.f262122f;
        kotlin.jvm.internal.o.f(finderLiveMicMuteIcon, "finderLiveMicMuteIcon");
        setFinderLiveMicMuteIcon(finderLiveMicMuteIcon);
        com.tencent.mm.ui.widget.imageview.WeImageView finderLiveMicMuteIconWe = a17.f262123g;
        kotlin.jvm.internal.o.f(finderLiveMicMuteIconWe, "finderLiveMicMuteIconWe");
        setFinderLiveMicMuteIconWe(finderLiveMicMuteIconWe);
        android.widget.RelativeLayout relativeLayout = a17.f262117a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        setRoot(relativeLayout);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262124h.f262282a;
        kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
        setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout);
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveVideoLinkBottomBarName = a17.f262127k;
        kotlin.jvm.internal.o.f(finderLiveVideoLinkBottomBarName, "finderLiveVideoLinkBottomBarName");
        setFinderLiveVideoLinkBottomBarName(finderLiveVideoLinkBottomBarName);
        setFinderLiveFinderLogo(a17.f262119c);
        setFinderLiveMicHeartText(a17.f262121e);
        setFinderLiveMicTagText(a17.f262126j.f262294b);
        android.widget.RelativeLayout relativeLayout2 = a17.f262120d.f261936a;
        kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
        setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout2);
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

    @Override // oj2.o, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
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
