package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x50 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f115032d;

    public x50(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        this.f115032d = r60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f115032d;
        android.view.View view = r60Var.f114104y;
        if (view == null) {
            kotlin.jvm.internal.o.o("promoteAnchorBubbleDelToast");
            throw null;
        }
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(1000L);
        kotlin.jvm.internal.o.f(duration, "setDuration(...)");
        duration.addListener(new com.tencent.mm.plugin.finder.live.plugin.w50(r60Var));
        duration.start();
    }
}
