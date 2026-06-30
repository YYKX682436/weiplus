package com.tencent.mm.plugin.sns.ui.improve.view.flexible;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001d\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B%\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleScaleSurfaceView;", "Landroid/view/SurfaceView;", "Ldd4/u0;", "Landroid/view/SurfaceHolder$Callback;", "Ldb5/e7;", "Lcom/tencent/mm/pluginsdk/ui/e1;", "type", "Ljz5/f0;", "setScaleType", "Lr45/jj4;", "media", "setupPlayerPositionAndSize", "Lik4/r;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFlexibleSurfaceListener", "", "isIntercepted", "setInterceptDetach", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FlexibleScaleSurfaceView extends android.view.SurfaceView implements dd4.u0, android.view.SurfaceHolder.Callback, db5.e7 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.o8 f169209d;

    /* renamed from: e, reason: collision with root package name */
    public int f169210e;

    /* renamed from: f, reason: collision with root package name */
    public int f169211f;

    /* renamed from: g, reason: collision with root package name */
    public ik4.r f169212g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f169213h;

    public FlexibleScaleSurfaceView(android.content.Context context) {
        super(context);
        getHolder().addCallback(this);
        this.f169209d = new com.tencent.mm.pluginsdk.ui.tools.o8();
    }

    public void a(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        if (i17 == 0 || i18 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
            return;
        }
        this.f169211f = i17;
        this.f169210e = i18;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
            return;
        }
        layoutParams.addRule(13);
        requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        if (this.f169211f == 0 || this.f169210e == 0) {
            setMeasuredDimension(1, 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        int i19 = this.f169211f;
        int i27 = this.f169210e;
        com.tencent.mm.pluginsdk.ui.tools.o8 o8Var = this.f169209d;
        o8Var.a(defaultSize, defaultSize2, i19, i27);
        setMeasuredDimension(o8Var.f191818g, o8Var.f191819h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // dd4.u0
    public void setFlexibleSurfaceListener(ik4.r listener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFlexibleSurfaceListener", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f169212g = listener;
        android.view.Surface surface = this.f169213h;
        boolean z17 = false;
        if (surface != null && surface.isValid()) {
            z17 = true;
        }
        if (z17) {
            android.view.Surface surface2 = this.f169213h;
            kotlin.jvm.internal.o.d(surface2);
            listener.b(surface2, getWidth(), getHeight(), 2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFlexibleSurfaceListener", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // db5.e7
    public void setInterceptDetach(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInterceptDetach", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInterceptDetach", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // dd4.u0
    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 type) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        kotlin.jvm.internal.o.g(type, "type");
        this.f169209d.d(type);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // dd4.u0
    public void setupPlayerPositionAndSize(r45.jj4 media) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        kotlin.jvm.internal.o.g(media, "media");
        r45.lj4 lj4Var = media.f377865p;
        if (lj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        } else {
            a((int) lj4Var.f379520d, (int) lj4Var.f379521e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("surfaceChanged", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("surfaceChanged", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("surfaceCreated", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f169213h = holder.getSurface();
        ik4.r rVar = this.f169212g;
        if (rVar != null) {
            android.view.Surface surface = holder.getSurface();
            kotlin.jvm.internal.o.f(surface, "getSurface(...)");
            rVar.b(surface, getWidth(), getHeight(), 2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("surfaceCreated", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("surfaceDestroyed", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
        kotlin.jvm.internal.o.g(holder, "holder");
        ik4.r rVar = this.f169212g;
        if (rVar != null) {
            android.view.Surface surface = holder.getSurface();
            kotlin.jvm.internal.o.f(surface, "getSurface(...)");
            rVar.a(surface);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("surfaceDestroyed", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleSurfaceView");
    }

    public FlexibleScaleSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        getHolder().addCallback(this);
        this.f169209d = new com.tencent.mm.pluginsdk.ui.tools.o8();
    }

    public FlexibleScaleSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        getHolder().addCallback(this);
        this.f169209d = new com.tencent.mm.pluginsdk.ui.tools.o8();
    }
}
