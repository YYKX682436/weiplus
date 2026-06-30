package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class o0 extends android.widget.LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f122379o = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f122380d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f122381e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f122382f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f122383g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ProgressBar f122384h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f122385i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f122386m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f122387n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o0(android.content.Context r2, boolean r3, android.util.AttributeSet r4, int r5, int r6, kotlin.jvm.internal.i r7) {
        /*
            r1 = this;
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto L6
            r4 = r0
        L6:
            r6 = r6 & 8
            if (r6 == 0) goto Lb
            r5 = 0
        Lb:
            java.lang.String r6 = "context"
            kotlin.jvm.internal.o.g(r2, r6)
            r1.<init>(r2, r4, r5)
            r1.f122380d = r2
            r1.f122381e = r3
            android.view.LayoutInflater r2 = com.tencent.mm.ui.id.b(r2)
            r3 = 2131496543(0x7f0c0e5f, float:1.8616654E38)
            android.view.View r2 = r2.inflate(r3, r0)
            if (r2 == 0) goto L2e
            r3 = 2131311532(0x7f093bac, float:1.8241407E38)
            android.view.View r3 = r2.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.mm.ui.widget.imageview.WeImageView) r3
            goto L2f
        L2e:
            r3 = r0
        L2f:
            r1.f122382f = r3
            if (r2 == 0) goto L3d
            r3 = 2131311534(0x7f093bae, float:1.824141E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            goto L3e
        L3d:
            r3 = r0
        L3e:
            r1.f122383g = r3
            if (r2 == 0) goto L4c
            r3 = 2131311533(0x7f093bad, float:1.8241409E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            goto L4d
        L4c:
            r3 = r0
        L4d:
            r1.f122384h = r3
            if (r2 == 0) goto L5b
            r3 = 2131307939(0x7f092da3, float:1.823412E38)
            android.view.View r2 = r2.findViewById(r3)
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L5b:
            r1.f122385i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.playlist.o0.<init>(android.content.Context, boolean, android.util.AttributeSet, int, int, kotlin.jvm.internal.i):void");
    }

    public static final void a(com.tencent.mm.plugin.finder.playlist.o0 o0Var) {
        o0Var.getClass();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(o0Var);
        hc2.v0.d(o0Var, "last_time_view", "view_clk", false, o0Var.getReportSdkFeedInfo(), null, 20, null);
    }

    private final java.util.Map<java.lang.String, java.lang.Object> getReportSdkFeedInfo() {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        lz5.m mVar = new lz5.m();
        com.tencent.mm.plugin.finder.playlist.c2 c2Var = ((cq.k) c17).f221227h;
        java.lang.Long l17 = c2Var.f122277b;
        mVar.put("feed_id", pm0.v.u(l17 != null ? l17.longValue() : 0L));
        if (c2Var.f122276a != null) {
            mVar.put("comment_scene", java.lang.Integer.valueOf(this.f122381e ? yc1.p.CTRL_INDEX : yc1.a0.CTRL_INDEX));
            return mVar;
        }
        kz5.b1.b(mVar);
        return null;
    }

    private final void setIconDirection(boolean z17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f122382f;
        if (weImageView == null) {
            return;
        }
        weImageView.setRotation(z17 ? 0.0f : 180.0f);
    }

    private final void setLastWatchedCount(int i17) {
        android.widget.TextView textView = this.f122383g;
        if (textView == null) {
            return;
        }
        textView.setText(this.f122380d.getResources().getString(com.tencent.mm.R.string.o0n, java.lang.Integer.valueOf(i17)));
    }

    public final void b(boolean z17) {
        this.f122386m = z17;
        android.widget.ProgressBar progressBar = this.f122384h;
        if (progressBar != null) {
            progressBar.setVisibility(z17 ? 0 : 8);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f122382f;
        if (weImageView == null) {
            return;
        }
        weImageView.setVisibility(z17 ? 8 : 0);
    }

    public final void c(boolean z17) {
        android.view.animation.TranslateAnimation translateAnimation;
        if (z17) {
            translateAnimation = new android.view.animation.TranslateAnimation(getRealRootView() != null ? r1.getWidth() : 0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            translateAnimation = new android.view.animation.TranslateAnimation(0.0f, getRealRootView() != null ? r1.getWidth() : 0.0f, 0.0f, 0.0f);
        }
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(this.f122380d, android.R.anim.accelerate_interpolator));
        translateAnimation.setAnimationListener(new com.tencent.mm.plugin.finder.playlist.n0(this));
        android.view.View realRootView = getRealRootView();
        if (realRootView != null) {
            realRootView.startAnimation(translateAnimation);
        }
    }

    public final void d(java.lang.Integer num, java.lang.Boolean bool, java.lang.Integer num2) {
        if (num2 != null) {
            android.view.View realRootView = getRealRootView();
            if (realRootView == null) {
                return;
            }
            int intValue = num2.intValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(realRootView, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerLittleTongue", "updateData", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            realRootView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(realRootView, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerLittleTongue", "updateData", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f122387n) {
            return;
        }
        if (num == null || bool == null) {
            android.view.View realRootView2 = getRealRootView();
            if (realRootView2 != null && realRootView2.getVisibility() == 0) {
                c(false);
                android.view.View realRootView3 = getRealRootView();
                if (realRootView3 == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(realRootView3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerLittleTongue", "updateData", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                realRootView3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(realRootView3, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerLittleTongue", "updateData", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        setIconDirection(bool.booleanValue());
        setLastWatchedCount(num.intValue());
        android.view.View realRootView4 = getRealRootView();
        if (realRootView4 != null && realRootView4.getVisibility() == 4) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(this);
            hc2.v0.d(this, "last_time_view", "view_exp", false, getReportSdkFeedInfo(), null, 20, null);
            android.view.View realRootView5 = getRealRootView();
            if (realRootView5 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(realRootView5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerLittleTongue", "updateData", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                realRootView5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(realRootView5, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerLittleTongue", "updateData", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            c(true);
        }
    }

    public final android.view.View getRealRootView() {
        return this.f122385i;
    }

    public final void setClickListener(yz5.a listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        android.view.View realRootView = getRealRootView();
        if (realRootView != null) {
            realRootView.setOnClickListener(new com.tencent.mm.plugin.finder.playlist.m0(listener, this));
        }
    }
}
