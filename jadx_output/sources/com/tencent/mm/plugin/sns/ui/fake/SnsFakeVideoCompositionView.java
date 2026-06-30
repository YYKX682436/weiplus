package com.tencent.mm.plugin.sns.ui.fake;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoCompositionView;", "Lcom/tencent/mm/videocomposition/play/VideoCompositionPlayView;", "Ldb5/e7;", "", "isIntercepted", "Ljz5/f0;", "setInterceptDetach", "r", "Z", "isInterceptedDetach", "()Z", "setInterceptedDetach", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class SnsFakeVideoCompositionView extends com.tencent.mm.videocomposition.play.VideoCompositionPlayView implements db5.e7 {

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean isInterceptedDetach;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Object f168322s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Object f168323t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsFakeVideoCompositionView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    @Override // android.view.View
    public void destroyDrawingCache() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        super.destroyDrawingCache();
        if (this.isInterceptedDetach) {
            z();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        if (this.isInterceptedDetach) {
            v();
        }
        super.onAttachedToWindow();
        if (this.isInterceptedDetach) {
            z();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        if (this.isInterceptedDetach) {
            v();
        } else {
            try {
                super.onDetachedFromWindow();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsFakeVideoCompositionView", e17, "unkown error", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    @Override // db5.e7
    public void setInterceptDetach(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInterceptDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        this.isInterceptedDetach = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInterceptDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    public final void setInterceptedDetach(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInterceptedDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        this.isInterceptedDetach = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInterceptedDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    public final void v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hookInnerDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoCompositionView", "hookInnerDetach");
            java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mLayer");
            declaredField.setAccessible(true);
            this.f168322s = declaredField.get(this);
            declaredField.set(this, null);
            java.lang.reflect.Field declaredField2 = android.view.TextureView.class.getDeclaredField("mSurface");
            declaredField2.setAccessible(true);
            this.f168323t = declaredField2.get(this);
            declaredField2.set(this, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsFakeVideoCompositionView", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hookInnerDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    public final void z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unHookInnerDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoCompositionView", "unHookInnerDetach");
            if (this.f168322s != null) {
                java.lang.reflect.Field declaredField = android.view.TextureView.class.getDeclaredField("mLayer");
                declaredField.setAccessible(true);
                declaredField.set(this, this.f168322s);
                this.f168322s = null;
            }
            if (this.f168323t != null) {
                java.lang.reflect.Field declaredField2 = android.view.TextureView.class.getDeclaredField("mSurface");
                declaredField2.setAccessible(true);
                declaredField2.set(this, this.f168323t);
                this.f168323t = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsFakeVideoCompositionView", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unHookInnerDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsFakeVideoCompositionView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
