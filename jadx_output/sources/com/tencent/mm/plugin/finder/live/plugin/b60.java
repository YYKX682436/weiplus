package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class b60 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f111977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f111978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f111979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ep0 f111980g;

    public b60(android.view.View view, android.view.View view2, com.tencent.mm.plugin.finder.live.plugin.r60 r60Var, com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var) {
        this.f111977d = view;
        this.f111978e = view2;
        this.f111979f = r60Var;
        this.f111980g = ep0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        android.view.View view = this.f111977d;
        if (view != null) {
            i17 = view.getHeight();
            int height = this.f111978e.getHeight();
            if (i17 < height) {
                i17 = height;
            }
        } else {
            i17 = 0;
        }
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f111979f;
        android.widget.ScrollView scrollView = r60Var.f114103x;
        if (scrollView == null) {
            kotlin.jvm.internal.o.o("promoteBubbleContainerScrollView");
            throw null;
        }
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofInt(scrollView, "scrollY", 0, i17 + ((java.lang.Number) ((jz5.n) r60Var.I).getValue()).intValue()).setDuration(200L);
        kotlin.jvm.internal.o.f(duration, "setDuration(...)");
        duration.addListener(new com.tencent.mm.plugin.finder.live.plugin.a60(r60Var, view, this.f111980g));
        duration.start();
    }
}
