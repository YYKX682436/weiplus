package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kn extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.hl f113289p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.rk f113290q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.jl f113291r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f113292s;

    /* renamed from: t, reason: collision with root package name */
    public ce2.i f113293t;

    /* renamed from: u, reason: collision with root package name */
    public kotlinx.coroutines.r2 f113294u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f113295v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113295v = new java.util.concurrent.ConcurrentLinkedQueue();
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f2t);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.hl hlVar = new com.tencent.mm.plugin.finder.live.widget.hl((com.tencent.mm.view.MMPAGView) findViewById, this);
        this.f113289p = hlVar;
        com.tencent.mm.plugin.finder.live.widget.rk rkVar = new com.tencent.mm.plugin.finder.live.widget.rk(this);
        this.f113290q = rkVar;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f0n);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.jl jlVar = new com.tencent.mm.plugin.finder.live.widget.jl(findViewById2, this);
        this.f113291r = jlVar;
        android.view.View view = jlVar.f118762a;
        view.getLayoutParams().height = ((int) (com.tencent.mm.ui.bl.b(view.getContext()).y * 0.16f)) + com.tencent.mm.ui.bl.c(view.getContext());
        view.setPadding(0, 0, 0, com.tencent.mm.ui.zk.a(view.getContext(), 48) + com.tencent.mm.ui.bl.c(view.getContext()));
        com.tencent.mm.plugin.finder.live.plugin.kn knVar = rkVar.f119653a;
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView O6 = je2.t.O6((je2.t) knVar.P0(je2.t.class), "FinderLiveGiftPlayMagicRewardWidget_init", knVar.f365323d, 0, null, 12, null);
        rkVar.f119654b = O6;
        if (O6 != null) {
            O6.setVisibility(8);
        }
        if (zl2.r4.f473950a.w1()) {
            com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView = rkVar.f119654b;
            if (magicRewardView != null) {
                magicRewardView.setOnClickListener(null);
            }
            com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView2 = rkVar.f119654b;
            if (magicRewardView2 != null) {
                magicRewardView2.setClickable(false);
            }
        } else {
            com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView3 = rkVar.f119654b;
            if (magicRewardView3 != null) {
                magicRewardView3.setWatchDispatchTouchEvent(new com.tencent.mm.plugin.finder.live.widget.mk(new java.lang.ref.WeakReference(rkVar)));
            }
        }
        ae2.in inVar = ae2.in.f3688a;
        inVar.k0();
        inVar.l0();
        inVar.m0();
        boolean w17 = zl2.r4.f473950a.w1();
        com.tencent.mm.view.MMPAGView mMPAGView = hlVar.f118573a;
        if (w17) {
            mMPAGView.setOnClickListener(null);
            mMPAGView.setClickable(false);
        } else {
            mMPAGView.setOnTouchListener(new com.tencent.mm.plugin.finder.live.widget.tk(hlVar));
        }
        mMPAGView.a(new com.tencent.mm.plugin.finder.live.widget.uk(hlVar));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPluginV1", "setVisible visible:" + i17);
        }
        if (((mm2.e0) P0(mm2.e0.class)).P6()) {
            super.K0(8);
        } else {
            super.K0(i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0064  */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.kn.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        kotlinx.coroutines.r2 r2Var;
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView;
        super.O0();
        kotlinx.coroutines.r2 r2Var2 = this.f113294u;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        com.tencent.mm.plugin.finder.live.widget.hl hlVar = this.f113289p;
        if (hlVar != null) {
            com.tencent.mm.view.MMPAGView mMPAGView = hlVar.f118573a;
            mMPAGView.setAlpha(1.0f);
            if (!zl2.r4.f473950a.w1()) {
                mMPAGView.setClickable(true);
            }
        }
        com.tencent.mm.plugin.finder.live.widget.rk rkVar = this.f113290q;
        if (rkVar != null) {
            if (!zl2.r4.f473950a.w1() && (magicRewardView = rkVar.f119654b) != null) {
                magicRewardView.setClickable(true);
            }
            it2.z zVar = ((je2.t) rkVar.f119653a.P0(je2.t.class)).f299266i;
            if (zVar != null) {
                zVar.b("FinderLiveGiftPlayMagicRewardWidget_unMount", kt2.c.f311971d);
            }
        }
        com.tencent.mm.plugin.finder.live.widget.jl jlVar = this.f113291r;
        if (jlVar != null) {
            android.view.View view = jlVar.f118762a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "unMount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "unMount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = jlVar.f118762a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "unMount", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "unMount", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.ViewPropertyAnimator viewPropertyAnimator = jlVar.f118764c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
        }
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var == null || (r2Var = a9Var.f229700z) == null) {
            return;
        }
        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1(java.lang.String source) {
        boolean z17;
        df2.t6 t6Var;
        kotlinx.coroutines.r2 r2Var;
        df2.s8 s8Var;
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPluginV1", source + " hide full screen gift, id:" + this.f113292s);
        K0(8);
        kotlinx.coroutines.r2 r2Var2 = this.f113294u;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        com.tencent.mm.plugin.finder.live.widget.hl hlVar = this.f113289p;
        if (hlVar != null) {
            hlVar.a();
        }
        com.tencent.mm.plugin.finder.live.widget.rk rkVar = this.f113290q;
        if (rkVar != null) {
            rkVar.a(source);
        }
        com.tencent.mm.plugin.finder.live.widget.jl jlVar = this.f113291r;
        if (jlVar != null) {
            android.view.View view = jlVar.f118762a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = jlVar.f118762a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.ViewPropertyAnimator viewPropertyAnimator = jlVar.f118764c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
        }
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var == null || (r2Var = a9Var.f229700z) == null) {
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPluginV1", "showFundingSucAnimJob isActive = " + r2Var.a());
            if (r2Var.a() && (s8Var = (df2.s8) U0(df2.s8.class)) != null) {
                s8Var.b7();
            }
            z17 = true;
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        if (!(in0.q.f292769b2 != null ? z17 : false) || (t6Var = (df2.t6) U0(df2.t6.class)) == null) {
            return;
        }
        t6Var.e7();
    }

    public final void u1() {
        com.tencent.mm.plugin.finder.live.widget.jl jlVar;
        if (zl2.r4.f473950a.w1() || (jlVar = this.f113291r) == null) {
            return;
        }
        boolean z17 = !gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GIFT_HIDE_TIP_GUIDE_BOOLEAN_SYNC, false);
        if (z17) {
            pm0.v.V(1000L, new com.tencent.mm.plugin.finder.live.widget.il(jlVar));
        }
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayTipsWidget", "tryShowHideTip showGiftTip:" + z17);
    }

    public final void v1() {
        com.tencent.mm.plugin.finder.live.widget.jl jlVar = this.f113291r;
        if (jlVar != null) {
            android.view.View view = jlVar.f118762a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideSingleGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideSingleGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = jlVar.f118762a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideSingleGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideSingleGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.ViewPropertyAnimator viewPropertyAnimator = jlVar.f118764c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GIFT_HIDE_TIP_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.finder.live.plugin.ap apVar = (com.tencent.mm.plugin.finder.live.plugin.ap) X0(com.tencent.mm.plugin.finder.live.plugin.ap.class);
        if (apVar != null) {
            apVar.R1(true);
        }
    }

    public final void w1(java.util.LinkedList linkedList, ce2.i iVar) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPluginV1", "start random gift animation, randomGifts:".concat(kz5.n0.g0(linkedList, null, null, null, 0, null, com.tencent.mm.plugin.finder.live.plugin.gn.f112716d, 31, null)));
        this.f113295v.addAll(linkedList);
        this.f113294u = com.tencent.mm.plugin.finder.live.util.y.m(this, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.plugin.hn(this, iVar, null), 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.dn(this, null), 3, null);
    }
}
