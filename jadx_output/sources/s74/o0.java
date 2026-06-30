package s74;

/* loaded from: classes4.dex */
public abstract class o0 extends com.tencent.mm.plugin.sns.ui.widget.l {
    public static final s74.a D = new s74.a(null);
    public java.util.List A;
    public boolean B;
    public final jz5.g C;

    /* renamed from: o, reason: collision with root package name */
    public final int f404448o;

    /* renamed from: p, reason: collision with root package name */
    public final i64.b1 f404449p;

    /* renamed from: q, reason: collision with root package name */
    public final w64.l f404450q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.k4 f404451r;

    /* renamed from: s, reason: collision with root package name */
    public final s74.p2 f404452s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.r0 f404453t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f404454u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f404455v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f404456w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f404457x;

    /* renamed from: y, reason: collision with root package name */
    public s74.f3 f404458y;

    /* renamed from: z, reason: collision with root package name */
    public int f404459z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, int i17, i64.b1 mSnsAdStatistic, w64.l lVar, com.tencent.mm.plugin.sns.model.k4 k4Var, s74.p2 dependViews) {
        super(str, yVar, view);
        kotlin.jvm.internal.o.g(mSnsAdStatistic, "mSnsAdStatistic");
        kotlin.jvm.internal.o.g(dependViews, "dependViews");
        this.f404448o = i17;
        this.f404449p = mSnsAdStatistic;
        this.f404450q = lVar;
        this.f404451r = k4Var;
        this.f404452s = dependViews;
        int i18 = kotlinx.coroutines.r0.N0;
        this.f404453t = new s74.n0(kotlinx.coroutines.q0.f310567d, this);
        this.f404454u = jz5.h.b(new s74.p(this));
        this.C = jz5.h.b(s74.o.f404447d);
    }

    public static final void y(s74.o0 o0Var, s74.j3 j3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setOuterAreaClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        o0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOuterAreaClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mars.xlog.Log.i(o0Var.j(), "setOuterAreaClick " + o0Var.N());
        java.lang.Object e17 = o0Var.f404452s.e();
        s74.p0 p0Var = e17 instanceof s74.p0 ? (s74.p0) e17 : null;
        android.widget.LinearLayout linearLayout = p0Var != null ? p0Var.f169286o : null;
        if (o0Var.N()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageKeeperLayoutClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            s74.m0 m0Var = new s74.m0(o0Var);
            if (linearLayout != null) {
                linearLayout.setOnClickListener(m0Var);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageKeeperLayoutClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            android.view.View c17 = j3Var != null ? j3Var.c() : null;
            if (c17 != null) {
                c17.setDuplicateParentStateEnabled(true);
            }
            r5 = j3Var != null ? j3Var.c() : null;
            if (r5 != null) {
                r5.setClickable(false);
            }
        } else {
            if (linearLayout != null) {
                linearLayout.setOnClickListener(null);
            }
            if (linearLayout != null) {
                linearLayout.setClickable(false);
            }
            if (p0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                r5 = p0Var.D0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
            }
            if (r5 != null) {
                r5.setDuplicateParentStateEnabled(false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOuterAreaClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setOuterAreaClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4 A[Catch: all -> 0x0722, TRY_LEAVE, TryCatch #0 {all -> 0x0722, blocks: (B:3:0x0040, B:5:0x0052, B:8:0x0056, B:10:0x007b, B:12:0x0083, B:14:0x0087, B:17:0x0090, B:19:0x00a4), top: B:2:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.sns.storage.SnsInfo r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.o0.A(com.tencent.mm.plugin.sns.storage.SnsInfo, boolean):void");
    }

    public final int B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContainerViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        int i17 = this.f404459z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContainerViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return i17;
    }

    public final s74.p2 C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDependViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDependViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return this.f404452s;
    }

    public final s74.f3 D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicViewCtx", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        s74.f3 f3Var = this.f404458y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicViewCtx", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return f3Var;
    }

    public final android.content.Context E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        s74.p2 p2Var = this.f404452s;
        p2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCtx", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCtx", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return p2Var.f404482c;
    }

    public final com.tencent.mm.plugin.sns.ui.MaskImageView F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMaskImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = (com.tencent.mm.plugin.sns.ui.MaskImageView) ((jz5.n) this.f404454u).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMaskImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return maskImageView;
    }

    public final i64.b1 G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return this.f404449p;
    }

    public final int H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return this.f404448o;
    }

    public final android.view.View I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElementContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        android.view.View view = this.f404457x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElementContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return view;
    }

    public final java.util.List J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOtherAlphaAnimViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        java.util.List list = this.f404456w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOtherAlphaAnimViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return list;
    }

    public abstract void K(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo);

    public abstract void L(s74.f3 f3Var);

    public final void M(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetDynamicView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        java.lang.String j17 = j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetComponentState ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) i();
        sb6.append(snsInfo != null ? snsInfo.getSnsId() : null);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        viewGroup.removeAllViews();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetDynamicView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if ((r2 != null ? r2.i() : 0) < 101) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N() {
        /*
            r7 = this;
            java.lang.String r0 = "shouldOuterClick"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r7.f404448o
            r3 = 0
            if (r2 != 0) goto L35
            s74.f3 r2 = r7.f404458y
            r4 = 1
            if (r2 == 0) goto L23
            java.lang.String r5 = "isEnableOuterAreaClick"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            boolean r2 = r2.f404278l
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            if (r2 != r4) goto L23
            r2 = r4
            goto L24
        L23:
            r2 = r3
        L24:
            if (r2 != 0) goto L34
            s74.f3 r2 = r7.f404458y
            if (r2 == 0) goto L2f
            int r2 = r2.i()
            goto L30
        L2f:
            r2 = r3
        L30:
            r5 = 101(0x65, float:1.42E-43)
            if (r2 >= r5) goto L35
        L34:
            r3 = r4
        L35:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.o0.N():boolean");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public /* bridge */ /* synthetic */ void d(java.lang.Object obj, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        A((com.tencent.mm.plugin.sns.storage.SnsInfo) obj, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean n(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo lastModel = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo currentModel = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        kotlin.jvm.internal.o.g(lastModel, "lastModel");
        kotlin.jvm.internal.o.g(currentModel, "currentModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisableCompareDynamicXml", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        jz5.g gVar = this.C;
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisableCompareDynamicXml", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        boolean z17 = false;
        boolean z18 = booleanValue || (com.tencent.mm.sdk.platformtools.t8.D0(lastModel.getAdXml().adDynamicInfo, currentModel.getAdXml().adDynamicInfo) && com.tencent.mm.sdk.platformtools.t8.D0(lastModel.getAdXml().adDynamicAttr, currentModel.getAdXml().adDynamicAttr));
        java.lang.String j17 = j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("disableCompareDynamicXml is ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisableCompareDynamicXml", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        boolean booleanValue2 = ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisableCompareDynamicXml", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        sb6.append(booleanValue2);
        sb6.append(", compareDynamicXmlResult is ");
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        if (kotlin.jvm.internal.o.b(lastModel.getSnsId(), currentModel.getSnsId()) && z18) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void s(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        super.s(snsInfo);
        kotlinx.coroutines.y0 h17 = h();
        if (h17 != null) {
            kotlinx.coroutines.l.d(h17, kotlinx.coroutines.q1.f310570c.plus(this.f404453t), null, new s74.x(snsInfo, this, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
    }

    public final void z() {
        java.lang.Float f17;
        java.lang.Float f18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustRootMargin", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        s74.f3 f3Var = this.f404458y;
        if (f3Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootViewMarginTop", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            f17 = f3Var.f404279m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootViewMarginTop", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        } else {
            f17 = null;
        }
        s74.p2 p2Var = this.f404452s;
        android.view.ViewGroup a17 = p2Var.a();
        android.widget.RelativeLayout relativeLayout = a17 instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) a17 : null;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        android.view.View view = p2Var.f404480a;
        if (layoutParams != null && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = f17 != null ? (int) f17.floatValue() : a84.d0.a(10);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
            view.requestLayout();
        }
        s74.f3 f3Var2 = this.f404458y;
        if (f3Var2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootViewMarginBottom", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            f18 = f3Var2.f404280n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootViewMarginBottom", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        } else {
            f18 = null;
        }
        android.view.ViewGroup a18 = p2Var.a();
        android.widget.RelativeLayout relativeLayout2 = a18 instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) a18 : null;
        android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout2 != null ? relativeLayout2.getLayoutParams() : null;
        if (layoutParams2 != null && (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = f18 != null ? (int) f18.floatValue() : a84.d0.a(2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicDependedView");
            view.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustRootMargin", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
    }
}
