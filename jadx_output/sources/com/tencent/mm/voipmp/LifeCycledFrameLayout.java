package com.tencent.mm.voipmp;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\t\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/voipmp/LifeCycledFrameLayout;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/o;", "getLifecycle", "Lkotlin/Function1;", "Landroid/content/res/Configuration;", "Ljz5/f0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnConfigurationChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-voipmp_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LifeCycledFrameLayout extends android.widget.FrameLayout implements androidx.lifecycle.y {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.b0 f213760d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f213761e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifeCycledFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f213760d = new androidx.lifecycle.b0(this, true);
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f213760d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.LifeCycledFrameLayout", "onAttachedToWindow: ");
        androidx.lifecycle.b0 b0Var = this.f213760d;
        b0Var.f(androidx.lifecycle.m.ON_START);
        b0Var.f(androidx.lifecycle.m.ON_RESUME);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.LifeCycledFrameLayout", "onConfigurationChanged: " + configuration);
        yz5.l lVar = this.f213761e;
        if (lVar != null) {
            lVar.invoke(configuration);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.LifeCycledFrameLayout", "onDetachedFromWindow: ");
        androidx.lifecycle.b0 b0Var = this.f213760d;
        b0Var.f(androidx.lifecycle.m.ON_PAUSE);
        b0Var.f(androidx.lifecycle.m.ON_STOP);
    }

    public final void setOnConfigurationChangedListener(yz5.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f213761e = listener;
    }
}
