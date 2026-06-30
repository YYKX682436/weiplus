package i74;

/* loaded from: classes4.dex */
public class i implements i74.l, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f289491d;

    /* renamed from: e, reason: collision with root package name */
    public m74.b f289492e;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f289494g;

    /* renamed from: h, reason: collision with root package name */
    public final i74.d f289495h;

    /* renamed from: i, reason: collision with root package name */
    public final i74.a f289496i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.i f289497m;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f289499o;

    /* renamed from: p, reason: collision with root package name */
    public int f289500p;

    /* renamed from: f, reason: collision with root package name */
    public final int f289493f = com.tencent.mm.R.layout.cos;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f289498n = new java.util.HashSet();

    public i(android.content.Context context) {
        this.f289499o = false;
        this.f289500p = 0;
        this.f289491d = context;
        i74.a aVar = new i74.a();
        this.f289496i = aVar;
        this.f289495h = new i74.d(context, aVar, this);
        this.f289500p = this.f289491d.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a_c);
        if (context instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) {
            this.f289499o = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            aVar.f289457c = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
    }

    @Override // i74.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanReasonIds", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        java.util.Set set = this.f289498n;
        if (set != null) {
            ((java.util.HashSet) set).clear();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanReasonIds", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    @Override // i74.l
    public void b(android.view.View view, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        try {
            if (i17 == 5) {
                k(view, obj);
            } else {
                if (i17 == 1) {
                    m(view);
                } else if (i17 == 2) {
                    i();
                } else if (i17 == 3) {
                    j();
                } else if (i17 == 4) {
                    l(view, obj);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1962, i17 + 10);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("FeedbackPromptManager", "onAction failed : actionId = " + i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAction", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public int c(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f289500p, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view2.getMeasuredHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnchorViewRect", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = iArr[0];
        rect.left = i17;
        rect.top = iArr[1];
        rect.right = i17 + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnchorViewRect", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        android.graphics.Rect rect2 = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        if (rect.bottom + measuredHeight <= rect2.height()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return 0;
        }
        int i18 = -(measuredHeight + rect.height());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        return i18;
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        m74.b bVar = this.f289492e;
        if (bVar != null) {
            bVar.dismiss();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    @Override // i74.l
    public void dismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensurePopupWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        if (this.f289492e == null) {
            android.view.View inflate = android.view.LayoutInflater.from(this.f289491d).inflate(this.f289493f, (android.view.ViewGroup) null);
            m74.b bVar = new m74.b(this.f289491d);
            this.f289492e = bVar;
            bVar.setContentView(inflate);
            this.f289492e.setWidth(this.f289500p);
            this.f289492e.setHeight(-2);
            this.f289492e.setFocusable(true);
            this.f289492e.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            this.f289492e.setOnDismissListener(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensurePopupWindow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public final boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isContextInvalid", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        android.content.Context context = this.f289491d;
        boolean z17 = true;
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContextInvalid", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return true;
        }
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContextInvalid", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return false;
        }
        android.app.Activity activity = (android.app.Activity) context;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContextInvalid", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        return z17;
    }

    public ca4.j g(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("obtainAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        java.lang.Object tag = view.getTag();
        if (tag instanceof ca4.j) {
            ca4.j jVar = (ca4.j) tag;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return jVar;
        }
        com.tencent.mars.xlog.Log.w("FeedbackPromptManager", "the tag is not AdUnlikeTag");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        return null;
    }

    public android.view.View h(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        if (view instanceof android.view.ViewGroup) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return view;
        }
        java.lang.Object parent = view.getParent();
        if (parent == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            return view;
        }
        android.view.View view2 = (android.view.View) parent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        return view2;
    }

    public void i() {
        j74.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onApprove", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        p(true);
        d();
        i74.a aVar2 = this.f289496i;
        if (aVar2 != null) {
            aVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getApproveChannelReport", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = aVar2.f289456b;
            com.tencent.mm.plugin.sns.storage.ADXml e17 = aVar2.e();
            com.tencent.mm.plugin.sns.storage.ADInfo d17 = aVar2.d();
            if (snsInfo == null || e17 == null || d17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getApproveChannelReport", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                aVar = null;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createAdApprovedChannelData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
                aVar = new j74.a();
                aVar.f298051a = snsInfo.field_snsId;
                aVar.f298053c = this.f289499o ? 2 : 1;
                aVar.f298052b = ca4.c0.a(d17.uxInfo);
                aVar.f298054d = e17.adExtInfo;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createAdApprovedChannelData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getApproveChannelReport", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            }
            a84.t0.a(aVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onApprove", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("complaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        try {
            android.content.Context context = this.f289491d;
            if (context != null) {
                android.content.Intent f17 = this.f289496i.f();
                if (com.tencent.mm.sdk.platformtools.c2.c(f17, "complaint_weapp", false)) {
                    q(f17);
                } else {
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(f17, context);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("complaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public final void k(android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onComplaintReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        java.util.Set set = this.f289498n;
        if (set != null && (obj instanceof j74.c)) {
            int i17 = ((j74.c) obj).f298064a;
            if (view == null || !view.isSelected()) {
                ((java.util.HashSet) set).remove(java.lang.Integer.valueOf(i17));
            } else {
                ((java.util.HashSet) set).add(java.lang.Integer.valueOf(i17));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onComplaintReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.View r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i74.i.l(android.view.View, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.view.View r13) {
        /*
            r12 = this;
            java.lang.String r0 = "onNoInterestingClick"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.util.Set r2 = r12.f289498n
            if (r2 == 0) goto L11
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.clear()
        L11:
            i74.a r2 = r12.f289496i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto Lc4
            r2.getClass()
            java.lang.String r5 = "hasNoInterestingReason"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            com.tencent.mm.plugin.sns.storage.ADInfo r7 = r2.d()     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L5c
            com.tencent.mm.plugin.sns.storage.d r7 = r7.adUnlikeInfo     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L5c
            java.util.List r7 = r7.a()     // Catch: java.lang.Throwable -> L5c
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5c
            r8.<init>()     // Catch: java.lang.Throwable -> L5c
            r9 = r3
        L36:
            int r10 = r7.size()     // Catch: java.lang.Throwable -> L5c
            if (r9 >= r10) goto L54
            java.lang.Object r10 = r7.get(r9)     // Catch: java.lang.Throwable -> L5c
            com.tencent.mm.plugin.sns.storage.c r10 = (com.tencent.mm.plugin.sns.storage.c) r10     // Catch: java.lang.Throwable -> L5c
            int r10 = r10.f165945d     // Catch: java.lang.Throwable -> L5c
            r11 = 10006(0x2716, float:1.4021E-41)
            if (r10 == r11) goto L51
            java.lang.Object r10 = r7.get(r9)     // Catch: java.lang.Throwable -> L5c
            com.tencent.mm.plugin.sns.storage.c r10 = (com.tencent.mm.plugin.sns.storage.c) r10     // Catch: java.lang.Throwable -> L5c
            r8.add(r10)     // Catch: java.lang.Throwable -> L5c
        L51:
            int r9 = r9 + 1
            goto L36
        L54:
            boolean r7 = a84.b0.e(r8)     // Catch: java.lang.Throwable -> L5c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            goto L60
        L5c:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            r7 = r3
        L60:
            if (r7 == 0) goto Lc4
            m74.b r5 = r12.f289492e
            if (r5 == 0) goto Lc4
            e42.c0 r13 = e42.c0.clicfg_fix_feedback_anchor_extra_space_ui
            int r13 = ca4.m0.u0(r13, r4)
            if (r13 != r4) goto L6f
            goto L70
        L6f:
            r4 = r3
        L70:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r5 = "fixExtraSpace is "
            r13.<init>(r5)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            java.lang.String r5 = "FeedbackPromptManager"
            com.tencent.mars.xlog.Log.i(r5, r13)
            if (r4 == 0) goto L98
            m74.b r13 = r12.f289492e
            android.view.View r13 = r13.getContentView()
            android.view.ViewTreeObserver r13 = r13.getViewTreeObserver()
            i74.f r4 = new i74.f
            r4.<init>(r12, r13)
            r13.addOnPreDrawListener(r4)
            goto Lb1
        L98:
            android.view.View r13 = r12.f289494g
            m74.b r4 = r12.f289492e
            android.view.View r4 = r4.getContentView()
            int r8 = r12.c(r13, r4)
            r12.n(r8)
            m74.b r5 = r12.f289492e
            android.view.View r6 = r12.f289494g
            r7 = 0
            r9 = -1
            r10 = -1
            r5.update(r6, r7, r8, r9, r10)
        Lb1:
            com.tencent.mm.plugin.sns.model.q2 r13 = r2.k(r3)
            if (r13 == 0) goto Le5
            gm0.j1.i()
            gm0.y r2 = gm0.j1.n()
            com.tencent.mm.modelbase.r1 r2 = r2.f273288b
            r2.g(r13)
            goto Le5
        Lc4:
            r12.p(r3)
            r12.d()
            com.tencent.mm.plugin.sns.ui.listener.i r3 = r12.f289497m
            if (r3 == 0) goto Ld1
            r3.G(r13)
        Ld1:
            if (r2 == 0) goto Le5
            com.tencent.mm.plugin.sns.model.q2 r13 = r2.k(r4)
            if (r13 == 0) goto Le5
            gm0.j1.i()
            gm0.y r2 = gm0.j1.n()
            com.tencent.mm.modelbase.r1 r2 = r2.f273288b
            r2.g(r13)
        Le5:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i74.i.m(android.view.View):void");
    }

    public void n(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        i74.d dVar = this.f289495h;
        if (dVar != null) {
            dVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = dVar.f289463f;
            if (weImageView != null && dVar.f289464g != null) {
                if (i17 < 0) {
                    weImageView.setVisibility(8);
                    dVar.f289464g.setVisibility(0);
                } else {
                    weImageView.setVisibility(0);
                    dVar.f289464g.setVisibility(8);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showArrowByWindowPosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00af, blocks: (B:7:0x0013, B:9:0x0019, B:12:0x0023, B:20:0x003c, B:24:0x004a, B:28:0x0059, B:30:0x0082, B:31:0x008f, B:34:0x0089, B:37:0x0040), top: B:6:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o(android.view.View r8, com.tencent.mm.plugin.sns.storage.SnsInfo r9) {
        /*
            r7 = this;
            i74.a r0 = r7.f289496i
            java.lang.String r1 = "FeedbackPromptManager"
            java.lang.String r2 = "showFeedback"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = 0
            if (r8 != 0) goto L13
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L13:
            ca4.j r5 = r7.g(r8)     // Catch: java.lang.Throwable -> Laf
            if (r5 != 0) goto L23
            java.lang.String r8 = "the unlike tag is null. there is no data for showing window!"
            com.tencent.mars.xlog.Log.e(r1, r8)     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L23:
            r0.q(r5, r9)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r9 = "shouldUseNewFeedbackPanel"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)     // Catch: java.lang.Throwable -> Laf
            r6 = 1
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.e()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L40
            int r0 = r0.newFeedbackPanel     // Catch: java.lang.Throwable -> L40
            if (r0 <= 0) goto L3b
            r0 = r6
            goto L3c
        L3b:
            r0 = r4
        L3c:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)     // Catch: java.lang.Throwable -> Laf
            goto L44
        L40:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)     // Catch: java.lang.Throwable -> Laf
            r0 = r4
        L44:
            if (r0 != 0) goto L4a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L4a:
            r7.e()     // Catch: java.lang.Throwable -> Laf
            m74.b r9 = r7.f289492e     // Catch: java.lang.Throwable -> Laf
            boolean r9 = r9.isShowing()     // Catch: java.lang.Throwable -> Laf
            if (r9 == 0) goto L59
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r6
        L59:
            android.view.View r8 = r7.h(r8)     // Catch: java.lang.Throwable -> Laf
            r7.f289494g = r8     // Catch: java.lang.Throwable -> Laf
            i74.d r8 = r7.f289495h     // Catch: java.lang.Throwable -> Laf
            m74.b r9 = r7.f289492e     // Catch: java.lang.Throwable -> Laf
            android.view.View r9 = r9.getContentView()     // Catch: java.lang.Throwable -> Laf
            r8.e(r9)     // Catch: java.lang.Throwable -> Laf
            android.view.View r8 = r7.f289494g     // Catch: java.lang.Throwable -> Laf
            m74.b r9 = r7.f289492e     // Catch: java.lang.Throwable -> Laf
            android.view.View r9 = r9.getContentView()     // Catch: java.lang.Throwable -> Laf
            int r8 = r7.c(r8, r9)     // Catch: java.lang.Throwable -> Laf
            r7.n(r8)     // Catch: java.lang.Throwable -> Laf
            m74.b r9 = r7.f289492e     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = "getAnimationStyle"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)     // Catch: java.lang.Throwable -> Laf
            if (r8 >= 0) goto L89
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)     // Catch: java.lang.Throwable -> Laf
            r0 = 2131821463(0x7f110397, float:1.927567E38)
            goto L8f
        L89:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)     // Catch: java.lang.Throwable -> Laf
            r0 = 2131821464(0x7f110398, float:1.9275672E38)
        L8f:
            r9.setAnimationStyle(r0)     // Catch: java.lang.Throwable -> Laf
            m74.b r9 = r7.f289492e     // Catch: java.lang.Throwable -> Laf
            android.view.View r0 = r7.f289494g     // Catch: java.lang.Throwable -> Laf
            r5 = 8388613(0x800005, float:1.175495E-38)
            r9.showAsDropDown(r0, r4, r8, r5)     // Catch: java.lang.Throwable -> Laf
            m74.b r8 = r7.f289492e     // Catch: java.lang.Throwable -> Laf
            java.lang.String r9 = "getDimAccount"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r3)     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r3)     // Catch: java.lang.Throwable -> Laf
            r9 = 1056964608(0x3f000000, float:0.5)
            r8.a(r9)     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r6
        Laf:
            java.lang.String r8 = "show feedback window has something wrong!"
            com.tencent.mars.xlog.Log.e(r1, r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i74.i.o(android.view.View, com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        this.f289492e = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public final void p(boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("thanks", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        try {
            i74.a aVar = this.f289496i;
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNewStyleFlag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = aVar.f289456b;
            if (snsInfo != null) {
                z18 = com.tencent.mm.plugin.sns.storage.ADInfo.isNewStyleFeedback(snsInfo.getAdInfo());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNewStyleFlag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNewStyleFlag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                z18 = false;
            }
            com.tencent.mars.xlog.Log.i("FeedbackPromptManager", "thanks, hasNewStyleFlag=" + z18);
            if (z18) {
                db5.t7.h(this.f289491d, z17 ? this.f289491d.getString(com.tencent.mm.R.string.ls7) : this.f289491d.getString(com.tencent.mm.R.string.f493189ls4));
            } else {
                android.content.Context context = this.f289491d;
                db5.t7.h(context, z17 ? context.getString(com.tencent.mm.R.string.j8_) : context.getString(com.tencent.mm.R.string.j8a));
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("thanks", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }

    public final void q(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "appUserName");
        java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(intent, "appPagePath");
        java.lang.String l19 = com.tencent.mm.sdk.platformtools.c2.l(intent, "appVersion");
        java.lang.String l27 = com.tencent.mm.sdk.platformtools.c2.l(intent, "aId");
        java.lang.String l28 = com.tencent.mm.sdk.platformtools.c2.l(intent, "traceId");
        java.lang.String l29 = com.tencent.mm.sdk.platformtools.c2.l(intent, "sceneNote");
        java.lang.String l37 = com.tencent.mm.sdk.platformtools.c2.l(intent, "uxInfo");
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1045);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        if (android.text.TextUtils.isEmpty(l17)) {
            com.tencent.mars.xlog.Log.w("FeedbackPromptManager", "the app user name is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        } else {
            ca4.z0.r0(l17, l18, l19, l27, l28, l29, l37, g17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toWeApp", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
    }
}
