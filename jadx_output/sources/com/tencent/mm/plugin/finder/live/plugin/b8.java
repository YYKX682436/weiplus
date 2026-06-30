package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class b8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f111984d;

    public b8(android.view.ViewGroup viewGroup) {
        this.f111984d = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f111984d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += com.tencent.mm.ui.bl.c(viewGroup.getContext());
    }
}
