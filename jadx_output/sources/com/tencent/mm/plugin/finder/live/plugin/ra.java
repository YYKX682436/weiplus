package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class ra implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f114119e;

    public ra(android.view.ViewGroup viewGroup, int i17) {
        this.f114118d = viewGroup;
        this.f114119e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f114118d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f114119e + com.tencent.mm.ui.bl.c(viewGroup.getContext());
    }
}
