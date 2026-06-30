package com.tencent.mm.plugin.sns.cover.preview;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001b\u0012\u0006\u00105\u001a\u000204\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0005R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR6\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u0006:"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout;", "Landroid/widget/FrameLayout;", "Lv94/k;", "Landroidx/lifecycle/k0;", "Lcom/tencent/mm/plugin/sns/storage/x1;", "", "getPreviewType", "Lv94/j;", "getStatus", "Lv94/i;", "getSnsCoverReporter", "", "isPreview", "Ljz5/f0;", "setPreview", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "getSnsBackPreView", "newMode", "setMode", "newFoldHeight", "setFoldHeight", "height", "setHeight", "Lkotlin/Function0;", "s", "Lyz5/a;", "getCoverClickListener", "()Lyz5/a;", "setCoverClickListener", "(Lyz5/a;)V", "coverClickListener", "Lkotlin/Function2;", "t", "Lyz5/p;", "getOnViewSizeChanged", "()Lyz5/p;", "setOnViewSizeChanged", "(Lyz5/p;)V", "onViewSizeChanged", org.chromium.base.BaseSwitches.V, "I", "getExternalMargin", "()I", "setExternalMargin", "(I)V", "externalMargin", "Lba4/a;", "w", "Lba4/a;", "getCoverReporter", "()Lba4/a;", "coverReporter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsCoverContainerLayout extends android.widget.FrameLayout implements v94.k, androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f163998d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview f163999e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f164000f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f164001g;

    /* renamed from: h, reason: collision with root package name */
    public final v94.j f164002h;

    /* renamed from: i, reason: collision with root package name */
    public float f164003i;

    /* renamed from: m, reason: collision with root package name */
    public float f164004m;

    /* renamed from: n, reason: collision with root package name */
    public int f164005n;

    /* renamed from: o, reason: collision with root package name */
    public final int f164006o;

    /* renamed from: p, reason: collision with root package name */
    public int f164007p;

    /* renamed from: q, reason: collision with root package name */
    public int f164008q;

    /* renamed from: r, reason: collision with root package name */
    public int f164009r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public yz5.a coverClickListener;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public yz5.p onViewSizeChanged;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.x1 f164012u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public int externalMargin;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final ba4.a coverReporter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsCoverContainerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f164002h = new v94.j(true, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackWidthAndHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        int[] iArr = {com.tencent.mm.ui.bh.a(context).f197135a, 0};
        iArr[1] = (int) (iArr[0] * 1.7777778f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackWidthAndHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        int i17 = iArr[1];
        this.f164005n = i17;
        this.f164006o = i17;
        this.f164008q = 1;
        this.f164009r = i65.a.h(context, com.tencent.mm.R.dimen.aa_);
        this.coverReporter = new ba4.a();
        android.view.View view = new android.view.View(context);
        this.f164001g = view;
        android.view.View view2 = new android.view.View(context);
        this.f164000f = view2;
        view.setBackgroundResource(com.tencent.mm.R.color.BW_20);
        view2.setBackgroundResource(com.tencent.mm.R.color.a5r);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, i17);
        addView(view2, layoutParams);
        addView(view, layoutParams);
        com.tencent.mm.plugin.sns.storage.a2 Bj = com.tencent.mm.plugin.sns.model.l4.Bj();
        Bj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewModel", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewModel", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        nb4.m mVar = Bj.f165924f;
        mVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserCover", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        androidx.lifecycle.j0 j0Var = mVar.f336087e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserCover", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        j0Var.observeForever(this);
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverContainerLayout", "[" + hashCode() + "] onPostClose");
        android.view.View view = this.f164001g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout", "onPostClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout", "onPostClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f164002h.f434167a = true;
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = this.f163999e;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onPostClose();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverContainerLayout", "[" + hashCode() + "] onPreClose");
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = this.f163999e;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onPreClose();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void c(boolean z17, java.lang.String userName) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCoverReportData", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        boolean z18 = !this.f164002h.f434168b;
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsCoverActionData", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverActionStruct snsCoverActionStruct = s0Var.X;
        if (z18) {
            snsCoverActionStruct.f60508d = 1;
        } else if (z17) {
            snsCoverActionStruct.f60508d = 2;
        } else {
            snsCoverActionStruct.f60508d = 3;
        }
        snsCoverActionStruct.f60510f = snsCoverActionStruct.b("OwnerUsername", userName, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsCoverActionData", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCoverReportData", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void d(com.tencent.mm.plugin.sns.storage.x1 x1Var) {
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBackView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverContainerLayout", "updateBackView info:" + x1Var + "  useNewVersion:" + w94.a.f444075a.b());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceBackView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        this.f164012u = x1Var;
        int type = x1Var != null ? x1Var.getType() : 0;
        android.view.View childAt = getChildAt(0);
        boolean z17 = childAt instanceof com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview;
        if (z17) {
            absSnsBackPreview = (com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview) childAt;
            if (absSnsBackPreview.getType() == type) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceBackView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310568a, null, new aa4.c(absSnsBackPreview, x1Var, this, null), 2, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            }
        }
        if (z17) {
            com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview2 = (com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview) childAt;
            absSnsBackPreview2.onPause();
            absSnsBackPreview2.onDestroy();
            removeViewAt(0);
        }
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview3 = this.f163999e;
        float translationY = absSnsBackPreview3 != null ? absSnsBackPreview3.getTranslationY() : 0.0f;
        aa4.a aVar = aa4.a.f2635a;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview a17 = aVar.a(context, type, this.f164008q, this.f164009r);
        this.f163999e = a17;
        if (a17 != null) {
            a17.setCoverFoldStatusProvider(this);
        }
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.z().f60509e = type;
        s0Var.f(1);
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview4 = this.f163999e;
        if (absSnsBackPreview4 != null) {
            absSnsBackPreview4.setTranslationY(translationY);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, this.f164005n);
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview5 = this.f163999e;
        if (absSnsBackPreview5 != null) {
            absSnsBackPreview5.setOnClickListener(new aa4.b(this));
        }
        addView(this.f163999e, 0, layoutParams);
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview6 = this.f163999e;
        android.view.View findViewById = absSnsBackPreview6 != null ? absSnsBackPreview6.findViewById(com.tencent.mm.R.id.n7q) : null;
        if (findViewById != null) {
            findViewById.setBackgroundResource(com.tencent.mm.R.drawable.b1t);
        }
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview7 = this.f163999e;
        android.view.View findViewById2 = absSnsBackPreview7 != null ? absSnsBackPreview7.findViewById(com.tencent.mm.R.id.n7p) : null;
        if (findViewById2 != null) {
            findViewById2.setBackgroundResource(com.tencent.mm.R.drawable.b1r);
        }
        absSnsBackPreview = this.f163999e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceBackView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310568a, null, new aa4.c(absSnsBackPreview, x1Var, this, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final yz5.a getCoverClickListener() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverClickListener", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        yz5.a aVar = this.coverClickListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverClickListener", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return aVar;
    }

    public final ba4.a getCoverReporter() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return this.coverReporter;
    }

    public final int getExternalMargin() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExternalMargin", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        int i17 = this.externalMargin;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExternalMargin", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return i17;
    }

    public final yz5.p getOnViewSizeChanged() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnViewSizeChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        yz5.p pVar = this.onViewSizeChanged;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnViewSizeChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return pVar;
    }

    public final int getPreviewType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPreviewType", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = this.f163999e;
        int type = absSnsBackPreview != null ? absSnsBackPreview.getType() : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreviewType", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return type;
    }

    public final com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview getSnsBackPreView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsBackPreView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = this.f163999e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBackPreView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return absSnsBackPreview;
    }

    @Override // v94.k
    public v94.i getSnsCoverReporter() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return this.coverReporter;
    }

    @Override // v94.k
    public v94.j getStatus() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStatus", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatus", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return this.f164002h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        super.onAttachedToWindow();
        android.view.ViewGroup viewGroup = this;
        do {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            android.view.ViewParent parent = viewGroup.getParent();
            viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup == null) {
                break;
            }
        } while (!(viewGroup instanceof com.tencent.mm.ui.base.MMOverScrollView));
        while (viewGroup != null) {
            this.f163998d = viewGroup;
            if (viewGroup.getId() == 16908290) {
                break;
            }
            android.view.ViewParent parent2 = viewGroup.getParent();
            viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.tencent.mm.plugin.sns.storage.x1 x1Var = (com.tencent.mm.plugin.sns.storage.x1) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverContainerLayout", "onChanged current:" + this.f164012u + " update:" + x1Var);
        com.tencent.mm.plugin.sns.storage.x1 x1Var2 = this.f164012u;
        if (kotlin.jvm.internal.o.b(x1Var2 != null ? x1Var2.field_userName : null, x1Var != null ? x1Var.field_userName : null) && x1Var != null) {
            this.f164012u = x1Var;
            d(x1Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        super.onDetachedFromWindow();
        this.f163998d = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateViewSize", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        if (z17) {
            getLocationInWindow(new int[2]);
            this.f164000f.setTranslationY(getHeight());
            this.f164001g.setTranslationY(-this.f164006o);
            this.f164005n = (int) (getWidth() * 1.7777778f);
            int height = getHeight();
            android.view.ViewGroup viewGroup = this.f163998d;
            if (viewGroup != null) {
                height = viewGroup.getHeight() - getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
            }
            if (this.f164005n > height) {
                this.f164005n = height;
            }
            if (this.f164005n < getHeight()) {
                this.f164005n = getHeight();
            }
            this.f164003i = getHeight() - this.f164005n;
            int height2 = getHeight();
            int i28 = this.f164005n;
            this.f164004m = (height2 - i28) / 2;
            this.f164007p = (i28 - getHeight()) - this.externalMargin;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverContainerLayout", "updateViewSize: " + this.f164005n + ", " + this.f164007p);
            com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = this.f163999e;
            android.view.ViewGroup.LayoutParams layoutParams = absSnsBackPreview != null ? absSnsBackPreview.getLayoutParams() : null;
            if (layoutParams != null) {
                int i29 = layoutParams.height;
                int i37 = this.f164005n;
                if (i29 != i37) {
                    layoutParams.height = i37;
                    com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview2 = this.f163999e;
                    if (absSnsBackPreview2 != null) {
                        absSnsBackPreview2.setLayoutParams(layoutParams);
                    }
                }
            }
            yz5.p pVar = this.onViewSizeChanged;
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(this.f164005n), java.lang.Integer.valueOf(this.f164007p));
            }
            com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview3 = this.f163999e;
            if (kotlin.jvm.internal.o.a(absSnsBackPreview3 != null ? java.lang.Float.valueOf(absSnsBackPreview3.getTranslationY()) : null, 0.0f)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("opening", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
                float f17 = this.f164003i;
                float f18 = this.f164004m;
                float f19 = ((f17 - f18) * 0.0f) + f18;
                com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview4 = this.f163999e;
                if (absSnsBackPreview4 != null) {
                    absSnsBackPreview4.setTranslationY(f19);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("opening", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateViewSize", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateViewSize", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void setCoverClickListener(yz5.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCoverClickListener", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        this.coverClickListener = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCoverClickListener", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void setExternalMargin(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExternalMargin", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        this.externalMargin = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExternalMargin", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void setFoldHeight(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFoldHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        this.f164009r = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFoldHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void setHeight(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCoverContainerLayout", "setHeight: " + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverContainerLayout", "setHeight: " + i17);
        getLayoutParams().height = i17;
        requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void setMode(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        this.f164008q = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMode", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void setOnViewSizeChanged(yz5.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnViewSizeChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        this.onViewSizeChanged = pVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnViewSizeChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void setPreview(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPreview", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        this.f164002h.f434168b = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPreview", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }
}
