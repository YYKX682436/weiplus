package kj2;

/* loaded from: classes10.dex */
public class j0 extends oj2.f {

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView f308409p1;

    /* renamed from: x1, reason: collision with root package name */
    public lj2.s0 f308410x1;

    /* renamed from: y1, reason: collision with root package name */
    public final int f308411y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        this.f308411y1 = android.graphics.Color.parseColor("#A18B98");
    }

    @Override // wj2.w
    public void R() {
        java.lang.String str;
        java.lang.String str2;
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            u(getNickTextView());
            t(getAvatarView());
            f(bindLinkMicUser.f309183n, bindLinkMicUser.f309191v, false);
            S(getMicHeartTextView());
            r(getFinderLiveMicUserAvatar(), getMicTagTextView(), getMicTagLayout());
        }
        if (A()) {
            getMicHeartTextView().setOnClickListener(this);
            setTouchDelegate(getMicHeartTextView());
        }
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f308409p1;
        if (ripperAnimateView != null) {
            ripperAnimateView.b(getService().a());
        }
        km2.q bindLinkMicUser2 = getBindLinkMicUser();
        if (bindLinkMicUser2 != null) {
            if (com.tencent.mm.storage.z3.S3(bindLinkMicUser2.f309172c)) {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView2 = this.f308409p1;
                if (ripperAnimateView2 != null) {
                    ripperAnimateView2.setAnimateMode(jj2.e.f299979d);
                }
            } else {
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView3 = this.f308409p1;
                if (ripperAnimateView3 != null) {
                    ripperAnimateView3.setAnimateMode(jj2.e.f299980e);
                }
            }
        }
        android.view.ViewGroup giftRootView = getGiftRootView();
        if (giftRootView != null) {
            giftRootView.setTranslationY(-i65.a.b(getContext(), 10));
        }
        xh2.a bindMicData = getBindMicData();
        if (bindMicData != null) {
            lj2.s0 s0Var = this.f308410x1;
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
            oj2.s micTagLocationWidget = getMicTagLocationWidget();
            if (micTagLocationWidget != null) {
                micTagLocationWidget.b(getTagTextColor(), bindMicData);
            }
        }
        e();
        if (getPluginAbility().a0().K() == null || getCurWidgetMode() != pm2.a.f356862r) {
            getPluginAbility().a0().b(new kj2.g0(this));
            return;
        }
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView4 = this.f308409p1;
        if (ripperAnimateView4 != null) {
            ripperAnimateView4.setColor(this.f308411y1);
        }
    }

    @Override // lj2.u0
    public void e() {
        jz5.f0 f0Var;
        oj2.s micTagLocationWidget;
        dk2.u4 K;
        xh2.i iVar;
        android.widget.TextView finderLiveMicHeartText = getFinderLiveMicHeartText();
        if (finderLiveMicHeartText != null) {
            finderLiveMicHeartText.setVisibility(8);
        }
        android.widget.TextView finderLiveMicHeartText2 = getFinderLiveMicHeartText();
        int i17 = com.tencent.mm.R.drawable.a5v;
        if (finderLiveMicHeartText2 != null) {
            finderLiveMicHeartText2.setBackgroundResource(com.tencent.mm.R.drawable.a5v);
        }
        lj2.t0 a07 = getPluginAbility().a0();
        if (a07 == null || (K = a07.K()) == null) {
            f0Var = null;
        } else {
            if (K.h() || K.i()) {
                android.widget.TextView finderLiveMicHeartText3 = getFinderLiveMicHeartText();
                if (finderLiveMicHeartText3 != null) {
                    finderLiveMicHeartText3.setText("0");
                }
                int i18 = K.f234160g;
                if (i18 == 2) {
                    android.widget.TextView finderLiveMicHeartText4 = getFinderLiveMicHeartText();
                    if (finderLiveMicHeartText4 != null) {
                        lj2.t0 a08 = getPluginAbility().a0();
                        xh2.a bindMicData = getBindMicData();
                        finderLiveMicHeartText4.setBackgroundResource(a08.d((bindMicData == null || (iVar = bindMicData.f454521b) == null) ? 0 : iVar.f454553e) ? com.tencent.mm.R.drawable.coa : com.tencent.mm.R.drawable.cjh);
                    }
                } else if (i18 == 1) {
                    int h17 = getPluginAbility().a0().h(getBindLinkMicUser());
                    android.widget.TextView finderLiveMicHeartText5 = getFinderLiveMicHeartText();
                    if (finderLiveMicHeartText5 != null) {
                        if (h17 == 1) {
                            i17 = com.tencent.mm.R.drawable.a2y;
                        }
                        finderLiveMicHeartText5.setBackgroundResource(i17);
                    }
                }
                W(getFinderLiveMicHeartText());
                android.widget.TextView finderLiveMicHeartText6 = getFinderLiveMicHeartText();
                if (finderLiveMicHeartText6 != null) {
                    finderLiveMicHeartText6.setVisibility(0);
                }
            } else {
                S(getMicHeartTextView());
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            S(getMicHeartTextView());
        }
        xh2.a bindMicData2 = getBindMicData();
        if (bindMicData2 == null || (micTagLocationWidget = getMicTagLocationWidget()) == null) {
            return;
        }
        micTagLocationWidget.b(getTagTextColor(), bindMicData2);
    }

    @Override // oj2.f, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // oj2.f, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // oj2.f, wj2.w, lj2.u0
    public ai2.a getBattleResultWidget() {
        return this.f308410x1;
    }

    @Override // oj2.f, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // oj2.f, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // oj2.f, wj2.w, sj2.m
    public android.animation.ValueAnimator getGiftInAnimator() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new kj2.h0(this));
        return ofFloat;
    }

    @Override // oj2.f, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // oj2.f, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // wj2.w
    public int getProfileSourceType() {
        return zl2.r4.f473950a.x1() ? 8 : 3;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "AudioRoomVisitorWidget";
    }

    @Override // lj2.j
    public int getTagTextColor() {
        return getContext().getResources().getColor(com.tencent.mm.R.color.aaz);
    }

    @Override // oj2.f, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // oj2.f, wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oj2.s micTagLocationWidget = getMicTagLocationWidget();
        if (micTagLocationWidget != null) {
            micTagLocationWidget.c();
        }
    }

    @Override // wj2.w
    public boolean z() {
        return false;
    }
}
