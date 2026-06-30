package sj2;

/* loaded from: classes10.dex */
public final class f extends sj2.i {
    public final fg2.o0 N;
    public java.lang.Boolean P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 3);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.auy, (android.view.ViewGroup) this, false);
        int i17 = com.tencent.mm.R.id.f484711f85;
        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.f484711f85);
        if (a17 != null) {
            int i18 = com.tencent.mm.R.id.f483046v5;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(a17, com.tencent.mm.R.id.f483046v5);
            if (frameLayout != null) {
                i18 = com.tencent.mm.R.id.cjn;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(a17, com.tencent.mm.R.id.cjn);
                if (textView != null) {
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(a17, com.tencent.mm.R.id.f484710f84);
                    if (frameLayout2 != null) {
                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) a17;
                        fg2.w wVar = new fg2.w(relativeLayout, frameLayout, textView, frameLayout2, relativeLayout);
                        int i19 = com.tencent.mm.R.id.f8q;
                        android.view.View a18 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
                        if (a18 != null) {
                            int i27 = com.tencent.mm.R.id.f483768c03;
                            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = (com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView) x4.b.a(a18, com.tencent.mm.R.id.f483768c03);
                            if (finderLiveGiftTextView != null) {
                                android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) a18;
                                com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) x4.b.a(a18, com.tencent.mm.R.id.iy7);
                                if (mMPAGView != null) {
                                    fg2.b0 b0Var = new fg2.b0(relativeLayout2, finderLiveGiftTextView, relativeLayout2, mMPAGView);
                                    i19 = com.tencent.mm.R.id.fa_;
                                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                                    if (finderFixedTextView != null) {
                                        i19 = com.tencent.mm.R.id.faj;
                                        android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.faj);
                                        if (a19 != null) {
                                            fg2.h0 a27 = fg2.h0.a(a19);
                                            com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate;
                                            int i28 = com.tencent.mm.R.id.fm8;
                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.fm8);
                                            if (constraintLayout != null) {
                                                i28 = com.tencent.mm.R.id.fqg;
                                                android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.fqg);
                                                if (a28 != null) {
                                                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(a28, com.tencent.mm.R.id.cjn);
                                                    if (textView2 != null) {
                                                        i18 = com.tencent.mm.R.id.fqf;
                                                        android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) x4.b.a(a28, com.tencent.mm.R.id.fqf);
                                                        if (frameLayout3 != null) {
                                                            android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) a28;
                                                            i18 = com.tencent.mm.R.id.p8g;
                                                            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(a28, com.tencent.mm.R.id.p8g);
                                                            if (imageView != null) {
                                                                fg2.x1 x1Var = new fg2.x1(relativeLayout3, textView2, frameLayout3, relativeLayout3, imageView);
                                                                i17 = com.tencent.mm.R.id.jis;
                                                                com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView potholingImageView = (com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView) x4.b.a(inflate, com.tencent.mm.R.id.jis);
                                                                if (potholingImageView != null) {
                                                                    i17 = com.tencent.mm.R.id.jj8;
                                                                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(inflate, com.tencent.mm.R.id.jj8);
                                                                    if (finderFixedTextView2 != null) {
                                                                        i17 = com.tencent.mm.R.id.jja;
                                                                        android.view.View a29 = x4.b.a(inflate, com.tencent.mm.R.id.jja);
                                                                        if (a29 != null) {
                                                                            i17 = com.tencent.mm.R.id.kb9;
                                                                            com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = (com.tencent.mm.ui.widget.RoundCornerFrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.kb9);
                                                                            if (roundCornerFrameLayout != null) {
                                                                                i17 = com.tencent.mm.R.id.kbc;
                                                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.kbc);
                                                                                if (constraintLayout2 != null) {
                                                                                    i17 = com.tencent.mm.R.id.n0k;
                                                                                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.n0k);
                                                                                    if (constraintLayout3 != null) {
                                                                                        i17 = com.tencent.mm.R.id.f487687pg3;
                                                                                        com.tencent.mm.view.MMPAGView mMPAGView2 = (com.tencent.mm.view.MMPAGView) x4.b.a(inflate, com.tencent.mm.R.id.f487687pg3);
                                                                                        if (mMPAGView2 != null) {
                                                                                            this.N = new fg2.o0(roundCornerConstraintLayout, wVar, b0Var, finderFixedTextView, a27, roundCornerConstraintLayout, constraintLayout, x1Var, potholingImageView, finderFixedTextView2, a29, roundCornerFrameLayout, constraintLayout2, constraintLayout3, mMPAGView2);
                                                                                            addView(roundCornerConstraintLayout);
                                                                                            roundCornerConstraintLayout.setOnClickListener(this);
                                                                                            ym5.l2 l2Var = ym5.l2.f463424a;
                                                                                            ym5.j2[] j2VarArr = ym5.j2.f463392d;
                                                                                            mMPAGView2.o(ae2.in.f3688a.a(ym5.f6.V));
                                                                                            android.content.res.AssetManager assets = context.getAssets();
                                                                                            kotlin.jvm.internal.o.f(assets, "getAssets(...)");
                                                                                            mMPAGView2.k(assets, "finder_live_link_mic_wave.pag");
                                                                                            mMPAGView2.setRepeatCount(-1);
                                                                                            com.tencent.mm.ui.fk.a(finderFixedTextView2);
                                                                                            java.lang.Object systemService = context.getSystemService("window");
                                                                                            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                                                                                            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                                                                                            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
                                                                                            if (defaultDisplay != null) {
                                                                                                defaultDisplay.getMetrics(displayMetrics);
                                                                                            }
                                                                                            finderFixedTextView2.setTextSize(1, (10.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
                                                                                            dq4.c cVar = dq4.c.f242369a;
                                                                                            cVar.f(finderFixedTextView2);
                                                                                            cVar.f(mMPAGView2);
                                                                                            return;
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
                                                    throw new java.lang.NullPointerException("Missing required view with ID: ".concat(a28.getResources().getResourceName(i18)));
                                                }
                                            }
                                            i17 = i28;
                                        }
                                    }
                                } else {
                                    i27 = com.tencent.mm.R.id.iy7;
                                }
                            }
                            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(a18.getResources().getResourceName(i27)));
                        }
                        i17 = i19;
                    } else {
                        i18 = com.tencent.mm.R.id.f484710f84;
                    }
                }
            }
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(a17.getResources().getResourceName(i18)));
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    private final android.widget.TextView getMicHeartText() {
        android.view.ViewGroup T;
        if (!this.M) {
            return this.N.f262181d;
        }
        lj2.v0 pluginAbility = getPluginAbility();
        if (pluginAbility == null || (T = pluginAbility.T()) == null) {
            return null;
        }
        return (android.widget.TextView) T.findViewById(com.tencent.mm.R.id.fa_);
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
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationStart");
        this.N.f262187j.setVisibility(8);
    }

    @Override // lj2.u0
    public void b(boolean z17, boolean z18) {
        if (this.f408386J != z17 || z18) {
            setAudioMode(z17);
            com.tencent.mars.xlog.Log.i(getTAG(), "notifyAnchorAudioModeChange " + z17 + " isForce: " + z18);
            pm0.v.X(new sj2.d(this, z17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0056  */
    @Override // sj2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b0(boolean r15) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj2.f.b0(boolean):void");
    }

    public final void c0(boolean z17) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.uo1 liveDesc;
        kotlinx.coroutines.flow.j2 j2Var;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4;
        r45.uo1 liveDesc2;
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAudioMode isAudioMode:");
        sb6.append(z17);
        sb6.append(" business(LiveCommonSlice::class.java).audioModeHolderBm:");
        sb6.append(getPluginAbility().a0().f());
        sb6.append(" liveDesc.cover:");
        com.tencent.mm.protocal.protobuf.FinderObject z18 = getPluginAbility().a0().z();
        java.lang.String str2 = null;
        sb6.append((z18 == null || (objectDesc4 = z18.getObjectDesc()) == null || (liveDesc2 = objectDesc4.getLiveDesc()) == null) ? null : liveDesc2.getString(0));
        sb6.append(" media.url:");
        com.tencent.mm.protocal.protobuf.FinderObject z19 = getPluginAbility().a0().z();
        sb6.append((z19 == null || (objectDesc3 = z19.getObjectDesc()) == null || (media2 = objectDesc3.getMedia()) == null || (finderMedia2 = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media2)) == null) ? null : finderMedia2.getUrl());
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        boolean D = D();
        fg2.o0 o0Var = this.N;
        if (D) {
            o0Var.f262184g.setVisibility(4);
            return;
        }
        if (zl2.r4.f473950a.x1()) {
            if (!z17) {
                o0Var.f262184g.setVisibility(4);
                return;
            }
            lj2.t0 a07 = getPluginAbility().a0();
            mm2.g1 g1Var = (mm2.g1) dk2.ef.f233372a.i(mm2.g1.class);
            if (g1Var != null && (j2Var = g1Var.f329075p) != null) {
                str2 = (java.lang.String) ((kotlinx.coroutines.flow.h3) j2Var).getValue();
            }
            pm0.v.X(new sj2.c(this, a07.C(str2)));
            return;
        }
        if (!z17) {
            o0Var.f262184g.setVisibility(4);
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderObject z27 = getPluginAbility().a0().z();
        if (z27 != null && (objectDesc2 = z27.getObjectDesc()) != null && (liveDesc = objectDesc2.getLiveDesc()) != null) {
            str2 = liveDesc.getString(0);
        }
        if (str2 == null || str2.length() == 0) {
            com.tencent.mm.protocal.protobuf.FinderObject z28 = getPluginAbility().a0().z();
            if (z28 == null || (objectDesc = z28.getObjectDesc()) == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null || (str = finderMedia.getUrl()) == null) {
                str = "";
            }
            str2 = str;
        }
        pm0.v.X(new sj2.c(this, getPluginAbility().a0().C(str2)));
    }

    @Override // sj2.m
    public void d() {
        com.tencent.mars.xlog.Log.i(getTAG(), "onGiftAnimationEnd");
        this.N.f262187j.setVisibility(0);
    }

    @Override // lj2.u0
    public void e() {
        S(getMicHeartText());
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
        android.widget.RelativeLayout relativeLayout = this.N.f262182e.f262062a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public android.view.ViewGroup getLotteryBubbleRootView() {
        return this.N.f262179b.f262384a;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public android.view.ViewGroup getLuckyMoneyRootView() {
        android.widget.RelativeLayout relativeLayout = this.N.f262180c.f261945a;
        kotlin.jvm.internal.o.f(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    @Override // sj2.i
    public com.tencent.mm.ui.widget.RoundCornerConstraintLayout getRoundCornerConstraintLayout() {
        com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = this.N.f262178a;
        kotlin.jvm.internal.o.f(roundCornerConstraintLayout, "getRoot(...)");
        return roundCornerConstraintLayout;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "FocusAnchorCoverWidget";
    }

    @Override // sj2.i, wj2.w, lj2.u0
    public android.view.ViewGroup getVoteBubbleRootView() {
        return this.N.f262183f.f262395a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.N.f262178a.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            if (!this.M || E()) {
                J();
                return;
            } else {
                a0();
                return;
            }
        }
        android.widget.TextView micHeartText = getMicHeartText();
        if (kotlin.jvm.internal.o.b(valueOf, micHeartText != null ? java.lang.Integer.valueOf(micHeartText.getId()) : null)) {
            android.widget.TextView micHeartText2 = getMicHeartText();
            boolean z17 = false;
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
}
