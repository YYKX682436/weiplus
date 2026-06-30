package tc4;

/* loaded from: classes4.dex */
public final class b4 extends tc4.v0 implements xd4.d {

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f417296y1;

    /* renamed from: z1, reason: collision with root package name */
    public final int[] f417297z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f417297z1 = new int[]{0, 0};
    }

    @Override // tc4.d2
    public boolean B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // tc4.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.b4.D(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.d2
    public java.lang.Object E(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return bool;
    }

    @Override // tc4.v0
    public android.view.View Q(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f417296y1;
        if (flexibleVideoView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
            return flexibleVideoView;
        }
        kotlin.jvm.internal.o.o("videoView");
        throw null;
    }

    public final void T(android.view.ViewGroup.LayoutParams layoutParams) {
        xc4.p n17;
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        zc4.b data = getData();
        if (data == null || (n17 = data.n()) == null || (h17 = n17.h1()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
            return;
        }
        android.util.Pair l17 = m21.y.l(h17, getContext(), false);
        java.lang.Object first = l17.first;
        kotlin.jvm.internal.o.f(first, "first");
        layoutParams.width = ((java.lang.Number) first).intValue();
        java.lang.Object second = l17.second;
        kotlin.jvm.internal.o.f(second, "second");
        layoutParams.height = ((java.lang.Number) second).intValue();
        x("MicroMsg.Improve.VideoFlexibleTimelineItem", "[" + getMediaId() + "]width:" + l17.first + " height:" + l17.second);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        zc4.b data = getData();
        if (data == null || (n17 = data.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
            return;
        }
        r45.jj4 R0 = n17.R0();
        if (R0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
            return;
        }
        if (R0.f377856e == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.VideoFlexibleTimelineItem", "[" + getMediaId() + "]background video no auto play");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
            return;
        }
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f417296y1;
        if (flexibleVideoView == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.m(flexibleVideoView, false, false, false, 7, null);
        xd4.g.a().d(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f417296y1;
        if (flexibleVideoView == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        boolean z17 = flexibleVideoView.f169232r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        flexibleVideoView.k(!z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // tc4.v0, tc4.i2, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            java.lang.String r0 = "onViewRecycled"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r12 instanceof tc4.a4
            if (r2 == 0) goto L1b
            r2 = r12
            tc4.a4 r2 = (tc4.a4) r2
            int r3 = r2.f417284g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f417284g = r3
            goto L20
        L1b:
            tc4.a4 r2 = new tc4.a4
            r2.<init>(r11, r12)
        L20:
            java.lang.Object r12 = r2.f417282e
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f417284g
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L33
            java.lang.Object r2 = r2.f417281d
            tc4.b4 r2 = (tc4.b4) r2
            kotlin.ResultKt.throwOnFailure(r12)
            goto L50
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r12
        L3e:
            kotlin.ResultKt.throwOnFailure(r12)
            r2.f417281d = r11
            r2.f417284g = r5
            java.lang.Object r12 = super.g(r2)
            if (r12 != r3) goto L4f
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L4f:
            r2 = r11
        L50:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r3 = "onViewRecycled id:"
            r12.<init>(r3)
            zc4.b r3 = r2.getData()
            r4 = 0
            if (r3 == 0) goto L6a
            xc4.p r3 = r3.n()
            if (r3 == 0) goto L6a
            java.lang.String r3 = r3.a1()
            goto L6b
        L6a:
            r3 = r4
        L6b:
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            java.lang.String r3 = "MicroMsg.Improve.VideoFlexibleTimelineItem"
            com.tencent.mars.xlog.Log.i(r3, r12)
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView r5 = r2.f417296y1
            if (r5 == 0) goto La2
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.r(r5, r6, r7, r8, r9, r10)
            xd4.g r12 = xd4.g.a()
            r12.getClass()
            java.lang.String r3 = "viewRecycled"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.util.Set r12 = r12.f453641a
            java.util.HashSet r12 = (java.util.HashSet) r12
            r12.remove(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            jz5.f0 r12 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        La2:
            java.lang.String r12 = "videoView"
            kotlin.jvm.internal.o.o(r12)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.b4.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        int[] iArr = new int[2];
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f417296y1;
        if (flexibleVideoView == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        flexibleVideoView.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView2 = this.f417296y1;
        if (flexibleVideoView2 == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        int measuredWidth = flexibleVideoView2.getMeasuredWidth();
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView3 = this.f417296y1;
        if (flexibleVideoView3 == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, measuredWidth + i17, flexibleVideoView3.getMeasuredHeight() + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return rect;
    }

    @Override // tc4.x1
    public int getViewType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // tc4.v0, uc4.f1, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(in5.s0 r20, zc4.b r21, int r22, boolean r23, kotlin.coroutines.Continuation r24) {
        /*
            r19 = this;
            r6 = r19
            r0 = r24
            java.lang.String r7 = "onBindViewHolder"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r1 = r0 instanceof tc4.z3
            if (r1 == 0) goto L1f
            r1 = r0
            tc4.z3 r1 = (tc4.z3) r1
            int r2 = r1.f417551h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 - r3
            r1.f417551h = r2
            goto L24
        L1f:
            tc4.z3 r1 = new tc4.z3
            r1.<init>(r6, r0)
        L24:
            r5 = r1
            java.lang.Object r0 = r5.f417549f
            pz5.a r9 = pz5.a.f359186d
            int r1 = r5.f417551h
            java.lang.String r10 = "videoView"
            r2 = 1
            r11 = 0
            if (r1 == 0) goto L4d
            if (r1 != r2) goto L42
            java.lang.Object r1 = r5.f417548e
            zc4.b r1 = (zc4.b) r1
            java.lang.Object r2 = r5.f417547d
            tc4.b4 r2 = (tc4.b4) r2
            kotlin.ResultKt.throwOnFailure(r0)
            r12 = r1
            goto Lb3
        L42:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            throw r0
        L4d:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.ArrayList r0 = uc4.f1.J(r19)
            java.util.Iterator r0 = r0.iterator()
        L58:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            uc4.g r1 = (uc4.g) r1
            boolean r3 = r1 instanceof uc4.h1
            if (r3 == 0) goto L58
            goto L6a
        L69:
            r1 = r11
        L6a:
            if (r1 != 0) goto L96
            java.util.ArrayList r0 = r19.getClickInstanceList()
            uc4.h1 r1 = new uc4.h1
            android.content.Context r3 = r19.getContext()
            java.lang.String r4 = "getContext(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            r1.<init>(r3)
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView r13 = r6.f417296y1
            if (r13 == 0) goto L92
            r14 = 0
            r15 = 1
            r16 = 0
            r17 = 10
            r18 = 0
            r12 = r1
            uc4.g.l(r12, r13, r14, r15, r16, r17, r18)
            r0.add(r1)
            goto L96
        L92:
            kotlin.jvm.internal.o.o(r10)
            throw r11
        L96:
            r5.f417547d = r6
            r12 = r21
            r5.f417548e = r12
            r5.f417551h = r2
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.Object r0 = super.h(r1, r2, r3, r4, r5)
            if (r0 != r9) goto Lb2
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r9
        Lb2:
            r2 = r6
        Lb3:
            com.tencent.mm.plugin.sns.ui.ai r0 = com.tencent.mm.plugin.sns.ui.bi.f167914c
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView r1 = r2.f417296y1
            if (r1 == 0) goto Lc6
            xc4.p r2 = r12.n()
            r0.e(r1, r2)
            jz5.f0 r0 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r0
        Lc6:
            kotlin.jvm.internal.o.o(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.b4.h(in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        this.f417296y1 = new com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView(getContext());
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, 0);
        T(layoutParams);
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f417296y1;
        if (flexibleVideoView == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        jz5.l lVar = new jz5.l(flexibleVideoView, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return "VideoFlexibleTimelineItem";
    }

    @Override // tc4.i2
    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        super.o();
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f417296y1;
        if (flexibleVideoView == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = flexibleVideoView.getLayoutParams();
        kotlin.jvm.internal.o.d(layoutParams);
        T(layoutParams);
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView2 = this.f417296y1;
        if (flexibleVideoView2 == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        flexibleVideoView2.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            int rawX = (int) motionEvent.getRawX();
            int[] iArr = this.f417297z1;
            iArr[0] = rawX;
            iArr[1] = (int) motionEvent.getRawY();
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f417296y1;
            if (flexibleVideoView == null) {
                kotlin.jvm.internal.o.o("videoView");
                throw null;
            }
            flexibleVideoView.setTag(com.tencent.mm.R.id.ohu, iArr);
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        return onInterceptTouchEvent;
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f417296y1;
        if (flexibleVideoView == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        flexibleVideoView.k(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem");
    }
}
