package com.tencent.mm.plugin.flutter.finder.live.base.view;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/flutter/finder/live/base/view/LifeCycledFrameLayout;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/o;", "getLifecycle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-flutter-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LifeCycledFrameLayout extends android.widget.FrameLayout implements androidx.lifecycle.y {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.b0 f137293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifeCycledFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f137293d = new androidx.lifecycle.b0(this, true);
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f137293d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("Finder.LifeCycledFrameLayout", "onAttachedToWindow...");
        androidx.lifecycle.b0 b0Var = this.f137293d;
        b0Var.f(androidx.lifecycle.m.ON_CREATE);
        b0Var.f(androidx.lifecycle.m.ON_START);
        b0Var.f(androidx.lifecycle.m.ON_RESUME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("Finder.LifeCycledFrameLayout", "onDetachedFromWindow... ");
        androidx.lifecycle.b0 b0Var = this.f137293d;
        b0Var.f(androidx.lifecycle.m.ON_PAUSE);
        b0Var.f(androidx.lifecycle.m.ON_STOP);
        b0Var.f(androidx.lifecycle.m.ON_DESTROY);
    }
}
