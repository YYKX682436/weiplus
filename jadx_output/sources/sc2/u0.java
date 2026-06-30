package sc2;

/* loaded from: classes2.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f406274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406275f;

    public u0(sc2.h1 h1Var, android.view.ViewGroup viewGroup, in5.s0 s0Var) {
        this.f406273d = h1Var;
        this.f406274e = viewGroup;
        this.f406275f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sc2.h1 h1Var = this.f406273d;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = h1Var.f405929x;
        boolean z17 = finderThumbPlayerProxy != null && finderThumbPlayerProxy.isPlaying();
        in5.s0 s0Var = this.f406275f;
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        if (z17) {
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = h1Var.f405929x;
            if (finderThumbPlayerProxy2 != null) {
                finderThumbPlayerProxy2.setShouldPlayResume(false);
            }
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy3 = h1Var.f405929x;
            if (finderThumbPlayerProxy3 != null) {
                finderThumbPlayerProxy3.setVideoViewFocused(false);
            }
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy4 = h1Var.f405929x;
            if (finderThumbPlayerProxy4 != null) {
                finderThumbPlayerProxy4.pause();
            }
            android.view.View view2 = h1Var.f405930x0;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$6$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$6$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            h1Var.F = true;
            com.tencent.mm.plugin.finder.report.d2.k(d2Var, this.f406274e, "ad_card", "video_pause", false, sc2.h1.H(h1Var, s0Var), null, 40, null);
        } else {
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy5 = h1Var.f405929x;
            if (finderThumbPlayerProxy5 != null) {
                finderThumbPlayerProxy5.setShouldPlayResume(true);
            }
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy6 = h1Var.f405929x;
            if (finderThumbPlayerProxy6 != null) {
                finderThumbPlayerProxy6.setVideoViewFocused(true);
            }
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy7 = h1Var.f405929x;
            if (finderThumbPlayerProxy7 != null) {
                finderThumbPlayerProxy7.play();
            }
            android.view.View view3 = h1Var.f405930x0;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$6$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$6$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            h1Var.F = false;
            com.tencent.mm.plugin.finder.report.d2.k(d2Var, this.f406274e, "ad_card", "video_play", false, sc2.h1.H(h1Var, s0Var), null, 40, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
