package uj2;

/* loaded from: classes10.dex */
public final class a extends oj2.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // oj2.l
    public void a0() {
        fg2.j0 a17 = fg2.j0.a(com.tencent.mm.ui.id.b(getContext()), this, false);
        com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = a17.f262098a;
        kotlin.jvm.internal.o.f(roundCornerConstraintLayout, "getRoot(...)");
        setRoot(roundCornerConstraintLayout);
        android.widget.FrameLayout finderLiveMicAnchorAudioLayout = a17.f262103f;
        kotlin.jvm.internal.o.f(finderLiveMicAnchorAudioLayout, "finderLiveMicAnchorAudioLayout");
        setFinderLiveMicAnchorAudioLayout(finderLiveMicAnchorAudioLayout);
        android.widget.RelativeLayout relativeLayout = a17.f262108k.f262389a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        setFinderLiveVoteBubbleRoot(relativeLayout);
        android.widget.RelativeLayout relativeLayout2 = a17.f262102e.f261936a;
        kotlin.jvm.internal.o.f(relativeLayout2, "getRoot(...)");
        setFinderLiveLuckyMoneyBubbleUiRoot(relativeLayout2);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262105h.f262282a;
        kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
        setFinderLiveMicNewNormalMicGiftItemLayout(constraintLayout);
        android.widget.RelativeLayout relativeLayout3 = a17.f262101d.f262381a;
        kotlin.jvm.internal.o.f(relativeLayout3, "getRoot(...)");
        setFinderLiveLotteryBubbleRoot(relativeLayout3);
        android.widget.TextView finderLiveMicHeartText = a17.f262104g;
        kotlin.jvm.internal.o.f(finderLiveMicHeartText, "finderLiveMicHeartText");
        setFinderLiveMicHeartText(finderLiveMicHeartText);
        setFinderLiveMicTagText(a17.f262107j.f262294b);
        setAnchorAudioCoverView(a17.f262099b);
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
        return "GrabCoverAnchorWidget";
    }
}
