package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ad extends com.tencent.mm.plugin.finder.live.plugin.h {
    public int A;
    public boolean B;
    public int C;
    public com.tencent.mm.view.LazyPlayPAGView D;
    public android.graphics.drawable.Drawable E;
    public final jz5.g F;
    public final jz5.g G;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f111860p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f111861q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f111862r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f111863s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f111864t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f111865u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f111866v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f111867w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f111868x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f111869y;

    /* renamed from: z, reason: collision with root package name */
    public r45.q84 f111870z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ad(android.view.ViewGroup r1, qo0.c r2, r45.qt2 r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r4 = "root"
            kotlin.jvm.internal.o.g(r1, r4)
            java.lang.String r4 = "statusMonitor"
            kotlin.jvm.internal.o.g(r2, r4)
            r0.<init>(r1, r2, r3)
            r0.f111860p = r2
            com.tencent.mm.plugin.finder.live.plugin.qc r1 = new com.tencent.mm.plugin.finder.live.plugin.qc
            r1.<init>(r0)
            jz5.g r1 = jz5.h.b(r1)
            r0.F = r1
            com.tencent.mm.plugin.finder.live.plugin.wc r1 = new com.tencent.mm.plugin.finder.live.plugin.wc
            r1.<init>(r0)
            jz5.g r1 = jz5.h.b(r1)
            r0.G = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ad.<init>(android.view.ViewGroup, qo0.c, r45.qt2, int, kotlin.jvm.internal.i):void");
    }

    public static final void C1(com.tencent.mm.plugin.finder.live.plugin.ad adVar, boolean z17) {
        android.widget.TextView textView = adVar.f111864t;
        if (textView == null || kotlin.jvm.internal.o.b(textView.getTag(), java.lang.Boolean.valueOf(z17))) {
            return;
        }
        android.view.ViewGroup viewGroup = adVar.f365323d;
        if (z17) {
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            com.tencent.mm.ui.bk.t0(textView.getPaint());
        }
        textView.setTag(java.lang.Boolean.valueOf(z17));
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.ad adVar) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.view.ViewGroup.LayoutParams layoutParams3;
        android.view.View view = adVar.f111868x;
        if (view != null) {
            com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView = adVar.D;
            if (lazyPlayPAGView != null && (layoutParams3 = lazyPlayPAGView.getLayoutParams()) != null) {
                layoutParams3.width = view.getMeasuredWidth() + gm2.c1.f273320a.g();
            }
            com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView2 = adVar.D;
            if (lazyPlayPAGView2 != null) {
                lazyPlayPAGView2.requestLayout();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showFreeTimeOverWarning costInnerContainer size:");
            sb6.append(view.getMeasuredWidth());
            sb6.append('-');
            sb6.append(view.getMeasuredHeight());
            sb6.append(",freeTimeOverPag:");
            com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView3 = adVar.D;
            java.lang.Integer num = null;
            sb6.append((lazyPlayPAGView3 == null || (layoutParams2 = lazyPlayPAGView3.getLayoutParams()) == null) ? null : java.lang.Integer.valueOf(layoutParams2.width));
            sb6.append('-');
            com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView4 = adVar.D;
            if (lazyPlayPAGView4 != null && (layoutParams = lazyPlayPAGView4.getLayoutParams()) != null) {
                num = java.lang.Integer.valueOf(layoutParams.height);
            }
            sb6.append(num);
            sb6.append('!');
            com.tencent.mars.xlog.Log.i("FinderLiveChargePayLazyPlugin", sb6.toString());
        }
    }

    public static final void u1(com.tencent.mm.plugin.finder.live.plugin.ad adVar) {
        r45.o52 P6 = ((mm2.g0) adVar.P0(mm2.g0.class)).P6();
        if (P6 != null && P6.getInteger(0) == 2) {
            com.tencent.mm.plugin.finder.live.plugin.ld.b(adVar, true);
            return;
        }
        long j17 = ((mm2.e1) adVar.P0(mm2.e1.class)).f328988r.getLong(0);
        com.tencent.mars.xlog.Log.i("FinderLiveChargePayPluginEx", "#payForLiveV2 liveId=" + j17);
        com.tencent.mm.plugin.finder.live.util.y.m(adVar, null, null, new com.tencent.mm.plugin.finder.live.plugin.kd(adVar, j17, null), 3, null);
    }

    public static void z1(com.tencent.mm.plugin.finder.live.plugin.ad adVar, r45.q84 freeTimeInfo, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 2) != 0 ? true : z17;
        boolean z27 = (i17 & 4) != 0 ? false : z18;
        adVar.getClass();
        kotlin.jvm.internal.o.g(freeTimeInfo, "freeTimeInfo");
        boolean x07 = adVar.x0();
        adVar.f111870z = freeTimeInfo;
        r45.o52 P6 = ((mm2.g0) adVar.P0(mm2.g0.class)).P6();
        adVar.A = P6 != null ? P6.getInteger(4) : 0;
        android.view.ViewGroup viewGroup = adVar.f365323d;
        adVar.f111861q = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.hkq);
        adVar.f111862r = viewGroup.findViewById(com.tencent.mm.R.id.f483609bf0);
        adVar.f111863s = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.bfk);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485058ge3);
        d92.f fVar = d92.f.f227470a;
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 15.0f, 0.0f, 8, null);
        adVar.f111864t = textView;
        adVar.f111865u = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.f483614bf5);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.bf6);
        android.content.Context context2 = textView2.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        d92.f.a(fVar, context2, textView2, 15.0f, 0.0f, 8, null);
        adVar.f111866v = textView2;
        hc2.o.a(textView2, false);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.f483613bf4);
        adVar.f111867w = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.sc(adVar));
        }
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.bf8);
        android.content.Context context3 = textView3.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        d92.f.a(fVar, context3, textView3, 15.0f, 0.0f, 8, null);
        adVar.f111869y = textView3;
        adVar.f111868x = viewGroup.findViewById(com.tencent.mm.R.id.bf7);
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView = (com.tencent.mm.view.LazyPlayPAGView) viewGroup.findViewById(com.tencent.mm.R.id.o7r);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        lazyPlayPAGView.o(ae2.in.f3688a.a(ym5.f6.B));
        com.tencent.mm.plugin.finder.live.util.y.m(adVar, null, null, new com.tencent.mm.plugin.finder.live.plugin.tc(lazyPlayPAGView, null), 3, null);
        lazyPlayPAGView.setRepeatCount(0);
        if (!x07) {
            lazyPlayPAGView.setScaleMode(1);
        }
        adVar.D = lazyPlayPAGView;
        if (mm2.g0.R6((mm2.g0) adVar.P0(mm2.g0.class), null, 1, null) && !x07) {
            com.tencent.mm.plugin.finder.live.util.y.m(adVar, null, null, new com.tencent.mm.plugin.finder.live.plugin.uc(adVar, null), 3, null);
        } else if (!x07) {
            android.widget.TextView textView4 = adVar.f111864t;
            if (textView4 != null) {
                textView4.setTextSize(15.0f);
            }
            android.widget.TextView textView5 = adVar.f111864t;
            if (textView5 != null) {
                textView5.setAlpha(1.0f);
            }
            android.widget.TextView textView6 = adVar.f111863s;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            android.view.View view = adVar.f111862r;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin", "initView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin", "initView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        adVar.x1(true);
        adVar.A1(false, false);
        adVar.B1();
        if (z27 && x07) {
            zl2.r4.f473950a.e(adVar, false);
        }
        if (z19) {
            viewGroup.setAlpha(0.0f);
            viewGroup.animate().alpha(1.0f).start();
        }
        adVar.K0(0);
        android.view.ViewGroup viewGroup3 = adVar.f111867w;
        boolean z28 = ((mm2.c1) adVar.P0(mm2.c1.class)).f328801f2 == 2;
        long j17 = ((mm2.e1) adVar.P0(mm2.e1.class)).f328983m;
        if (viewGroup3 != null) {
            ym5.a1.h(viewGroup3, new ml2.y0(z28, j17));
        }
        com.tencent.mars.xlog.Log.i("FinderLiveChargePayLazyPlugin", "show freeTomeToWatch:" + cm2.a.f43328a.r(freeTimeInfo) + ",isLandscape:" + x07 + ",purchasePrice:" + adVar.A);
    }

    public final void A1(boolean z17, boolean z18) {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view;
        android.widget.TextView textView = this.f111866v;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(this.A));
        }
        if (z17) {
            android.view.View view2 = this.f111868x;
            if (view2 != null) {
                if (!(this.C != 3)) {
                    view2 = null;
                }
                if (view2 != null) {
                    D1(3);
                    y1(false);
                    if (x0()) {
                        B1();
                    } else {
                        android.view.View view3 = this.f111868x;
                        java.lang.Object tag = view3 != null ? view3.getTag() : null;
                        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
                        com.tencent.mars.xlog.Log.i("FinderLiveChargePayLazyPlugin", "foldCostLayout layoutFolded:" + bool + '!');
                        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                        if (!kotlin.jvm.internal.o.b(bool, bool2) && (view = this.f111868x) != null) {
                            int width = view.getWidth();
                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f111865u;
                            int width2 = width - (weImageView != null ? weImageView.getWidth() : 0);
                            android.widget.TextView textView2 = this.f111866v;
                            int width3 = width2 - (textView2 != null ? textView2.getWidth() : 0);
                            zl2.q4 q4Var = zl2.q4.f473933a;
                            zl2.q4.k(q4Var, view, width, width3, 150L, null, 16, null);
                            view.setTag(bool2);
                            com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView = this.D;
                            if (lazyPlayPAGView != null) {
                                gm2.c1 c1Var = gm2.c1.f273320a;
                                zl2.q4.k(q4Var, lazyPlayPAGView, width + c1Var.g(), width3 + c1Var.g(), 150L, null, 16, null);
                            }
                        }
                    }
                    view2.postDelayed((java.lang.Runnable) ((jz5.n) this.G).getValue(), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                    ml2.z0.f328330a.c(true, ((mm2.c1) P0(mm2.c1.class)).f328801f2 == 2, ((mm2.e1) P0(mm2.e1.class)).f328983m);
                    return;
                }
                return;
            }
            return;
        }
        int w17 = w1();
        android.view.ViewGroup viewGroup = this.f365323d;
        if (w17 <= 0 && !mm2.g0.R6((mm2.g0) P0(mm2.g0.class), null, 1, null)) {
            if (z18) {
                D1(2);
                y1(true);
                if (x0()) {
                    B1();
                    return;
                } else {
                    viewGroup.post(new com.tencent.mm.plugin.finder.live.plugin.yc(this));
                    return;
                }
            }
            if (this.C != 3) {
                D1(2);
            }
            android.view.View view4 = this.f111868x;
            if (view4 != null) {
                view4.postDelayed(new com.tencent.mm.plugin.finder.live.plugin.zc(this, view4), 100L);
                return;
            }
            return;
        }
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView2 = this.D;
        if (lazyPlayPAGView2 != null && lazyPlayPAGView2.f()) {
            r4 = true;
        }
        if (r4) {
            com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView3 = this.D;
            if (lazyPlayPAGView3 != null) {
                lazyPlayPAGView3.n();
            }
            com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView4 = this.D;
            if (lazyPlayPAGView4 != null) {
                lazyPlayPAGView4.setVisibility(8);
            }
            android.view.View view5 = this.f111868x;
            if (view5 != null && (viewTreeObserver = view5.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener((com.tencent.mm.plugin.finder.live.plugin.pc) ((jz5.n) this.F).getValue());
            }
            if (x0()) {
                android.view.ViewGroup viewGroup2 = this.f111867w;
                if (viewGroup2 != null) {
                    android.graphics.drawable.Drawable drawable = this.E;
                    if (drawable == null) {
                        drawable = viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a1g);
                    }
                    viewGroup2.setBackground(drawable);
                }
            } else {
                android.view.View view6 = this.f111868x;
                if (view6 != null) {
                    android.graphics.drawable.Drawable drawable2 = this.E;
                    if (drawable2 == null) {
                        drawable2 = viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a1g);
                    }
                    view6.setBackground(drawable2);
                }
            }
        }
        if (!z18) {
            if (this.C != 3) {
                D1(1);
            }
        } else {
            D1(1);
            y1(true);
            if (x0()) {
                B1();
            } else {
                viewGroup.post(new com.tencent.mm.plugin.finder.live.plugin.yc(this));
            }
        }
    }

    public final void B1() {
        int integer;
        java.lang.String string;
        int integer2;
        java.lang.String string2;
        int w17 = w1();
        android.view.ViewGroup viewGroup = this.f365323d;
        if (w17 <= 0) {
            C1(this, true);
            if (mm2.g0.R6((mm2.g0) P0(mm2.g0.class), null, 1, null) || x0()) {
                android.widget.TextView textView = this.f111864t;
                if (textView == null) {
                    return;
                }
                textView.setVisibility(8);
                return;
            }
            android.widget.TextView textView2 = this.f111864t;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = this.f111864t;
            if (textView3 == null) {
                return;
            }
            textView3.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d8y));
            return;
        }
        if (w1() >= 60) {
            if (x0() && this.C == 3) {
                android.widget.TextView textView4 = this.f111864t;
                if (textView4 == null) {
                    return;
                }
                textView4.setVisibility(8);
                return;
            }
            C1(this, false);
            android.widget.TextView textView5 = this.f111864t;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            r45.td2 td2Var = ((mm2.g0) P0(mm2.g0.class)).f329066m;
            int integer3 = td2Var != null ? td2Var.getInteger(3) : 0;
            android.widget.TextView textView6 = this.f111864t;
            if (textView6 == null) {
                return;
            }
            if (integer3 > 0) {
                string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dfv, k35.m1.d(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dfs), integer3));
            } else {
                android.content.res.Resources resources = viewGroup.getContext().getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                ne2.c cVar = ne2.c.f336527a;
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                r45.q84 q84Var = this.f111870z;
                if (q84Var != null) {
                    integer = q84Var.getInteger(2);
                } else {
                    r45.td2 td2Var2 = ((mm2.g0) P0(mm2.g0.class)).f329066m;
                    integer = td2Var2 != null ? td2Var2.getInteger(1) : 0;
                }
                objArr[0] = cVar.b(context, integer);
                string = resources.getString(com.tencent.mm.R.string.dft, objArr);
            }
            textView6.setText(string);
            return;
        }
        if (x0() && this.C == 3) {
            android.widget.TextView textView7 = this.f111864t;
            if (textView7 == null) {
                return;
            }
            textView7.setVisibility(8);
            return;
        }
        C1(this, false);
        android.widget.TextView textView8 = this.f111864t;
        if (textView8 != null) {
            textView8.setVisibility(0);
        }
        r45.td2 td2Var3 = ((mm2.g0) P0(mm2.g0.class)).f329066m;
        int integer4 = td2Var3 != null ? td2Var3.getInteger(3) : 0;
        android.widget.TextView textView9 = this.f111864t;
        if (textView9 == null) {
            return;
        }
        if (integer4 > 0) {
            string2 = x0() ? viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dfv, k35.m1.d(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dfs), integer4)) : viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dfw, k35.m1.d(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dfs), integer4), java.lang.Integer.valueOf(w1()));
        } else if (x0()) {
            string2 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dfy, java.lang.Integer.valueOf(w1()));
        } else {
            android.content.res.Resources resources2 = viewGroup.getContext().getResources();
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            ne2.c cVar2 = ne2.c.f336527a;
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            r45.q84 q84Var2 = this.f111870z;
            if (q84Var2 != null) {
                integer2 = q84Var2.getInteger(2);
            } else {
                r45.td2 td2Var4 = ((mm2.g0) P0(mm2.g0.class)).f329066m;
                integer2 = td2Var4 != null ? td2Var4.getInteger(1) : 0;
            }
            objArr2[0] = cVar2.b(context2, integer2);
            objArr2[1] = java.lang.Integer.valueOf(w1());
            string2 = resources2.getString(com.tencent.mm.R.string.dfu, objArr2);
        }
        textView9.setText(string2);
    }

    public final void D1(int i17) {
        android.widget.TextView textView;
        this.C = i17;
        com.tencent.mars.xlog.Log.i("FinderLiveChargePayLazyPlugin", "update payStatus:" + i17);
        int i18 = this.C;
        android.view.ViewGroup viewGroup = this.f365323d;
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 == 3 && (textView = this.f111869y) != null) {
                    textView.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d9t));
                    return;
                }
                return;
            }
            android.widget.TextView textView2 = this.f111869y;
            if (textView2 == null) {
                return;
            }
            textView2.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d9r));
            return;
        }
        if (mm2.g0.R6((mm2.g0) P0(mm2.g0.class), null, 1, null)) {
            android.widget.TextView textView3 = this.f111869y;
            if (textView3 == null) {
                return;
            }
            textView3.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d9s));
            return;
        }
        android.widget.TextView textView4 = this.f111869y;
        if (textView4 == null) {
            return;
        }
        textView4.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d9r));
    }

    public final void E1(r45.q84 info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f111870z = info;
        ((mm2.g0) P0(mm2.g0.class)).f329067n = info.getInteger(1);
        if (this.B) {
            if (info.getInteger(1) <= 0 && !a1()) {
                x1(false);
                qo0.c.a(this.f111860p, qo0.b.X4, null, 2, null);
            }
            A1(false, false);
            B1();
            com.tencent.mars.xlog.Log.i("FinderLiveChargePayLazyPlugin", "updateTimer " + cm2.a.f43328a.r(info) + " finish:" + a1());
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        android.view.View view;
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view2 = this.f111868x;
        if (view2 != null) {
            view2.removeCallbacks((java.lang.Runnable) ((jz5.n) this.G).getValue());
        }
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView = this.D;
        if (lazyPlayPAGView != null) {
            lazyPlayPAGView.n();
        }
        if (this.D != null && (view = this.f111868x) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((com.tencent.mm.plugin.finder.live.plugin.pc) ((jz5.n) this.F).getValue());
        }
        com.tencent.mm.view.LazyPlayPAGView lazyPlayPAGView2 = this.D;
        if (lazyPlayPAGView2 == null) {
            return;
        }
        lazyPlayPAGView2.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 == 1 || ((mm2.c1) P0(mm2.c1.class)).f328801f2 == 2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void v1() {
        com.tencent.mars.xlog.Log.i("FinderLiveChargePayLazyPlugin", "finishCountDown freeTimeInfo:" + this.f111870z);
        r45.q84 q84Var = this.f111870z;
        if (q84Var != null) {
            E1(q84Var);
        }
    }

    public final int w1() {
        r45.q84 q84Var = this.f111870z;
        if (q84Var != null) {
            return q84Var.getInteger(1);
        }
        return 0;
    }

    public final void x1(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveChargePayLazyPlugin", "enableCountDown:" + z17);
        this.B = z17;
    }

    public final void y1(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f111865u;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            android.widget.TextView textView = this.f111866v;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f111865u;
        if (weImageView2 != null) {
            weImageView2.setVisibility(8);
        }
        android.widget.TextView textView2 = this.f111866v;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }
}
