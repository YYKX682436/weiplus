package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d70 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.u70 f118085d;

    public d70(com.tencent.mm.plugin.finder.live.widget.u70 u70Var) {
        this.f118085d = u70Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        this.f118085d.a7();
    }
}
