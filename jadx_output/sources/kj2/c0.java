package kj2;

/* loaded from: classes10.dex */
public final class c0 extends wj2.w {

    /* renamed from: J, reason: collision with root package name */
    public final fg2.j f308390J;
    public final com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView K;
    public final pj2.c L;
    public boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 1);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        fg2.j a17 = fg2.j.a(com.tencent.mm.ui.id.b(context), this, false);
        this.f308390J = a17;
        a17.f262094h.setVisibility(4);
        a17.f262095i.f262063a.setVisibility(4);
        addView(a17.f262087a);
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = a17.f262097k;
        this.K = ripperAnimateView;
        if (ripperAnimateView != null) {
            ripperAnimateView.b(service.a());
        }
        this.L = new kj2.a0(this);
        setClipChildren(false);
    }

    @Override // wj2.w
    public void I(boolean z17) {
        if (this.M == z17) {
            boolean z18 = false;
            pj2.c cVar = this.L;
            if (cVar != null && cVar.c() == z17) {
                z18 = true;
            }
            if (!z18) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(getTAG(), "notifyUserVolumeChange notTalking:" + z17 + " lastNotTalking: " + this.M);
        this.M = z17;
        pm0.v.X(new kj2.b0(z17, this));
    }

    @Override // wj2.w
    public void R() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.K;
        if (ripperAnimateView != null) {
            ripperAnimateView.b(getService().a());
        }
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            if (com.tencent.mm.storage.z3.S3(bindLinkMicUser.f309172c)) {
                if (ripperAnimateView != null) {
                    ripperAnimateView.setAnimateMode(jj2.e.f299979d);
                }
            } else if (ripperAnimateView != null) {
                ripperAnimateView.setAnimateMode(jj2.e.f299980e);
            }
        }
        if (getBindLinkMicUser() != null) {
            t(this.f308390J.f262096j);
        }
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.view.ViewGroup getGiftRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLuckyMoneyRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "FinderLiveVoiceRoomFloatVisitorWidget";
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }
}
