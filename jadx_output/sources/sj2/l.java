package sj2;

/* loaded from: classes10.dex */
public final class l extends sj2.i {
    public final fg2.q0 N;
    public final wj2.j0 P;
    public wj2.j0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 2);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488927av1, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.f8q;
        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
        if (a17 != null) {
            fg2.a0 a18 = fg2.a0.a(a17);
            i17 = com.tencent.mm.R.id.fa_;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.fag;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.fag);
                if (frameLayout != null) {
                    i17 = com.tencent.mm.R.id.faj;
                    android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.faj);
                    if (a19 != null) {
                        fg2.h0 a27 = fg2.h0.a(a19);
                        i17 = com.tencent.mm.R.id.rmf;
                        android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.rmf);
                        if (a28 != null) {
                            fg2.t0 a29 = fg2.t0.a(a28);
                            com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate;
                            int i18 = com.tencent.mm.R.id.jj8;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.jj8);
                            if (textView2 != null) {
                                i18 = com.tencent.mm.R.id.jja;
                                android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.jja);
                                if (a37 != null) {
                                    i18 = com.tencent.mm.R.id.n0k;
                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.n0k);
                                    if (constraintLayout != null) {
                                        this.N = new fg2.q0(roundCornerConstraintLayout, a18, textView, frameLayout, a27, a29, roundCornerConstraintLayout, textView2, a37, constraintLayout);
                                        addView(roundCornerConstraintLayout);
                                        roundCornerConstraintLayout.setOnClickListener(this);
                                        android.widget.LinearLayout linearLayout = a29.f262315a;
                                        kotlin.jvm.internal.o.f(linearLayout, "getRoot(...)");
                                        this.P = new wj2.j0(linearLayout, pluginAbility, service);
                                        frameLayout.setOnClickListener(this);
                                        return;
                                    }
                                }
                            }
                            i17 = i18;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    private final android.widget.TextView getMicHeartText() {
        if (!this.M) {
            return this.N.f262258c;
        }
        android.view.ViewGroup T = getPluginAbility().T();
        if (T != null) {
            return (android.widget.TextView) T.findViewById(com.tencent.mm.R.id.fa_);
        }
        return null;
    }

    private final android.view.View getVideoFocusMuteView() {
        android.view.ViewGroup T;
        lj2.v0 pluginAbility = getPluginAbility();
        if (pluginAbility == null || (T = pluginAbility.T()) == null) {
            return null;
        }
        return T.findViewById(com.tencent.mm.R.id.fag);
    }

    @Override // wj2.w
    public void S(android.widget.TextView textView) {
        super.S(textView);
        if (!getPluginAbility().a0().n() || textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // sj2.m
    public void a() {
    }

    @Override // sj2.i
    public void b0(boolean z17) {
        android.widget.TextView micHeartText;
        android.view.ViewGroup T;
        android.view.ViewGroup T2;
        android.view.View findViewById;
        float b17 = i65.a.b(getContext(), 8);
        if (!(D() ? zl2.r4.f473950a.x1() : !Z())) {
            b17 = 0.0f;
        }
        fg2.q0 q0Var = this.N;
        android.graphics.drawable.Drawable background = q0Var.f262262g.getBackground();
        android.graphics.drawable.GradientDrawable gradientDrawable = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(b17);
        }
        com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = q0Var.f262256a;
        if (z17) {
            roundCornerConstraintLayout.setRadius(0.0f);
        } else {
            roundCornerConstraintLayout.setRadius(b17);
        }
        xh2.a bindMicData = getBindMicData();
        if (bindMicData != null) {
            if (z17) {
                lj2.v0 pluginAbility = getPluginAbility();
                if (pluginAbility != null && (T2 = pluginAbility.T()) != null && (findViewById = T2.findViewById(com.tencent.mm.R.id.rmf)) != null) {
                    this.Q = new wj2.j0(findViewById, getPluginAbility(), getService());
                }
                wj2.j0 j0Var = this.Q;
                if (j0Var != null) {
                    j0Var.b(bindMicData, new lj2.e0(j0Var.f446689a, lj2.f0.f318856e));
                }
            } else {
                wj2.j0 j0Var2 = this.P;
                if (j0Var2 != null) {
                    j0Var2.b(bindMicData, new lj2.e0(this, lj2.f0.f318856e));
                }
            }
        }
        if (getBindLinkMicUser() != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = q0Var.f262263h;
            if (z17) {
                constraintLayout.setVisibility(8);
                android.view.View videoFocusMuteView = getVideoFocusMuteView();
                if (videoFocusMuteView != null) {
                    videoFocusMuteView.setOnClickListener(new sj2.k(this));
                }
            } else {
                constraintLayout.setVisibility(0);
                u(q0Var.f262261f);
            }
        }
        lj2.v0 pluginAbility2 = getPluginAbility();
        if (pluginAbility2 != null && (T = pluginAbility2.T()) != null && this.M && !D()) {
            android.widget.ImageView imageView = (android.widget.ImageView) T.findViewById(com.tencent.mm.R.id.vnr);
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            T.setVisibility(0);
            T.setOnClickListener(new sj2.j(this));
            km2.q bindLinkMicUser = getBindLinkMicUser();
            android.view.View findViewById2 = T.findViewById(com.tencent.mm.R.id.jj8);
            if (bindLinkMicUser != null && findViewById2 != null) {
                ((android.widget.TextView) findViewById2).setText(getContext().getResources().getString(com.tencent.mm.R.string.nse, zl2.r4.D0(zl2.r4.f473950a, bindLinkMicUser.f309172c, bindLinkMicUser.f309173d, false, 4, null)));
            }
            km2.q bindLinkMicUser2 = getBindLinkMicUser();
            android.view.View findViewById3 = T.findViewById(com.tencent.mm.R.id.tig);
            if (bindLinkMicUser2 != null && findViewById3 != null) {
                ya2.g gVar = ya2.h.f460484a;
                java.lang.String str = bindLinkMicUser2.f309172c;
                if (!(str != null ? r26.i0.n(str, "@finder", false) : false) || bindLinkMicUser2.f309177h) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "onFocusHeaderShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "onFocusHeaderShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "onFocusHeaderShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "onFocusHeaderShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        S(getMicHeartText());
        if (!A() || (micHeartText = getMicHeartText()) == null) {
            return;
        }
        setTouchDelegate(micHeartText);
        micHeartText.setOnClickListener(this);
    }

    @Override // sj2.m
    public void d() {
    }

    @Override // lj2.u0
    public void e() {
        S(getMicHeartText());
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        android.view.View videoFocusMuteView;
        super.f(z17, i17, z18);
        boolean B = B();
        fg2.q0 q0Var = this.N;
        if (!B && (!G() || !getPluginAbility().a0().F())) {
            if (this.M && (videoFocusMuteView = getVideoFocusMuteView()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(videoFocusMuteView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "notifyMicUserTalkingStateChange", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                videoFocusMuteView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(videoFocusMuteView, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "notifyMicUserTalkingStateChange", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            q0Var.f262259d.setVisibility(8);
            return;
        }
        if (!this.M) {
            q0Var.f262259d.setVisibility(0);
            return;
        }
        android.view.View videoFocusMuteView2 = getVideoFocusMuteView();
        if (videoFocusMuteView2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(videoFocusMuteView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "notifyMicUserTalkingStateChange", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        videoFocusMuteView2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(videoFocusMuteView2, "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusVideoCoverWidget", "notifyMicUserTalkingStateChange", "(ZIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // sj2.i, wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // sj2.i, wj2.w, sj2.m
    public android.view.ViewGroup getGiftRootView() {
        android.widget.RelativeLayout relativeLayout = this.N.f262260e.f262062a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public android.view.ViewGroup getLuckyMoneyRootView() {
        android.widget.RelativeLayout relativeLayout = this.N.f262257b.f261936a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // sj2.i
    public com.tencent.mm.ui.widget.RoundCornerConstraintLayout getRoundCornerConstraintLayout() {
        com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = this.N.f262256a;
        kotlin.jvm.internal.o.f(roundCornerConstraintLayout, "getRoot(...)");
        return roundCornerConstraintLayout;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "FocusVideoCoverWidget";
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.q0 q0Var = this.N;
        int id6 = q0Var.f262256a.getId();
        boolean z17 = false;
        if (valueOf != null && valueOf.intValue() == id6) {
            if (this.M && !E()) {
                a0();
                return;
            } else if (G()) {
                wj2.w.U(this, 0, 1, null);
                return;
            } else {
                X();
                return;
            }
        }
        int id7 = q0Var.f262259d.getId();
        if (valueOf != null && valueOf.intValue() == id7) {
            L();
            return;
        }
        android.widget.TextView micHeartText = getMicHeartText();
        if (kotlin.jvm.internal.o.b(valueOf, micHeartText != null ? java.lang.Integer.valueOf(micHeartText.getId()) : null)) {
            android.widget.TextView micHeartText2 = getMicHeartText();
            if (micHeartText2 != null) {
                if (micHeartText2.getVisibility() == 0) {
                    z17 = true;
                }
            }
            if (z17) {
                H();
            }
        }
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wj2.j0 j0Var = this.P;
        if (j0Var != null) {
            j0Var.c();
        }
        wj2.j0 j0Var2 = this.Q;
        if (j0Var2 != null) {
            j0Var2.c();
        }
    }
}
