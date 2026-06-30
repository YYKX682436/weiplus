package tc4;

/* loaded from: classes4.dex */
public final class h3 extends tc4.k2 {

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f417357x1;

    /* renamed from: y1, reason: collision with root package name */
    public final jz5.g f417358y1;

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f417359z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f417358y1 = jz5.h.b(new tc4.f3(this));
        this.f417359z1 = jz5.h.b(new tc4.g3(this));
    }

    private final android.view.View getTingCategoryRoot() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTingCategoryRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.f417358y1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTingCategoryRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return view;
    }

    private final com.tencent.mm.plugin.ting.widget.TingCategoryView getTingCategoryView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTingCategoryView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        com.tencent.mm.plugin.ting.widget.TingCategoryView tingCategoryView = (com.tencent.mm.plugin.ting.widget.TingCategoryView) ((jz5.n) this.f417359z1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTingCategoryView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return tingCategoryView;
    }

    @Override // tc4.d2
    public boolean B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // tc4.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            java.lang.String r0 = "loadCustomItemInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r10 instanceof tc4.d3
            if (r2 == 0) goto L1b
            r2 = r10
            tc4.d3 r2 = (tc4.d3) r2
            int r3 = r2.f417316g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f417316g = r3
            goto L20
        L1b:
            tc4.d3 r2 = new tc4.d3
            r2.<init>(r9, r10)
        L20:
            java.lang.Object r10 = r2.f417314e
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f417316g
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L33
            java.lang.Object r2 = r2.f417313d
            com.tencent.mm.plugin.ting.widget.TingCategoryView r2 = (com.tencent.mm.plugin.ting.widget.TingCategoryView) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L95
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r10
        L3e:
            kotlin.ResultKt.throwOnFailure(r10)
            zc4.b r10 = r9.getData()
            if (r10 == 0) goto L9b
            xc4.p r10 = r10.n()
            if (r10 != 0) goto L4e
            goto L9b
        L4e:
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r10.h1()
            r45.a90 r4 = r10.ContentObj
            if (r4 != 0) goto L5c
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r10
        L5c:
            r45.km6 r4 = r4.A
            if (r4 == 0) goto L95
            java.lang.String r4 = r4.f378839e
            bw5.o50 r4 = il4.d.v(r4)
            android.content.Context r6 = r9.getContext()
            java.lang.String r7 = "getContext(...)"
            kotlin.jvm.internal.o.f(r6, r7)
            java.lang.String r10 = m21.v.b(r10)
            r45.lm6 r10 = il4.d.c(r6, r4, r10)
            com.tencent.mm.plugin.ting.widget.TingCategoryView r4 = r9.getTingCategoryView()
            if (r4 == 0) goto L95
            kotlinx.coroutines.p0 r6 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r6 = kotlinx.coroutines.internal.b0.f310484a
            tc4.e3 r7 = new tc4.e3
            r8 = 0
            r7.<init>(r4, r10, r8)
            r2.f417313d = r4
            r2.f417316g = r5
            java.lang.Object r10 = kotlinx.coroutines.l.g(r6, r7, r2)
            if (r10 != r3) goto L95
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L95:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r10
        L9b:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.h3.E(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public int getViewType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return 40;
    }

    @Override // uc4.f1, tc4.s0
    public java.lang.Object h(in5.s0 s0Var, zc4.b bVar, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        uc4.g gVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        java.util.Iterator it = uc4.f1.J(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            gVar = (uc4.g) it.next();
            if (gVar instanceof uc4.u0) {
                break;
            }
        }
        if (gVar == null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            uc4.u0 u0Var = new uc4.u0(context);
            uc4.g.l(u0Var, getTingCategoryRoot(), false, true, false, 10, null);
            getClickInstanceList().add(u0Var);
        }
        java.lang.Object h17 = super.h(s0Var, bVar, i17, z17, continuation);
        if (h17 == pz5.a.f359186d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
            return h17;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return f0Var;
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.csm, (android.view.ViewGroup) this, false);
        this.f417357x1 = inflate;
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f10908s = 0;
        jz5.l lVar = new jz5.l(inflate, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        return "MusicTingCategoryImproveTimelineItem";
    }

    @Override // tc4.i2
    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        super.o();
        com.tencent.mm.plugin.ting.widget.TingCategoryView tingCategoryView = getTingCategoryView();
        if (tingCategoryView != null) {
            tingCategoryView.setContainerBackgroundColor(tingCategoryView.getContext().getResources().getColor(com.tencent.mm.R.color.f478492d));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
    }
}
