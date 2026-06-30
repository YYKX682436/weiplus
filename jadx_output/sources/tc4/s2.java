package tc4;

/* loaded from: classes4.dex */
public final class s2 extends tc4.v0 {

    /* renamed from: y1, reason: collision with root package name */
    public pd4.b f417460y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // tc4.d2
    public boolean B() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        pd4.b bVar = this.f417460y1;
        boolean z18 = false;
        if (bVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAllImgViewAttached", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
            java.util.Iterator<T> it = bVar.getChildList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAllImgViewAttached", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
                    z17 = true;
                    break;
                }
                android.view.View view = (android.view.View) it.next();
                if ((view instanceof com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) && !((com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) view).getImageView().E) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAllImgViewAttached", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                z18 = true;
            }
        }
        boolean z19 = !z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return z19;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // tc4.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.s2.D(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.d2
    public java.lang.Object E(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new tc4.q2(null), continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return g17;
    }

    @Override // tc4.v0
    public android.view.View Q(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        pd4.b bVar = this.f417460y1;
        android.view.View childAt = bVar != null ? bVar.getChildAt(i17) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return childAt;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
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
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r7 instanceof tc4.r2
            if (r2 == 0) goto L1b
            r2 = r7
            tc4.r2 r2 = (tc4.r2) r2
            int r3 = r2.f417451g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f417451g = r3
            goto L20
        L1b:
            tc4.r2 r2 = new tc4.r2
            r2.<init>(r6, r7)
        L20:
            java.lang.Object r7 = r2.f417449e
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f417451g
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L33
            java.lang.Object r2 = r2.f417448d
            tc4.s2 r2 = (tc4.s2) r2
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
            r2.f417448d = r6
            r2.f417451g = r5
            java.lang.Object r7 = super.g(r2)
            if (r7 != r3) goto L4f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L4f:
            r2 = r6
        L50:
            pd4.b r7 = r2.f417460y1
            if (r7 == 0) goto L6b
            java.lang.String r2 = "release"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            ku5.u0 r4 = ku5.t0.f312615d
            pd4.a r5 = new pd4.a
            r5.<init>(r7)
            ku5.t0 r4 = (ku5.t0) r4
            r4.g(r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L6b:
            jz5.f0 r7 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.s2.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public int getViewType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return 36;
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        if (this.f417460y1 == null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f417460y1 = new pd4.b(context);
        }
        java.util.List<r45.jj4> mediaList = getMediaList();
        pd4.b bVar = this.f417460y1;
        if (bVar != null) {
            bVar.b(mediaList != null ? mediaList.size() : 0);
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f10891g = 0;
        pd4.b bVar2 = this.f417460y1;
        kotlin.jvm.internal.o.d(bVar2);
        jz5.l lVar = new jz5.l(bVar2, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MultiPhotoImproveTimelineItem-");
        java.util.List<r45.jj4> mediaList = getMediaList();
        sb6.append(mediaList != null ? java.lang.Integer.valueOf(mediaList.size()) : null);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return sb7;
    }

    @Override // tc4.i2
    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        super.o();
        java.util.List<r45.jj4> mediaList = getMediaList();
        pd4.b bVar = this.f417460y1;
        if (bVar != null) {
            bVar.b(mediaList != null ? mediaList.size() : 0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("width:");
        pd4.b bVar2 = this.f417460y1;
        sb6.append(bVar2 != null ? java.lang.Integer.valueOf(bVar2.getWidth()) : null);
        sb6.append(" height:");
        pd4.b bVar3 = this.f417460y1;
        sb6.append(bVar3 != null ? java.lang.Integer.valueOf(bVar3.getHeight()) : null);
        x("MicroMsg.Improve.MultiPhotoTimelineItem", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
    }
}
