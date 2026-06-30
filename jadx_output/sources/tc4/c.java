package tc4;

/* loaded from: classes4.dex */
public final class c extends tc4.v0 implements com.tencent.mm.plugin.sns.model.h0 {

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.FrameLayout f417298y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View f417299z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // tc4.d2
    public java.lang.Object E(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        return bool;
    }

    @Override // tc4.v0
    public android.view.View Q(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        android.view.View view = this.f417299z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // tc4.v0, tc4.i2, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            java.lang.String r0 = "onViewRecycled"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r7 instanceof tc4.b
            if (r2 == 0) goto L1b
            r2 = r7
            tc4.b r2 = (tc4.b) r2
            int r3 = r2.f417288g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f417288g = r3
            goto L20
        L1b:
            tc4.b r2 = new tc4.b
            r2.<init>(r6, r7)
        L20:
            java.lang.Object r7 = r2.f417286e
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f417288g
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L33
            java.lang.Object r2 = r2.f417285d
            tc4.c r2 = (tc4.c) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L50
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r7
        L3e:
            kotlin.ResultKt.throwOnFailure(r7)
            r2.f417285d = r6
            r2.f417288g = r5
            java.lang.Object r7 = super.g(r2)
            if (r7 != r3) goto L4f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L4f:
            r2 = r6
        L50:
            com.tencent.mm.plugin.sns.model.m0 r7 = com.tencent.mm.plugin.sns.model.l4.Cj()
            r7.v(r2)
            jz5.f0 r7 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.c.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public int getViewType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // tc4.v0, uc4.f1, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(in5.s0 r18, zc4.b r19, int r20, boolean r21, kotlin.coroutines.Continuation r22) {
        /*
            r17 = this;
            r6 = r17
            r0 = r22
            java.lang.String r7 = "onBindViewHolder"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r1 = r0 instanceof tc4.a
            if (r1 == 0) goto L1f
            r1 = r0
            tc4.a r1 = (tc4.a) r1
            int r2 = r1.f417269g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 - r3
            r1.f417269g = r2
            goto L24
        L1f:
            tc4.a r1 = new tc4.a
            r1.<init>(r6, r0)
        L24:
            r5 = r1
            java.lang.Object r0 = r5.f417267e
            pz5.a r9 = pz5.a.f359186d
            int r1 = r5.f417269g
            r2 = 1
            if (r1 == 0) goto L44
            if (r1 != r2) goto L39
            java.lang.Object r1 = r5.f417266d
            tc4.c r1 = (tc4.c) r1
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lce
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            throw r0
        L44:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.ArrayList r0 = uc4.f1.J(r17)
            java.util.Iterator r0 = r0.iterator()
        L4f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            uc4.g r1 = (uc4.g) r1
            boolean r3 = r1 instanceof uc4.y0
            if (r3 == 0) goto L4f
            goto L61
        L60:
            r1 = 0
        L61:
            if (r1 != 0) goto L85
            uc4.y0 r0 = new uc4.y0
            android.content.Context r1 = r17.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r1, r3)
            r0.<init>(r1)
            android.view.View r11 = r6.f417299z1
            r12 = 0
            r13 = 1
            r14 = 0
            r15 = 10
            r16 = 0
            r10 = r0
            uc4.g.l(r10, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r1 = r17.getClickInstanceList()
            r1.add(r0)
        L85:
            java.lang.Class<dy1.s> r0 = dy1.s.class
            i95.m r0 = i95.n0.c(r0)
            dy1.s r0 = (dy1.s) r0
            xc4.p r1 = r19.n()
            java.lang.String r1 = r1.a1()
            zy1.f r0 = (zy1.f) r0
            r3 = 12076(0x2f2c, float:1.6922E-41)
            java.lang.String r4 = "BrowseOtherFeedCount"
            r0.Di(r3, r4, r1)
            com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherItemLoadHandle r0 = com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherItemLoadHandle.INSTANCE
            xc4.p r1 = r19.n()
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.c1()
            android.view.View r3 = r6.f417299z1
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup"
            kotlin.jvm.internal.o.e(r3, r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0.handle(r1, r3)
            r5.f417266d = r6
            r5.f417269g = r2
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.Object r0 = super.h(r1, r2, r3, r4, r5)
            if (r0 != r9) goto Lcd
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r9
        Lcd:
            r1 = r6
        Lce:
            com.tencent.mm.plugin.sns.model.m0 r0 = com.tencent.mm.plugin.sns.model.l4.Cj()
            r0.c(r1)
            jz5.f0 r0 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.c.h(in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
        md4.e eVar = md4.e.f325877a;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f417299z1 = eVar.b(context);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.f417298y1 = frameLayout;
        frameLayout.addView(this.f417299z1);
        android.widget.FrameLayout frameLayout2 = this.f417298y1;
        kotlin.jvm.internal.o.d(frameLayout2);
        jz5.l lVar = new jz5.l(frameLayout2, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        return "BizCardImproveTimelineItem";
    }

    @Override // tc4.i2
    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        super.o();
        zc4.b data = getData();
        xc4.p n17 = data != null ? data.n() : null;
        if (n17 == null) {
            android.widget.FrameLayout frameLayout = this.f417298y1;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
            return;
        }
        android.widget.FrameLayout frameLayout2 = this.f417298y1;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        r45.jj4 jj4Var = (r45.jj4) n17.h1().ContentObj.f369840h.get(1);
        md4.e eVar = md4.e.f325877a;
        android.view.View view = this.f417299z1;
        kotlin.jvm.internal.o.d(view);
        kotlin.jvm.internal.o.d(jj4Var);
        eVar.f(view, jj4Var, n17.h1().publicUserName, n17.h1().ContentObj.f369838f, n17.h1().ContentObj.f369843n.f376160r);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        zc4.b data = getData();
        if (data == null || (n17 = data.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
            return;
        }
        if (n17.h1().ContentObj.f369840h.size() <= 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        } else if (!kotlin.jvm.internal.o.b(((r45.jj4) n17.h1().ContentObj.f369840h.get(1)).f377855d, str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        } else {
            o();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        }
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem");
    }
}
