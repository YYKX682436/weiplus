package tc4;

/* loaded from: classes4.dex */
public final class q3 extends tc4.v0 {
    public com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView A1;
    public android.view.View B1;

    /* renamed from: y1, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f417443y1;

    /* renamed from: z1, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.MaskImageView f417444z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f417443y1 = new android.graphics.drawable.ColorDrawable(i65.a.d(context, com.tencent.mm.R.color.f478492d));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // tc4.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.q3.D(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.d2
    public java.lang.Object E(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new tc4.n3(null), continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return g17;
    }

    @Override // tc4.v0
    public android.view.View Q(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView = this.A1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return maskImageWithLivePhotoTagView;
    }

    public final java.util.List T(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        kotlin.jvm.internal.o.g(timeLineObject, "<this>");
        r45.a90 a90Var = timeLineObject.ContentObj;
        java.util.LinkedList linkedList = a90Var != null ? a90Var.f369840h : null;
        kotlin.jvm.internal.o.d(linkedList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return linkedList;
    }

    public final void U(android.view.ViewGroup.LayoutParams layoutParams) {
        xc4.p n17;
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        zc4.b data = getData();
        if (data == null || (n17 = data.n()) == null || (h17 = n17.h1()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
            return;
        }
        if (T(h17).isEmpty()) {
            w("MicroMsg.Improve.SinglePhotoTimelineItem", "updateParam error for empty media list!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
            return;
        }
        r45.jj4 media = (r45.jj4) T(h17).get(0);
        int i17 = jd4.a.f299181a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateSinglePhotoSize", "com.tencent.mm.plugin.sns.ui.item.improve.calculate.TimelineSizeCalculator");
        kotlin.jvm.internal.o.g(media, "media");
        r45.lj4 lj4Var = media.f377865p;
        float f17 = lj4Var.f379520d;
        float f18 = lj4Var.f379521e;
        float f19 = jd4.a.f299181a;
        float f27 = f19 / f17;
        float f28 = f19 / f18;
        if (f27 > f28) {
            f27 = f28;
        }
        float f29 = f17 * f27;
        float f37 = f18 * f27;
        float f38 = jd4.a.f299182b;
        if (f29 < f38) {
            float f39 = (f38 * 1.0f) / f29;
            f29 *= f39;
            f37 *= f39;
        }
        if (f37 < f38) {
            float f47 = (f38 * 1.0f) / f37;
            f29 *= f47;
            f37 *= f47;
        }
        if (f29 > f19) {
            f29 = f19;
        }
        if (f37 <= f19) {
            f19 = f37;
        }
        android.util.Size size = new android.util.Size((int) f29, (int) f19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateSinglePhotoSize", "com.tencent.mm.plugin.sns.ui.item.improve.calculate.TimelineSizeCalculator");
        layoutParams.width = size.getWidth();
        layoutParams.height = size.getHeight();
        x("MicroMsg.Improve.SinglePhotoTimelineItem", "width:" + size.getWidth() + " height:" + size.getHeight());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
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
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r7 instanceof tc4.p3
            if (r2 == 0) goto L1b
            r2 = r7
            tc4.p3 r2 = (tc4.p3) r2
            int r3 = r2.f417435g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f417435g = r3
            goto L20
        L1b:
            tc4.p3 r2 = new tc4.p3
            r2.<init>(r6, r7)
        L20:
            java.lang.Object r7 = r2.f417433e
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f417435g
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L33
            java.lang.Object r2 = r2.f417432d
            tc4.q3 r2 = (tc4.q3) r2
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
            r2.f417432d = r6
            r2.f417435g = r5
            java.lang.Object r7 = super.g(r2)
            if (r7 != r3) goto L4f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L4f:
            r2 = r6
        L50:
            com.tencent.mm.plugin.sns.ui.MaskImageView r7 = r2.f417444z1
            if (r7 == 0) goto L57
            r7.o()
        L57:
            jz5.f0 r7 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.q3.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.d2
    public com.tencent.mm.memory.ui.QPictureView getTagImgView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = this.f417444z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return maskImageView;
    }

    @Override // tc4.x1
    public int getViewType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return 37;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
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
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r1 = r0 instanceof tc4.o3
            if (r1 == 0) goto L1f
            r1 = r0
            tc4.o3 r1 = (tc4.o3) r1
            int r2 = r1.f417428h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 - r3
            r1.f417428h = r2
            goto L24
        L1f:
            tc4.o3 r1 = new tc4.o3
            r1.<init>(r6, r0)
        L24:
            r5 = r1
            java.lang.Object r0 = r5.f417426f
            pz5.a r9 = pz5.a.f359186d
            int r1 = r5.f417428h
            r2 = 1
            if (r1 == 0) goto L48
            if (r1 != r2) goto L3d
            java.lang.Object r1 = r5.f417425e
            zc4.b r1 = (zc4.b) r1
            java.lang.Object r2 = r5.f417424d
            tc4.q3 r2 = (tc4.q3) r2
            kotlin.ResultKt.throwOnFailure(r0)
            r10 = r1
            goto La6
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            throw r0
        L48:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.ArrayList r0 = uc4.f1.J(r17)
            java.util.Iterator r0 = r0.iterator()
        L53:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()
            uc4.g r1 = (uc4.g) r1
            boolean r3 = r1 instanceof uc4.b1
            if (r3 == 0) goto L53
            goto L65
        L64:
            r1 = 0
        L65:
            if (r1 != 0) goto L89
            java.util.ArrayList r0 = r17.getClickInstanceList()
            uc4.b1 r1 = new uc4.b1
            android.content.Context r3 = r17.getContext()
            java.lang.String r4 = "getContext(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            r1.<init>(r3)
            com.tencent.mm.plugin.sns.ui.MaskImageView r11 = r6.f417444z1
            r12 = 0
            r13 = 1
            r14 = 0
            r15 = 10
            r16 = 0
            r10 = r1
            uc4.g.l(r10, r11, r12, r13, r14, r15, r16)
            r0.add(r1)
        L89:
            r5.f417424d = r6
            r10 = r19
            r5.f417425e = r10
            r5.f417428h = r2
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.Object r0 = super.h(r1, r2, r3, r4, r5)
            if (r0 != r9) goto La5
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r9
        La5:
            r2 = r6
        La6:
            com.tencent.mm.plugin.sns.ui.ai r0 = com.tencent.mm.plugin.sns.ui.bi.f167914c
            com.tencent.mm.plugin.sns.ui.MaskImageView r1 = r2.f417444z1
            r2 = 0
            xc4.p r3 = r10.n()
            r0.d(r1, r2, r3)
            jz5.f0 r0 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.q3.h(in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView = new com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView(context);
        this.A1 = maskImageWithLivePhotoTagView;
        this.f417444z1 = maskImageWithLivePhotoTagView.getImageView();
        com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView2 = this.A1;
        this.B1 = maskImageWithLivePhotoTagView2 != null ? maskImageWithLivePhotoTagView2.getLivePhotoTagView() : null;
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = this.f417444z1;
        if (maskImageView != null) {
            maskImageView.setScaleType(al5.q2.CENTER_CROP);
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, 0);
        U(layoutParams);
        if (pc4.d.f353410a.x()) {
            com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView3 = this.A1;
            float b17 = i65.a.b(getContext(), 2);
            boolean z17 = (12 & 4) != 0;
            boolean z18 = (12 & 8) != 0;
            if (maskImageWithLivePhotoTagView3 != null) {
                maskImageWithLivePhotoTagView3.setOutlineProvider(new zl5.a(z17, z18, b17));
            }
            if (maskImageWithLivePhotoTagView3 != null) {
                maskImageWithLivePhotoTagView3.setClipToOutline(true);
            }
        }
        com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView4 = this.A1;
        kotlin.jvm.internal.o.d(maskImageWithLivePhotoTagView4);
        jz5.l lVar = new jz5.l(maskImageWithLivePhotoTagView4, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return "SinglePhotoTimelineItem";
    }

    @Override // tc4.i2
    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        super.o();
        com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView = this.A1;
        android.view.ViewGroup.LayoutParams layoutParams = maskImageWithLivePhotoTagView != null ? maskImageWithLivePhotoTagView.getLayoutParams() : null;
        if (layoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
            return;
        }
        U(layoutParams);
        com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView2 = this.A1;
        if (maskImageWithLivePhotoTagView2 != null) {
            maskImageWithLivePhotoTagView2.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = this.f417444z1;
        if (maskImageView != null) {
            maskImageView.setImageDrawable(this.f417443y1);
        }
        android.view.View view = this.B1;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/SinglePhotoImproveTimelineItem", "customLayoutMeasureForReuse", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/improve/item/SinglePhotoImproveTimelineItem", "customLayoutMeasureForReuse", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
    }
}
