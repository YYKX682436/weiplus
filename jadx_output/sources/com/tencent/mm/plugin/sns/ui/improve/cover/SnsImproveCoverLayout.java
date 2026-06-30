package com.tencent.mm.plugin.sns.ui.improve.cover;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105B#\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\u0006\u00106\u001a\u00020\u0004¢\u0006\u0004\b4\u00107J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004R\u001b\u0010\u0013\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00068"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/cover/SnsImproveCoverLayout;", "Landroid/widget/FrameLayout;", "", "getStagePercent", "", "height", "Ljz5/f0;", "setHeight", "setHeightSilently", "getHeightSilently", "newMode", "setMode", "newFoldHeight", "setFoldHeight", "getFoldHeight", "g", "Ljz5/g;", "getDragMaxOffset", "()I", "dragMaxOffset", "Lkotlin/Function1;", "h", "Lyz5/l;", "getHeightChangedCallback", "()Lyz5/l;", "setHeightChangedCallback", "(Lyz5/l;)V", "heightChangedCallback", "i", "getDragCallback", "setDragCallback", "dragCallback", "Lcom/tencent/mm/feature/sns/api/ICoverStatusChanged;", "m", "Lcom/tencent/mm/feature/sns/api/ICoverStatusChanged;", "getStatusChangedCallback", "()Lcom/tencent/mm/feature/sns/api/ICoverStatusChanged;", "setStatusChangedCallback", "(Lcom/tencent/mm/feature/sns/api/ICoverStatusChanged;)V", "statusChangedCallback", "Lkotlin/Function0;", "n", "Lyz5/a;", "getLegacyClickListener", "()Lyz5/a;", "setLegacyClickListener", "(Lyz5/a;)V", "legacyClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsImproveCoverLayout extends android.widget.FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f169065o = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f169066d;

    /* renamed from: e, reason: collision with root package name */
    public int f169067e;

    /* renamed from: f, reason: collision with root package name */
    public int f169068f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g dragMaxOffset;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.l heightChangedCallback;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yz5.l dragCallback;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.feature.sns.api.ICoverStatusChanged statusChangedCallback;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.a legacyClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsImproveCoverLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f169066d = i65.a.f(getContext(), com.tencent.mm.R.dimen.aa_);
        this.f169067e = 1;
        this.f169068f = 1;
        this.dragMaxOffset = jz5.h.b(new qc4.c(this));
        setOnClickListener(new qc4.a(this));
    }

    private final int getDragMaxOffset() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDragMaxOffset", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int intValue = ((java.lang.Number) this.dragMaxOffset.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDragMaxOffset", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return intValue;
    }

    public final void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addViewImpl", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        if (view.getParent() != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addViewImpl", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
            return;
        }
        int b17 = b();
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CoverLayout", "addView: height=" + b17);
        addView(view, new android.widget.FrameLayout.LayoutParams(-1, b17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addViewImpl", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        } else if (getWidth() == 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new qc4.b(this, view));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        } else {
            a(view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        }
    }

    public final int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateExpandHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479731dn);
        int width = (int) (getWidth() * ((this.f169068f == 1 || !pc4.d.f353410a.y()) ? 1.7777778f : 0.9f));
        int k17 = (i65.a.k(getContext()) - com.tencent.mm.ui.bl.c(getContext())) - f17;
        if (width > k17) {
            width = k17;
        }
        int f18 = this.f169066d + i65.a.f(getContext(), com.tencent.mm.R.dimen.f479671c8);
        if (width < f18) {
            width = f18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CoverLayout", "backViewHeight=" + width + ", maxHeight=" + k17 + ", viewHeight=" + getHeight());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateExpandHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return width;
    }

    public final synchronized void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeCoverStage", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int i17 = this.f169067e;
        if (i17 == 1) {
            e(b(), 2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeCoverStage", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        } else if (i17 != 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeCoverStage", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        } else {
            e(this.f169066d, 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeCoverStage", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        }
    }

    public final void d(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleDrag", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CoverLayout", "handleDrag: " + f17);
        float min = java.lang.Math.min(java.lang.Math.max(0.0f, f17 * 0.4f), (float) getDragMaxOffset());
        if (min > 0.0f) {
            yz5.l lVar = this.dragCallback;
            if (lVar != null) {
                lVar.invoke(java.lang.Float.valueOf(min));
            }
            setHeightSilently((int) (this.f169066d + min));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDrag", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final void e(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateViewHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CoverLayout", "updateViewHeight height:" + i17 + " newStage:" + i18);
        this.f169067e = 3;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofInt(this, "height", i17).setDuration(250L);
        kotlin.jvm.internal.o.f(duration, "setDuration(...)");
        duration.addListener(new qc4.f(i18, this));
        duration.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateViewHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final yz5.l getDragCallback() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDragCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        yz5.l lVar = this.dragCallback;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDragCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return lVar;
    }

    public final int getFoldHeight() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFoldHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int i17 = this.f169066d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFoldHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return i17;
    }

    public final yz5.l getHeightChangedCallback() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeightChangedCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        yz5.l lVar = this.heightChangedCallback;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeightChangedCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return lVar;
    }

    public final int getHeightSilently() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeightSilently", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int i17 = getLayoutParams().height;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeightSilently", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return i17;
    }

    public final yz5.a getLegacyClickListener() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLegacyClickListener", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        yz5.a aVar = this.legacyClickListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLegacyClickListener", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return aVar;
    }

    public final float getStagePercent() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStagePercent", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int b17 = b() - this.f169066d;
        float f17 = 1.0f;
        if (b17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStagePercent", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
            return 1.0f;
        }
        int i17 = getLayoutParams().height - this.f169066d;
        float f18 = (i17 * 1.0f) / b17;
        if (f18 < 1.0f) {
            f17 = 0.0f;
            if (f18 > 0.0f) {
                f17 = f18;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CoverLayout", "getStagePercent: percent=" + f17 + ", current=" + i17 + ", maxDistance=" + b17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStagePercent", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return f17;
    }

    public final com.tencent.mm.feature.sns.api.ICoverStatusChanged getStatusChangedCallback() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStatusChangedCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.tencent.mm.feature.sns.api.ICoverStatusChanged iCoverStatusChanged = this.statusChangedCallback;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStatusChangedCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        return iCoverStatusChanged;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        super.onConfigurationChanged(configuration);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onConfigurationChanged: orientation=");
        sb6.append(configuration != null ? java.lang.Integer.valueOf(configuration.orientation) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CoverLayout", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFoldWithoutAni", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        this.f169067e = 1;
        setHeight(this.f169066d);
        com.tencent.mm.feature.sns.api.ICoverStatusChanged iCoverStatusChanged = this.statusChangedCallback;
        if (iCoverStatusChanged != null) {
            iCoverStatusChanged.onPreClose();
        }
        com.tencent.mm.feature.sns.api.ICoverStatusChanged iCoverStatusChanged2 = this.statusChangedCallback;
        if (iCoverStatusChanged2 != null) {
            iCoverStatusChanged2.onPostClose();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFoldWithoutAni", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        int childCount = getChildCount();
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            int b17 = (b() - (i27 - i18)) / 2;
            childAt.layout(i17, -b17, i19, b17 + i27);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        super.onMeasure(i17, i18);
        android.view.View childAt = getChildAt(0);
        android.view.ViewGroup.LayoutParams layoutParams = childAt != null ? childAt.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final void setDragCallback(yz5.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDragCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        this.dragCallback = lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDragCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final void setFoldHeight(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFoldHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        this.f169066d = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFoldHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final void setHeight(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CoverLayout", "setHeight: " + i17);
        getLayoutParams().height = i17;
        requestLayout();
        yz5.l lVar = this.heightChangedCallback;
        if (lVar != null) {
            lVar.invoke(java.lang.Float.valueOf(getStagePercent()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeight", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final void setHeightChangedCallback(yz5.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeightChangedCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        this.heightChangedCallback = lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeightChangedCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final void setHeightSilently(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeightSilently", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.CoverLayout", "setHeightSilently: " + i17);
        getLayoutParams().height = i17;
        requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeightSilently", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final void setLegacyClickListener(yz5.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLegacyClickListener", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        this.legacyClickListener = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLegacyClickListener", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final void setMode(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMode", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        this.f169068f = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMode", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    public final void setStatusChangedCallback(com.tencent.mm.feature.sns.api.ICoverStatusChanged iCoverStatusChanged) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStatusChangedCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
        this.statusChangedCallback = iCoverStatusChanged;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStatusChangedCallback", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsImproveCoverLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f169066d = i65.a.f(getContext(), com.tencent.mm.R.dimen.aa_);
        this.f169067e = 1;
        this.f169068f = 1;
        this.dragMaxOffset = jz5.h.b(new qc4.c(this));
        setOnClickListener(new qc4.a(this));
    }
}
