package sj2;

/* loaded from: classes10.dex */
public final class h extends sj2.i {
    public final fg2.p0 N;
    public boolean P;
    public final wj2.j0 Q;
    public final wj2.j0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 1);
        android.view.View view;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.auz, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.f484628ey3;
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.f484628ey3);
        if (finderFixedTextView != null) {
            i17 = com.tencent.mm.R.id.f484630rm4;
            android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.f484630rm4);
            if (a17 != null) {
                fg2.t0 a18 = fg2.t0.a(a17);
                int i18 = com.tencent.mm.R.id.f8q;
                android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
                if (a19 != null) {
                    fg2.a0 a27 = fg2.a0.a(a19);
                    i18 = com.tencent.mm.R.id.f_y;
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f_y);
                    if (frameLayout != null) {
                        i18 = com.tencent.mm.R.id.fa_;
                        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                        if (finderFixedTextView2 != null) {
                            i18 = com.tencent.mm.R.id.fag;
                            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.fag);
                            if (frameLayout2 != null) {
                                i18 = com.tencent.mm.R.id.fah;
                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.fah);
                                if (weImageView != null) {
                                    com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate;
                                    int i19 = com.tencent.mm.R.id.faj;
                                    android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.faj);
                                    if (a28 != null) {
                                        fg2.h0 a29 = fg2.h0.a(a28);
                                        i19 = com.tencent.mm.R.id.rmf;
                                        android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.rmf);
                                        if (a37 != null) {
                                            fg2.t0 a38 = fg2.t0.a(a37);
                                            i19 = com.tencent.mm.R.id.g_m;
                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.g_m);
                                            if (constraintLayout != null) {
                                                i19 = com.tencent.mm.R.id.g_n;
                                                android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.g_n);
                                                if (imageView != null) {
                                                    i19 = com.tencent.mm.R.id.g_o;
                                                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView3 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.g_o);
                                                    if (finderFixedTextView3 != null) {
                                                        i19 = com.tencent.mm.R.id.g_r;
                                                        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) x4.b.a(inflate, com.tencent.mm.R.id.g_r);
                                                        if (mMPAGView != null) {
                                                            i19 = com.tencent.mm.R.id.gxq;
                                                            androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) x4.b.a(inflate, com.tencent.mm.R.id.gxq);
                                                            if (guideline != null) {
                                                                i19 = com.tencent.mm.R.id.jis;
                                                                com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView potholingImageView = (com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView) x4.b.a(inflate, com.tencent.mm.R.id.jis);
                                                                if (potholingImageView != null) {
                                                                    i19 = com.tencent.mm.R.id.f485919jj2;
                                                                    android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.f485919jj2);
                                                                    if (imageView2 != null) {
                                                                        i19 = com.tencent.mm.R.id.jj8;
                                                                        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView4 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.jj8);
                                                                        if (finderFixedTextView4 != null) {
                                                                            i19 = com.tencent.mm.R.id.jja;
                                                                            android.view.View a39 = x4.b.a(inflate, com.tencent.mm.R.id.jja);
                                                                            if (a39 != null) {
                                                                                i19 = com.tencent.mm.R.id.m3w;
                                                                                android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.m3w);
                                                                                if (frameLayout3 != null) {
                                                                                    i19 = com.tencent.mm.R.id.n0k;
                                                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.n0k);
                                                                                    if (constraintLayout2 != null) {
                                                                                        i19 = com.tencent.mm.R.id.f487687pg3;
                                                                                        view = inflate;
                                                                                        com.tencent.mm.view.MMPAGView mMPAGView2 = (com.tencent.mm.view.MMPAGView) x4.b.a(inflate, com.tencent.mm.R.id.f487687pg3);
                                                                                        if (mMPAGView2 != null) {
                                                                                            this.N = new fg2.p0(roundCornerConstraintLayout, finderFixedTextView, a18, a27, frameLayout, finderFixedTextView2, frameLayout2, weImageView, roundCornerConstraintLayout, a29, a38, constraintLayout, imageView, finderFixedTextView3, mMPAGView, guideline, potholingImageView, imageView2, finderFixedTextView4, a39, frameLayout3, constraintLayout2, mMPAGView2);
                                                                                            addView(roundCornerConstraintLayout);
                                                                                            roundCornerConstraintLayout.setOnClickListener(this);
                                                                                            imageView.setOnClickListener(this);
                                                                                            finderFixedTextView3.setOnClickListener(this);
                                                                                            ym5.l2 l2Var = ym5.l2.f463424a;
                                                                                            ym5.j2[] j2VarArr = ym5.j2.f463392d;
                                                                                            ae2.in inVar = ae2.in.f3688a;
                                                                                            mMPAGView.o(inVar.a(ym5.f6.T));
                                                                                            mMPAGView2.o(inVar.a(ym5.f6.U));
                                                                                            android.content.res.AssetManager assets = context.getAssets();
                                                                                            kotlin.jvm.internal.o.f(assets, "getAssets(...)");
                                                                                            mMPAGView.k(assets, "finder_live_link_mic_wave.pag");
                                                                                            mMPAGView.setRepeatCount(-1);
                                                                                            android.content.res.AssetManager assets2 = context.getAssets();
                                                                                            kotlin.jvm.internal.o.f(assets2, "getAssets(...)");
                                                                                            mMPAGView2.k(assets2, "finder_live_link_mic_wave.pag");
                                                                                            mMPAGView2.setRepeatCount(-1);
                                                                                            frameLayout.setOnClickListener(this);
                                                                                            frameLayout2.setOnClickListener(this);
                                                                                            android.widget.LinearLayout linearLayout = a38.f262315a;
                                                                                            kotlin.jvm.internal.o.f(linearLayout, "getRoot(...)");
                                                                                            this.Q = new wj2.j0(linearLayout, pluginAbility, service);
                                                                                            android.widget.LinearLayout linearLayout2 = a18.f262315a;
                                                                                            kotlin.jvm.internal.o.f(linearLayout2, "getRoot(...)");
                                                                                            this.R = new wj2.j0(linearLayout2, pluginAbility, service);
                                                                                            linearLayout2.setTranslationX(-i65.a.b(context, 20));
                                                                                            linearLayout2.setTranslationY(-i65.a.b(context, 8));
                                                                                            return;
                                                                                        }
                                                                                        i17 = i19;
                                                                                        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    view = inflate;
                                    i17 = i19;
                                    throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
                                }
                            }
                        }
                    }
                }
                view = inflate;
                i17 = i18;
                throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
            }
        }
        view = inflate;
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    private final android.widget.TextView getMicHeartText() {
        boolean z17 = this.M;
        fg2.p0 p0Var = this.N;
        if (z17) {
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = p0Var.f262204b;
            kotlin.jvm.internal.o.d(finderFixedTextView);
            return finderFixedTextView;
        }
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2 = p0Var.f262207e;
        kotlin.jvm.internal.o.d(finderFixedTextView2);
        return finderFixedTextView2;
    }

    @Override // wj2.w
    public void S(android.widget.TextView textView) {
        android.view.ViewTreeObserver viewTreeObserver;
        super.S(textView);
        if (this.M && textView != null && (viewTreeObserver = textView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new sj2.g(textView));
        }
        if (!getPluginAbility().a0().n() || textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // sj2.m
    public void a() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationStart");
    }

    @Override // sj2.i
    public void b0(boolean z17) {
        android.widget.TextView micHeartText;
        fg2.p0 p0Var = this.N;
        if (!z17) {
            android.content.Context context = p0Var.f262203a.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            float f17 = displayMetrics.density / context.getResources().getDisplayMetrics().density;
            com.tencent.mars.xlog.Log.i(getTAG(), "checkFontSizeMode rate: " + f17);
            android.view.ViewGroup.LayoutParams layoutParams = p0Var.f262216n.getLayoutParams();
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = p0Var.f262203a;
            if (layoutParams != null) {
                int b17 = (int) (i65.a.b(roundCornerConstraintLayout.getContext(), 36) * f17);
                layoutParams.width = b17;
                layoutParams.height = b17;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = p0Var.f262209g.f262062a.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = (int) (i65.a.b(roundCornerConstraintLayout.getContext(), 20) * f17);
            }
        }
        float b18 = i65.a.b(getContext(), 8);
        if (!(D() ? zl2.r4.f473950a.x1() : !Z())) {
            b18 = 0.0f;
        }
        android.graphics.drawable.Drawable background = p0Var.f262218p.getBackground();
        jz5.f0 f0Var = null;
        android.graphics.drawable.GradientDrawable gradientDrawable = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(b18);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = p0Var.f262214l.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams3).f10881b = z17 ? getRightOffestSize() : 0;
        if (z17) {
            p0Var.f262210h.setVisibility(0);
            p0Var.f262219q.setVisibility(8);
            p0Var.f262203a.setRadius(0.0f);
        } else {
            p0Var.f262203a.setRadius(b18);
            p0Var.f262210h.setVisibility(8);
            p0Var.f262219q.setVisibility(0);
        }
        xh2.a bindMicData = getBindMicData();
        if (bindMicData != null) {
            if (z17) {
                wj2.j0 j0Var = this.R;
                if (j0Var != null) {
                    j0Var.b(bindMicData, new lj2.e0(j0Var.f446689a, lj2.f0.f318855d));
                }
            } else {
                wj2.j0 j0Var2 = this.Q;
                if (j0Var2 != null) {
                    j0Var2.b(bindMicData, new lj2.e0(this, lj2.f0.f318856e));
                }
            }
        }
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            q(p0Var.f262215m);
            if (z17) {
                java.util.ArrayList<android.graphics.RectF> potholingRectList = getPotholingRectList();
                if (potholingRectList != null) {
                    p0Var.f262215m.r(b18, potholingRectList);
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    p0Var.f262215m.n();
                }
                t(p0Var.f262211i);
                u(p0Var.f262212j);
            } else {
                p0Var.f262215m.n();
                t(p0Var.f262216n);
                u(p0Var.f262217o);
                f(bindLinkMicUser.f309183n, bindLinkMicUser.f309191v, false);
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
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationEnd");
    }

    @Override // lj2.u0
    public void e() {
        S(getMicHeartText());
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        super.f(z17, i17, z18);
        boolean B = B();
        fg2.p0 p0Var = this.N;
        if (B || (G() && getPluginAbility().a0().F())) {
            if (p0Var.f262210h.getVisibility() == 0) {
                p0Var.f262206d.setVisibility(0);
            } else {
                p0Var.f262208f.setVisibility(0);
            }
            p0Var.f262213k.n();
            p0Var.f262213k.setVisibility(8);
            com.tencent.mm.view.MMPAGView mMPAGView = p0Var.f262220r;
            mMPAGView.n();
            mMPAGView.setVisibility(8);
            return;
        }
        p0Var.f262208f.setVisibility(8);
        p0Var.f262206d.setVisibility(8);
        if (this.P != z17) {
            com.tencent.mars.xlog.Log.i(getTAG(), "notifyMicUserTalkingState notTalking:" + z17 + " lastNotTalking: " + this.P);
            this.P = z17;
            if (z17) {
                p0Var.f262213k.n();
                p0Var.f262213k.setVisibility(8);
                com.tencent.mm.view.MMPAGView mMPAGView2 = p0Var.f262220r;
                mMPAGView2.n();
                mMPAGView2.setVisibility(8);
                return;
            }
            if (p0Var.f262210h.getVisibility() == 0) {
                com.tencent.mm.view.MMPAGView mMPAGView3 = p0Var.f262213k;
                mMPAGView3.setVisibility(0);
                mMPAGView3.g();
            } else {
                com.tencent.mm.view.MMPAGView mMPAGView4 = p0Var.f262220r;
                mMPAGView4.setVisibility(0);
                mMPAGView4.g();
            }
        }
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
        android.widget.RelativeLayout relativeLayout = this.N.f262209g.f262062a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public android.view.ViewGroup getLuckyMoneyRootView() {
        android.widget.RelativeLayout relativeLayout = this.N.f262205c.f261936a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // sj2.i
    public com.tencent.mm.ui.widget.RoundCornerConstraintLayout getRoundCornerConstraintLayout() {
        com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = this.N.f262203a;
        kotlin.jvm.internal.o.f(roundCornerConstraintLayout, "getRoot(...)");
        return roundCornerConstraintLayout;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "FocusAudioCoverWidget";
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r11) {
        /*
            r10 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusAudioCoverWidget"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r11)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r10
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            r0 = 0
            if (r11 == 0) goto L27
            int r11 = r11.getId()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L28
        L27:
            r11 = r0
        L28:
            fg2.p0 r1 = r10.N
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout r2 = r1.f262203a
            int r2 = r2.getId()
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.lang.String r4 = "onClick"
            java.lang.String r5 = "android/view/View$OnClickListener"
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusAudioCoverWidget"
            if (r11 != 0) goto L3b
            goto L57
        L3b:
            int r7 = r11.intValue()
            if (r7 != r2) goto L57
            boolean r11 = r10.M
            if (r11 == 0) goto L52
            boolean r11 = r10.E()
            if (r11 != 0) goto L52
            r10.a0()
            yj0.a.h(r10, r6, r5, r4, r3)
            return
        L52:
            r10.J()
            goto Lcf
        L57:
            android.widget.ImageView r2 = r1.f262211i
            int r2 = r2.getId()
            r7 = 0
            r8 = 1
            if (r11 != 0) goto L62
            goto L6a
        L62:
            int r9 = r11.intValue()
            if (r9 != r2) goto L6a
        L68:
            r2 = r8
            goto L7b
        L6a:
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r2 = r1.f262212j
            int r2 = r2.getId()
            if (r11 != 0) goto L73
            goto L7a
        L73:
            int r9 = r11.intValue()
            if (r9 != r2) goto L7a
            goto L68
        L7a:
            r2 = r7
        L7b:
            if (r2 == 0) goto L7f
        L7d:
            r2 = r8
            goto L90
        L7f:
            android.widget.FrameLayout r2 = r1.f262208f
            int r2 = r2.getId()
            if (r11 != 0) goto L88
            goto L8f
        L88:
            int r9 = r11.intValue()
            if (r9 != r2) goto L8f
            goto L7d
        L8f:
            r2 = r7
        L90:
            if (r2 == 0) goto L94
        L92:
            r1 = r8
            goto La5
        L94:
            android.widget.FrameLayout r1 = r1.f262206d
            int r1 = r1.getId()
            if (r11 != 0) goto L9d
            goto La4
        L9d:
            int r2 = r11.intValue()
            if (r2 != r1) goto La4
            goto L92
        La4:
            r1 = r7
        La5:
            if (r1 == 0) goto Lab
            r10.J()
            goto Lcf
        Lab:
            android.widget.TextView r1 = r10.getMicHeartText()
            if (r1 == 0) goto Lb9
            int r0 = r1.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        Lb9:
            boolean r11 = kotlin.jvm.internal.o.b(r11, r0)
            if (r11 == 0) goto Lcf
            android.widget.TextView r11 = r10.getMicHeartText()
            int r11 = r11.getVisibility()
            if (r11 != 0) goto Lca
            r7 = r8
        Lca:
            if (r7 == 0) goto Lcf
            r10.H()
        Lcf:
            yj0.a.h(r10, r6, r5, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sj2.h.onClick(android.view.View):void");
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wj2.j0 j0Var = this.Q;
        if (j0Var != null) {
            j0Var.c();
        }
        wj2.j0 j0Var2 = this.R;
        if (j0Var2 != null) {
            j0Var2.c();
        }
    }
}
