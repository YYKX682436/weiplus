package tc4;

/* loaded from: classes4.dex */
public final class c3 extends tc4.k2 {
    public static final /* synthetic */ int D1 = 0;
    public final jz5.g A1;
    public final jz5.g B1;
    public final com.tencent.mm.sdk.event.IListener C1;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f417307x1;

    /* renamed from: y1, reason: collision with root package name */
    public final jz5.g f417308y1;

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f417309z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f417308y1 = jz5.h.b(new tc4.w2(this));
        this.f417309z1 = jz5.h.b(new tc4.x2(this));
        this.A1 = jz5.h.b(new tc4.y2(this));
        this.B1 = jz5.h.b(new tc4.b3(this));
        final androidx.lifecycle.y lifecycleOwner = getLifecycleOwner();
        this.C1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(lifecycleOwner) { // from class: com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicPlayerListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                tc4.c3 c3Var;
                com.tencent.mm.plugin.ting.widget.MusicView Q;
                xc4.p n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicPlayerListener$1");
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicPlayerListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = event.f54512g.f7036b;
                if ((i17 == 0 || i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 7) && (Q = tc4.c3.Q((c3Var = tc4.c3.this))) != null) {
                    zc4.b data = c3Var.getData();
                    Q.a(true, com.tencent.mm.plugin.sns.ui.wm.b((data == null || (n17 = data.n()) == null) ? null : n17.h1()));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicPlayerListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicPlayerListener$1");
                return false;
            }
        };
    }

    public static final /* synthetic */ com.tencent.mm.plugin.ting.widget.MusicView Q(tc4.c3 c3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMusicView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.tencent.mm.plugin.ting.widget.MusicView musicView = c3Var.getMusicView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMusicView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return musicView;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v5 java.lang.String, still in use, count: 2, list:
          (r6v5 java.lang.String) from 0x0053: IF  (r6v5 java.lang.String) == (null java.lang.String)  -> B:65:0x0055 A[HIDDEN]
          (r6v5 java.lang.String) from 0x0056: PHI (r6v8 java.lang.String) = (r6v5 java.lang.String), (r6v7 java.lang.String), (r6v31 java.lang.String) binds: [B:69:0x0053, B:65:0x0055, B:13:0x004a] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:40)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R(tc4.c3 r11, com.tencent.mm.protocal.protobuf.TimeLineObject r12, r45.jj4 r13, bw5.v70 r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.c3.R(tc4.c3, com.tencent.mm.protocal.protobuf.TimeLineObject, r45.jj4, bw5.v70):void");
    }

    private final android.view.View getMusicMvRoot() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMusicMvRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.f417308y1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMusicMvRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return view;
    }

    private final com.tencent.mm.plugin.ting.widget.MusicView getMusicView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMusicView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.tencent.mm.plugin.ting.widget.MusicView musicView = (com.tencent.mm.plugin.ting.widget.MusicView) ((jz5.n) this.f417309z1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMusicView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return musicView;
    }

    private final android.view.ViewGroup getMusicViewContainer() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMusicViewContainer", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.A1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMusicViewContainer", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return viewGroup;
    }

    private final android.view.ViewGroup getRoot() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.B1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRoot", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return viewGroup;
    }

    @Override // tc4.d2
    public boolean B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return true;
    }

    @Override // tc4.d2
    public java.lang.Object E(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new tc4.v2(this, null), continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return g17;
    }

    public final void S(int i17, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.ting.widget.MusicView musicView;
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMusicViewWidth", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        if (viewGroup == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMusicViewWidth", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutParams4 = null;
        if (!(layoutParams3 != null && layoutParams3.width == i17)) {
            android.view.ViewGroup.LayoutParams layoutParams5 = viewGroup.getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.width = i17;
            } else {
                layoutParams5 = null;
            }
            viewGroup.setLayoutParams(layoutParams5);
        }
        com.tencent.mm.plugin.ting.widget.MusicView musicView2 = getMusicView();
        if (!((musicView2 == null || (layoutParams2 = musicView2.getLayoutParams()) == null || layoutParams2.width != i17) ? false : true) && (musicView = getMusicView()) != null) {
            com.tencent.mm.plugin.ting.widget.MusicView musicView3 = getMusicView();
            if (musicView3 != null && (layoutParams = musicView3.getLayoutParams()) != null) {
                layoutParams.width = i17;
                layoutParams4 = layoutParams;
            }
            musicView.setLayoutParams(layoutParams4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMusicViewWidth", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // tc4.i2, tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            java.lang.String r0 = "onViewRecycled"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r8 instanceof tc4.a3
            if (r2 == 0) goto L1b
            r2 = r8
            tc4.a3 r2 = (tc4.a3) r2
            int r3 = r2.f417280g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f417280g = r3
            goto L20
        L1b:
            tc4.a3 r2 = new tc4.a3
            r2.<init>(r7, r8)
        L20:
            java.lang.Object r8 = r2.f417278e
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f417280g
            jz5.f0 r5 = jz5.f0.f302826a
            r6 = 1
            if (r4 == 0) goto L40
            if (r4 != r6) goto L35
            java.lang.Object r2 = r2.f417277d
            tc4.c3 r2 = (tc4.c3) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L51
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r8
        L40:
            kotlin.ResultKt.throwOnFailure(r8)
            r2.f417277d = r7
            r2.f417280g = r6
            super.g(r2)
            if (r5 != r3) goto L50
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L50:
            r2 = r7
        L51:
            com.tencent.mm.sdk.event.IListener r8 = r2.C1
            r8.dead()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.c3.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public int getViewType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return 24;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // uc4.f1, tc4.s0
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
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r1 = r0 instanceof tc4.z2
            if (r1 == 0) goto L1f
            r1 = r0
            tc4.z2 r1 = (tc4.z2) r1
            int r2 = r1.f417546g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 - r3
            r1.f417546g = r2
            goto L24
        L1f:
            tc4.z2 r1 = new tc4.z2
            r1.<init>(r6, r0)
        L24:
            r5 = r1
            java.lang.Object r0 = r5.f417544e
            pz5.a r9 = pz5.a.f359186d
            int r1 = r5.f417546g
            r2 = 1
            if (r1 == 0) goto L43
            if (r1 != r2) goto L38
            java.lang.Object r1 = r5.f417543d
            tc4.c3 r1 = (tc4.c3) r1
            kotlin.ResultKt.throwOnFailure(r0)
            goto L9f
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            throw r0
        L43:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.ArrayList r0 = uc4.f1.J(r17)
            java.util.Iterator r0 = r0.iterator()
        L4e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r0.next()
            uc4.g r1 = (uc4.g) r1
            boolean r3 = r1 instanceof uc4.t0
            if (r3 == 0) goto L4e
            goto L60
        L5f:
            r1 = 0
        L60:
            if (r1 != 0) goto L86
            uc4.t0 r0 = new uc4.t0
            android.content.Context r1 = r17.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r1, r3)
            r0.<init>(r1)
            android.view.View r11 = r17.getMusicMvRoot()
            r12 = 0
            r13 = 1
            r14 = 0
            r15 = 10
            r16 = 0
            r10 = r0
            uc4.g.l(r10, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r1 = r17.getClickInstanceList()
            r1.add(r0)
        L86:
            r5.f417543d = r6
            r5.f417546g = r2
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.Object r0 = super.h(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L9e
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r9
        L9e:
            r1 = r6
        L9f:
            com.tencent.mm.sdk.event.IListener r0 = r1.C1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.C1
            r0.alive()
            jz5.f0 r0 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.c3.h(in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.csk, (android.view.ViewGroup) this, false);
        this.f417307x1 = inflate;
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f10908s = 0;
        jz5.l lVar = new jz5.l(inflate, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        return "MusicImproveTimelineItem";
    }

    @Override // tc4.i2
    public void r() {
        bw5.v70 c17;
        bw5.nb0 Bi;
        xc4.p n17;
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadAppNameView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        zc4.b data = getData();
        r45.xs4 xs4Var = (data == null || (n17 = data.n()) == null || (h17 = n17.h1()) == null || (a90Var = h17.ContentObj) == null) ? null : a90Var.f369852w;
        if (xs4Var == null || xs4Var.getInteger(18) <= 0 || (c17 = rk4.l5.c(xs4Var.getString(19))) == null || (Bi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Bi(c17)) == null) {
            super.r();
            getAppNameStub().invalidate();
            getAppNameStub().requestLayout();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadAppNameView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
            return;
        }
        if (getAppNameStub() instanceof android.view.ViewStub) {
            android.widget.TextView l17 = tc4.x1.l(this, true, com.tencent.mm.R.color.f479515a62, com.tencent.mm.R.dimen.f479925j4, true, 0, 0, null, 112, null);
            l17.setEllipsize(android.text.TextUtils.TruncateAt.END);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
            layoutParams.setMargins(i65.a.h(getContext(), com.tencent.mm.R.dimen.f479671c8), 0, 0, 0);
            layoutParams.weight = 1.0f;
            android.view.View appNameStub = getAppNameStub();
            kotlin.jvm.internal.o.e(appNameStub, "null cannot be cast to non-null type android.view.ViewStub");
            pd4.d.a((android.view.ViewStub) appNameStub, l17, layoutParams);
            setAppNameStub(l17);
        }
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.f493381lg5, Bi.f30610s[9] ? Bi.f30606o : "");
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string);
        spannableString.setSpan(new tc4.u2(this, Bi), 0, spannableString.length(), 33);
        getAppNameStub().setClickable(true);
        getAppNameStub().setOnTouchListener(new com.tencent.mm.plugin.sns.ui.p5());
        android.view.View appNameStub2 = getAppNameStub();
        kotlin.jvm.internal.o.e(appNameStub2, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) appNameStub2;
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setText(spannableString, android.widget.TextView.BufferType.SPANNABLE);
        textView.setContentDescription(spannableString);
        android.view.View appNameStub3 = getAppNameStub();
        kotlin.jvm.internal.o.e(appNameStub3, "null cannot be cast to non-null type android.widget.TextView");
        ((android.widget.TextView) appNameStub3).setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.f479515a62));
        android.view.View appNameStub4 = getAppNameStub();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(appNameStub4, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/MusicImproveTimelineItem", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        appNameStub4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(appNameStub4, "com/tencent/mm/plugin/sns/ui/improve/item/MusicImproveTimelineItem", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getAppNameStub().invalidate();
        getAppNameStub().requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadAppNameView", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
    }
}
