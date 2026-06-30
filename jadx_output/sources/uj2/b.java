package uj2;

/* loaded from: classes10.dex */
public final class b extends oj2.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // oj2.m
    public void Z() {
        fg2.r a17 = fg2.r.a(com.tencent.mm.ui.id.b(getContext()), this, false);
        com.tencent.mm.view.MMPAGView finderLiveMicStateAudioWaveIcon = a17.f262280l;
        kotlin.jvm.internal.o.f(finderLiveMicStateAudioWaveIcon, "finderLiveMicStateAudioWaveIcon");
        setFinderLiveMicStateAudioWaveIcon(finderLiveMicStateAudioWaveIcon);
        android.widget.FrameLayout finderLiveMicMuteIcon = a17.f262273e;
        kotlin.jvm.internal.o.f(finderLiveMicMuteIcon, "finderLiveMicMuteIcon");
        setFinderLiveMicMuteIcon(finderLiveMicMuteIcon);
        com.tencent.mm.ui.widget.imageview.WeImageView finderLiveMicMuteIconWe = a17.f262274f;
        kotlin.jvm.internal.o.f(finderLiveMicMuteIconWe, "finderLiveMicMuteIconWe");
        setFinderLiveMicMuteIconWe(finderLiveMicMuteIconWe);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262269a;
        kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
        setRoot(constraintLayout);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = a17.f262275g.f262282a;
        kotlin.jvm.internal.o.f(constraintLayout2, "getRoot(...)");
        setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout2);
        android.widget.ImageView finderLiveMicStateAudioAvatar = a17.f262277i;
        kotlin.jvm.internal.o.f(finderLiveMicStateAudioAvatar, "finderLiveMicStateAudioAvatar");
        setFinderLiveMicStateAudioAvatar(finderLiveMicStateAudioAvatar);
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderLiveMicStateAudioName = a17.f262279k;
        kotlin.jvm.internal.o.f(finderLiveMicStateAudioName, "finderLiveMicStateAudioName");
        setFinderLiveMicStateAudioName(finderLiveMicStateAudioName);
        android.widget.ImageView finderLiveMicStateAudioBg = a17.f262278j;
        kotlin.jvm.internal.o.f(finderLiveMicStateAudioBg, "finderLiveMicStateAudioBg");
        setFinderLiveMicStateAudioBg(finderLiveMicStateAudioBg);
        android.widget.TextView finderLiveMicHeartText = a17.f262272d;
        kotlin.jvm.internal.o.f(finderLiveMicHeartText, "finderLiveMicHeartText");
        setFinderLiveMicHeartText(finderLiveMicHeartText);
        android.widget.RelativeLayout relativeLayout = a17.f262271c.f261936a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout);
        setFinderLiveMicTagText(a17.f262281m.f262294b);
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
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

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "GrabCoverAudioWidget";
    }

    @Override // oj2.m, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }
}
