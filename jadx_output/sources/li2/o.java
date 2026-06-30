package li2;

/* loaded from: classes10.dex */
public class o extends li2.b {
    public com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView W;

    /* renamed from: p0, reason: collision with root package name */
    public android.graphics.drawable.Drawable f318771p0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f318772x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // li2.b, wj2.w
    public void J() {
        if (G()) {
            wj2.w.U(this, 0, 1, null);
        } else {
            X();
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
        getPluginAbility().a0().b(new li2.k(this));
    }

    @Override // li2.b
    public void Z() {
        fg2.t a17 = fg2.t.a(com.tencent.mm.ui.id.b(getContext()), this, false);
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = a17.f262314j;
        this.W = ripperAnimateView;
        if (ripperAnimateView != null) {
            ripperAnimateView.b(getService().a());
        }
        setWaveViewCallback(new li2.m(this));
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
        getPluginAbility().a0().b(new li2.n(this));
    }

    @Override // li2.b, lj2.u0
    public void e() {
        java.lang.String str;
        java.lang.String str2;
        super.e();
        boolean z17 = this.f318772x0;
        lj2.t0 a07 = getPluginAbility().a0();
        km2.q curBindLinkMicUser = getCurBindLinkMicUser();
        java.lang.String str3 = "";
        if (curBindLinkMicUser == null || (str = curBindLinkMicUser.f309170a) == null) {
            str = "";
        }
        if (z17 != a07.j(str)) {
            lj2.t0 a08 = getPluginAbility().a0();
            km2.q curBindLinkMicUser2 = getCurBindLinkMicUser();
            if (curBindLinkMicUser2 != null && (str2 = curBindLinkMicUser2.f309170a) != null) {
                str3 = str2;
            }
            this.f318772x0 = a08.j(str3);
            g();
        }
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
        ofFloat.addUpdateListener(new li2.l(this));
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
    public android.graphics.drawable.Drawable getTagLayoutBackgroundDrawable() {
        android.graphics.drawable.Drawable drawable = this.f318771p0;
        if (drawable != null) {
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = getContext().getResources().getDrawable(com.tencent.mm.R.color.f479103q2);
        kotlin.jvm.internal.o.f(drawable2, "getDrawable(...)");
        return drawable2;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "KTVRoomVisitorWidget";
    }

    @Override // wj2.w, lj2.j
    public java.lang.String getTagText() {
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.mjl);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // lj2.j
    public int getTagTextColor() {
        return getContext().getResources().getColor(com.tencent.mm.R.color.aaz);
    }

    @Override // li2.b, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // lj2.j
    public void r(android.view.View view, android.widget.TextView textView, android.view.ViewGroup viewGroup) {
        java.lang.String str;
        super.r(view, textView, viewGroup);
        com.tencent.mars.xlog.Log.i(getTAG(), "showMicTagLayout isSelfSinger: " + this.f318772x0);
        if (viewGroup == null) {
            return;
        }
        lj2.t0 a07 = getPluginAbility().a0();
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser == null || (str = bindLinkMicUser.f309170a) == null) {
            str = "";
        }
        viewGroup.setVisibility(a07.j(str) ? 0 : 8);
    }

    @Override // wj2.w
    public boolean z() {
        return false;
    }
}
