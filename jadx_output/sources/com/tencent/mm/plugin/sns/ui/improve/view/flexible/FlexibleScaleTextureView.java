package com.tencent.mm.plugin.sns.ui.improve.view.flexible;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleScaleTextureView;", "Lcom/tencent/mm/plugin/thumbplayer/view/MMTextureView;", "Ldd4/u0;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lcom/tencent/mm/pluginsdk/ui/e1;", "type", "Ljz5/f0;", "setScaleType", "Lr45/jj4;", "media", "setupPlayerPositionAndSize", "Lik4/r;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFlexibleSurfaceListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FlexibleScaleTextureView extends com.tencent.mm.plugin.thumbplayer.view.MMTextureView implements dd4.u0, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.o8 f169214h;

    /* renamed from: i, reason: collision with root package name */
    public int f169215i;

    /* renamed from: m, reason: collision with root package name */
    public int f169216m;

    /* renamed from: n, reason: collision with root package name */
    public ik4.r f169217n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.Surface f169218o;

    public FlexibleScaleTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f169214h = new com.tencent.mm.pluginsdk.ui.tools.o8();
        setSurfaceTextureListener(this);
    }

    public void k(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        if (i17 == 0 || i18 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
            return;
        }
        if (this.f169216m == i17 && this.f169215i == i18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
            return;
        }
        this.f169216m = i17;
        this.f169215i = i18;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
            return;
        }
        layoutParams.addRule(13);
        requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        if (this.f169216m == 0 || this.f169215i == 0) {
            setMeasuredDimension(1, 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        int i19 = this.f169216m;
        int i27 = this.f169215i;
        com.tencent.mm.pluginsdk.ui.tools.o8 o8Var = this.f169214h;
        o8Var.a(defaultSize, defaultSize2, i19, i27);
        setMeasuredDimension(o8Var.f191818g, o8Var.f191819h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture texture, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        kotlin.jvm.internal.o.g(texture, "texture");
        android.view.Surface surface = new android.view.Surface(texture);
        this.f169218o = surface;
        ik4.r rVar = this.f169217n;
        if (rVar != null) {
            rVar.b(surface, i17, i18, 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture texture) {
        ik4.r rVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        kotlin.jvm.internal.o.g(texture, "texture");
        android.view.Surface surface = this.f169218o;
        if (surface != null && (rVar = this.f169217n) != null) {
            rVar.a(surface);
        }
        this.f169218o = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // dd4.u0
    public void setFlexibleSurfaceListener(ik4.r listener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFlexibleSurfaceListener", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f169217n = listener;
        android.view.Surface surface = this.f169218o;
        boolean z17 = false;
        if (surface != null && surface.isValid()) {
            z17 = true;
        }
        if (z17) {
            android.view.Surface surface2 = this.f169218o;
            kotlin.jvm.internal.o.d(surface2);
            listener.b(surface2, getWidth(), getHeight(), 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFlexibleSurfaceListener", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // dd4.u0
    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 type) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        kotlin.jvm.internal.o.g(type, "type");
        this.f169214h.d(type);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScaleType", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
    }

    @Override // dd4.u0
    public void setupPlayerPositionAndSize(r45.jj4 media) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        kotlin.jvm.internal.o.g(media, "media");
        r45.lj4 lj4Var = media.f377865p;
        if (lj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        } else {
            k((int) lj4Var.f379520d, (int) lj4Var.f379521e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupPlayerPositionAndSize", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleScaleTextureView");
        }
    }

    public FlexibleScaleTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f169214h = new com.tencent.mm.pluginsdk.ui.tools.o8();
        setSurfaceTextureListener(this);
    }

    public FlexibleScaleTextureView(android.content.Context context) {
        super(context);
        this.f169214h = new com.tencent.mm.pluginsdk.ui.tools.o8();
        setSurfaceTextureListener(this);
    }
}
