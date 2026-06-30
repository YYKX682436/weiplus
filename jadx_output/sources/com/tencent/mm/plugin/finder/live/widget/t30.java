package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class t30 extends com.tencent.mm.plugin.finder.live.widget.c40 {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f119863t;

    /* renamed from: u, reason: collision with root package name */
    public fg2.u1 f119864u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t30(android.content.Context context, com.tencent.mm.plugin.finder.live.widget.d40 params) {
        super(context, params);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        this.f119863t = "FinderLiveVisitorMicReplayWidget";
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public java.lang.String A() {
        return this.f119863t;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public dk2.na B(r45.jt1 res) {
        kotlin.jvm.internal.o.g(res, "res");
        r45.gl4 gl4Var = (r45.gl4) res.getCustom(1);
        if (gl4Var == null) {
            com.tencent.mars.xlog.Log.e(this.f119863t, "micReplayInfo is null");
            return dk2.na.f233811m;
        }
        dk2.qf qfVar = this.f117956i;
        qfVar.getClass();
        java.util.List list = qfVar.G;
        list.clear();
        list.add(new dk2.rf(gl4Var));
        dk2.ma maVar = dk2.na.f233805d;
        r45.hl4 a17 = r45.hl4.a((int) gl4Var.getLong(2));
        if (a17 == null) {
            a17 = r45.hl4.kMicReplayFailed;
        }
        return maVar.a(a17);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public void C(dk2.na status) {
        kotlin.jvm.internal.o.g(status, "status");
        fg2.u1 u1Var = this.f119864u;
        if (u1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var.f262360f.setVisibility(0);
        fg2.u1 u1Var2 = this.f119864u;
        if (u1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var2.f262359e.setVisibility(8);
        fg2.u1 u1Var3 = this.f119864u;
        if (u1Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var3.f262364j.setVisibility(8);
        fg2.u1 u1Var4 = this.f119864u;
        if (u1Var4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var4.f262362h.setVisibility(8);
        fg2.u1 u1Var5 = this.f119864u;
        if (u1Var5 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var5.f262361g.setVisibility(8);
        int ordinal = status.ordinal();
        android.content.Context context = this.f118381d;
        switch (ordinal) {
            case 0:
            case 8:
                fg2.u1 u1Var6 = this.f119864u;
                if (u1Var6 != null) {
                    u1Var6.f262360f.setVisibility(4);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
            case 1:
                fg2.u1 u1Var7 = this.f119864u;
                if (u1Var7 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                u1Var7.f262359e.setVisibility(0);
                fg2.u1 u1Var8 = this.f119864u;
                if (u1Var8 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                u1Var8.f262359e.setText(context.getResources().getString(com.tencent.mm.R.string.f493741ov3));
                ml2.n4 n4Var = ml2.n4.U;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 49");
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
                return;
            case 2:
            case 5:
                fg2.u1 u1Var9 = this.f119864u;
                if (u1Var9 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                u1Var9.f262364j.setVisibility(0);
                fg2.u1 u1Var10 = this.f119864u;
                if (u1Var10 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                u1Var10.f262364j.setText(context.getResources().getString(com.tencent.mm.R.string.f493743ov5));
                return;
            case 3:
                fg2.u1 u1Var11 = this.f119864u;
                if (u1Var11 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                u1Var11.f262364j.setVisibility(0);
                fg2.u1 u1Var12 = this.f119864u;
                if (u1Var12 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                u1Var12.f262364j.setText(context.getResources().getString(com.tencent.mm.R.string.ov9));
                ml2.n4 n4Var2 = ml2.n4.W;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 51");
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
                return;
            case 4:
                fg2.u1 u1Var13 = this.f119864u;
                if (u1Var13 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                u1Var13.f262364j.setVisibility(0);
                fg2.u1 u1Var14 = this.f119864u;
                if (u1Var14 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                u1Var14.f262362h.setVisibility(0);
                fg2.u1 u1Var15 = this.f119864u;
                if (u1Var15 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                u1Var15.f262364j.setText(context.getResources().getString(com.tencent.mm.R.string.ov8));
                ml2.n4 n4Var3 = ml2.n4.X;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 52");
                i95.m c19 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ml2.r0.ik((ml2.r0) c19, n4Var3, null, 0, 6, null);
                return;
            case 6:
                fg2.u1 u1Var16 = this.f119864u;
                if (u1Var16 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                u1Var16.f262364j.setVisibility(0);
                fg2.u1 u1Var17 = this.f119864u;
                if (u1Var17 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                u1Var17.f262364j.setText(context.getResources().getString(com.tencent.mm.R.string.f493742ov4));
                return;
            case 7:
                fg2.u1 u1Var18 = this.f119864u;
                if (u1Var18 != null) {
                    u1Var18.f262361g.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
            default:
                return;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public void G() {
        fg2.u1 u1Var = this.f119864u;
        if (u1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var.f262379y.setVisibility(8);
        fg2.u1 u1Var2 = this.f119864u;
        if (u1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var2.f262357c.setVisibility(8);
        fg2.u1 u1Var3 = this.f119864u;
        if (u1Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var3.f262360f.setVisibility(8);
        fg2.u1 u1Var4 = this.f119864u;
        if (u1Var4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var4.f262368n.setVisibility(0);
        fg2.u1 u1Var5 = this.f119864u;
        if (u1Var5 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var5.f262369o.setVisibility(0);
        fg2.u1 u1Var6 = this.f119864u;
        if (u1Var6 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var6.f262370p.setVisibility(0);
        fg2.u1 u1Var7 = this.f119864u;
        if (u1Var7 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var7.f262358d.setVisibility(8);
        dk2.qf qfVar = this.f117956i;
        int i17 = qfVar.B;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (i17 == 3) {
            fg2.u1 u1Var8 = this.f119864u;
            if (u1Var8 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            u1Var8.f262377w.setVisibility(0);
            fg2.u1 u1Var9 = this.f119864u;
            if (u1Var9 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            u1Var9.f262378x.setVisibility(8);
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(qfVar.A, null, 2, null);
            fg2.u1 u1Var10 = this.f119864u;
            if (u1Var10 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            com.tencent.mm.ui.widget.MMRoundCornerImageView finderLiveVisitorMicReplaySelfAvatarIconCircle = u1Var10.f262376v;
            kotlin.jvm.internal.o.f(finderLiveVisitorMicReplaySelfAvatarIconCircle, "finderLiveVisitorMicReplaySelfAvatarIconCircle");
            a17.c(nVar, finderLiveVisitorMicReplaySelfAvatarIconCircle, g1Var.h(mn2.f1.f329957h));
        } else {
            fg2.u1 u1Var11 = this.f119864u;
            if (u1Var11 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            u1Var11.f262377w.setVisibility(8);
            fg2.u1 u1Var12 = this.f119864u;
            if (u1Var12 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            u1Var12.f262378x.setVisibility(0);
            vo0.d l17 = g1Var.l();
            mn2.n nVar2 = new mn2.n(qfVar.A, null, 2, null);
            fg2.u1 u1Var13 = this.f119864u;
            if (u1Var13 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            com.tencent.mm.ui.widget.MMRoundCornerImageView finderLiveVisitorMicReplaySelfAvatarIcon = u1Var13.f262375u;
            kotlin.jvm.internal.o.f(finderLiveVisitorMicReplaySelfAvatarIcon, "finderLiveVisitorMicReplaySelfAvatarIcon");
            l17.c(nVar2, finderLiveVisitorMicReplaySelfAvatarIcon, g1Var.h(mn2.f1.f329961o));
        }
        vo0.d a18 = g1Var.a();
        mn2.n nVar3 = new mn2.n(qfVar.D, null, 2, null);
        fg2.u1 u1Var14 = this.f119864u;
        if (u1Var14 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.ImageView finderLiveVisitorMicReplayAnchorAvatarIcon = u1Var14.f262356b;
        kotlin.jvm.internal.o.f(finderLiveVisitorMicReplayAnchorAvatarIcon, "finderLiveVisitorMicReplayAnchorAvatarIcon");
        a18.c(nVar3, finderLiveVisitorMicReplayAnchorAvatarIcon, g1Var.h(mn2.f1.f329957h));
        fg2.u1 u1Var15 = this.f119864u;
        if (u1Var15 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.content.res.Resources resources = this.f118381d.getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = qfVar.E;
        if (str == null) {
            str = " ";
        }
        objArr[0] = str;
        u1Var15.f262380z.setText(resources.getString(com.tencent.mm.R.string.ovh, objArr));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public void I() {
        fg2.u1 u1Var = this.f119864u;
        if (u1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var.f262369o.setVisibility(8);
        fg2.u1 u1Var2 = this.f119864u;
        if (u1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        u1Var2.f262370p.setVisibility(8);
        fg2.u1 u1Var3 = this.f119864u;
        if (u1Var3 != null) {
            u1Var3.f262358d.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.t30.K():void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.ecb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        fg2.u1 u1Var = this.f119864u;
        if (u1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        boolean b17 = kotlin.jvm.internal.o.b(view, u1Var.f262372r);
        java.lang.String str = this.f119863t;
        if (b17) {
            com.tencent.mars.xlog.Log.i(str, "onClick: my heat icon");
            fj2.s sVar = fj2.s.f263183a;
            sVar.b(ml2.n4.S);
            H();
            sVar.b(ml2.n4.T);
            return;
        }
        fg2.u1 u1Var2 = this.f119864u;
        if (u1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        if (kotlin.jvm.internal.o.b(view, u1Var2.f262363i)) {
            com.tencent.mars.xlog.Log.i(str, "onClick: gen status layout");
            dk2.qf qfVar = this.f117956i;
            dk2.na naVar = qfVar.f233986w;
            if (naVar == dk2.na.f233807f) {
                ml2.n4 n4Var = ml2.n4.V;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 50");
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
                E(true);
                J(dk2.na.f233813o);
                return;
            }
            if (naVar == dk2.na.f233810i) {
                ml2.n4 n4Var2 = ml2.n4.Y;
                com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 53");
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
                dk2.rf rfVar = (dk2.rf) kz5.n0.Z(qfVar.G);
                if (rfVar == null) {
                    com.tencent.mars.xlog.Log.e(str, "openFinderPostGallery: micReplayInfoList is empty");
                } else {
                    D(rfVar, t40.d.f415477e, 109);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.tpy;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.tencent.mm.R.id.tpy);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.f484847tq0;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.f484847tq0);
            if (linearLayout != null) {
                i17 = com.tencent.mm.R.id.f484848tq1;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f484848tq1);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.f484849tq2;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.f484849tq2);
                    if (textView2 != null) {
                        i17 = com.tencent.mm.R.id.f484850tq3;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.f484850tq3);
                        if (linearLayout2 != null) {
                            i17 = com.tencent.mm.R.id.f484851tq4;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.tencent.mm.R.id.f484851tq4);
                            if (frameLayout != null) {
                                i17 = com.tencent.mm.R.id.f484852tq5;
                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.f484852tq5);
                                if (weImageView != null) {
                                    i17 = com.tencent.mm.R.id.tq6;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tq6);
                                    if (linearLayout3 != null) {
                                        i17 = com.tencent.mm.R.id.tq7;
                                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tq7);
                                        if (textView3 != null) {
                                            i17 = com.tencent.mm.R.id.tq8;
                                            android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tq8);
                                            if (linearLayout4 != null) {
                                                i17 = com.tencent.mm.R.id.tq9;
                                                android.widget.Space space = (android.widget.Space) x4.b.a(rootView, com.tencent.mm.R.id.tq9);
                                                if (space != null) {
                                                    i17 = com.tencent.mm.R.id.tq_;
                                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tq_);
                                                    if (textView4 != null) {
                                                        i17 = com.tencent.mm.R.id.tqa;
                                                        android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tqa);
                                                        if (linearLayout5 != null) {
                                                            i17 = com.tencent.mm.R.id.tqb;
                                                            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(rootView, com.tencent.mm.R.id.tqb);
                                                            if (progressBar != null) {
                                                                i17 = com.tencent.mm.R.id.tqc;
                                                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tqc);
                                                                if (textView5 != null) {
                                                                    i17 = com.tencent.mm.R.id.tqd;
                                                                    android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tqd);
                                                                    if (linearLayout6 != null) {
                                                                        i17 = com.tencent.mm.R.id.tqe;
                                                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.tqe);
                                                                        if (weImageView2 != null) {
                                                                            i17 = com.tencent.mm.R.id.tqf;
                                                                            android.widget.Space space2 = (android.widget.Space) x4.b.a(rootView, com.tencent.mm.R.id.tqf);
                                                                            if (space2 != null) {
                                                                                i17 = com.tencent.mm.R.id.tqg;
                                                                                android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tqg);
                                                                                if (textView6 != null) {
                                                                                    i17 = com.tencent.mm.R.id.tqi;
                                                                                    com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) x4.b.a(rootView, com.tencent.mm.R.id.tqi);
                                                                                    if (mMRoundCornerImageView != null) {
                                                                                        i17 = com.tencent.mm.R.id.tqj;
                                                                                        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView2 = (com.tencent.mm.ui.widget.MMRoundCornerImageView) x4.b.a(rootView, com.tencent.mm.R.id.tqj);
                                                                                        if (mMRoundCornerImageView2 != null) {
                                                                                            i17 = com.tencent.mm.R.id.tqk;
                                                                                            com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout = (com.tencent.mm.ui.widget.RoundCornerLinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tqk);
                                                                                            if (roundCornerLinearLayout != null) {
                                                                                                i17 = com.tencent.mm.R.id.tql;
                                                                                                com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout2 = (com.tencent.mm.ui.widget.RoundCornerLinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tql);
                                                                                                if (roundCornerLinearLayout2 != null) {
                                                                                                    i17 = com.tencent.mm.R.id.tqm;
                                                                                                    android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tqm);
                                                                                                    if (textView7 != null) {
                                                                                                        i17 = com.tencent.mm.R.id.tqn;
                                                                                                        android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tqn);
                                                                                                        if (textView8 != null) {
                                                                                                            i17 = com.tencent.mm.R.id.tqo;
                                                                                                            android.widget.LinearLayout linearLayout7 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.tqo);
                                                                                                            if (linearLayout7 != null) {
                                                                                                                i17 = com.tencent.mm.R.id.tqp;
                                                                                                                android.widget.Space space3 = (android.widget.Space) x4.b.a(rootView, com.tencent.mm.R.id.tqp);
                                                                                                                if (space3 != null) {
                                                                                                                    i17 = com.tencent.mm.R.id.tqq;
                                                                                                                    android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.tqq);
                                                                                                                    if (textView9 != null) {
                                                                                                                        this.f119864u = new fg2.u1((android.widget.LinearLayout) rootView, imageView, linearLayout, textView, textView2, linearLayout2, frameLayout, weImageView, linearLayout3, textView3, linearLayout4, space, textView4, linearLayout5, progressBar, textView5, linearLayout6, weImageView2, space2, textView6, mMRoundCornerImageView, mMRoundCornerImageView2, roundCornerLinearLayout, roundCornerLinearLayout2, textView7, textView8, linearLayout7, space3, textView9);
                                                                                                                        weImageView2.setOnClickListener(this);
                                                                                                                        fg2.u1 u1Var = this.f119864u;
                                                                                                                        if (u1Var != null) {
                                                                                                                            u1Var.f262363i.setOnClickListener(this);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                            throw null;
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
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40, com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        ml2.n4 n4Var = ml2.n4.R;
        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 46");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public int y() {
        qs5.d dVar = qs5.d.f366426e;
        return 16;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.c40
    public long z() {
        return 0L;
    }
}
