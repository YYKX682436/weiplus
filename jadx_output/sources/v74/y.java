package v74;

/* loaded from: classes4.dex */
public final class y implements androidx.recyclerview.widget.RecyclerView.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.k0 f433942d;

    public y(v74.k0 k0Var) {
        this.f433942d = k0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void R3(android.view.View view) {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChildViewAttachedToWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnChildAttachStateChangeListener$1");
        kotlin.jvm.internal.o.g(view, "view");
        v74.k0 k0Var = this.f433942d;
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView d17 = v74.k0.d(k0Var);
        int u07 = d17 != null ? d17.u0(view) : -1;
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView d18 = v74.k0.d(k0Var);
        boolean z17 = false;
        int itemCount = (d18 == null || (adapter = d18.getAdapter()) == null) ? 0 : adapter.getItemCount();
        view.hashCode();
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView d19 = v74.k0.d(k0Var);
        androidx.recyclerview.widget.k3 w07 = d19 != null ? d19.w0(view) : null;
        boolean b17 = v74.k0.b(k0Var);
        boolean z18 = w07 instanceof v74.b;
        v74.b bVar = z18 ? (v74.b) w07 : null;
        android.widget.ImageView j17 = bVar != null ? bVar.j() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setVideoStatusIconVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k0Var.n(j17, b17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setVideoStatusIconVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSplashVideoLogic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        v74.h1 h1Var = k0Var.f433854t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSplashVideoLogic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        if (h1Var != null && h1Var.b()) {
            z17 = true;
        }
        if (!z17 && u07 != -1 && u07 != itemCount - 1) {
            v74.k0.a(k0Var).i(u07);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsSmoothMode$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsSmoothMode$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        if (k0Var.f433846l) {
            v74.k0.E.f(z18 ? (v74.b) w07 : null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChildViewAttachedToWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnChildAttachStateChangeListener$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p3(android.view.View r10) {
        /*
            r9 = this;
            java.lang.String r0 = "onChildViewDetachedFromWindow"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnChildAttachStateChangeListener$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "view"
            kotlin.jvm.internal.o.g(r10, r2)
            v74.k0 r2 = r9.f433942d
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r3 = v74.k0.d(r2)
            r4 = 0
            if (r3 == 0) goto L1c
            androidx.recyclerview.widget.k3 r3 = r3.w0(r10)
            goto L1d
        L1c:
            r3 = r4
        L1d:
            boolean r5 = r3 instanceof v74.b
            if (r5 == 0) goto L24
            v74.b r3 = (v74.b) r3
            goto L25
        L24:
            r3 = r4
        L25:
            boolean r5 = v74.k0.b(r2)
            if (r3 == 0) goto L30
            android.widget.ImageView r6 = r3.j()
            goto L31
        L30:
            r6 = r4
        L31:
            java.lang.String r7 = "access$setVideoStatusIconVisibility"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            r2.n(r6, r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            if (r3 == 0) goto L45
            android.widget.FrameLayout r3 = r3.i()
            goto L46
        L45:
            r3 = r4
        L46:
            java.lang.String r5 = "getVideoViewInContainer"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            boolean r7 = a84.y0.e(r3)
            if (r7 == 0) goto L67
            if (r3 == 0) goto L5b
            r7 = 0
            android.view.View r3 = r3.getChildAt(r7)
            goto L5c
        L5b:
            r3 = r4
        L5c:
            boolean r7 = r3 instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView
            if (r7 == 0) goto L67
            r4 = r3
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r4 = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) r4
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            goto L6a
        L67:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        L6a:
            if (r4 != 0) goto L6d
            goto L71
        L6d:
            r3 = 0
            r4.setAlpha(r3)
        L71:
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r2 = v74.k0.d(r2)
            if (r2 == 0) goto L7a
            r2.u0(r10)
        L7a:
            r10.hashCode()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.y.p3(android.view.View):void");
    }
}
