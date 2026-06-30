package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGameInfoView;", "Lcom/tencent/mm/magicbrush/plugin/scl/view/MagicSclViewContainer;", "Lmm2/c1;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ljz5/f0;", "setup", "", "getFrameSetName", "Lik2/e;", "w", "Lik2/e;", "getSurfaceMgr", "()Lik2/e;", "setSurfaceMgr", "(Lik2/e;)V", "surfaceMgr", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveGameInfoView extends com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer {

    /* renamed from: x, reason: collision with root package name */
    public static long f115913x = java.lang.System.currentTimeMillis();

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f115914u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f115915v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public ik2.e surfaceMgr;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveGameInfoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void g(java.lang.String str) {
        hq0.e0 e0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveGameInfoView", "notifyGameData:" + str);
        ik2.e eVar = this.surfaceMgr;
        if (eVar == null || (e0Var = eVar.f291887c) == null) {
            return;
        }
        e0Var.a(str, null);
    }

    public final java.lang.String getFrameSetName() {
        return "portrait_game_outfits";
    }

    public final ik2.e getSurfaceMgr() {
        return this.surfaceMgr;
    }

    @Override // com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveGameInfoView", "onAttachedToWindow");
        super.onAttachedToWindow();
    }

    @Override // com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveGameInfoView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        this.f115915v = false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1740, 3);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        getMeasuredHeight();
        getMeasuredWidth();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    public final void setSurfaceMgr(ik2.e eVar) {
        this.surfaceMgr = eVar;
    }

    public final void setup(mm2.c1 data) {
        jz5.f0 f0Var;
        hq0.e0 e0Var;
        kotlin.jvm.internal.o.g(data, "data");
        if (this.f115915v) {
            return;
        }
        e(getFrameSetName());
        fq0.x xVar = this.frameSet;
        if (xVar != null) {
            xVar.f265486j = false;
            pm0.v.X(new fq0.s(xVar, false));
        }
        ik2.e eVar = this.surfaceMgr;
        if (eVar != null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            eVar.a(context, data.f328852o, ((mm2.e1) data.business(mm2.e1.class)).f328983m);
        }
        ik2.e eVar2 = this.surfaceMgr;
        if (eVar2 == null || (e0Var = eVar2.f291887c) == null) {
            f0Var = null;
        } else {
            a(e0Var);
            this.f115915v = true;
            f115913x = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(23423, "wx9e221f7828fa7482", 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(f115913x));
            java.lang.String str = this.f115914u;
            if (str != null) {
                g(str);
            }
            g0Var.A(1740, 1);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FinderLiveGameInfoView", "root is null");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveGameInfoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
