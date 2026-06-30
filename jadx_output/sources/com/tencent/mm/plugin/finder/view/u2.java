package com.tencent.mm.plugin.finder.view;

/* loaded from: classes7.dex */
public final class u2 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.w2 f133154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f133155e;

    public u2(com.tencent.mm.plugin.finder.view.w2 w2Var, java.util.function.Consumer consumer) {
        this.f133154d = w2Var;
        this.f133155e = consumer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        android.view.WindowManager windowManager;
        kotlin.jvm.internal.o.g(v17, "v");
        android.view.Window window = this.f133154d.getWindow();
        if (window == null || (windowManager = window.getWindowManager()) == null) {
            return;
        }
        windowManager.addCrossWindowBlurEnabledListener(this.f133155e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        android.view.WindowManager windowManager;
        kotlin.jvm.internal.o.g(v17, "v");
        android.view.Window window = this.f133154d.getWindow();
        if (window == null || (windowManager = window.getWindowManager()) == null) {
            return;
        }
        windowManager.removeCrossWindowBlurEnabledListener(this.f133155e);
    }
}
