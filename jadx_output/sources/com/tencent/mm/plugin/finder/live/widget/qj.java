package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget f119529d;

    public qj(com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget finderLiveFinderDetailWidget) {
        this.f119529d = finderLiveFinderDetailWidget;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009a A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #0 {Exception -> 0x0072, blocks: (B:10:0x0038, B:12:0x006a, B:15:0x0076, B:17:0x009a), top: B:9:0x0038 }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFinderDetailWidget$setupNoticeRowClick$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r12)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r11
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget r12 = r11.f119529d
            android.content.Context r0 = r12.getContext()
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L28
            android.app.Activity r0 = (android.app.Activity) r0
            goto L29
        L28:
            r0 = 0
        L29:
            r2 = r0
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r7 = "onClick"
            java.lang.String r8 = "android/view/View$OnClickListener"
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFinderDetailWidget$setupNoticeRowClick$1"
            if (r2 != 0) goto L38
            yj0.a.h(r11, r9, r8, r7, r0)
            return
        L38:
            cl0.g r1 = new cl0.g     // Catch: java.lang.Exception -> L72
            r1.<init>()     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "source_type"
            r4 = 109(0x6d, float:1.53E-43)
            r1.o(r3, r4)     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "notice_type"
            r5 = 1
            r1.o(r3, r5)     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "pull_source"
            int r5 = r12.f117633w     // Catch: java.lang.Exception -> L72
            r1.o(r3, r5)     // Catch: java.lang.Exception -> L72
            cl0.g r3 = new cl0.g     // Catch: java.lang.Exception -> L72
            r3.<init>()     // Catch: java.lang.Exception -> L72
            java.lang.String r5 = "clientInfo"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L72
            r3.h(r5, r1)     // Catch: java.lang.Exception -> L72
            cl0.g r1 = new cl0.g     // Catch: java.lang.Exception -> L72
            r1.<init>()     // Catch: java.lang.Exception -> L72
            java.lang.String r5 = "noticeId"
            r45.h32 r6 = r12.f117631u     // Catch: java.lang.Exception -> L72
            if (r6 == 0) goto L74
            r10 = 4
            java.lang.String r6 = r6.getString(r10)     // Catch: java.lang.Exception -> L72
            if (r6 != 0) goto L76
            goto L74
        L72:
            r1 = move-exception
            goto La5
        L74:
            java.lang.String r6 = ""
        L76:
            r1.h(r5, r6)     // Catch: java.lang.Exception -> L72
            java.lang.String r5 = "scene"
            r1.o(r5, r4)     // Catch: java.lang.Exception -> L72
            java.lang.String r4 = "noticeBusinessDic"
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L72
            r1.h(r4, r3)     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Exception -> L72
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.o.f(r3, r1)     // Catch: java.lang.Exception -> L72
            java.lang.Class<zy2.b6> r1 = zy2.b6.class
            i95.m r1 = i95.n0.c(r1)     // Catch: java.lang.Exception -> L72
            zy2.b6 r1 = (zy2.b6) r1     // Catch: java.lang.Exception -> L72
            if (r1 == 0) goto Laf
            com.tencent.mm.plugin.finder.live.widget.oj r4 = com.tencent.mm.plugin.finder.live.widget.oj.f119305a     // Catch: java.lang.Exception -> L72
            com.tencent.mm.plugin.finder.live.widget.pj r5 = com.tencent.mm.plugin.finder.live.widget.pj.f119387a     // Catch: java.lang.Exception -> L72
            r6 = 0
            c61.l7 r1 = (c61.l7) r1     // Catch: java.lang.Exception -> L72
            r1.Zk(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L72
            goto Laf
        La5:
            java.lang.String r12 = r12.f117617d
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "reserveChannelsLive exception"
            com.tencent.mars.xlog.Log.printErrStackTrace(r12, r1, r3, r2)
        Laf:
            yj0.a.h(r11, r9, r8, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.qj.onClick(android.view.View):void");
    }
}
