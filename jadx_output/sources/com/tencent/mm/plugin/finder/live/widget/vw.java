package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vw implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView f120107d;

    public vw(com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView) {
        this.f120107d = finderLiveTaskBannerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r8 != 2) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$init$2"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r8)
            r4.add(r9)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r7
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            int r8 = r9.getAction()
            r9 = 0
            r0 = 1
            if (r8 == 0) goto L3f
            if (r8 == r0) goto L2c
            r1 = 2
            if (r8 == r1) goto L3f
            goto L5b
        L2c:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f120107d
            java.lang.String r8 = r8.f117681o
            java.lang.String r1 = "bannerRv action up"
            com.tencent.mars.xlog.Log.i(r8, r1)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f120107d
            r8.f117683q = r0
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f120107d
            r8.c()
            goto L5b
        L3f:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f120107d
            java.lang.String r8 = r8.f117681o
            java.lang.String r1 = "bannerRv action down"
            com.tencent.mars.xlog.Log.i(r8, r1)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f120107d
            boolean r8 = r8.f117683q
            if (r8 != r0) goto L5b
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f120107d
            r8.f117683q = r9
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f120107d
            com.tencent.mm.sdk.platformtools.n3 r0 = r8.f117684r
            int r8 = r8.f117679m
            r0.removeMessages(r8)
        L5b:
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$init$2"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = 0
            r2 = r7
            yj0.a.i(r1, r2, r3, r4, r5, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.vw.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
